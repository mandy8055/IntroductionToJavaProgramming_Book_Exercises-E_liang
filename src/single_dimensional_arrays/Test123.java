package single_dimensional_arrays;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Test123 {
    private static final Scanner sc = new Scanner(System.in);
    private static final Pattern ip4 = Pattern.compile("^(?:(?:\\d|[1-9]\\d|1\\d\\d|2[0-5][0-5])\\.){3}(?:\\d|[1-9]\\d|1\\d\\d|2[0-5][0-5])$",Pattern.MULTILINE);
    private static final Pattern ip6 = Pattern.compile("^(?:[\\da-f]{1,4}:){7}(?:[\\da-f]{1,4})$", Pattern.MULTILINE & Pattern.CASE_INSENSITIVE);

    public static void main(String[] args){
        int testCases = sc.nextInt();
        sc.nextLine();
        readString(testCases);
//      Freeing up the resources
        sc.close();
    }

    private static String matchAddresses(String str){
        Matcher ipv4 = ip4.matcher(str);
        Matcher ipv6 = ip6.matcher(str);
        String temp;
        if(ipv4.find())temp =  "IPv4";
        else if(ipv6.find())temp = "IPv6";
        else temp =  "Neither";
        return temp;
    }

    private static void readString(int testCases){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < testCases; i++){
            sb.append(sc.nextLine());
            sb.append("\n");
        }
        String[] arr = sb.toString().split("\n");
        for(String str : arr){
            System.out.println(matchAddresses(str));
        }
    }
}
