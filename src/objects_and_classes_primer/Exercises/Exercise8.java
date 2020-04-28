package objects_and_classes_primer.Exercises;

public class Exercise8 {
    public static void main(String[] args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setOn(true);
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        System.out.println(fan1.toString());

        fan2.setSpeed(2);
        System.out.println(fan2.toString());
    }
}

class Fan{
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public String toString() {
        if (on) return "The fan speed is " + speed + ", the color of the fan is " + color
                + " and the radius of the fan is " + radius;
        else return "The color of the fan is " + color
                + " and the radius of the fan is " + radius + ". The fan is off.";
    }

//  Accessor Methods
    public int getSpeed(){ return speed; }
    public boolean getOn(){return on;}
    public double getRadius(){return radius;}
    public String getColor(){return color;}

//  Mutator Methods
    public void setSpeed(int speedVal){
        switch(speedVal){
            case 1: speed = SLOW;
                break;
            case 2: speed = MEDIUM;
                break;
            case 3: speed = FAST;
                break;
            default: speed = SLOW;
        }
    }
    public void setOn(boolean onVal){
        on = onVal;
    }
    public void setColor(String colorVal){
        color = colorVal;
    }

    public void setRadius(double radiusVal){
        radius = radiusVal;
    }
}
