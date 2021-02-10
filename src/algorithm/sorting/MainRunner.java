package algorithm.sorting;

public class MainRunner {
    private static int[] arr = {80, 20, 50, 5, 90, 23, 15};
    public static void main(String[] args){
        SortingAlgos st = new SortingAlgos();
//        st.bubbleSort(arr);
//        st.insertionSort(arr);
//        st.selectionSort(arr);
//        st.mergeSort(arr, 0, arr.length - 1);
        st.quickSort(arr, 0, arr.length - 1);
        SortingAlgos.printArr(arr);
    }
}
