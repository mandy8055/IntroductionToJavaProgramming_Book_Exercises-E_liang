package single_dimensional_arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;
public class Exercise27 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter list1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i < size1; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter list2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < size2; i++){
            arr2[i] = sc.nextInt();
        }

        if(equals(arr1, arr2))System.out.println("Two lists are identical");
        else System.out.println("Two lists are not identical");

        sc.close();
    }

    public static boolean equals(int[] list1, int[] list2){
//      Base case
        if(list1.length != list2.length)return false;
//      In the problem strict equality is not required.
        Arrays.sort(list1);
        Arrays.sort(list2);
        return Arrays.equals(list1, list2);
    }
}
