package strings.Exercises;

import java.util.Scanner;
public class Exercise9 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the binary number: ");
        String binary = sc.nextLine();
        System.out.println("The number in Hex format is " + binaryToHex(binary));
        sc.close();
    }
    private static String binaryToHex(String binary){
        StringBuilder sb = new StringBuilder("0x");
        for(int i = 0; i < binary.length() - 3; i += 4){
            String temp1 = binary.substring(i, i + 4);
            if(Exercise8.binaryToDecimal(temp1) == 10)sb.append('A');
            else if(Exercise8.binaryToDecimal(temp1) == 11)sb.append('B');
            else if(Exercise8.binaryToDecimal(temp1) == 12)sb.append('C');
            else if(Exercise8.binaryToDecimal(temp1) == 13)sb.append('D');
            else if(Exercise8.binaryToDecimal(temp1) == 14)sb.append('E');
            else if(Exercise8.binaryToDecimal(temp1) == 15)sb.append('F');
            else if(Exercise8.binaryToDecimal(temp1) <= 9)sb.append(Exercise8.binaryToDecimal(temp1));
        }
        return sb.toString();
    }
}
