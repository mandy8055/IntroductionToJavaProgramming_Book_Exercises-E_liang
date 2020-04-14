package strings;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.HashSet;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Test123 {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern p1 = Pattern.compile("^(?:(?:\\d|[1-9]\\d|1\\d\\d|2[0-5][0-5])\\.){3}(?:\\d|[1-9]\\d|1\\d\\d|2[0-5][0-5])$", Pattern.MULTILINE);
    public static void main(String[] args){
        int testCases = sc.nextInt();
        // To stop getting "" as the first line of input
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
            sb.append("\n");
        }
        return sb.toString();
    }
}
