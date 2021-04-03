package collectionsPractice;

import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args){
        Hashtable hashtable = new Hashtable();
        hashtable.put(new TempClass1(5), "A");
        hashtable.put(new TempClass1(2), "B");
        hashtable.put(new TempClass1(6), "C");
        hashtable.put(new TempClass1(15), "D");
        hashtable.put(new TempClass1(23), "E");
        hashtable.put(new TempClass1(16), "F");
        System.out.println(hashtable); // {6=C, 16=F, 5=A, 15=D, 2=B, 23=E}
    }
}

class TempClass1{
    int tempHashCode;
    public TempClass1(int tempHashCode){
        this.tempHashCode = tempHashCode;
    }
    public int hashCode(){
        return tempHashCode;
    }
    public String toString(){
        return tempHashCode + "";
    }

}
