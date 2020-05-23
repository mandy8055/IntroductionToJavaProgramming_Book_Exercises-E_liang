package java8_date_time;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Month;

public class GivenDateAndTimeExamples {
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.of(1996, Month.MAY, 12, 12, 45);
        System.out.println(dt.plusDays(10));
        System.out.println(dt.plusSeconds(1000000000)); // 10^9
    }
}
