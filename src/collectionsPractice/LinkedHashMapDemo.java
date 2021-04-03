package collectionsPractice;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args){
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Mandy", 340);
        linkedHashMap.put("John", 120);
        linkedHashMap.put("Mike", 500);
        linkedHashMap.put("Ikira", 1000);
        System.out.println(linkedHashMap); // {Mandy=340, John=120, Mike=500, Ikira=1000}
    }
}
