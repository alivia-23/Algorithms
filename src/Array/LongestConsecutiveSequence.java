package Array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 *
 * Example 1:
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *
 * Example 2:
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int maxConsecutiveCount = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curNum = num;
                int curConsecutiveCount = 1;

                while (set.contains(curNum + 1)) {
                    curNum += 1;
                    curConsecutiveCount += 1;
                }
                maxConsecutiveCount = Math.max(maxConsecutiveCount, curConsecutiveCount);
            }
        }
        return maxConsecutiveCount;
    }

    public static void main(String[] args) {
        //int[] nums = {100,4,200,1,3,2};
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }
}
