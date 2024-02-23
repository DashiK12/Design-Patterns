package Estructurales.Bridge;

public class TV implements Device{
    
    private int volume,channel;

    public TV(){
        volume = channel = 0;
    }

    public void setVolume(int p) {
        volume = p;
    }

    public int getVolume() {
        return volume;
    }

    public void setChannel(int c) {
        channel = c;
    }

    public int getChannel() {
        return channel;
    }
    
}
