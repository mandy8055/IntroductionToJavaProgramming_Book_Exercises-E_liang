package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("M");
        arrayList.add("K");
        arrayList.add("a");
        System.out.println(arrayList); // [Z, A, M, K, a]
        Collections.sort(arrayList);
        System.out.println(arrayList); // [A, K, M, Z, a]

        System.out.println(Collections.binarySearch(arrayList, "M")); // 2
        System.out.println(Collections.binarySearch(arrayList, "b")); // -6(insertion point)

    }
}
