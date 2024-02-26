package Comportamiento.Command;

public class CutCommand extends Command{

    public CutCommand(App a, Editor e) {
        super(a, e);
    }

    @Override
    public boolean execute() {
        saveBackup();
        app.clipboard = editor.getSelection();
        editor.replaceSelection(""); // delete
        return true;
    }
    
}
