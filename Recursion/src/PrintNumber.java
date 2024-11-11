import java.util.Scanner;

public class PrintNumber {
    public static void printDescending(int n){
        if(n==0)return;
        System.out.print(n+" ");
        printDescending(n-1);
    }
    public static void printAscending(int n){
        if(n==0)return;
        printAscending(n-1);
        System.out.print(n+" ");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number till print");
        int n = sc.nextInt();
        printDescending(n);
        System.out.println();
        printAscending(n);

    }
}
