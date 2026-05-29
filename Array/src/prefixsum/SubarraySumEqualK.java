package prefixsum;
//Leetcode 560. Subarray Sum Equals K
import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualK {
    public int subarraySum(int[] nums, int k) {
        int res =0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum =0;
        for(int num : nums){
            prefixSum += num;
            if(map.containsKey(prefixSum - k)){
                res += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        SubarraySumEqualK solution = new SubarraySumEqualK();
        int[] nums = {1, 1, 1};
        int k = 2;
        int result = solution.subarraySum(nums, k);
        System.out.println("Number of subarrays that sum to " + k + ": " + result);
    }
}
