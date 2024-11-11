import java.util.*;
public class ArrayImp {
    static Scanner sc = new Scanner(System.in);
    //function for input array
    static void input(int arr[] , int n){
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    //print array
    static void print(int arr[] , int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the number of element :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements " + n);
        input(arr ,n);
        System.out.println("array is :");
        print(arr , n);
    }
}