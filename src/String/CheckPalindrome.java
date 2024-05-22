package String;

/**
 * Given a string return true if it is a palindrome
 *
 * Example 1:
 * Input : "aba"
 * output : true
 */
public class CheckPalindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "aba";  // true
//        String s = "acccba";  // false
        String s = "caacaac"; // true
        System.out.println(isPalindrome(s));
    }

}
