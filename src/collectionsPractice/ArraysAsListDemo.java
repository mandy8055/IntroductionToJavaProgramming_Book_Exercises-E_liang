package collectionsPractice;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListDemo {
    public static void main(String[] args){
        String[] strArr = {"Mike", "Paper", "Rock"};
        List list = Arrays.asList(strArr);
        System.out.println(list); // [Mike, Paper, Rock]
        strArr[0] = "Bose";
        System.out.println(list); // [Bose, Paper, Rock]
        list.set(1, "Jim");
        for(String str: strArr){
            System.out.print(str + ", "); // Bose, Jim, Rock,
        }
        list.add("John"); // throws UnsupportedOperationsException as runtime exception
        list.remove(2); // throws UnsupportedOperationsException as runtime exception
        list.set(2, new Integer(20)); // throws ArrayStoreException as runtime exception

    }
}
