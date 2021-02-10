package elementary_programming;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test123 {
    private static final Pattern pattern = Pattern.compile("(?=[\"])\"([^\"\\\\\\n]*(?:\\\\[\\s\\S][^\"\\\\\\n]*)*)\"|([\\w]+)");
    public static void main(String[] args){
        String testString = "hget \"User 1\" \"full name\" \"firstname middlename lastname\"";
        Matcher matcher = pattern.matcher(testString);
        String command = "";
        String[] arr = new String[4];
        int j = 0;
        while (matcher.find()) {
                if(matcher.group(2) != null)
                    command = matcher.group();
                if(matcher.group(1) != null){
                    arr[j] = matcher.group(1);
                    j++;
                }
        }
        System.out.println("Command = " + command);
        System.out.println("key = " + arr[0]);
        System.out.println("field = " + arr[1]);
        System.out.println("value = " + arr[2]);

    }
}
