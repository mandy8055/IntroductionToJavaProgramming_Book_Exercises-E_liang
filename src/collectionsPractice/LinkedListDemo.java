package collectionsPractice;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Mandy8055");
        l.add(30);
        l.add(null);
        l.add("Mandy8055"); // [Mandy8055, 30, null, Mandy8055]
        l.set(0, "Software"); // [Software, 30, null, Mandy8055]
        l.add(0, "Sappy"); // [Sappy, Software, 30, null, Mandy8055]
        l.removeLast(); // [Sappy, Software, 30, null]
        l.addFirst("CCC"); // [CCC,Sappy, Software, 30, null]
        System.out.println(l);
    }
}

