package java_introduction.Exercises;

public class Exercise4 {
    public static void main(String[] args){
        System.out.println("a  a^2 a^3");
        for(int i = 1; i <= 4; i++){
            System.out.print(i + " " + (i * i) + " " + (i * i * i));
            System.out.println();
        }
    }
}
