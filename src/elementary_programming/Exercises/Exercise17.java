package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise17 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the temperature in fahrenheit: ");
        double temp = sc.nextDouble();
        System.out.print("Enter the wind speed in miles per hour: ");
        double wind_speed = sc.nextDouble();
        double wind_chill_temperature = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(wind_speed, 0.16))
                + (0.4275 * temp * Math.pow(wind_speed, 0.16));
        System.out.println("The wind chill index is: " + wind_chill_temperature);
        sc.close();
    }
}
