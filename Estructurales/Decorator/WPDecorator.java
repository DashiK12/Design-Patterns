package Estructurales.Decorator;

public class WPDecorator extends BaseDecorator{

    public WPDecorator(Notifier n) {
        super(n);
    }

    public void send(String m){
        System.out.println("WP msg: "+m);
    }
    
}
