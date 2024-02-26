package Comportamiento.ChainOR;

import java.util.ArrayList;

public class Container extends Component{

    protected ArrayList<Component> children = new ArrayList<>();

    public Container(String s) {
        super(s);
    }
    public Container() {
        super();
    }

    public void add(Component child){
        children.add(child);
        child.container = this;
    }
}
