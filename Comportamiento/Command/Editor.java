package Comportamiento.Command;

public class Editor {
    protected String text;

    public String getSelection(){
        return text;
    }

    public void replaceSelection(String t){
        if (t.compareTo("")==0)
            text = null;
        else   
            text = t;
    }
}
