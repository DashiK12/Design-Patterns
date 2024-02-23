package Estructurales.Bridge;

public class AdvancedRemote extends Remote{

    public AdvancedRemote(Device d) {
        super(d);
    }

    public void mute(){
        dev.setVolume(0);
    }
}
