package algorithm.sorting;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

class SortingAlgos {
    // Implementation of Bubble Sort
    void bubbleSort(int @NotNull [] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!swapped)break;
        }
    }
    // Implementation of Insertion Sort
    void insertionSort(int @NotNull [] arr){
         for(int i = 1; i < arr.length; i++){
             int key = arr[i];
             int j = i - 1;
             while(j >= 0 && arr[j] > key){
                 arr[j + 1] = arr[j];
                 j--;
             }
             arr[j + 1] = key;
         }
    }
// Implementation of Merge Sort
    void mergeSort(int[] arr, int left, int right){
         if(left < right){
             int middle = (int) Math.floor((left + right) / 2);
             mergeSort(arr, left, middle);
             mergeSort(arr, middle + 1, right);
             merge(arr, left, middle, right);
         }
    }
// Implementation of Quick Sort
    void quickSort(int[] arr, int low, int high){
         if(low < high){
             int partitions = partition(arr, low, high);
             quickSort(arr, low, partitions - 1);
             quickSort(arr, partitions + 1, high);
         }
    }
// Implementation of Selection Sort
    void selectionSort(int[] arr){
         for(int i = 0; i < arr.length - 1; i++){
             int jmin = i;
             for(int j = i + 1; j < arr.length; j++){
                 if(arr[jmin] > arr[j])jmin = j;
             }
             if(i != jmin){
                 // swap
                 int temp = arr[jmin];
                 arr[jmin] = arr[i];
                 arr[i] = temp;
             }
         }
    }

// Utility Methods
   public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(i == (arr.length - 1)){
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
   }
//   Implementation of merge algorithm
   private static void merge(int[] arr, int left, int middle, int right){
         // define the sizes of the sub-arrays
       int n1 = middle - left + 1;
       int n2 = right - middle;
//       Create two sub-arrays
       int[] LEFT = new int[n1];
       int[] RIGHT = new int[n2];
       // Populate the sub-arrays
       for(int i = 0; i < n1; i++)
           LEFT[i] = arr[left + i];
       for(int j = 0; j < n2; j++)
           RIGHT[j] = arr[middle + 1 + j];
       // Merge the sub-arrays
       int k = left, i = 0, j = 0;
       while(i < n1 && j < n2){
           if(LEFT[i] <= RIGHT[j])
               arr[k] = LEFT[i++];
           else
               arr[k] = RIGHT[j++];
           k++;
       }
       // Merge the remaining elements
       while(i < n1)
           arr[k++] = LEFT[i++];
       while(j < n2)
           arr[k++] = RIGHT[j++];
   }
// Implementation of partition algorithm
   private static int partition(int[] arr, int low, int high){
         int pivot = arr[high];
         int i = low - 1;
         for(int j = low; j < arr.length - 1; j++){
             if(pivot >= arr[j]){
                 i++;
                 int temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
             }
         }
         int temp = arr[high];
         arr[high] = arr[i + 1];
         arr[i + 1] = temp;
         return (i + 1);
   }
   // NON-COMPARISON Based sorting algorithms
   /*
   * 1. Time complexity : O(n + k) where k is the range
   * 2. Space complexity: O(n) for the auxiliary array
   * */
   void countingSort(int[] arr, int range){
       // Auxiliary array
       int[] tempArr = new int[range + 1];
       // Initialize every element in an array with 0.
       Arrays.fill(tempArr, 0);
       // Maintain count of elements which are being repeated in the array.
       for (int value : arr) {
           tempArr[value]++;
       }
       int k = 0;
       for(int i = 0; i <= range; i++){
           if(tempArr[i] != 0){
               int j;
               for(j = 0; j < tempArr[i]; j++){
                   arr[k++] = i;
               }
           }
       }
   }
}


