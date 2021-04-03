package collectionsPractice;
import java.util.*;
public class VectorDemo1 {
    public static void main(String[] args){
        Vector v = new Vector(); // Warning comes because of lack of type safety.
//        Use Vector<Integer> v = new Vector<Integer>();
//        Vector v = new Vector(10, 5);
//        Vector v = new Vector(24);
        System.out.println(v.capacity());
        for(int i = 1; i <= 10; i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.add("A");
        System.out.println(v.capacity());
        System.out.println(v.size());
        System.out.println(v);

    }
}
