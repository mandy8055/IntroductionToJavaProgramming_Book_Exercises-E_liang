package strings.Exercises;

import java.util.Scanner;
public class Exercise31 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println("The new String is: " + swapCase(s));
        sc.close();
    }

    public static String swapCase(String s){
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLowerCase(ch))sb.append(Character.toUpperCase(ch));
            else if(Character.isUpperCase(ch))sb.append(Character.toLowerCase(ch));
            else sb.append(ch);
        }
        return sb.toString();
    }


}
