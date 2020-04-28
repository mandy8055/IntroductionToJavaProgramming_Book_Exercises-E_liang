package elementary_programming.Exercises;
public class Exercise22 {
    public static void main(String[] args){
        int ascii_value = (int)(Math.random() * (90 - 65 + 1)) + 65;
        System.out.println("Random Uppercase character is: " + (char)ascii_value);
    }
}
