package objects_and_classes_primer;

public class TestTV {
    public static void main(String[] args){
//      First TV Objects
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
//      Second TV Objects
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("TV 1's channel is " + tv1.channel + " and volume Level is " + tv1.volumeLevel);
        System.out.println("TV 2's channel is " + tv2.channel + " and volume Level is " + tv2.volumeLevel);


    }
}

class TV{
//  Data Fields
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

//  Turn the TV on
    public void turnOn(){
        on = true;
    }
//  Turn the TV off
    public void turnOff(){
        on = false;
    }
//  Sets a new Channel for this TV
    public void setChannel(int newChannel){
        channel = newChannel;
    }
//  Sets a new Volume level for this TV
    public void setVolume(int newVolumeLevel){
        volumeLevel = newVolumeLevel;
    }
//  Increases the channel number by 1
    public void channelUp(){
        if(channel == 120 && on)channel = 120;
        else
            channel += 1;
    }
//  Decreases the channel number by 1
    public void channelDown(){
        if(channel == 1 && on)channel = 1;
        else
            channel -= 1;
    }
//  Increases the volume level by 1
    public void volumeUp(){
        if(volumeLevel == 7 && on)volumeLevel = 7;
        else
            volumeLevel += 1;
    }
//  Decreases the volume level by 1
    public void volumeDown(){
        if(volumeLevel == 1 && on)volumeLevel = 1;
        else
            volumeLevel -= 1;
    }
}
