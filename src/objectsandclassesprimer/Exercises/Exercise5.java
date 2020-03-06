package objectsandclassesprimer.Exercises;
import java.util.GregorianCalendar;
public class Exercise5 {
    private static final GregorianCalendar calender = new GregorianCalendar();
    public static void main(String[] args){
        System.out.println("Today the date is: " + calender.get(GregorianCalendar.YEAR)
                + "-" + calender.get(GregorianCalendar.MONTH) + "-" + calender.get(GregorianCalendar.DAY_OF_MONTH));

        calender.setTimeInMillis(1234567898765L);
        System.out.println("Today the date is: " + calender.get(GregorianCalendar.YEAR)
                + "-" + calender.get(GregorianCalendar.MONTH) + "-" + calender.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
