package thinkinginobjects.exercises;
import thinkinginobjects.casestudies.StackOfIntegers;
import java.util.Scanner;

public class Exercise5 {
    private static final Scanner sc = new Scanner(System.in);
    private static final StackOfIntegers stackofIntegers = new StackOfIntegers();
    public static void main(String[] args){
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();
        primeFactorization(num);
        sc.close();
    }

    private static void primeFactorization(int number){
        if(number == 1)stackofIntegers.push(number);

        for(int i = 2; i * i <= number; i++){
            if(number % i == 0){
                int count = 0;
                while(number % i == 0){
                    number /= i;
                    count++;
                }
                for(int j = 0; j < count; j++){
                    stackofIntegers.push(i);
                }
            }
        }
        if(number != 1)stackofIntegers.push(number);
        while(!stackofIntegers.empty()){
            System.out.print(stackofIntegers.pop() + ", ");
            if(stackofIntegers.getSize() == 1)break;
        }
        System.out.print(stackofIntegers.pop());
    }
}
