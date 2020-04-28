package objects_and_classes_primer;

public class TestSimpleCircle{
//  Driver Method
    public static void main(String[] args){
//      Creating the 3 objects of SimpleCircle class
        SimpleCircle simpleCircle1 = new SimpleCircle(1);
        SimpleCircle simpleCircle2 = new SimpleCircle(25);
        SimpleCircle simpleCircle3 = new SimpleCircle(125);
//      Using the data fields and methods in print statements
        System.out.println("The area of circle with radius " + simpleCircle1.radius + " is " + simpleCircle1.getArea());
        System.out.println("The area of circle with radius " + simpleCircle2.radius + " is " + simpleCircle2.getArea());
        System.out.println("The area of circle with radius " + simpleCircle3.radius + " is " + simpleCircle3.getArea());
        simpleCircle1.radius = 100;
        System.out.println("The area of circle with radius " + simpleCircle1.radius + " is " + simpleCircle1.getArea());
    }
}

// Circle Class
class SimpleCircle{
//  Data Field
    double radius;
//  Constructor
    public SimpleCircle(double givenRadius){
        radius = givenRadius;
    }
//  Getters and setters
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public void setRadius(double newRadius){
        radius = newRadius;
    }
}
