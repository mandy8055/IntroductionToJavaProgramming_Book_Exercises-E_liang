package multidimensionalarrays.processing_2d;

public class DriverClass {
    public static void main(String[] args){
        int[][] matrix = new int[5][5];

        matrix = ArrayInit.init2(matrix);

        printing2D(matrix);


//      Printing the sum of all elements of the given array
        System.out.println("The sum of all the elements of the given array is " + ArrayInit.sumOfAllElements(matrix));
//      Printing the sum by column
        ArrayInit.sumByColumn(matrix);
//      Printing the largest sum by row
        ArrayInit.largestSumRow(matrix);
//        Random Shuffling
        ArrayInit.randomShuffling(matrix);
        printing2D(matrix);

    }

    public static void printing2D(int[][] matrix){
        //     Printing a 2D array
        for(int rows = 0; rows < matrix.length; rows++){
            for(int columns = 0; columns < matrix[rows].length; columns++){
                System.out.print(matrix[rows][columns] + " ");
            }
            System.out.println();
        }
    }
}
