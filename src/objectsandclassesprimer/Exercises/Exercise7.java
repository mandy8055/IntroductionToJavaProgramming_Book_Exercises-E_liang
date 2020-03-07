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

class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        id = 0;
        balance = annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int idVal, double initialBalance){
        id = idVal;
        balance = initialBalance;
        dateCreated = new Date();
    }

//  Accessor Methods
    public int getId(){return id;}
    public double getBalance(){return balance;}
    public double getAnnualInterestRate(){return annualInterestRate;}
    public Date getDateCreated(){return dateCreated;}

//  Mutator Methods
    public void setId(int idVal){ id = idVal;}
    public void setBalance(double balanceVal){balance = balanceVal;}
    public void setAnnualInterestRate(double annualInterestRateVal){annualInterestRate = annualInterestRateVal;}

    public double getMonthlyInterestRate(){
        return annualInterestRate / (100 * 12);
    }

    public double getMonthlyInterest(){
        return (balance * getMonthlyInterestRate());
     }

     public void withdraw(double withdrawAmount){
        balance -= withdrawAmount;
     }

     public void deposit(double depositAmount){
        balance += depositAmount;
    }
}
