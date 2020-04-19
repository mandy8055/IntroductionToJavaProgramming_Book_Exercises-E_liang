package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ProgrammingLanguageDetection {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern pythonPattern = Pattern.compile("^[ \\t]*?(?:\\bprint\\b|def|''')", Pattern.MULTILINE);
    private static final Pattern javaPattern = Pattern.compile("^[ ]*(?:class|public|private|protected)", Pattern.MULTILINE);
    public static void main(String[] args){
        String inputString = readInput();
        detectLanguage(inputString);
        sc.close();
    }
    private static void detectLanguage(String input){
        Matcher pythonMatcher = pythonPattern.matcher(input);
        Matcher javaMatcher = javaPattern.matcher(input);
        if(pythonMatcher.find())System.out.println("Python");
        else if(javaMatcher.find())System.out.println("Java");
        else System.out.println("C");
    }
    private static String readInput(){
        StringBuilder sb = new StringBuilder();
        while(sc.hasNextLine()) {
            sb.append(sc.nextLine());
            sb.append("\n");
        }
        return sb.toString();
    }
}
