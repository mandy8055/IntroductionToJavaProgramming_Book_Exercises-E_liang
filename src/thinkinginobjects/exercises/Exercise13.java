package thinkinginobjects.exercises;

public class Exercise13 {
    public static void main(String[] args){
        MyRectangle2D myRectangle2D = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println(myRectangle2D.getArea());
        System.out.println(myRectangle2D.getPerimeter());
        System.out.println(myRectangle2D.contains(3, 3));
        System.out.println(myRectangle2D.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(myRectangle2D.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

    }
}

class MyRectangle2D{
//  The point represents the center of the rectangle
    private double x;
    private double y;
    private double width;
    private double height;

//  No-arg constructor
    public MyRectangle2D(){
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

//   Parametrized constructor
    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

//  Accessor Methods
    public double getX(){return x;}
    public double getY() {return y;}
    public double getWidth(){return width;}
    public double getHeight(){return height;}

//  Mutator Methods
    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}
    public void setWidth(double width){this.width = width;}
    public void setHeight(double height){this.height = height;}

//  Methods(properties)
    public double getArea(){
        return this.getHeight() * this.getWidth();
    }
    public double getPerimeter(){
        return 2 * (this.getWidth() + this.getHeight());
    }
    public boolean contains(double x, double y){
        return (2 * x <= 2 * getX() + getWidth() && 2 * x >= 2 * getX() - getWidth() && 2 * y <= 2 * getY()  + getHeight()
                && 2 * y >= 2 * getY() - getHeight());
    }
    public boolean contains(MyRectangle2D rectangle2D){
        double x1Andx2 = rectangle2D.getX() - (rectangle2D.getWidth() / 2);
        double y1andy4 = rectangle2D.getY() - (rectangle2D.getHeight() / 2);
        double y2andy3 = rectangle2D.getY() + (rectangle2D.getHeight() / 2);
        double x3Andx4 = rectangle2D.getX() + (rectangle2D.getWidth() / 2);
        return (contains(x1Andx2, y1andy4) && contains(x1Andx2, y2andy3) && contains(x3Andx4, y2andy3) && contains(x3Andx4, y1andy4));
    }
    public boolean overlaps(MyRectangle2D rectangle2D){
//      Given rectangle's points
        double x1 = rectangle2D.getX() - (rectangle2D.getWidth() / 2);
        double y1 = rectangle2D.getY() - (rectangle2D.getHeight() / 2);
        double x3 = rectangle2D.getX() + (rectangle2D.getWidth() / 2);
        double y3 = rectangle2D.getY() + (rectangle2D.getHeight() / 2);
//      This rectangle's points
        double x11 = this.getX() - (this.getWidth() / 2);
        double y11 = this.getY() - (this.getHeight() / 2);
        double x33 = this.getX() + (this.getWidth() / 2);
        double y33 = this.getY() + (this.getHeight() / 2);
//      if one rectangle is on the left side to other
        if(x1 > x33 || x11 > x3)return false;
//      If one rectangle is above other
        return !(y1 < y33) && !(y3 < y11);
    }
}
