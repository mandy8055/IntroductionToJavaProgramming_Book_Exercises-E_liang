package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise24 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter an amount, for example 1156: ");
        int amount = sc.nextInt();
        computeChange(amount);
        sc.close();
    }

    public static void computeChange(int amount){
        int tempAmount = amount;
//      Find the number of one dollars
        int numberOfDollars = tempAmount / 100;
        tempAmount %= 100;
//      Find the number of quarters in the remaining amount
        int numberOfQuarters = tempAmount / 25;
        tempAmount %=25;
//      Find the number of dimes in the remaining amount
        int numberOfDimes = tempAmount / 10;
        tempAmount %= 10;
//      Find the number of nickels in the remaining amount
        int numberOfNickels = tempAmount / 5;
        tempAmount %= 5;
//      Find the number of pennies
        int numberOfPennies = tempAmount;
        System.out.println("Your amount " + amount + " consist of \n" +
                "\t" + numberOfDollars + " dollars\n" +
                "\t" + numberOfQuarters + " quarters\n" +
                "\t" + numberOfDimes + " dimes\n" +
                "\t" + numberOfNickels + " nickels\n" +
                "\t" + numberOfPennies + " pennies");
    }
}
