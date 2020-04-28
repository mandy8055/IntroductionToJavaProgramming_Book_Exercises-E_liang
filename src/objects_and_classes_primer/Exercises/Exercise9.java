package objects_and_classes_primer.Exercises;

public class Exercise9 {
    public static void main(String[] args){
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6, 4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("The perimeter of first instance is " + regularPolygon1.getPerimeter() +
                " and the area of the first instance is " + regularPolygon1.getArea());
        System.out.println("The perimeter of second instance is " + regularPolygon2.getPerimeter() +
                " and the area of the second instance is " + regularPolygon2.getArea());
        System.out.println("The perimeter of third instance is " + regularPolygon3.getPerimeter() +
                " and the area of the third instance is " + regularPolygon3.getArea());
    }
}

class RegularPolygon{
    private int n;
    private double side, x, y;

    public RegularPolygon(){
        n = 3;
        side = 1;
        y = 0;
    }

    public RegularPolygon(int nVal, double sideVal){
        y = 0;
        n = nVal;
        side = sideVal;
    }

    public RegularPolygon(int nVal, double sideVal, double xVal, double yVal){
        n = nVal;
        side = sideVal;
        x = xVal;
        y = yVal;
    }

//  Accessor Method
    public int getN(){return n;}
    public double getSide(){return side;}
    public double getX(){return x;}
    public double getY(){return y;}

//  Mutator Method
    public void setN(int nVal){n = nVal;}
    public void setSide(double sideVal){side = sideVal;}
    public void setX(double xVal){x = xVal;}
    public void setY(double yVal){y = yVal;}

    public double getPerimeter(){
        return (n * side);
    }

    public double getArea(){
        return (n * side * side) / 4 * Math.tan((Math.PI / n));
    }


}
