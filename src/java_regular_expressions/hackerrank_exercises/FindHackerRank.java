package java_regular_expressions.hackerrank_exercises;
import java.util.Scanner;
public class FindHackerRank {
    private static final Scanner sc = new Scanner(System.in);
    private static final String pat = "hackerrank";
    public static void main(String[] args){
        int testCases = sc.nextInt();
        sc.nextLine();
        readString(testCases);
//      Freeing up the resources
        sc.close();
    }
    private static void readString(int testCases){
        StringBuilder sb = new StringBuilder();
        int result;
        for(int i = 0; i < testCases; i++){
            sb.append(sc.nextLine());
            // Each test String(tag line) is separated by a new line character
            sb.append("\n");
        }
        String[] arr = sb.toString().split("\n");
        for(String str : arr){
            if(str.startsWith(pat) && str.endsWith(pat)) result = 0;
            else if(str.startsWith(pat))result = 1;
            else if(str.endsWith(pat))result = 2;
            else result = -1;
            System.out.println(result);
        }
    }
}
