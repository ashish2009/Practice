package newPack.collectionPractice;

import java.util.*;

public class MapToList {

    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("A",1);
        hashMap.put("B",2);
        hashMap.put("C",3);
        hashMap.put("D",4);
        hashMap.put("E",5);

        ArrayList<String> list = new ArrayList<>(hashMap.keySet());
        ArrayList<Integer> list1 = new ArrayList<>(hashMap.values());
        ArrayList<Map.Entry<String,Integer>> list2 = new ArrayList<>(hashMap.entrySet());

        for (String s: list){
            System.out.println(s);
        }

        for (Integer i: list1){
            System.out.println(i);
        }

        for(Map.Entry<String,Integer> e:list2){
            System.out.println(e.getKey()+" : "+e.getValue());
        }
        
    }
}
