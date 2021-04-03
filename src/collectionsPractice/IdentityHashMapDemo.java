package collectionsPractice;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args){
        HashMap hashMap = new HashMap();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Integer i1 = new Integer(10);
        Integer i2 = new Integer(10);
        hashMap.put(i1, "Cydney");
        hashMap.put(i2, "Rhonda");
        System.out.println(hashMap); // {10=Rhonda}
        identityHashMap.put(i1, "Cydney");
        identityHashMap.put(i2, "Rhonda");
        System.out.println(identityHashMap); // {10=Rhonda, 10=Cydney}
    }
}
