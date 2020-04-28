package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise6 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a number between 0 and 1000: ");
        int num = sc.nextInt();
        int sum = 0, rem;
        while(num != 0){
            rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("The sum of the digits is " + sum);
        sc.close();
    }
}
