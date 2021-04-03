package collectionsPractice;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.TreeSet;
public class Employee implements Comparable{
    int eid;
    String name;
    public Employee(int eid, String name){
        this.eid = eid;
        this.name = name;
    }
    public String toString() {
        return eid + " --> " + name;
    }
    @Override
    public int compareTo(@NotNull Object o) {
        Employee i1 = (Employee) o;
        if(this.eid < i1.eid)return -1;
        else if(this.eid > i1.eid) return 1;
        else return 0;
    }
}
class ComparatorVsComparable{
    public static void main(String[] args){
        Employee e1 = new Employee(100,"Chirag");
        Employee e2 = new Employee(200,"John");
        Employee e3 = new Employee(50,"Titu");
        Employee e4 = new Employee(150,"Swami");
        Employee e5 = new Employee(100,"Chirag");
        TreeSet treeSet = new TreeSet();
        treeSet.add(e1);
        treeSet.add(e2);
        treeSet.add(e3);
        treeSet.add(e4);
        treeSet.add(e5);
        System.out.println(treeSet);
        TreeSet treeSet1 = new TreeSet(new MyComparator5());
        treeSet1.add(e1);
        treeSet1.add(e2);
        treeSet1.add(e3);
        treeSet1.add(e4);
        treeSet1.add(e5);
        System.out.println(treeSet1);
    }
}
class MyComparator5 implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.name.compareTo(e2.name);
    }

}
