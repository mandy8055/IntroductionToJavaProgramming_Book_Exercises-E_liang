package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise23 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter an ASCII code: ");
        int ascii_num = sc.nextInt();
        System.out.println("The character is " + (char)ascii_num);
        sc.close();
    }
}
