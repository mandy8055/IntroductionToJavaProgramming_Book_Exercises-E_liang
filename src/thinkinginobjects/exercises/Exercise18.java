package thinkinginobjects.exercises;

import java.math.BigInteger;

public class Exercise18 {
    public static void main(String[] args){
        displayNumbersDivisibleByFiveOrSix();
    }

    private static void displayNumbersDivisibleByFiveOrSix(){
        BigInteger bigInteger = new BigInteger(Long.MAX_VALUE + "");
//      Added 1 in because the requirement is to find the numbers greater than Long.MAX_VALUE and prime.
        bigInteger = bigInteger.add(new BigInteger(1 + ""));
        int i = 0;
        do {
            if (bigInteger.isProbablePrime(1)) {
                System.out.println(bigInteger);
                i++;
            }
            bigInteger = bigInteger.add(new BigInteger(1 + ""));
//          Exit condition
        } while (i != 5);
    }
}
