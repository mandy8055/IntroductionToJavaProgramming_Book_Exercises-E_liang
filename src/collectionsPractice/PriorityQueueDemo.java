package collectionsPractice;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue priorityQueue = new PriorityQueue();
//        System.out.println(priorityQueue.peek());
//        System.out.println(priorityQueue.element());
        for(int i = 0; i <= 10; i++)priorityQueue.offer(i);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        priorityQueue.offer(1);
        System.out.println(priorityQueue); // [1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    }
}
