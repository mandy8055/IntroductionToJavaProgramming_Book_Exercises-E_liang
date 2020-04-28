package elementary_programming.Exercises;
import javax.swing.JOptionPane;
public class Exercise27 {
    public static void main(String[] args){
        String emp_name = JOptionPane.showInputDialog("Enter employee's name: ");
        int hrs= Integer.parseInt(JOptionPane.showInputDialog("Enter number of hours worked in a week: "));
        double hrly_rate = Double.parseDouble(JOptionPane.showInputDialog("Enter hourly pay rate: "));
        double federal_tax = Double.parseDouble(JOptionPane.showInputDialog("Enter federal tax withholding rate: "));
        double state_tax = Double.parseDouble(JOptionPane.showInputDialog("Enter state tax withholding rate: "));

        double gross_pay = hrs * hrly_rate;
        double federal_withholding = gross_pay * federal_tax;
        double state_withholding = gross_pay * state_tax;

        //Printing
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Hours worked: " + (double)hrs);
        System.out.println("Pay Rate: $" + hrly_rate);
        System.out.println("Gross Pay: $" + gross_pay);
        System.out.println("Deductions:");
        System.out.println("    Federal Withholding("+(federal_tax * 100)+"%): $" + federal_withholding);
        System.out.println("    State Withholding("+(state_tax * 100)+"%): $" + state_withholding);
        System.out.println("    Total Deductions: $" + (state_withholding + federal_withholding));
        System.out.println("Net Pay: $" + (gross_pay - (state_withholding + federal_withholding)));

    }
}
