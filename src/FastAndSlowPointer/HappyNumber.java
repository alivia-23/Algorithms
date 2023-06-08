package FastAndSlowPointer;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = sqrSum(n);
        while (fast != 1 && slow != fast) {
            slow = sqrSum(slow);
            fast = sqrSum(sqrSum(fast));
        }
        return fast == 1;
    }

    public static int sqrSum(int n) {
        int sum = 0;
        while (n != 0) {
            int lastNum = n % 10;
            n = n / 10;
            sum += lastNum * lastNum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
