package objectsandclassesprimer;
import javax.swing.*;
public class GUIComponents {
    public static void main(String[] args){
//      Ok button
        JButton jbtok = new JButton("OK");
//      Cancel Button
        JButton jbtcancel = new JButton("Cancel");
//      Name label and fields
        JLabel jLabel1 = new JLabel("Name: ");
        JTextField jTextField = new JTextField("Type your name here...");
//      Check Boxes
        JCheckBox jCheckBox1 = new JCheckBox("Bold");
        JCheckBox jCheckBox2 = new JCheckBox("Italic");
//      Radio Buttons
        JRadioButton jRadioButton1 = new JRadioButton("Red");
        JRadioButton jRadioButton2 = new JRadioButton("Yellow");
//      Combo Boxes
        JComboBox jComboBox = new JComboBox(new String[]{"Freshman", "Sophomore", "Junior", "Senior"});

//      Create a panel to group components
        JPanel jPanel = new JPanel();
        jPanel.add(jbtok);
        jPanel.add(jbtcancel);
        jPanel.add(jLabel1);
        jPanel.add(jTextField);
        jPanel.add(jCheckBox1);
        jPanel.add(jCheckBox2);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        jPanel.add(jComboBox);
//      Create a frame and add panel to the frame
        JFrame jFrame = new JFrame();
        jFrame.add(jPanel);
        jFrame.setTitle("GUI Components");
        jFrame.setSize(850, 300);
        jFrame.setLocation(100, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
