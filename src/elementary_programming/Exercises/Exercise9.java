package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise9 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter v0, v1 and t: ");
        double v0 = sc.nextDouble();
        double v1 = sc.nextDouble();
        double t = sc.nextDouble();
        System.out.println("The average acceleration is "+  (v1 - v0) / t);
        sc.close();
    }
}
