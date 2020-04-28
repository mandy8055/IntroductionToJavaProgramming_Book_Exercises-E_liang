package thinking_in_objects.exercises;
import thinking_in_objects.casestudiesandutilities.MyDate;
public class Exercise14 {
    public static void main(String[] args){
        MyDate myDate1 = new MyDate();
        MyDate myDate2 = new MyDate(561555550000L);
        System.out.println(myDate1.getYear() + "-" + myDate1.getMonth() + "-" + myDate1.getDay());
        System.out.println(myDate2.getYear() + "-" + myDate2.getMonth() + "-" + myDate2.getDay());
    }
}