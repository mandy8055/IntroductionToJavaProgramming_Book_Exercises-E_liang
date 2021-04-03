package collectionsPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo3 {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet(new MyComparator3());
        treeSet.add(new StringBuffer("Romesh"));
        treeSet.add(new StringBuffer("Sandy"));
        treeSet.add(new StringBuffer("Rammy"));
        treeSet.add(new StringBuffer("Geeta"));
        treeSet.add(new StringBuffer("Raja"));
        System.out.println(treeSet);
    }
}
class MyComparator3 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        // Since the object is StringBuffer object; compulsorily we need to use toString() method
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s1.compareTo(s2);
    }
}
