package hashing;

import java.util.*;

public class TopKFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
                HashMap<Integer, Integer> map = new HashMap<>();

                // frequency count
                for (int num : nums) {
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }

                // sort by frequency descending
                List<Map.Entry<Integer, Integer>> list =
                        map.entrySet()
                                .stream()
                                .sorted((a, b) -> b.getValue() - a.getValue())
                                .limit(k)
                                .toList();

                int[] res = new int[k];

                // collect keys into array
                for (int i = 0; i < k; i++) {
                    res[i] = list.get(i).getKey();
                }

                return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] topK = topKFrequent(nums, k);
        System.out.print("Top " + k + " frequent elements: ");
        for (int num : topK) {
            System.out.print(num + " ");
        }
    }
}
