package strings.Exercises;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise5 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        for (int i = 0;i < count(str).length; i++){
            if(count(str)[i] != 0)System.out.println("count[" + i + "] is " + count(str)[i]);
        }
        sc.close();
    }
    private static int[] count(String digitString){
        int[] resArr = new int[10];
        for(char ch : digitString.toCharArray()){
            if(Character.isDigit(ch)){
                resArr[(ch - '0')]++;
            }
        }
        return resArr;
    }
}
