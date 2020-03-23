package strings.Exercises;
import java.util.Scanner;
public class Exercise8 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the binary number: ");
        String binary = sc.nextLine();
        System.out.println("The binary number in decimal is " + binaryToDecimal(binary));
        sc.close();
    }
    public static int binaryToDecimal(String binaryString){
        StringBuilder sb = new StringBuilder(binaryString);
        sb.reverse();
        String temp = sb.toString();
        int decimal = 0, i = 0;
        for(char ch : temp.toCharArray()){
            if(ch == '1'){
                decimal += (int)Math.pow(2, i);
                i++;
            }else if(ch == '0') i++;
            else return -1;
        }
        return decimal;
    }
}
