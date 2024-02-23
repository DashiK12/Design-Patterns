package Estructurales.Decorator;

public class Chat implements Notifier{

    public Chat(){
    }

    public void send(String m) {
        System.out.println("msg:"+ m);
    }
    
}
