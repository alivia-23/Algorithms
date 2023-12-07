package String;

/**
 * Given a string of words replace character in the string with the given character
 *
 * Example :
 * Input:
 * String word = "a happy boy", char prev = a, char cur = i
 * output: "i hippy boy"
 */
public class ReplaceCharInString {
    public static String replace(String word, char prev, char cur) {
        char[] cArray = word.toCharArray();
        char[] result = new char[cArray.length];
        int i = 0;
        for (char c : cArray) {
            if (c == prev) {
                result[i] = cur;
            } else {
                result[i] = c;
            }
            i++;
        }
        return new String(result);
    }

    public static void main(String[] args) {
        String word = "a happy boy";
        char prev = 'a';
        char cur = 'i';
        String result = replace(word, prev, cur);
        System.out.println(result);
    }
}
