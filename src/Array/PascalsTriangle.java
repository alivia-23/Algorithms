package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * Example 2:
 * Input: numRows = 1
 * Output: [[1]]
 *
 * Constraints:
 * 1 <= numRows <= 30
 */
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>(); // this is the list which holds the triangle that we form

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);
        List<Integer> prevRow = firstRow;

        for (int i = 1; i < numRows; i++) {
            List<Integer> curRow = new ArrayList<>(); // here I will construct the current row
            curRow.add(1);  // first element of current row would be 1
            for (int j = 1; j < i; j++) {   // loop through the row number until whichever row i is at
                curRow.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            curRow.add(1); //last elemnt of current row would also be 1
            triangle.add(curRow); // add current row to triangle
            prevRow = curRow; // make current row as previous row
        }
        return triangle;
    }

    public static void main(String[] args) {
        int r = 5;
        List<List<Integer>> result = new ArrayList<>();
        result = generate(5);
        System.out.println(result);
    }
}
