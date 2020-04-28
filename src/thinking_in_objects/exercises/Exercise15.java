package thinking_in_objects.exercises;
import thinking_in_objects.casestudiesandutilities.Rectangle2D;
import java.util.Scanner;
public class Exercise15 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double[] points = new double[10];
        System.out.print("Enter five points: ");
        for(int i = 0; i < points.length; i++){
                points[i] = sc.nextDouble();
        }
        System.out.println("The bounding rectangle's center (" + Rectangle2D.getRectangle(points).getX() + ", " +
                Rectangle2D.getRectangle(points).getY() + "), width " + Rectangle2D.getRectangle(points).getWidth() +
                ", height " + Rectangle2D.getRectangle(points).getHeight());
        sc.close();
    }
}
