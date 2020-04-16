package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StackExchangeScraper {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern patternForIdAndText = Pattern.compile("<h3><a\\shref=\"/questions/(\\d+)(?=/)(?:.*)\">([^<]+)");
    private static final Pattern patternForTime = Pattern.compile("asked\\s<span(?:.+)\">([^<]+)");
    private static final Pattern pat = Pattern.compile("id=\"question-summary-(\\d+).*?class=\"question-hyperlink\">(.+?)</a>.*?class=\"relativetime\">(.+?)</span>");
    public static void main(String[] args){
        // Reading the HTML input as a single String.
        String str = readHtml();
        matchLink(str);
        sc.close();
    }

    private static void matchLink(String str){
        Matcher matcher1 = patternForIdAndText.matcher(str);
        Matcher matcher2 = patternForTime.matcher(str);
        while(matcher1.find() && matcher2.find())
            System.out.println(matcher1.group(1).trim() + ";" + matcher1.group(2).trim() + ";" + matcher2.group(1));
    }

    private static String readHtml() {
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()){
            sb.append(sc.nextLine());
        }
        return sb.toString();
    }
}
