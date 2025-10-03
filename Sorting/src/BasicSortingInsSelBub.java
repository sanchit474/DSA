public class BasicSortingInsSelBub {
    static void bubbleSort(int[] array){
        for(int i =0;i<array.length-1;i++){
            for(int j=0;j< array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j] = array[j+1];
                    array[j+1] =temp;
                }
            }
        }
    }
    static void selectionSort(int[] array){
        int n = array.length;
        for (int i =0;i<n-1;i++){
            int smallest = i;
            for (int j =i+1;j<n;j++){
                if(array[j] < array[smallest]){
                    smallest = j;
                }
            }
            int temp=array[i];
            array[i] = array[smallest];
            array[smallest] =temp;
        }
    }
    static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int curr = arr[i];   // element to be inserted
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Place key in its correct position
            arr[j + 1] = curr;
        }
    }

    static void  printArray(int[] array){
        for(int e : array){
            System.out.print(e +", ");
        }
    }

    public static void main(String[] args) {
        int[] array ={5,2,8,4,1,6,7,3};
//        bubbleSort(array);
//        selectionSort(array);
        insertionSort(array);
        printArray(array);

    }
}
