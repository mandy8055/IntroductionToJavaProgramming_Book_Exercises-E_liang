package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise14 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter weight in pounds: ");
        double wt = sc.nextDouble();
        System.out.print("Enter height in inches: ");
        double ht = sc.nextDouble();
        double kg = wt * 0.45359237;
        double htm = ht * 0.0254;
        System.out.println("BMI is " + (kg / (htm * htm)));
        sc.close();
    }
}
