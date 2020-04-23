package objectsandclassesprimer.Exercises;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Exercise7 {
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    public static void main(String[] args){
        Account account = new Account(2200, 20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);

        System.out.println("The balance of the account number with id " + account.getId()
                + " is " + account.getBalance() + " and the monthly interest on the account is "
                + account.getMonthlyInterest() + ". The account was opened on " + formatter.format(account.getDateCreated()));
    }
}