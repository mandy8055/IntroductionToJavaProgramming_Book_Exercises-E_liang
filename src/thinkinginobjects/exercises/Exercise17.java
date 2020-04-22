package thinkinginobjects.exercises;

import java.math.BigInteger;

public class Exercise17 {
    public static void main(String[] args){
//      System.out.println(Long.MAX_VALUE);
//      System.out.println(Math.sqrt(Long.MAX_VALUE));
        calculateTenGreaterNumbers();
    }

    private static void calculateTenGreaterNumbers(){
//      Initialize the number as the square root of Long.MAX_VALUE
        long num = (long)Math.sqrt(Long.MAX_VALUE);
        while (!(Math.pow(num, 2) > Long.MAX_VALUE)) {
            num++;
        }
        for (int i = 0; i < 10; i++){
            System.out.println(num++);
        }
    }
}