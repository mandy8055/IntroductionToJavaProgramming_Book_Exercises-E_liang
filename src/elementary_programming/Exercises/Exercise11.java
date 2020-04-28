package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise11 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        System.out.println("Total population after " +  years + " years: " + java_introduction.Exercises.Exercise11.calculateTotalPopulation(years));
        sc.close();
    }
}
