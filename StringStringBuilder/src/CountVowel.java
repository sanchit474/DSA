public class CountVowel {
    //check vowel
    static boolean isVowel(char ch){
       return ch =='a' || ch =='e'|| ch =='i'|| ch =='o'|| ch =='u' ;

    }
    public static void main(String[] args) {
        String str ="Hello World welcome to the hub";
        str = str.toLowerCase();
        int cnt =0;
        for(int i =0;i< str.length();i++){
            char ch = str.charAt(i);
            if(isVowel(ch)){
                cnt++;
            }
        }
        System.out.println("vowel cnt :" + cnt);
    }
}
