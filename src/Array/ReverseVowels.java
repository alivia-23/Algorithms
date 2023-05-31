package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public static String reverseVowels(String sentence) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        char[] chs = sentence.toCharArray();
        int left = 0;
        int right = chs.length - 1;
        while (left < right) {
            while (left < right && !vowels.contains(chs[left])) {
                left++;
            }
            while (left < right && !vowels.contains(chs[right])) {
                right--;
            }

            char temp = chs[left];
            chs[left] = chs[right];
            chs[right] = temp;
            left++;
            right--;
        }
        return Arrays.toString(chs);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

}

