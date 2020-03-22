package strings.Exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Exercise1 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a Social Security number in the format DDD-DD-DDDD: ");
        String ssn = sc.nextLine();
        Pattern pattern = Pattern.compile("\\d{3}-\\d{2}-\\d{4}");
        Matcher matcher = pattern.matcher(ssn);
        if(matcher.matches())System.out.println("Valid SSN");
        else System.out.println("Invalid SSN");
        sc.close();
    }
}
