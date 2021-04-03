package collectionsPractice;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap hashMap = new HashMap();
        hashMap.put("Mandy", 340);
        hashMap.put("John", 120);
        hashMap.put("Mike", 500);
        hashMap.put("Ikira", 1000);
        System.out.println(hashMap); // Output order undefined. Based on hashcode value
        System.out.println(hashMap.put("Mandy", 700)); // 340
        Set set = hashMap.keySet();
        System.out.println(set);
        Collection collection = hashMap.values();
        System.out.println(collection);
        Set set1 = hashMap.entrySet();
        System.out.println(set1);
        Iterator itr = set1.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey() + "-->" + entry.getValue());
            if(entry.getKey().equals("Ikira")){
                entry.setValue(2500);
            }
        }
        System.out.println(hashMap);
    }
}
