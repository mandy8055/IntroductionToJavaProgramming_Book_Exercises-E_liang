package thinkinginobjects.exercises;
import java.math.BigInteger;
import java.util.Arrays;
public class Exercise19 {
    public static void main(String[] args){
        boolean[] primes = sieve(100);

        System.out.println("p\t\t2^p-1");
        for(int i = 2; i < primes.length; i++){
            if(primes[i]){
//             Perform Mersenne Prime checking and displaying here
               displayMersennePrime(i);
            }
        }
    }

//  Implementing the eratosthenes Sieve to get the first 100 primes
    public static boolean[] sieve(int num){
        boolean[] primes = new boolean[num];
//      Assuming all the numbers to be primes initially
        Arrays.fill(primes, true);
//      Removing 0 and 1 from the list
        primes[0] = primes[1] = false;
        for(int i = 2; i * i <= num; i++){
            for(int p = 2 * i; p < num; p += i){
                primes[p] = false;
            }
        }
        return primes;
    }
//  Implementing MersennePrime method
    public static void displayMersennePrime(int i){
        BigInteger bigInteger = new BigInteger("2");
        bigInteger = bigInteger.pow(i);
        bigInteger = bigInteger.subtract(new BigInteger("1"));
        if(bigInteger.isProbablePrime(1)){
            System.out.println(i + "\t\t" + bigInteger);
        }
    }
}
