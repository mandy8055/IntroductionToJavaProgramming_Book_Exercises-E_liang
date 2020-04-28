package objects_and_classes_primer.Exercises;
import java.util.Scanner;
public class Exercise11 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        LinearEquation linearEquation = new LinearEquation(a, b, c, d, e, f);
        if(linearEquation.isSolvable()) System.out.println("X is " + linearEquation.getX()
                + " and Y is " + linearEquation.getY());
        else System.out.println("The Equation has no solution.");
//       Releasing the resource
        sc.close();

    }
}

class LinearEquation{ 
    private double a, b, c, d, e, f;
    
    public LinearEquation(double aVal, double bVal, double cVal, double dVal, double eVal, double fVal){
        a = aVal;
        b = bVal;
        c = cVal;
        d = dVal;
        e = eVal;
        f = fVal;
        
    }
    
    public double getA(){return a;}
    public double getB(){return b;}
    public double getC(){return c;}
    public double getD(){return d;}
    public double getE(){return e;}
    public double getF(){return f;}
    
    public boolean isSolvable(){
        return (getA() * getD()) - (getB() * getC()) != 0;
    }

    //  CRAMER's Rule for solving the linear equation in two variables

    public double getX(){
        return ((getE() * getD()) - (getB() * getF())) / ((getA() * getD()) - (getB() * getC()));
    }

    public double getY(){
        return ((getA() * getF()) - (getE() * getC())) / ((getA() * getD()) - (getB() * getC()));
    }
}
