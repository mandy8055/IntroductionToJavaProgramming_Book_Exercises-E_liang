package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class DetectHTMLLinks {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern p1 = Pattern.compile("<a\\shref=\"(.*?)\"[^<>]*>(<[^<>]+>)*?([^<>]*)(</[^<>]+>)*?</a>");
    public static void main(String[] args){
        int testCases = sc.nextInt();
        // To stop getting "" as the first input; using sc.nextLine() below
        sc.nextLine();
        // Reading the HTML input as a single String.
        String str = readHtml(testCases);
        matchLink(str);
        sc.close();
    }

    private static void matchLink(String str){
        Matcher m = p1.matcher(str);
        while(m.find())
//          1st capturing group denotes the link and the 3rd capturing group represents the link text
            System.out.println(m.group(1).trim() + "," + m.group(3).trim());
    }

    private static String readHtml(int N) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(sc.nextLine());
            // Each test String(tag line) is separated by a new line character
            sb.append("\n");
        }
        return sb.toString();
    }
}
