import java.util.Scanner;

public class Fibonacci {
    public static int fibbo(int n){
        if(n<=1){
            return n;
        }
        return fibbo(n - 1) + fibbo(n - 2);

    }
    public static void main(String[] args) {
        System.out.println("enter the number to print fibbonacci");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibbo(n));

    }
}
