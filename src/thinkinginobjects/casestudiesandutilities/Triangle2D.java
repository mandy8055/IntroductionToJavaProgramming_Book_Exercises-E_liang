package thinkinginobjects.casestudiesandutilities;

import java.awt.geom.Line2D;

public class Triangle2D {
    private Point p1, p2, p3;

//  No-arg constructor
    public Triangle2D(){
        p1 = new Point(0, 0);
        p2 = new Point(1, 1);
        p3 = new Point(2, 5);
    }
//  Parametrized Constructor
    public Triangle2D(Point p1, Point p2, Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
//  Accessor Methods
    public Point getP1() {return p1;}
    public Point getP2(){return p2;}
    public Point getP3(){return p3;}
//  Mutator Methods
    public void setP1(Point p1){this.p1 = p1;}
    public void setP2(Point p2){this.p2 = p2;}
    public void setP3(Point p3){this.p3 = p3;}

    //  Implementable methods
    public double getArea(){
        double side1 = p1.distance(p2);
        double side2 = p1.distance(p3);
        double side3 = p2.distance(p3);
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s- side2) * (s - side3));
//      We can use this also.
//      return 0.5 * ((p1.getX() * (p2.getY() - p3.getY())) + (p2.getX() * (p3.getY() - p1.getY())) + (p3.getX() * (p1.getY() - p2.getY())));
    }
    public double getPerimeter(){
        return p1.distance(p2) + p1.distance(p3) + p2.distance(p3);
    }
    public boolean contains(double x, double y){
        double maxX = Math.max(p1.getX(), Math.max(p2.getX(), p3.getX()));
        double minX = Math.min(p1.getX(), Math.min(p2.getX(), p3.getX()));
        double maxY = Math.max(p1.getY(), Math.max(p2.getY(), p3.getY()));
        double minY = Math.min(p1.getY(), Math.min(p2.getY(), p3.getY()));
//      Point lies outside the triangle
        if(x < minX || x > maxX || y < minY || y > maxY)return false;

        Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
        Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());

//      Point lies on one of the sides of the triangle
        if(side1.contains(x, y) || side2.contains(x, y) || side3.contains(x, y))return true;

        /*Algorithm to detect whether a point is inside the triangle:
        * 1. Draw 3 dashed lines.
        * 2. If the point is inside a triangle;
        *   2.1. each dashed line should intersect a side only once.
        *   2.2. If a dashed line intersects a side twice, then the point must be outside the triangle.*/
        double topY = 0;
        if(x == p1.getX())topY = p1.getY();
        else if(x == p2.getX())topY = p2.getY();
        else if(x == p3.getX())topY = p3.getY();
//      Dashed line
        Line2D line;
        if(y < topY)line = new Line2D.Double(x, y, x, minY);
        else line = new Line2D.Double(x, y, x, maxY);
//      Number of intersections
        int hits = 0;
        if(line.intersectsLine(side1))hits++;
        if(line.intersectsLine(side2))hits++;
        if(line.intersectsLine(side3))hits++;
//      Dashed line should intersect only thrice. For other value return false.
        return !(hits % 2 == 0);
    }
    public boolean contains(Triangle2D triangle2D){
        return contains(triangle2D.p1.getX(), triangle2D.p1.getY()) &&
                contains(triangle2D.p2.getX(), triangle2D.p2.getY()) &&
                contains(triangle2D.p3.getX(), triangle2D.p3.getY());
    }
    public boolean intersectsOrOverlaps(Triangle2D triangle2D){
        /*
        * CASE 1: Two triangles overlap if either one of them is inside the other.
        * CASE 2: One triangle intersects a side in the other triangle
        * */
//      Sides of given triangle
        Line2D line1 = new Line2D.Double(triangle2D.p1.getX(), triangle2D.p1.getY(), triangle2D.p2.getX(), triangle2D.p2.getY());
        Line2D line2 = new Line2D.Double(triangle2D.p1.getX(), triangle2D.p1.getY(), triangle2D.p3.getX(), triangle2D.p3.getY());
        Line2D line3 = new Line2D.Double(triangle2D.p2.getX(), triangle2D.p2.getY(), triangle2D.p3.getX(), triangle2D.p3.getY());
//      Sides of this triangle
        Line2D side1 = new Line2D.Double(p1.getX(), p1.getY(), p2.getX(), p2.getY());
        Line2D side2 = new Line2D.Double(p1.getX(), p1.getY(), p3.getX(), p3.getY());
        Line2D side3 = new Line2D.Double(p2.getX(), p2.getY(), p3.getX(), p3.getY());

        return (contains(triangle2D) ||
                triangle2D.contains(this) ||
                line1.intersectsLine(side1) ||
                line1.intersectsLine(side2) ||
                line1.intersectsLine(side3) ||
                line2.intersectsLine(side1) ||
                line2.intersectsLine(side2) ||
                line2.intersectsLine(side3) ||
                line3.intersectsLine(side1) ||
                line3.intersectsLine(side2) ||
                line3.intersectsLine(side3));
    }
}
