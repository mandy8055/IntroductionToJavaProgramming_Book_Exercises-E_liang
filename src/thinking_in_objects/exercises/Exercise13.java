package thinking_in_objects.exercises;
import thinking_in_objects.casestudiesandutilities.Rectangle2D;
public class Exercise13 {
    public static void main(String[] args){
        Rectangle2D myRectangle2D = new Rectangle2D(2, 2, 5.5, 4.9);
        System.out.println(myRectangle2D.getArea());
        System.out.println(myRectangle2D.getPerimeter());
        System.out.println(myRectangle2D.contains(3, 3));
        System.out.println(myRectangle2D.contains(new Rectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(myRectangle2D.overlaps(new Rectangle2D(3, 5, 2.3, 5.4)));

    }
}


