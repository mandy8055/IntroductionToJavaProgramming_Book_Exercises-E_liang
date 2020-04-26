package thinkinginobjects.exercises;

import thinkinginobjects.casestudiesandutilities.StackOfIntegers;

import java.util.Arrays;

public class Exercise6 {
    private static final StackOfIntegers stackOfIntegers = new StackOfIntegers();
    public static void main(String[] args){
        boolean[] result = eratosthenesSieve(120);
        for(int i = 2; i < result.length; i++){
            if(result[i])stackOfIntegers.push(i);
        }
        while(!stackOfIntegers.empty()) {
            System.out.print(stackOfIntegers.pop() + ", ");
            if(stackOfIntegers.getSize() == 1)break;
        }
        System.out.print(stackOfIntegers.pop());
    }

    private static boolean[] eratosthenesSieve(int number){
        boolean[] primes = new boolean[number];
//      Assume all numbers to be prime
        Arrays.fill(primes, true);
//      Remove 1 and 0 from the list
        primes[0] = primes[1] = false;
        for(int i = 2; i * i <= primes.length; i++){
            for(int p = i * 2; p < number; p+= i){
                primes[p] = false;
            }
        }
        return primes;
    }
}
