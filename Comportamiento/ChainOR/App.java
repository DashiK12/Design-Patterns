package Comportamiento.ChainOR;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        ArrayList<Component> comp = new ArrayList<>();

        Dialog c1 = new Dialog("Budget Reports");
        Panel c2 = new Panel();
        Dialog c3 = new Dialog();
        Panel c4 = new Panel("Have cash");
        Dialog c5 = new Dialog("No cash");
        Panel c6 = new Panel();

        c1.add(c2);
        c2.add(c3);
        c3.add(c4);
        c4.add(c5);
        c5.add(c6);
        comp.add(c1);
        comp.add(c2);
        comp.add(c3);
        comp.add(c4);
        comp.add(c5);
        comp.add(c6);

        for (Component c : comp) {
            c.showHelp();
        }

    }
}
