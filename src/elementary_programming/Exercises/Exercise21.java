package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise21 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter investment amount: ");
        float investment_amount = sc.nextFloat();
        System.out.print("Enter annual interest rate in percentage: ");
        float rate = sc.nextFloat();
        System.out.print("Enter number of years: ");
        float yrs = sc.nextFloat();
        float number1 = rate + 1;
        float power = yrs * 12;
        float future_investment_value = investment_amount + (float)(Math.pow(number1, power));
        System.out.println("Accumulated value is " + (int)future_investment_value);
        sc.close();
    }
}
