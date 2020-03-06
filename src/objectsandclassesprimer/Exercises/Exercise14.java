package objectsandclassesprimer.Exercises;
import java.util.Random;
import java.util.Arrays;

public class Exercise14 {
    public static void main(String[] args){
        int[] arr = new int[100000];
        Random rand = new Random();
        Stopwatch stopwatch = new Stopwatch();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt((100000 - 1) + 1);
        }
        stopwatch.start();
        long getStart = stopwatch.getStartTime();
//      Arrays.sort(arr);
        selectionSort(arr);
        stopwatch.stop();
        long getEnd = stopwatch.getEndTime();
        System.out.print("The time to sort 100000 elements using selection sort is " + (getEnd - getStart) + "ms.\n");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] arr){
        int min = 0, posToSwap = 0;
        for(int i = 0; i < arr.length; i++){
            min = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    posToSwap = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[posToSwap];
            arr[posToSwap] = temp;
        }
    }
}

class Stopwatch{
    private long startTime;
    private long endTime;

//  Getters
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
//  No-arg constructor
    public Stopwatch(){
        startTime = System.currentTimeMillis();
    }

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void stop(){
        endTime = System.currentTimeMillis();
    }
}
