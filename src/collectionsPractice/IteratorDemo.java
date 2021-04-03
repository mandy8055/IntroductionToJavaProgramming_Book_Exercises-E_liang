package collectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args){
        List al = new ArrayList();
        for(int i = 0; i < 11; i++)
            al.add(i);
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            Integer i = (Integer) itr.next();
            if(i % 2 != 0)
                itr.remove();
        }
        System.out.println(al);
    }
}
