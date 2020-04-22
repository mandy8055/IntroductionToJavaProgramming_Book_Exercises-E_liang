package thinkinginobjects.exercises;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercise20 {
    public static void main(String[] args){
        approximateE();
    }

    private static void approximateE(){
//      Initializing BigDecimal Object
        BigDecimal bigDecimal = new BigDecimal(1);
        for(int i = 1; i <= 1000; i++){
            BigDecimal b = new BigDecimal(factorial(i) + "");
//          Approximating the value of e up to the scale of 25 digits
            bigDecimal = bigDecimal.add(new BigDecimal(1).divide(b, 25, BigDecimal.ROUND_UP));
        }
        System.out.println(bigDecimal);
    }
//  Method to calculate the factorial of numbers till 1000
    private static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));
        return result;
    }
}
