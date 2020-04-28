package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise20 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter balance and interest rate(e.g., 3 for 3%): ");
        double balance = sc.nextDouble();
        double rate = sc.nextDouble();
        System.out.println("The interest is " + (balance * (rate / 1200)));
        sc.close();
    }
}
