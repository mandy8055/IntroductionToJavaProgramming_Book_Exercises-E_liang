package thinkinginobjects.exercises;
import thinkinginobjects.casestudiesandutilities.MyInteger;
public class Exercise3 {
    public static void main(String[] args){
        MyInteger myInteger = new MyInteger(31);
        System.out.println(MyInteger.parseInt(new char[]{'1', '4', '5', '9'}));
    }
}