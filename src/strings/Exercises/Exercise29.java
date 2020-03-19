package strings.Exercises;
import java.util.Scanner;
public class Exercise29 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String s = sc.nextLine();
        System.out.println("The ISBN-13 number is " + getISBN_13(s));
        sc.close();
    }
    public static String getISBN_13(String s){return (s + get13ISBN(s));}


    public static int get13ISBN(String s){
        int sum = 0, checkSum = 0;
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0)sum = sum + (s.charAt(i) - '0');
            else sum = sum + (3 * (s.charAt(i) - '0'));
        }
        sum %= 10;
        checkSum = 10 - sum;
        if(checkSum == 10)return 0;
        else return checkSum;
    }

}
