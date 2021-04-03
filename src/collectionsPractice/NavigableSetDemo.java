package collectionsPractice;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args){
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(1000);
        treeSet.add(2000);
        treeSet.add(3000);
        treeSet.add(4000);
        treeSet.add(5000);
        System.out.println(treeSet); // [1000, 2000, 3000, 4000, 5000]
        System.out.println(treeSet.floor(3000)); // 3000
        System.out.println(treeSet.lower(3000)); // 2000
        System.out.println(treeSet.ceiling(3000)); // 3000
        System.out.println(treeSet.higher(3000)); // 4000
        System.out.println(treeSet.pollFirst()); // 1000
        System.out.println(treeSet.pollLast()); // 5000
        System.out.println(treeSet.descendingSet()); // [4000, 3000, 2000]
        System.out.println(treeSet); // [2000, 3000, 4000]
    }
}
