package prefixsum;
//leetcode 724. Find Pivot Index
public class PivotIndex {
   public static int  findPivotIndex(int []arr){
            int totalSum = 0;
            for (int num : arr) {
                totalSum += num;
            }
            int leftSum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (leftSum == totalSum - leftSum - arr[i]) {
                    return i; // pivot index found
                }
                leftSum += arr[i];
            }
            return -1; // no pivot index found
    }
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6};
        int pivotIndex = findPivotIndex(arr);
        System.out.println("Pivot Index: " + pivotIndex);
    }
}
