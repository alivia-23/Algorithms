package String;

import java.util.Arrays;

public class DifferenceBetweenStringValueOfAndToString {
    public static void main(String[] args) {
        char[] ch = new char[]{'c','a', 't'};
//        System.out.println(String.valueOf(ch));
//        System.out.println(ch.toString());   // it will give the object address
        Arrays.sort(ch);
        //Arrays.toString(ch); // gives the same result as String.valueOf(ch)
        System.out.println(ch);
    }
}
