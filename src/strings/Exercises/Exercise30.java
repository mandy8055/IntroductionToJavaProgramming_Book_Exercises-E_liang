package strings.Exercises;

import java.util.Scanner;
public class Exercise30 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        title(s);
        sc.close();
    }

    public static void title(String s){
        int counter = 1;
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while(i < s.length()){
            if(Character.isSpaceChar(s.charAt(i))){
                counter++;
                sb.append(s.charAt(i));
            }
            else if(Character.isLetter(s.charAt(i)) && counter >= 1){
                counter = 0;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else sb.append(s.charAt(i));
            i++;
        }
        System.out.println("The new String is: " + sb.toString());
    }
}
