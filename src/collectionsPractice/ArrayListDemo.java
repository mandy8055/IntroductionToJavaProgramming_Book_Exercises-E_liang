package collectionsPractice;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList l = new ArrayList();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        l.add(2, "M");
        l.add("N");
        System.out.println(l);

        // Example 2:
        LinkedList l2 = new LinkedList();
        System.out.println(l instanceof Serializable);
        System.out.println(l2 instanceof Serializable);
        System.out.println(l instanceof Cloneable);
        System.out.println(l2 instanceof Cloneable);
        System.out.println(l instanceof RandomAccess);
        System.out.println(l2 instanceof RandomAccess);

    }
}
