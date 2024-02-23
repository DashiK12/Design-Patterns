package Estructurales.Decorator;

public class App {
    public static void main(String[] args) {
        boolean SMS=false,
                WP=false,
                FB=true;

        Notifier n1 = new Chat();
        
        n1.send("Hola.");

        if(SMS)
            n1 = new SMSDecorator(n1);
        if(FB)
            n1 = new FBDecorator(n1);
        if(WP)
            n1 = new WPDecorator(n1);

        n1.send("Hola.");
        
    }
}
