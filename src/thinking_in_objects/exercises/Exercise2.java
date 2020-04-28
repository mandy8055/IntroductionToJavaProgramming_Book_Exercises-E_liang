package thinking_in_objects.exercises;

import thinking_in_objects.casestudiesandutilities.BMI;

public class Exercise2 {
    public static void main(String[] args){
        BMI bmi = new BMI("Manuj Sankrit", 24, 141, 69);
        System.out.println("The BMI for " + bmi.getName() + " is " + bmi.getBMI() + " " + bmi.getStatus());
        BMI bmi1 = new BMI("Manuj Sankrit", 24, 141, 5, 9);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
    }
}
