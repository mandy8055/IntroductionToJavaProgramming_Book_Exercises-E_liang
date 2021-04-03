package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSearchDemo1 {
    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(0);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(5);
        System.out.println(arrayList); // [15, 0, 20, 10, 5]
        Collections.sort(arrayList, new MyComparator9());
        System.out.println(arrayList); // [20, 15, 10, 5, 0]
        System.out.println(Collections.binarySearch(arrayList, 10,new MyComparator9())); // 2
        System.out.println(Collections.binarySearch(arrayList, 13,new MyComparator9())); // -3
        System.out.println(Collections.binarySearch(arrayList, 17)); // unpredictable
    }
}
class MyComparator9 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        return i2.compareTo(i1);
    }
}
