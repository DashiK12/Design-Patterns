package Estructurales.Bridge;

public class Radio implements Device{
    private int volume,channel;

    public Radio(){
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
