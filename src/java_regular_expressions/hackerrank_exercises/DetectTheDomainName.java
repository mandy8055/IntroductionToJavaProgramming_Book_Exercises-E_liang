package java_regular_expressions.hackerrank_exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.HashSet;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DetectTheDomainName {
    private static final Scanner sc = new Scanner(System.in);

    //1.  < *([a-z0-9]+)[^>]*> --> This regular expression solves the problem in less steps(146) steps but is vague
    //2. (?<=<)\\s*\\w+ This regex solves the problem in more steps(1022) but is very clean and specific(captures just the tag name)
    // The used regex is not clean as it includes <(bracket) but is very efficient(129 steps)
    private static final Pattern p1 = Pattern.compile("https?://(www.|ww2.)?([a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)+)", Pattern.MULTILINE);
    public static void main(String[] args){
        int testCases = sc.nextInt();
        // To stop getting "" as the first input
        sc.nextLine();
        // Reading the file as a single String
        String str = readHtml(testCases);
        matchLink(str);
        // Releasing the resources
        sc.close();

    }

    private static void matchLink(String str){
        Matcher m = p1.matcher(str);
        // Using HashSet to add each tag only once
        HashSet<String> hashSet = new HashSet<>();
        while(m.find())
            // Adding the matched tag names to HashSet(trimming spaces)
            hashSet.add(m.group(2).trim());
        // Using list to sort the given HashSet
        List<String> list = new ArrayList<>(hashSet);
        Collections.sort(list);
        // count is used to keep track of the delimiter(;)
        int count = list.size();

        for(String s : list){
            count--;
            if(count > 0) System.out.print(s + ";");
            else System.out.print(s);
        }
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
