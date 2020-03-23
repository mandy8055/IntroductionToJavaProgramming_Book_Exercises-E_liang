package strings.Exercises;
import java.util.Scanner;
public class Exercise10_2 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the decimal number: ");
        int num = sc.nextInt();
        System.out.println("The binary equivalent of the number is " + decimalToBinary(num));
        sc.close();
    }
    private static String decimalToBinary(int value){
        StringBuilder sb = new StringBuilder();
        while (value != 0){
            sb.append(value % 2);
            value /= 2;
        }
        return sb.reverse().toString();
    }
}
