package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortDemo {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("K");
        arrayList.add("N");
        System.out.println("Before sorting " + arrayList); // Before sorting [Z, A, K, N]
        Collections.sort(arrayList);
        System.out.println("After sorting " + arrayList); // After sorting [A, K, N, Z]
    }
}
