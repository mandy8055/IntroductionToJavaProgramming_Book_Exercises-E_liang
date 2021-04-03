package collectionsPractice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.add("Mandy8055");
        ll.add("David");
        ll.add("Nag");
        ll.add("Saurabh");
        System.out.println(ll);
        ListIterator ltr = ll.listIterator();
        while(ltr.hasNext()){
            String s = ltr.next().toString();
            if(s.equals("Mandy8055"))
                ltr.remove();
            else if(s.equals("Saurabh"))
                ltr.add("Lipika");
            else if(s.equals("Nag"))
                ltr.set("Shweta");
        }
        System.out.println(ll); // [David, Shweta, Saurabh, Lipika]
    }
}
