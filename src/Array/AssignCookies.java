package Array;

import java.util.Arrays;

/**
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
 * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with;
 * and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content.
 * Your goal is to maximize the number of your content children and output the maximum number.
 *
 * Example 1:
 * Input: g = [1,2,3], s = [1,1]
 * Output: 1
 * Example 2:
 * Input: g = [1,2], s = [1,2,3]
 * Output: 2
 */
public class AssignCookies {
    public static int assignCookies(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                count++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //int[] g = {1,2,3}; int[] s = {1, 1};
        int[] g = {1,2}; int[] s = {1, 2, 3};
        int count = assignCookies(g, s);
        System.out.println(count);
    }
}
