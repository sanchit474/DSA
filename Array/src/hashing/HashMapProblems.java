package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapProblems {
    //count frequency of elements in an array
     public static void countFrequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }else{
//                map.put(arr[i],1);
//            }
//        }
         for(int num : arr){
                map.put(num,map.getOrDefault(num,0)+1);
         }
         for(Map.Entry<Integer, Integer> entry : map.entrySet()){
             System.out.println(entry.getKey()+" "+entry.getValue());
         }
    }

//    contains duplicate in an array
    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> map = new HashSet<>();
        for(int num : arr){
            if(map.contains(num)){
                return true;
            }
            map.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        // You can add your test cases here to test the HashMap problems
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        countFrequency(arr);
        System.out.println( "this array contains duplicate: " +containsDuplicate(arr));
//        HashMap<Integer,Integer> map = new HashMap<>();
    }
}
