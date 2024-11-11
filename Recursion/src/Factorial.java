import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n *factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println("enter the number for factorial:");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int fact = factorial(n);
        System.out.println("factorial is "+fact);
    }
}
