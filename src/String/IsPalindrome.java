package String;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 */
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "").trim();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }



    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s1 = "race a car";
        System.out.println(isPalindrome(s1));
    }
}
