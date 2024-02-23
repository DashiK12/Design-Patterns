package Estructurales.Bridge;

public class Remote {
    protected Device dev;

    public Remote(Device d){
        dev = d;
    }

    public void volumeUp(){
        dev.setVolume((dev.getVolume()>=100)?100:dev.getVolume()+1);
    }
    public void volumeDown(){
        dev.setVolume((dev.getVolume()<=0)?0:dev.getVolume()-1);

    }
    public void channelUp(){
        dev.setChannel((dev.getChannel()>=35)?0:dev.getChannel()+1);

    }
    public void channelDown(){
        dev.setChannel((dev.getChannel()<=0)?35:dev.getChannel()-1);
    }

    public Device getDevice(){
        return dev;
    }
}
