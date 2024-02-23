package Comportamiento.ChainOR;

public class Panel extends Container{
    private String modalHelpText;

    public Panel(String s) {
        super(s);
    }

    public Panel() {
        super();
    }
    
    public void showHelp(){
        if (modalHelpText != null)
            System.out.println(modalHelpText);
        else
            super.showHelp();
    }
}
