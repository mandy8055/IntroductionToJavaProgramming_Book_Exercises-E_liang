package collectionsPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo2 {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet(new MyComparator2());
        treeSet.add("Romesh");
        treeSet.add("Sandy");
        treeSet.add("Rammy");
        treeSet.add("Geeta");
        treeSet.add("Raja");
        System.out.println(treeSet);
    }
}
class MyComparator2 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
