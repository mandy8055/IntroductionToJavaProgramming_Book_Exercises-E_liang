package collectionsPractice;

import java.util.TreeMap;

public class NavigationMapDemo {
    public static void main(String[] args){
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("A", "Apple");
        treeMap.put("B", "Ball");
        treeMap.put("C", "Cat");
        treeMap.put("D", "Dog");
        treeMap.put("E", "Elephant");
        treeMap.put("F", "Fan");
        System.out.println(treeMap);// {A=Apple, B=Ball, C=Cat, D=Dog, E=Elephant, F=Fan}
        System.out.println(treeMap.floorKey("C")); // C
        System.out.println(treeMap.lowerKey("C")); // B
        System.out.println(treeMap.ceilingKey("C")); // C
        System.out.println(treeMap.higherKey("C")); // D
        System.out.println(treeMap.pollFirstEntry()); // A: Apple
        System.out.println(treeMap.pollLastEntry()); // F: Fan
        System.out.println(treeMap.descendingMap()); // {E=Elephant, D=Dog, C=Cat, B=Ball}
        System.out.println(treeMap); // {B=Ball, C=Cat, D=Dog, E=Elephant}
    }
}
