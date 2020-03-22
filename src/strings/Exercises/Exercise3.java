package strings.Exercises;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Exercise3 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter a password: ");
        String passwd = sc.nextLine();
        Pattern pattern = Pattern.compile("^(?=(?:[a-zA-Z]*\\d){2})[a-zA-Z0-9]{8,}$");
        Matcher matcher = pattern.matcher(passwd);
        if(matcher.matches())System.out.println("Valid Password");
        else System.out.println("Invalid Password");
        sc.close();
    }
}
