package strings.Exercises;
import java.util.Scanner;
public class Exercise10_1 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();
        System.out.println("The binary equivalent of the number is " + decimalToBinary(num));
        sc.close();
    }

    private static String decimalToBinary(int value){
        if(value == 0)return String.valueOf(0);
        return String.valueOf(((10 * Integer.parseInt(decimalToBinary(value / 2))) + value % 2));
    }
}
