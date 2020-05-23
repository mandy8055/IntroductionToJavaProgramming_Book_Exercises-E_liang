package java8_date_time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CurrentDateAndTimeExamples {
    private static final LocalDate date = LocalDate.now();
    private static final LocalTime time = LocalTime.now();
    private static final LocalDateTime dt = LocalDateTime.now();
    public static void main(String[] args){
//      Displaying current date with different values.
        System.out.println(date);

        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();

        System.out.printf("%d-%d-%d\n", dd, mm, yyyy);

        //      Displaying current time with different values.
        System.out.println(time);

        int hours = time.getHour();
        int minutes = time.getMinute();
        int seconds = time.getSecond();
        int nanoSeconds = time.getNano();

        System.out.println("The current hour is " + hours + ", the current minute is "
                + minutes + ", the current seconds are " + seconds
                + " and the current nano-seconds are " + nanoSeconds);

//      Using date time combined using LocalDateTime class(RECOMMENDED)
        System.out.printf("\n%d-%d-%d", dt.getDayOfMonth(), dt.getMonthValue(), dt.getYear());
        System.out.printf("\n%d:%d:%d:%d", dt.getHour(), dt.getMinute(), dt.getSecond(), dt.getNano());
    }
}
