package Estructurales.Decorator;

public class SMSDecorator extends BaseDecorator{

    public SMSDecorator(Notifier n) {
        super(n);
    }

    public void send(String m){
        System.out.println("SMS msg: "+m);
    }
    
}
