package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise7 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number of minutes: ");
        long minutes = sc.nextLong();
        long years = minutes / (365 * 24 * 60);
        long remaining_Minutes = minutes % (365 * 24 * 60);
        long days = remaining_Minutes / (24 * 60);
        System.out.println(minutes +" minutes is approximately " + years + " years and " + days + " days");
        sc.close();
    }
}
