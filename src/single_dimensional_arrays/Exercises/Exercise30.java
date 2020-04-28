package single_dimensional_arrays.Exercises;

import java.util.Scanner;

public class Exercise30 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number of values in the series: ");
        int size = sc.nextInt();
        int[] series = new int[size];
        System.out.println("Enter " + size + " element series below: ");
        for(int i = 0; i < size; i++)series[i] = sc.nextInt();
        System.out.println(isConsecutiveFour(series));
        sc.close();
    }

    public static boolean isConsecutiveFour(int[] series){
//      Take the first element of the series as a point of reference
        int comp = series[0];
//      Main case
        int counter4 = 1;
        for(int i = 1; i < series.length; i++){
            if(comp == series[i]){
                counter4++;
            }else{
                counter4 = 1;
                comp = series[i];
            }
            if(counter4 == 4)return true;
        }
        return false;
    }
}
