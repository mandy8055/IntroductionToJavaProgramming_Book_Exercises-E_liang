package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise1 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the temperature in celsius: ");
        double temp_celsius = sc.nextDouble();
        double temp_fahrenheit = ((9 * temp_celsius) / 5) + 32;
        System.out.println("The temperature in Fahrenheit is " + temp_fahrenheit);
        sc.close();
    }
}
