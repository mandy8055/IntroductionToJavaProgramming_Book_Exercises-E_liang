package collectionsPractice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo1 {
    public static void main(String[] args){
        PriorityQueue priorityQueue = new PriorityQueue(6, new MyComparator8());
        priorityQueue.offer("L");
        priorityQueue.offer("B");
        priorityQueue.offer("Z");
        priorityQueue.offer("A");
        System.out.println(priorityQueue); // [Z, L, B, A]

    }
}
class MyComparator8 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
