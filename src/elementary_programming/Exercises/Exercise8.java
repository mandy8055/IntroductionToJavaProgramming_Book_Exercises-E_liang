package elementary_programming.Exercises;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Calendar;
public class Exercise8 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the time zone offset to GMT: ");
        double timeZone = sc.nextDouble();
        TimeZone tz = TimeZone.getTimeZone("GMT"+ timeZone);
        Calendar cd = Calendar.getInstance(tz);
        String time = String.format("%02d", cd.get(Calendar.HOUR_OF_DAY)) + ":"
                + String.format("%02d", cd.get(Calendar.MINUTE))+":" +
                String.format("%02d", cd.get(Calendar.SECOND))+ ":" +
                String.format("%02d", cd.get(Calendar.MILLISECOND));
        System.out.println("The current time is " + time);
        sc.close();
    }
}
