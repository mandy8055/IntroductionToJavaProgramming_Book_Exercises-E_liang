package strings.Exercises;
import java.util.Scanner;
public class Exercise4 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        System.out.print("Enter the character which you want to search: ");
        char ch = sc.nextLine().charAt(0);
        System.out.println(count(str, ch));
        sc.close();
    }
    private static int count(String str, char a){
        int counter = 0;
        for(char ch : str.toCharArray()){
            if(ch == a)counter++;
        }
        return counter;
    }
}
