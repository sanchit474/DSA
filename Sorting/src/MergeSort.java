public class MergeSort {

    // Merge two sorted arrays into one
    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Compare and merge
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right half
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy back into original array
        for (i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3, 7, 6, 1};

        System.out.println("Original Array:");
        for (int x : arr) System.out.print(x + " ");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        for (int x : arr) System.out.print(x + " ");
    }
}
