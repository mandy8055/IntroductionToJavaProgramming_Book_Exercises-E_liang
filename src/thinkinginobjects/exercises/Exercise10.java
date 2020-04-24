package thinkinginobjects.exercises;
import thinkinginobjects.casestudies.GuessDate;
import java.util.Scanner;
public class Exercise10 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int date = 0; // for determining the birth date
        int answer;
        for(int i = 0; i < 5; i++){
            System.out.println("Is your birthday in Set" + (i + 1) + "?");
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    System.out.print(GuessDate.getValue((i + 1), j, k) + "\t");
                }
                System.out.println();
            }
            System.out.print("\nEnter 1 for YES and 0 for NO: ");
            answer = sc.nextInt();

            if(answer == 1)date += GuessDate.getValue((i + 1), 0, 0);
        }

        System.out.println("Your birthday is " + date);
//      Releasing the acquired resource
        sc.close();
    }
}
