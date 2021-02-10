package algorithm.sorting;

class SortingAlgos {
     void bubbleSort(int[] arr){
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
    void insertionSort(int[] arr){
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
}
