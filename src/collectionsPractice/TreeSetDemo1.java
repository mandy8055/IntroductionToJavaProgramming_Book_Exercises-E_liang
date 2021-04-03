package collectionsPractice;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet();
//        treeSet.add("A");
//        treeSet.add("a");
//        treeSet.add("B");
//        treeSet.add("Z");
//        treeSet.add("L");
        // treeSet.add(10); --> results in ClassCastException
         treeSet.add(null); // --> NullPointerException
        System.out.println(treeSet); // [A, B, L, Z, a]
    }
}
