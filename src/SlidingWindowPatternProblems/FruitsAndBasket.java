package SlidingWindowPatternProblems;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/**
 * You are visiting a farm to collect fruits. The farm has a single row of fruit trees. You will be given two baskets,
 * and your goal is to pick as many fruits as possible to be placed in the given baskets.
 *
 * You will be given an array of characters where each character represents a fruit tree. The farm has following restrictions:
 *
 * Each basket can have only one type of fruit. There is no limit to how many fruit a basket can hold.
 * You can start with any tree, but you can’t skip a tree once you have started.
 * You will pick exactly one fruit from every tree until you cannot, i.e., you will stop when you have to pick from a third fruit type.
 * Write a function to return the maximum number of fruits in both baskets.
 *
 * Example 1:
 * Input: fruits = [1,2,1]
 * Output: 3
 * Explanation: We can pick from all 3 trees.
 *
 * Example 2:
 * Input: fruits = [1,2,3,2,2]
 * Output: 4
 * Explanation: We can pick from trees [2,3,2,2].
 * If we had started at the first tree, we would only pick from trees [1,2].
 *
 * Example 3:
 * Input: fruits = [0,1,2,2]
 * Output: 3
 * Explanation: We can pick from trees [1,2,2].
 * If we had started at the first tree, we would only pick from trees [0,1].
 */
public class FruitsAndBasket {
    public static int totalFruit(int[] fruits) {
        int maxPicked = Integer.MIN_VALUE;
        Map<Integer, Integer> basket = new HashMap<>();
        int start = 0, end;

        for (end = 0; end < fruits.length; end++) {
            int fruit = fruits[end];
            basket.put(fruit, basket.getOrDefault(fruit, 0) + 1);
            if (basket.size() > 2) {
                int firstFruit = fruits[start];
                basket.put(firstFruit, basket.get(firstFruit) - 1);
                if (basket.get(firstFruit) == 0) {
                    basket.remove(firstFruit);
                }
                start++;
            }
            maxPicked = Math.max(maxPicked, end - start + 1);
        }
        return maxPicked;
    }

    public static void main(String[] args) {
        //int[] fruits = {1,2,1};
        //int[] fruits = {1,2,3,2,2};
        int[] fruits = {0,1,2,2};
        int count = totalFruit(fruits);
        System.out.println(count);
    }
}
