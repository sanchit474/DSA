import java.util.Scanner;

public class Searching{

//    // Recursive method for linear search
//    public static int linearSearchRecursive(int[] arr, int target, int index) {
//
//        if (index >= arr.length) {
//            return -1;
//        }
//
//        if (arr[index] == target) {
//            return index;
//        }
//        return linearSearchRecursive(arr, target, index + 1);
//    }

    // Recursive method for binary search
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return binarySearch(arr, target, low, mid - 1);
            }

            // Otherwise, search in the right half
            return binarySearch(arr, target, mid + 1, high);
        }

        // Target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5, 6, 7, 8, 9};
        System.out.println("enter the target element:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int result = binarySearch(arr,target,0,arr.length);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    //  main method of linear search

//    public static void main(String[] args) {
//        int[] arr = {5, 3, 7, 2, 8, 9};
//        System.out.println("enter the target element:");
//        Scanner sc = new Scanner(System.in);
//        int target = sc.nextInt();
//        int result = linearSearchRecursive(arr, target, 0);
//
//        if (result != -1) {
//            System.out.println("Element found at index " + result);
//        } else {
//            System.out.println("Element not found");
//        }
//    }
}


