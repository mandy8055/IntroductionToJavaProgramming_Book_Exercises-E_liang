package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo2 {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("K");
        arrayList.add("N");
        System.out.println("Before sorting " + arrayList); // Before sorting [Z, A, K, N]
        Collections.sort(arrayList, new MyComparator7());
        System.out.println("After sorting " + arrayList); // After sorting [Z, N, K, A]
    }
}
class MyComparator7 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
