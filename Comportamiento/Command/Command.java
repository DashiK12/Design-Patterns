package Comportamiento.Command;

public abstract class Command {
    protected App app;
    protected Editor editor;
    protected String backup;

    public Command (App a, Editor e){
        app = a;
        editor = e;
    }

    public void saveBackup(){
        backup = editor.getSelection();
    }

    public void undo(){
        editor.replaceSelection(backup);
    }

    public abstract boolean execute();
}
