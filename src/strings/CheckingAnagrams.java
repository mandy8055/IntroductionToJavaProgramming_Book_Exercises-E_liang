package strings;
import java.util.Scanner;
import java.util.Arrays;
public class CheckingAnagrams {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Please enter the first String: ");
        String str1 = sc.nextLine();
        System.out.print("Please enter the second String: ");
        String str2 = sc.nextLine();
        if(str1 == null && str2 == null){
            System.out.println("Please end a valid string for checking anagram");
            return;
        }
        System.out.println(isAnagram(removeSpaces(str1), removeSpaces(str2))? "Given two strings are anagrams of each other"
                : "Given two strings are not the anagrams of one another");
        sc.close();
    }
    // Concerned only with the ASCII characters.
    private static boolean isAnagram(String str1, String str2){
        int[] arr = new int[128];
        Arrays.fill(arr, 0);
        // Base case
        if(str1.length() != str2.length())return false;
        int j = 0;
        while(j < str1.length()){
            arr[str1.toCharArray()[j]]++;
            arr[str2.toCharArray()[j++]]--;
        }
        for (int value : arr) {
            if (value != 0) return false;
        }
        return true;
    }

    private static String removeSpaces(String str){
        return String.join("", str.split(" "));
    }
}
