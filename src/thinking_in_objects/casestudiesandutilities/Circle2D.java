package thinking_in_objects.casestudiesandutilities;

public class Circle2D{
    //  Constants
    public static final int CIRCLES_TOUCH_EACH_OTHER = 0;
    public static final int CIRCLES_DO_NOT_TOUCH_EACH_OTHER = 1;
    public static final int CIRCLES_INTERSECT_EACH_OTHER = 2;
    //  data fields
//  x and y represent the center of the circle
    private double x;
    private double y;
    private double radius;
    //  No-arg constructor with default parameters for constructing a circle
    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }
    //  Parametrized Constructor
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //  Accessor Methods
    public double getX(){return x;}
    public double getY(){return y;}
    public double getRadius(){return radius;}

    //  Implementable methods
    public double getArea(){return (Math.PI * radius * radius);}
    public double getPerimeter(){return (2 * Math.PI * radius);}
    public boolean contains(double x, double y){
        double distance = getDistance(this.x, this.y, x, y);
        return !(distance > radius);
    }
    public boolean contains(Circle2D circle2D){
        double distance = getDistance(this.x, this.y, circle2D.getX(), circle2D.getY());
        return (radius > distance);
    }
    public int intersects(Circle2D circle2D){
        double distance = getDistance(this.x, this.y, circle2D.getX(), circle2D.getY());
//      Circles touch each other
        if(distance == (this.radius + circle2D.getRadius()))return CIRCLES_TOUCH_EACH_OTHER;
//      Circles do not touch each other
        else if(distance > this.radius + circle2D.getRadius())return CIRCLES_DO_NOT_TOUCH_EACH_OTHER;
//      Circles intersect each other
        else return CIRCLES_INTERSECT_EACH_OTHER;

    }

    //  Helper Method
    private double getDistance(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
    }
}

