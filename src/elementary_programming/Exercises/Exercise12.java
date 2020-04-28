package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise12 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter speed and Acceleration: ");
        double speed = sc.nextDouble();
        double acceleration = sc.nextDouble();
        System.out.println("The minimum runway length for this airplane is " + (Math.pow(speed, 2)/(2* acceleration)));
        sc.close();
    }
}
