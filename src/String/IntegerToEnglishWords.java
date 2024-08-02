package String;

/**
 * Convert a non-negative integer num to its English words representation.
 * Example 1:
 * Input: num = 123
 * Output: "One Hundred Twenty Three"
 * Example 2:
 * Input: num = 12345
 * Output: "Twelve Thousand Three Hundred Forty Five"
 */
public class IntegerToEnglishWords {
    public static String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", " Seven", "Eight", "Nine", "Ten",
                                    "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
                                    "Nineteen"};
    public static String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public static String intToString(int num) {
        if (num == 0) {
            return "Zero";
        }
        return convert(num);
    }

    private static String convert(int num) {
        String result = "";
        if (num < 20) {
            result = LESS_THAN_20[num];
        } else if (num < 100) {
            result = TENS[num / 10] + " " + convert(num % 10);
        } else if (num < 1000) {
            result = convert(num / 100) + " Hundred " + convert(num % 100);
        } else if (num < 1000000) {
            result = convert(num / 1000) + " Thousand " + convert(num % 1000);
        } else if (num < 1000000000) {
            result = convert(num / 1000000) + " Million " + convert(num % 1000000);
        } else {
            result = convert(num / 1000000000) + " Billion " + convert(num % 1000000000);
        }
        return result.trim();
    }

    public static void main(String[] args) {
        int num = 3456;
        String result = intToString(num);
        System.out.println(result);
    }
}
