package objectsandclassesprimer.Exercises;

public class Exercise1 {
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5,35.9);

        System.out.println("The area of first rectangle is " + rect1.getArea()
                + " and the perimeter of first rectangle is " + rect1.getPerimeter());
        System.out.println("The area of second rectangle is " + rect2.getArea()
                + " and the perimeter of second rectangle is " + rect2.getPerimeter());
    }
}

class Rectangle{
    private double width, height;
    public Rectangle(){
        width = height = 1;
    }
    public Rectangle(double widthVal, double heightVal){
        width = widthVal;
        height = heightVal;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public double getArea(){
        return width * height;
    }
}
