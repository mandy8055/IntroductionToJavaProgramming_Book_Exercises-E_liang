package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ValidPanFormat {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern PANPattern = Pattern.compile("^[A-Z]{5}\\d{4}[A-Z]$", Pattern.MULTILINE);
    public static void main(String[] args){
        int testcases = sc.nextInt();
        sc.nextLine();
        // Reading the total lines given in the following program
        readString(testcases);
        // Releasing the resources
        sc.close();
    }
    private static String matchPANPattern(String str){
        Matcher verifyPAN = PANPattern.matcher(str);
        String temp;
        if(verifyPAN.find()) temp = "YES";
        else temp = "NO";
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
            System.out.println(matchPANPattern(str));
        }
    }
}
