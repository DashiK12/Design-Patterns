package Comportamiento.ChainOR;

public class Component implements ComponentWithContextualHelp{
    protected Container container;
    protected String tooltip;

    public Component(String s){
        tooltip = s;
    }
    public Component(){
        tooltip = null;
    }

    public void showHelp(){
        if(tooltip!=null)
            System.out.println(tooltip);
        else{
            container.showHelp();
        }
    }
}
