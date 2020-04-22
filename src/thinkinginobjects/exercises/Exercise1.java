package thinkinginobjects.exercises;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Exercise1 {
    public static void main(String[] args){
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
    }
}

class Time{
    private long hour;
    private long minute;
    private long second;

//  No argument constructor for current time
    public Time(){
        long currentTime = System.currentTimeMillis();
        Date date = new Date(currentTime);
        this.hour = date.getHours();
        this.minute = date.getMinutes();
        this.second = date.getSeconds();
    }
//  Parameterized Constructor with given elapsed time in milliseconds.
    public Time(long elapsedTime){
        setTime(elapsedTime);
    }
//  Parametrized Constructor with given hour, minute and second
    public Time(long hour, long minute, long second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

//    Accessor Methods
    public long getHour(){return this.hour;}
    public long getMinute(){return this.minute;}
    public long getSecond(){return this.second;}

//   Method to set time for the object using the elapsed time
    public void setTime(long elapsedTime){
        long sec = (elapsedTime / 1000);
        this.second = sec % 60;
        long min = sec / 60;
        this.minute = min % 60;
        long hr = min / 60;
        this.hour = hr % 24;
    }

}
