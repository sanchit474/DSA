public class QuickSort {
    static int partition(int[] arr, int st, int end){
        int idx = st -1;
        int pivot = arr[end];
        for(int i=st;i<end;i++){
            if(arr[i]<=pivot){
                idx++;
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }//till here make all the element in the position
        // but not pivot is in its correct position
        int temp = arr[idx+1];
        arr[idx+1] = arr[end];
        arr[end] = temp;

        return idx+1;//which id pivot
    }
    static void quickSort(int[] arr, int st, int end){
        if(st<end){
            int pivot = partition(arr, st, end);
            quickSort(arr,st,pivot-1);//left sub array
            quickSort(arr,pivot+1, end);//right sub array
        }
    }
    static void  printArray(int[] array){
        for(int e : array){
            System.out.print(e +", ");
        }
    }
    public static void main(String[] args) {
        int[] array ={5,2,8,4,1,6,7,3};
        quickSort(array,0, array.length-1);
        printArray(array);
    }
}
