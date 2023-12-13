package String;

public class StringConcat {
    public static int maxDifference (int[] vals) {
        int max = 0;
        for (int i=0; i < vals.length; i++) {
            for (int j=0; j < vals.length; j++) {
                if ((vals[i] - vals[j]) > max) {
                    max = vals[i] - vals[j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] vals = {1,7,2,4,6,8};
        int result = maxDifference(vals);
        System.out.println(result);
    }
}
