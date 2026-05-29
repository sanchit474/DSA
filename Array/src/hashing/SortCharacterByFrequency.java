package hashing;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {
        public String frequencySort(String s) {
            Map<Character, Integer> map = new HashMap<>();
            //count frequency of each char
            for(int i =0;i<s.length();i++){
                char ch = s.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                }
                else{
                    map.put(ch,1);
                }
            }
            List<Map.Entry<Character, Integer>> list =
                    map.entrySet()
                            .stream()
                            .sorted((a, b) -> b.getValue() - a.getValue())
                            .toList();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {

                char ch = list.get(i).getKey();
                int freq = list.get(i).getValue();

                // append character freq times
                for (int j = 0; j < freq; j++) {
                    sb.append(ch);
                }
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        String s = "tree";
        SortCharacterByFrequency obj = new SortCharacterByFrequency();
        String result = obj.frequencySort(s);
        System.out.println("Sorted string by frequency: " + result);
    }
}
