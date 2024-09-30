package Array;

public class RecursionDemo {

    public static void main(String[] args) {
        recurse(1);
    }

    private static void recurse(int n) {
        if(n == 4) return;
        System.out.println("Entering ****** " + n);
        recurse(n + 1);
        System.out.println("Exiting ###### " + n);
    }
}
