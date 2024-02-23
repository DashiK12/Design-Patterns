package Comportamiento.ChainOR;

public class Dialog extends Container{
    private String diagHelpText;

    public Dialog(String s) {
        super(s);
    }
    public Dialog() {
        super();
    }

    public void showHelp(){
        if (diagHelpText != null)
            System.out.println(diagHelpText);
        else
            super.showHelp();
    }
}
