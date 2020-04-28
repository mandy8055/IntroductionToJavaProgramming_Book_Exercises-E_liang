package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise16 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the side: ");
        double side = sc.nextDouble();
        System.out.println("The area of the hexagon is " + ((3 * Math.sqrt(3) * Math.pow(side, 2)) / 2));
        sc.close();
    }
}
