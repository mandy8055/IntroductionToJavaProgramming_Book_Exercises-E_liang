package thinkinginobjects.exercises;

import objectsandclassesprimer.Exercises.Account;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Account[] accounts = new Account[10];
        for(int i = 0; i < 10; i++){
            accounts[i] = new Account(i, 100);
        }
        simulateATM(accounts);
    }

    private static void simulateATM(Account[] accounts){
        System.out.print("Enter an id: ");
        int id = sc.nextInt();
        if (id > 9 || id < 0){
            System.out.println("Enter the correct id");
            simulateATM(accounts);
        }
        int caller = 0;
        while(true){
            System.out.print("Main Menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit\n5: Exit From the Application\nEnter a choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("The balance is " + accounts[id].getBalance());
                    break;
                case 2:
                    System.out.print("Enter an amount to withdraw: ");
                    accounts[id].withdraw(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter an amount to deposit: ");
                    accounts[id].deposit(sc.nextInt());
                    break;
                case 4: simulateATM(accounts);
                case 5: System.exit(0);
                default:
                    System.out.println("INVALID CHOICE!!!TRY AGAIN. Wrong Choice Limit left" + (3 - ++caller));
            }

            if(caller == 3){
                System.out.println("You've exceeded the wrong choice limit.");
                System.exit(0);
            }
        }
    }
}
