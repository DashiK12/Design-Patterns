package Estructurales.Decorator;

public class FBDecorator extends BaseDecorator{

    public FBDecorator(Notifier n) {
        super(n);
    }

    public void send(String m){
        System.out.println("FB msg: "+m);
    }
    
}
