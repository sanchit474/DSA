public class Arr {
    private static void helper(int[] arr){
        for(int i=0;i< arr.length;i++){
            int num = arr[i];
            int sum =0;
            while(num>0){
                int dig = num%10;
                sum += dig;
                num = num/10;
            }
            arr[i]=sum;
        }

    }
    public static void main(String[] args) {
        int[] arr = {56,69,8,3};
        helper(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
