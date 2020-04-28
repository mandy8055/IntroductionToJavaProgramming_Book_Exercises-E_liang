package objects_and_classes_primer.Exercises;
import java.util.Scanner;
public class Exercise12 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter the endpoints of the first line segment: ");

        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.println();
        System.out.print("Enter the endpoints of the second line segment: ");

        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        double a = ((y2 - y1) / (x2 - x1));
        double c = ((y4 - y3) / (x4 - x3));
        double e = y1 - (a * x1);
        double f = y3 - (c * x3);
        LinearEquation linearEquation = new LinearEquation(-a, 1.0, -c, 1.0, e, f);
        if(linearEquation.isSolvable())System.out.println("The intersecting point is: (" + linearEquation.getX()
                + ", " + linearEquation.getY() + ").");
        else System.out.println("The equation has no solution");

    }
}




