package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class SplitThePhoneNumbers {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern phn = Pattern.compile("^([\\d]{1,3})([-\\s])([\\d]{1,3})\\2([\\d]{4,10})$", Pattern.MULTILINE);
    public static void main(String[] args){
        int testCases = sc.nextInt();
        // To stop getting "" as first input
        sc.nextLine();
        readString(testCases);
//      Freeing up the resources
        sc.close();
    }

    private static String matchPhn(String str){
        Matcher phoneNumber = phn.matcher(str);
        String temp = "";
        if(phoneNumber.find()) {
            temp = "CountryCode=" + phoneNumber.group(1) + ",LocalAreaCode=" + phoneNumber.group(3) + ",Number=" + phoneNumber.group(4);
        }
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
            System.out.println(matchPhn(str));
        }
    }
}
