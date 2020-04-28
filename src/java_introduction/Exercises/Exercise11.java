package java_introduction.Exercises;

public class Exercise11 {
    private static final int CURRENT_POPULATION = 312032486;
    public static void main(String[] args){
        System.out.println("Total population after 5 years: " + calculateTotalPopulation(5));
    }
    public static int calculateTotalPopulation(int years){
        int time = years * (365 * 24 * 3600);
        return (CURRENT_POPULATION + (time / 7) - (time / 13) + (time / 45));
    }
}
