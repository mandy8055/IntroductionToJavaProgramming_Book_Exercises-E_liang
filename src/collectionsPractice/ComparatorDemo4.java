package collectionsPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo4 {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet(new MyComparator4());
        treeSet.add("A");
        treeSet.add(new StringBuffer("ABC"));
        treeSet.add(new StringBuffer("AA"));
        treeSet.add("XX");
        treeSet.add("ABCD");
        treeSet.add("A");
        System.out.println(treeSet); // [A, AA, XX, ABC, ABCD]
    }
}
class MyComparator4 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int l1 = s1.length();
        int l2 = s2.length();
        if(l1 < l2)return -1;
        else if(l1 > l2)return 1;
        else
            return s1.compareTo(s2);
    }
}
