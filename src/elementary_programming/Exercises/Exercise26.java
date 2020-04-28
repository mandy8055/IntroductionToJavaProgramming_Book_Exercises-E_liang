package elementary_programming.Exercises;
import javax.swing.JOptionPane;
public class Exercise26 {
    public static void main(String[] args){
        int amount = Integer.parseInt(JOptionPane.showInputDialog("Enter an amount, for example 1156"));
        Exercise24.computeChange(amount);
    }
}
