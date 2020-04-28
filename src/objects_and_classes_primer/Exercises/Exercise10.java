package objects_and_classes_primer.Exercises;
import java.util.Scanner;

public class Exercise10 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if(quadraticEquation.getDiscriminant() == 0)System.out.println("The root is " + quadraticEquation.getRoot1());
        else if(quadraticEquation.getDiscriminant() < 0)System.out.println("The equation has no real roots");
        else System.out.println("The roots are " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        sc.close();
    }
}

class QuadraticEquation{
    private double a, b, c;
    
    public QuadraticEquation(double aVal, double bVal, double cVal){
        a = aVal;
        b = bVal;
        c = cVal;
    }
    
    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}
    
    public double getDiscriminant(){
        return ((b * b) - (4 * a * c));
    }

    public double getRoot1(){
        return ((-b) + Math.sqrt(getDiscriminant())) / 2 * a;
    }

    public double getRoot2(){
        return ((-b) - Math.sqrt(getDiscriminant())) / 2 * a;
    }
}
