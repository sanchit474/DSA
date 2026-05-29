package prefixsum;
//Leetcode 2574. Left and Right Sum Differences
public class LeftRightDiffrence {
    public int[] leftRightDifference(int[] nums) {
        int total =0;
        for(int num : nums){
            total += num;
        }
        int leftSum =0;
        for(int i =0;i<nums.length;i++){
            leftSum += nums[i];
            int right = total-leftSum;
            nums[i]=Math.abs(leftSum-nums[i]-right);
        }
        return nums;

    }
    public static void main(String[] args) {
        LeftRightDiffrence obj = new LeftRightDiffrence();
        int[] nums = {10, 4, 8, 3};
        int[] result = obj.leftRightDifference(nums);
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
