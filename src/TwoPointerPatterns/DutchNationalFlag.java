package TwoPointerPatterns;

/**
 * Given an array containing 0s, 1s and 2s, sort the array in-place. You should treat numbers of the array as objects,
 * hence, we can’t count 0s, 1s, and 2s to recreate the array.
 *
 * Example 1:
 * Input: [1, 0, 2, 1, 0]
 * Output: [0 0 1 1 2]
 *
 * Example 2:
 * Input: [2, 2, 0, 1, 2, 0]
 * Output: [0 0 1 2 2 2 ]
 */
public class DutchNationalFlag {
    public static void sort(int[] arr) {
        int low = 0; int high = arr.length - 1;

        for (int i = 0; i <= high;) {
            if (arr[i] == 0) {
                swap(arr, i, low);
                i++;
                low++;
            } else if (arr[i] == 1) {
                i++;
            } else {
                swap(arr, i, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2, 2, 0, 1, 2, 0};
        DutchNationalFlag.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        arr = new int[] {2, 2, 0, 1, 2, 0};
        DutchNationalFlag.sort((arr));
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
