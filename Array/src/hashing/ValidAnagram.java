package hashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // early check
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i =0;i<t.length();i++){
            char ch = t.charAt(i);
            if (!map.containsKey(ch)) {
                return false;
            }
            map.put(ch, map.get(ch) - 1);
            if(map.get(ch)==0){
                map.remove(ch);
            }
        }
        if(map.size()>0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";
        boolean result = isAnagram(s, t);
        System.out.println("Are the strings anagrams? " + result);
    }
}
