package Estructurales.Bridge;

import java.util.ArrayList;

public class App {


    public static void main(String[] args) {
        Device r = new Radio();
        Device t = new TV();
        Device r2 = new Radio();
        Device t2 = new TV();

        Remote remote = new Remote(r);
        Remote remote2 = new Remote(t);
        AdvancedRemote remote3 = new AdvancedRemote(r2);
        Remote remote4 = new AdvancedRemote(t2);

        ArrayList<Remote> list = new ArrayList<>();
        list.add(remote);
        list.add(remote2);
        list.add(remote3);
        list.add(remote4);

        for(int i=0;i<30;i++){
            if(i%2==0)remote.channelDown();
            remote2.channelUp();
            remote3.volumeUp();remote3.volumeUp();remote3.volumeUp();remote3.mute();remote3.volumeUp();
            remote4.volumeDown();remote4.volumeDown();

        }

        for (Remote rem : list) {
            System.out.println("vol "+rem.getDevice().getVolume()+", chann "+rem.getDevice().getChannel());
        }

    }
}
