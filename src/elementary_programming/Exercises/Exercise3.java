package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise3 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a value for feet: ");
        double feet = sc.nextDouble();
        System.out.println(feet + " feet is " + (feet * 0.305) + " metres");
        sc.close();
    }
}
