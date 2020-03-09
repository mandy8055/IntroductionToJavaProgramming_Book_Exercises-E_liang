package singledimensionalarrays.Exercises;
import java.util.Scanner;
public class Exercise28 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int[] arr = new int[10];
        System.out.println("Enter 10 integers below: ");
        for(int i = 0; i < 10; i++)arr[i] = sc.nextInt();
//      Printing the combination of numbers
        System.out.println("All the possible combination of numbers picked two at a time for the entered " +
                "numbers are: ");
        printCombinations(arr);
    }

    public static void printCombinations(int[] arr){
        for(int i = 0; i < 10; i++){
            for(int j = i + 1; j < 10; j++){
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
            }
        }
    }
}
