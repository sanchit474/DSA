public class SumOfNumber {
    //return
    public static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
    //void
    public static void sum(int n,int summ){
        if(n==0) {
            System.out.println(summ);
            return ;
        }
        sum(n-1,summ+n);
    }

    public static void main(String[] args) {
        int n=10;
        int sumn =sum(n);
        System.out.println(sumn);
        sum(n,0);
    }
}
