package thinkinginobjects.casestudiesandutilities;

public class Rectangle2D {
    //  The point represents the center of the rectangle
    private double x;
    private double y;
    private double width;
    private double height;

    //  No-arg constructor
    public Rectangle2D(){
        this.x = 0;
        this.y = 0;
        this.width = 1;
        this.height = 1;
    }

    //   Parametrized constructor
    public Rectangle2D(double x, double y, double width, double height){
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
    public boolean contains(Rectangle2D rectangle2D){
        double x1Andx2 = rectangle2D.getX() - (rectangle2D.getWidth() / 2);
        double y1andy4 = rectangle2D.getY() - (rectangle2D.getHeight() / 2);
        double y2andy3 = rectangle2D.getY() + (rectangle2D.getHeight() / 2);
        double x3Andx4 = rectangle2D.getX() + (rectangle2D.getWidth() / 2);
        return (contains(x1Andx2, y1andy4) && contains(x1Andx2, y2andy3) && contains(x3Andx4, y2andy3) && contains(x3Andx4, y1andy4));
    }
    public boolean overlaps(Rectangle2D rectangle2D){
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
//  Exercise 15 part(Create a minimum bounding 2D rectangle to cover all the points inside)
    public static Rectangle2D getRectangle(double[] points){
        double maxX, minX;
        double maxY, minY;
        maxY = minY = points[1];
        maxX = minX = points[0];
        for(int counter = 2; counter < points.length; counter++){
            if(counter % 2 == 0) {
                maxX = Math.max(maxX, points[counter]);
                minX = Math.min(minX, points[counter]);
            }else{
                maxY = Math.max(maxY, points[counter]);
                minY = Math.min(minY, points[counter]);
            }
        }

//      Top-left
        Point p1 = new Point(minX, maxY);
//      Top-right
        Point p2 = new Point(maxX, maxY);
//      Bottom left
        Point p3 = new Point(minX, minY);

        return new Rectangle2D((maxX + minX) / 2, (maxY + minY) / 2, p1.distance(p2), p1.distance(p3));
    }
}
