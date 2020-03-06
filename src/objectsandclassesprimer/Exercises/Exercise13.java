package objectsandclassesprimer.Exercises;
import java.util.Scanner;

public class Exercise13 {
    private static final Scanner sc = new Scanner(System.in);

    public static Location locateLargest(double[][] a){
        Location loc = new Location();
        double max = a[0][0];
        int pos_i = 0, pos_j = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > max){
                    max = a[i][j];
                    pos_i = i;
                    pos_j = j;
                }
            }
        }
        loc.row = pos_i;
        loc.column = pos_j;
        loc.maxVal = max;
        return loc;
    }

    public static void main(String[] args){
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        double[][] arr = new double[rows][columns];
        System.out.println("Enter the array:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("The location of the largest element is " +
                locateLargest(arr).maxVal + " at (" + locateLargest(arr).row
                + ", " + locateLargest(arr).column + ").");
        sc.close();
    }
}

class Location{
    public int row;
    public int column;
    public double maxVal;
}
