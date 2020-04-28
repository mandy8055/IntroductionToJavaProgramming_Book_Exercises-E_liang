package thinking_in_objects.exercises;

import java.math.BigInteger;

public class Exercise21 {
    public static void main(String[] args){
        displayNumbersDivisibleByFiveOrSix();
    }

    private static void displayNumbersDivisibleByFiveOrSix(){
//      Initialize the bigInteger object from Long.MAX_VALUE
        BigInteger bigInteger = new BigInteger(Long.MAX_VALUE + "");
//      Added 1 in because the requirement is to find the numbers greater than Long.MAX_VALUE and divisible by 5 or 6.
        bigInteger = bigInteger.add(new BigInteger(1 + ""));
        int i = 0;
        do {
//          Checking the remainder's int value == 0
            if (bigInteger.remainder(new BigInteger("5")).intValue() == 0 || bigInteger.remainder(new BigInteger("6")).intValue() == 0) {
                System.out.println(bigInteger);
                i++;
            }
            bigInteger = bigInteger.add(new BigInteger(1 + ""));
//          Exit condition
        } while (i != 10);
    }
}
