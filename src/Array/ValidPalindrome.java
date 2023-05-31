package Array;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        char[] chs = s.toCharArray();
        int left = 0;
        int right = chs.length - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(chs[left])) {
                left++;
            } else if (!Character.isLetterOrDigit(chs[right])) {
                right--;
            } else if (Character.toLowerCase(chs[left++]) != Character.toLowerCase(chs[right--])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal, Panama!";
        System.out.println(isPalindrome(s));
    }
}
