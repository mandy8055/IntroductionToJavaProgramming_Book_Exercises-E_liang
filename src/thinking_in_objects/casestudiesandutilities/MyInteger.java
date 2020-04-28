package thinking_in_objects.casestudiesandutilities;

public class MyInteger{
    private int value;
    public MyInteger(int value){
        this.value = value;
    }

    //    Accessor Methods
    public int getValue(){return this.value;}
    //  Instance methods
    public boolean isEven(){
        return this.value % 2 == 0;
    }
    public boolean isOdd(){
        return this.value % 2 != 0;
    }
    public boolean isPrime(){
        if(this.value <= 1)return false;
        if(this.value % 2 == 0)return false;
        int i = 3;
        while(i * i <= this.value){
            if(this.value % i == 0)return false;
            i+= 2;
        }
        return true;
    }
    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger integer){
        return this.value == integer.getValue();
    }
    //  Class or static methods
    public static boolean isEven(int value){
        return value % 2 == 0;
    }

    public static boolean isOdd(int value){
        return value % 2 != 0;
    }
    public static boolean isPrime(int value){
        if(value <= 1)return false;
        if(value % 2 == 0)return false;
        int i = 3;
        while(i * i <= value){
            if(value % i == 0)return false;
            i+= 2;
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger){
        return myInteger.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger myInteger){
        return myInteger.getValue() % 2 != 0;
    }
    public static boolean isPrime(MyInteger myInteger){
        if(myInteger.getValue() <= 1)return false;
        if(myInteger.getValue() % 2 == 0)return false;
        int i = 3;
        while(i * i <= myInteger.getValue()){
            if(myInteger.getValue() % i == 0)return false;
            i+= 2;
        }
        return true;
    }

    public static int parseInt(char[] arr){
        int number = 0;
        for(char ch : arr){
            if(Character.isDigit(ch))number = (number * 10) + (ch - '0');
        }
        return number;
    }
    public static int parseInt(String value){
        return Integer.parseInt(value);
    }
}

