package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class AlienUsername {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern usernamePattern = Pattern.compile("^[_.]\\d+[a-zA-Z]*_?$", Pattern.MULTILINE);
    public static void main(String[] args) {
        int testcases = sc.nextInt();
        sc.nextLine();
        // Reading the total lines given in the following program
        readString(testcases);
        // Releasing the resources
        sc.close();
    }
    private static String matchAlienUsername(String str){
        Matcher programmingLanguage = usernamePattern.matcher(str);
        String temp;
        if(programmingLanguage.find()) temp = "VALID";
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
            System.out.println(matchAlienUsername(str));
        }
    }
}
