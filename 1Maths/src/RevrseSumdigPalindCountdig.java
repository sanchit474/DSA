import java.util.*;
//this consist of multiple program  reverse number, check palindrome, count digit, count digit sum
public class RevrseSumdigPalindCountdig{

//    public static int reverse(int n){
//        int rev=0;
//        while(n>0){
//            int dig = n%10;
//            rev = rev*10 + dig;
//            n /=10;
//        }
//       return rev;
//    }
//    public  static void palindrome(int num){
//        int n = num;
//        int rev=0;
//        while(n>0){
//            int dig = n%10;
//            rev = rev*10 + dig;
//            n /=10;
//        }
//        if(num == rev){
//            System.out.println(num +" is palindrome");
//        }else{
//            System.out.println(num +" not palindrome");
//        }
//    }
//    public static void countDigAndSum(int num){
//        int n = num;
//        int sum =0;
//        int cntDig = 0;
//        while(n>0){
//            int dig = n%10;
//            sum += dig;
//            n /=10;
//            cntDig++;
//        }
//        System.out.println(num + " sum of digit is:" + sum);
//        System.out.println(num +" no of dig is " + cntDig);
//    }

    public static int sumNnaturalNo(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args) {
//        int n = 6789;
//        System.out.println("reverse is :"+reverse(n));
//        int num = 1331;
//        palindrome(num);

//        countDigAndSum(123456852);
//        System.out.println("sum of 10 natural no is "+ sumNnaturalNo(10));
    }
}
