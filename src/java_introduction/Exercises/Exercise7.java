package java_introduction.Exercises;

public class Exercise7 {
    public static void main(String[] args){
        double pi = 0;
        int count = 0;
        for(int i = 1; i <= 11; i += 2) {
            if (count % 2 == 0)
                pi -= (1 / (double) i);
            else
                pi += (1 / (double) i);
            count++;
        }
        System.out.println(4 * pi);
    }
}
