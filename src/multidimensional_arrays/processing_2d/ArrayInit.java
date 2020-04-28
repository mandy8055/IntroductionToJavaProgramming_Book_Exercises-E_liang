package multidimensional_arrays.processing_2d;

import java.util.Scanner;

class ArrayInit {
    private static final Scanner sc = new Scanner(System.in);
    public static int[][] init1(int[][] matrix){
        for(int rows = 0; rows < matrix.length; rows++){
            for(int columns = 0; columns < matrix[rows].length; columns++){
                matrix[rows][columns] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] init2(int[][] matrix){
        for(int rows = 0; rows < matrix.length; rows++){
            for(int columns = 0; columns < matrix[rows].length; columns++){
                matrix[rows][columns] = (int)(Math.random() * (25 - 1 + 1)) + 1;
            }
        }
        return matrix;
    }
//  Summing all the elements of the given 2D array
    public static int sumOfAllElements(int[][] matrix){
        int sum = 0;
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        return sum;
    }
//    Summing the elements by column
    public static void sumByColumn(int[][] matrix){
        for(int column = 0; column < matrix[0].length; column++){
            int total = 0;
            for (int[] ints : matrix) total += ints[column];
                System.out.println("Sum for column " + column + " is " + total);
        }
    }

//  Find the row that has the largest sum
    public static void largestSumRow(int[][] matrix){
        int maxRow = 0;
        int indexOfMaxRow = 0;
//      Get the sum of first row in maxRow
        for(int column =0; column < matrix[0].length; column++){
            maxRow += matrix[0][column];
        }

        for(int row = 1; row < matrix.length; row++){
            int totalOfThisRow = 0;
            for(int column = 0; column < matrix[row].length; column++)totalOfThisRow += matrix[row][column];

            if(totalOfThisRow > maxRow){
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Row " + indexOfMaxRow + " has the maximum sum of " + maxRow);
    }

//   Random Shuffling
    public static void randomShuffling(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                int iVal = (int) (Math.random() * matrix.length);
                int jVal = (int) (Math.random() * matrix[i].length);

//               Swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[iVal][jVal];
                matrix[iVal][jVal] = temp;
            }
        }
    }
}
