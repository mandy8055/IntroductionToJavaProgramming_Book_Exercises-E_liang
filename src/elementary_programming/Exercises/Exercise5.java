package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise5 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = sc.nextDouble();
        double gratuity_rate = sc.nextDouble();
        double gratuity = (subtotal * gratuity_rate) / 100;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + (subtotal + gratuity));
        sc.close();
    }
}
