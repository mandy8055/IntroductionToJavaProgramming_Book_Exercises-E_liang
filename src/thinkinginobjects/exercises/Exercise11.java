package thinkinginobjects.exercises;
import thinkinginobjects.casestudiesandutilities.Circle2D;
public class Exercise11 {
    public static void main(String[] args){
        Circle2D circle2D = new Circle2D(2, 2, 5.5);
        System.out.println(circle2D.getArea());
        System.out.println(circle2D.getPerimeter());
        System.out.println(circle2D.contains(3, 3));
        System.out.println(circle2D.contains(new Circle2D(4, 5, 10.5)));
        if(circle2D.intersects(new Circle2D(3, 5, 2.3)) == 0)System.out.println("Circles touch each other");
        else if (circle2D.intersects(new Circle2D(3, 5, 2.3)) == 1)System.out.println("Circles do not touch each other");
        else System.out.println("Circles overlap or intersect each other");

    }
}