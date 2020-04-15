package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class HackerrankLanguage {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern p = Pattern.compile("^[1-9]\\d{4}\\s(?:C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)$", Pattern.CASE_INSENSITIVE & Pattern.MULTILINE);
    public static void main(String[] args) {
        int testcases = sc.nextInt();
        sc.nextLine();
        // Reading the total lines given in the following program
        readString(testcases);
        // Releasing the resources
        sc.close();
    }
    private static String matchProgrammingLanguage(String str){
        Matcher programmingLanguage = p.matcher(str);
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
            System.out.println(matchProgrammingLanguage(str));
        }
    }
}
