package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class IdentifyingComments {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern commentsPattern = Pattern.compile("//.*|/\\*[^*]*\\*+(?:[^/*][^*]*\\*+)*/");
    public static void main(String[] args){
        String input = readFromCode();
        displayComments(input);
        sc.close();
    }

    private static void displayComments(String input){
        Matcher comments = commentsPattern.matcher(input);
        while(comments.find())System.out.println(comments.group().trim());
    }

    private static String readFromCode(){
        StringBuilder sb = new StringBuilder();
        sc.next();
        while(sc.hasNextLine()){
            sb.append(sc.nextLine().trim());
            sb.append("\n");
        }
        return sb.toString();
    }
}