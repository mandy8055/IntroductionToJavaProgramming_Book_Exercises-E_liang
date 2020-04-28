package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise4 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number in pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " pounds is " + (pounds * 0.454) + " kilograms");
        sc.close();
    }
}
