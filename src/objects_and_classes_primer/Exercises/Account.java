package objects_and_classes_primer.Exercises;

import java.util.Date;

public class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(){
        id = 0;
        annualInterestRate = 0;
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

