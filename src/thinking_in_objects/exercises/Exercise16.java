package thinking_in_objects.exercises;

import java.math.BigInteger;

public class Exercise16 {
    public static void main(String[] args){
       displayNumbers();
    }

    private static void displayNumbers(){
        //      Initialize the bigInteger object from 50 digit long String
        BigInteger bigInteger = new BigInteger(create50DigitString());
        int i = 1;
        do {
            // Checking the remainder's int value == 0 since the requirement is to find the number greater than Long.MAX_VALUE and divisible by 2 or 3.
            if (bigInteger.remainder(new BigInteger("2")).intValue() == 0 || bigInteger.remainder(new BigInteger("3")).intValue() == 0) {
                System.out.println(bigInteger);
                i++;
            }
//          Incrementing the bigInteger
            bigInteger = bigInteger.add(new BigInteger("1"));
//          Exit condition
        } while (i != 11);
    }
// Method to construct the 50 digit String
    private static String create50DigitString(){
        StringBuilder sb = new StringBuilder("1");
        for(int i = 1; i < 50; i++){
            sb.append("0");
        }
        return sb.toString();
    }
}
