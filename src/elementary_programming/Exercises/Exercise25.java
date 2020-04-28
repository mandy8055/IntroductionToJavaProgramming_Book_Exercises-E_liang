package elementary_programming.Exercises;
import java.util.Scanner;
public class Exercise25 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter employee's name: ");
        String emp_name = sc.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        int hrs= sc.nextInt();
        System.out.print("Enter hourly pay rate: ");
        double hrly_rate = sc.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federal_tax = sc.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double state_tax = sc.nextDouble();

        double gross_pay = hrs * hrly_rate;
        double federal_withholding = gross_pay * federal_tax;
        double state_withholding = gross_pay * state_tax;

        //Printing
        System.out.println();
        System.out.println("----------//---------");
        System.out.println();
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Hours worked: " + (double)hrs);
        System.out.println("Pay Rate: $" + hrly_rate);
        System.out.println("Gross Pay: $" + gross_pay);
        System.out.println("Deductions:");
        System.out.println("    Federal Withholding("+(federal_tax * 100)+"%): $" + federal_withholding);
        System.out.println("    State Withholding("+(state_tax * 100)+"%): $" + state_withholding);
        System.out.println("    Total Deductions: $" + (state_withholding + federal_withholding));
        System.out.println("Net Pay: $" + (gross_pay - (state_withholding + federal_withholding)));
        sc.close();
    }
}
