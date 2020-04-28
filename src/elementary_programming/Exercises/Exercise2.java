package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise2 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the radius and length of the cylinder: ");
        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double area = Math.PI * radius * radius;
        double volume = area * length;
        System.out.println("The area of the cylinder is: " + area);
        System.out.println("The volume of the cylinder is: " + volume);
        sc.close();
    }
}
