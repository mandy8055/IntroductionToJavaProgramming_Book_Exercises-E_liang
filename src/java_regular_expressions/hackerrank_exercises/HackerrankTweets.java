package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class HackerrankTweets {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern p = Pattern.compile("hackerrank", Pattern.CASE_INSENSITIVE);
    public static void main(String[] args) {
        int numberOfLines = sc.nextInt();
        sc.nextLine();
        // Reading the total lines given in the following program
        String lineString = readLines(numberOfLines);
        System.out.println(matchTextCount(lineString));
        // Releasing the resources
        sc.close();
    }

    private static int matchTextCount(String str){
        str = str.trim();
        Matcher m = p.matcher(str);
        int count = 0;
        while(m.find())
            // Counting the occurrence of the regular expression
            count++;
        return count;
    }

        private static String readLines(int numberOfLines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfLines; i++) {
            sb.append(sc.nextLine());
            sb.append(" ");
        }
        return sb.toString();
    }
}
