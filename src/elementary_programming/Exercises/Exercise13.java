package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise13 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the monthly saving amount: ");
        double amount = sc.nextDouble();
        double total = 0;
        for(int i = 0; i < 6; i++){
            total = (total + amount) * (1 + 0.00417);
        }
        System.out.println("After the sixth month, the account value is $" + total);
        sc.close();
    }
}
