package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise10 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the amount of water in kilograms: ");
        double amt = sc.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double ini_temperature = sc.nextDouble();
        System.out.print("Enter the final temperature: ");
        double fin_temperature = sc.nextDouble();
        System.out.println("The energy needed is " + (amt * (fin_temperature - ini_temperature) * 4184));
        sc.close();
    }
}
