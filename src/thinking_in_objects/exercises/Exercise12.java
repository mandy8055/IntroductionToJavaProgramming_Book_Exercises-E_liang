package thinking_in_objects.exercises;

import thinking_in_objects.casestudiesandutilities.Point;
import thinking_in_objects.casestudiesandutilities.Triangle2D;

public class Exercise12 {
    public static void main(String[] args){
        Triangle2D triangle2D = new Triangle2D(new Point(2, 2), new Point(5.5, 4.9), new Point(9.0, 10.3));
        System.out.println("Area is: " + triangle2D.getArea());
        System.out.println("Perimeter is: " + triangle2D.getPerimeter());
        System.out.println(triangle2D.contains(3, 3));
        System.out.println(triangle2D.contains(new Triangle2D(new Point(4, 5), new Point(10.5, 3.2), new Point(-0.5, -10.5))));
        System.out.println(triangle2D.intersectsOrOverlaps(new Triangle2D(new Point(3, 5), new Point(2.3, 6.7), new Point(5.5, 8.8))));


    }
}
