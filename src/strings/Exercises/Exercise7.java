package strings.Exercises;
import java.util.Scanner;
public class Exercise7 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the desired String: ");
        String str = (sc.nextLine()).toUpperCase();
        StringBuilder s = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)) s.append(ch);
            else if(Character.isLetter(ch)) s.append(getNumber(ch));
            else s.append(ch);
        }
        System.out.println(s);
        sc.close();
    }
    private static int getNumber(char upperCaseLetter){
        if(upperCaseLetter == 'A' || upperCaseLetter == 'B' || upperCaseLetter == 'C')return 2;
        if(upperCaseLetter == 'D' || upperCaseLetter == 'E' || upperCaseLetter == 'F')return 3;
        if(upperCaseLetter == 'G' || upperCaseLetter == 'H' || upperCaseLetter == 'I')return 4;
        if(upperCaseLetter == 'J' || upperCaseLetter == 'K' || upperCaseLetter == 'L')return 5;
        if(upperCaseLetter == 'M' || upperCaseLetter == 'N' || upperCaseLetter == 'O')return 6;
        if(upperCaseLetter == 'P' || upperCaseLetter == 'Q' || upperCaseLetter == 'R' || upperCaseLetter == 'S')return 7;
        if(upperCaseLetter == 'T' || upperCaseLetter == 'U' || upperCaseLetter == 'V')return 8;
        if(upperCaseLetter == 'W' || upperCaseLetter == 'X' || upperCaseLetter == 'Y' || upperCaseLetter == 'Z')return 9;
        return 0;
    }
}
