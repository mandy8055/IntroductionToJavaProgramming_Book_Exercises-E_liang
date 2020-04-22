package thinkinginobjects.exercises;

public class Exercise4 {
    public static void main(String[] args){
        MyPoint myPoint = new MyPoint();
        System.out.println(myPoint.distance(new MyPoint(10, 30.5)));
    }
}

class MyPoint{
    private double x;
    private double y;
    public MyPoint(){
         this.x = 0;
         this.y = 0;
    }
    public MyPoint(double x, double y){
         this.x = x;
         this.y = y;
    }
//  Accessor Methods
    public double getX(){return this.x;}
    public double getY(){return this.y;}

    public double distance(double x, double y){
        return Math.sqrt(Math.pow(y - this.y, 2) + Math.pow(x - this.x, 2));
    }
    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow(myPoint.getY() - this.y, 2) + Math.pow(myPoint.getX() - this.x, 2));
    }
}
