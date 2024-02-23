package Estructurales.Decorator;

public class BaseDecorator implements Notifier{
    
    private Notifier wrappee;

    public BaseDecorator(Notifier n){
        wrappee = n;
    }

    public void send(String message){
        wrappee.send(message);
    }
}
