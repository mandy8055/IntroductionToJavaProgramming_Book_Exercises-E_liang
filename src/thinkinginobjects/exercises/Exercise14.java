package thinkinginobjects.exercises;

import java.time.LocalDate;
import java.util.GregorianCalendar;

public class Exercise14 {
    public static void main(String[] args){
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(561555550000L);
        System.out.println(myDate1.getYear() + "-" + myDate1.getMonth() + "-" + myDate1.getDay());
        System.out.println(myDate2.getYear() + "-" + myDate2.getMonth() + "-" + myDate2.getDay());
    }
}

class MyDate{
    private long year;
    private long month;
    private long day;
    private static final LocalDate localDate = LocalDate.now();
    public MyDate(){
        this.year = localDate.getYear();
//      Since the month is zero-based
        this.month = (localDate.getMonthValue() - 1);
        this.day = localDate.getDayOfMonth();
    }
    public MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

//  Mutator methods
    public long getDay(){return day;}
    public long getMonth(){return month;}
    public long getYear(){return year;}

//  Method to set date from the given elapsed time
    public void setDate(long elapsedTime){
        long daysSinceEpoch = (elapsedTime / (1000 * 60 * 60 * 24));
        LocalDate localDate1 = LocalDate.ofEpochDay(daysSinceEpoch);
        this.year = localDate1.getYear();
        this.month = (localDate1.getMonthValue() - 1);
        this.day = localDate1.getDayOfMonth();
    }
}
