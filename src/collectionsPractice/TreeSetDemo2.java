package collectionsPractice;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet();
        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("L"));
        treeSet.add(new StringBuffer("Z"));
        treeSet.add(new StringBuffer("B"));
        System.out.println(treeSet);
    }
}
