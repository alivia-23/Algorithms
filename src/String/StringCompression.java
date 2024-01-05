package String;

/**
 * Given an array of characters chars, compress it using the following algorithm:
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 * If the group's length is 1, append the character to s.
 * Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
 * Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * After you are done modifying the input array, return the new length of the array.
 * You must write an algorithm that uses only constant extra space.
 * Example 1:
 * Input: chars = ["a","a","b","b","c","c","c"]
 * Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 */
public class StringCompression {
    public static int compress(char[] chars) {
        int length = 0; // represents running length of array
        int start = 0;
        while (start < chars.length) {
            int end = start;
            while (end < chars.length && chars[start] == chars[end]) {
                end++;
            }
            chars[length++] = chars[start];
            if (end - start > 1) {
                String counts = end - start + "";
                for (char c : counts.toCharArray()) {
                    chars[length++] = c;
                }
            }
            start = end;
        }
        return length;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int result = compress(chars);
        System.out.println(result);
    }
}
