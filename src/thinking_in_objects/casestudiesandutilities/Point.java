package thinking_in_objects.casestudiesandutilities;

public class Point {
    private double x;
    private double y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    //  Accessor Methods
    public double getX(){return this.x;}
    public double getY(){return this.y;}

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(y - this.y, 2) + Math.pow(x - this.x, 2));
    }
    public double distance(Point myPoint){
        return Math.sqrt(Math.pow(myPoint.getY() - this.y, 2) + Math.pow(myPoint.getX() - this.x, 2));
    }
}
