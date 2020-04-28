package java_introduction.Exercises;

public class Exercise11 {
    public static void main(String[] args){
        int current = 312032486;
        int time = 5 * (365 * 24 * 3600);
        int calculateTotal = current + (time / 7) - (time / 13) + (time / 45);
        System.out.println("Total population after 5 years: " + calculateTotal);
    }
}
