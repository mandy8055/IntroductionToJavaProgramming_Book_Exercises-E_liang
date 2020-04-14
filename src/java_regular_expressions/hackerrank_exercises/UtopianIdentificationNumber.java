package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class UtopianIdentificationNumber {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern p = Pattern.compile("^[a-z]{0,3}\\d{2,8}[A-Z]{3,}$", Pattern.MULTILINE);
    public static void main(String[] args){
        int testCases = sc.nextInt();
        // To stop getting "" as the first input
        sc.nextLine();
        readString(testCases);
        // Freeing the Resources
        sc.close();
    }

    private static String matchUtopian(String str){
        Matcher utopianNumber = p.matcher(str);
        String temp;
        if(utopianNumber.find()) temp = "VALID";
        else temp = "INVALID";
        return temp;
    }


    private static void readString(int testCases){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < testCases; i++){
            sb.append(sc.nextLine());
            // Each test String(tag line) is separated by a new line character
            sb.append("\n");
        }
        String[] arr = sb.toString().split("\n");
        for(String str : arr){
            System.out.println(matchUtopian(str));
        }
    }
}
