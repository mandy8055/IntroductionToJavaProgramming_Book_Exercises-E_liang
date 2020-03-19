package multidimensionalarrays.case_studies;
import java.util.Scanner;
public class FindingClosestPair {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number of points: ");
        int n = sc.nextInt();

        double[][] arr = new double[n][2];
        System.out.print("Enter " + n + " points: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                arr[i][j] = sc.nextDouble();
            }
        }

        displayClosestPairs(arr);

//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] +" ");
//            }
//        }
    }

    public static void displayClosestPairs(double[][] arr){

//      Calculate minimum distance
        double tempMinDistance = Math.sqrt(Math.pow((arr[1][0] - arr[0][0]), 2) + Math.pow((arr[1][1] - arr[0][1]), 2));
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
//                Calculate distance

            }
        }
    }

}
