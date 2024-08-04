package String;

import java.util.*;

/**
 * Given a collection of strings, write a method to determine the nTh longest string in that list.
 * Example: {Yuri, Interview, Nordstrom, Cat, Dog, Telephone, AVeryLongString, This code puzzle is easy}
 */
public class KthLongestString {
//    public static String KthLongestString(String[] strs, int n) {
//        if (strs.length == 0) {
//            return null;
//        }
//        if (n == 0 || n > strs.length) {
//            return null;
//        }
//        Map<String, Integer> map = new HashMap<>();
//        for (String s : strs) {
//            int length = s.length();
//            map.put(s, length);
//        }
//        List<Integer> list = new ArrayList<>();
//        for (String key : map.keySet()) {
//             int length = map.get(key);
//            list.add(length);
//        }
//        Collections.sort(list, (a, b) -> b - a);
//        int nthLongestLength = list.get(n - 1);
//        String result = "";
//        for (Map.Entry<String, Integer> set : map.entrySet()) {
//            if (set.getValue() == nthLongestLength) {
//                result = set.getKey();
//            }
//        }
//        return result;
//    }
    public static String KthLongestString(String[] strs, int k) {
        PriorityQueue<String> minHeap = new PriorityQueue<>((a, b) -> {
            if(a.length() == b.length()) {
                return a.compareTo(b);
            } else {
                return a.length() - b.length();
            }
        });
        for (String s : strs) {
            minHeap.offer(s);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

//    public static String KthLongestString(String[] strs, int k) {
//        if (strs.length == 0) {
//            return null;
//        }
//        if (k == 0 || k > strs.length) {
//            return null;
//        }
//
//        Arrays.sort(strs, (a, b) -> b.length() - a.length());
//        return strs[k-1];
//    }

    public static void main(String[] args) {
        String[] strs1 = {"Yuri", "Interview", "Nordstrom", "Cat", "Dog", "Telephone", "AVeryLongString", "This code puzzle is easy"};
        //String[] strs1 = {"ate", "hat", "qhfeitgkgrcjghjk","wordlength", "leetcode", "dfghutreg", "qhfeitgkgrhcjghjk"};

        int k = 2;
        String result = KthLongestString(strs1, k);
        System.out.println(result);
    }
}
