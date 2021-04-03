package collectionsPractice;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) throws Exception {
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = new WeakHashMap();
        TempClass tempClass = new TempClass();
        TempClass tempClass1 = new TempClass();
        hashMap.put(tempClass, "Axle");
        System.out.println(hashMap); // {temp=Axle}
        tempClass = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(hashMap); // {temp=Axle}
        weakHashMap.put(tempClass1, "Bose");
        System.out.println(weakHashMap);// {temp=Bose}
        tempClass1 = null; // finalize() method is called
        System.gc();
        Thread.sleep(5000);
        System.out.println(weakHashMap); // {}
    }
}

class TempClass{
    public String toString(){
        return "tempClass";
    }
    public void finalize(){
        System.out.println("finalize() method is called");
    }
}
