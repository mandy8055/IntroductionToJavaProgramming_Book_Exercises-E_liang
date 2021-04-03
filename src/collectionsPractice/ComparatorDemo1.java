package collectionsPractice;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo1 {
    public static void main(String[] args){
        TreeSet treeSet = new TreeSet(new MyComparator());
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(20);
        System.out.println(treeSet);
    }
}

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer) o1;
        Integer I2 = (Integer) o2;
//        if(I1 < I2){
//            return 1;
//        }else if(I1 > I2){
//            return -1;
//        }else return 0;
//        return (I2.compareTo(I1));
        return 1;
    }
}
