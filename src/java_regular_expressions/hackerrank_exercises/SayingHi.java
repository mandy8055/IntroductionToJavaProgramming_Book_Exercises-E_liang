package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class SayingHi {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern p1 = Pattern.compile("^[Hh][Ii]\\s[^dD].*$", Pattern.MULTILINE);
    public static void main(String[] args){
        int testCases = sc.nextInt();
        // To stop getting "" as first input
        sc.nextLine();
        // Reading the file as a single String
        String str = readHtml(testCases);
        matchLink(str);
        // Releasing the resources
        sc.close();

    }

    private static void matchLink(String str){
        Matcher m = p1.matcher(str);
        while(m.find())
            // Displaying the match
            System.out.println(m.group());
    }

    private static String readHtml(int testCases) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < testCases; i++) {
            sb.append(sc.nextLine());
            // Each test String(tag line) is separated by a new line character
            sb.append("\n");
        }
        return sb.toString();
    }
}
