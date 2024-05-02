package String;

/**
 * You are given a string s consisting only of characters 'a' and 'b'
 * You can delete any number of characters in s to make s balanced. s is balanced if there is no pair of indices (i,j)
 * such that i < j and s[i] = 'b' and s[j]= 'a'.
 * Return the minimum number of deletions needed to make s balanced.
 *
 * Example 1:
 * Input: s = "aababbab"
 * Output: 2
 *
 * Example 2:
 * Input: s = "bbaaaaabb"
 * Output: 2
 *
 */
public class MinDeletionBalanceString {
    /**
     * Basically our goal is to make all a's to appear before 'b' to make the string balanced
     * For that we can keep a counter of b appeared before a.So whenever we see 'a' then check if counter of b is greater than 0
     * we delete 1 count of 'b' and increment total deletion by 1
     * In this way we can keep track of the number of b's appeared before a and make delete operations accordingly
     * @param s
     * @return
     */
    public int minimumDeletions(String s) {
        int countB = 0;  // counter to keep track of the number of b's appeared before a
        int totalDel = 0; // counter to keep track of number of delete operation performed on countB when we found 'a'

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') {
                countB++;
            } else if (countB > 0) { // we found an a and we apply the condition here that if count of b is more than 0
                // then we delete 1 count of b and increment total delete operation by 1
                countB--;
                totalDel++;
            }
        }
        return totalDel;
    }
}
