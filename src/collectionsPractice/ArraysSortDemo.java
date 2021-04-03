package collectionsPractice;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortDemo {
    public static void main(String[] args){
        int[] arr = {50, 25, 70, 22, 15, 65};
        System.out.println("Primitive array before sorting: ");
        for(int i1 : arr){
            System.out.print(i1 + " ");
        }
        System.out.println("\nPrimitive array after sorting: ");
        Arrays.sort(arr);
        for(int i1 : arr){
            System.out.print(i1 + " ");
        }
        String[] strArr = {"Rock", "Paper", "Scissor", "Mike", "Rorke"};
        System.out.println("Object array before sorting: ");
        for(String s1 : strArr){
            System.out.print(s1 + ", ");
        }
        System.out.println("\nObject array after sorting: ");
        Arrays.sort(strArr);
        for(String s1 : strArr){
            System.out.print(s1 + ", ");
        }
        System.out.println("\nObjects array after getting sorted in descending order: ");
        Arrays.sort(strArr, new MyComparator11());
        for(String s1 : strArr){
            System.out.print(s1 + ", ");
        }

    }
}

class MyComparator11 implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
