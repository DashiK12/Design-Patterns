package Comportamiento.Command;

public class PasteCommand extends Command{

    public PasteCommand(App a, Editor e) {
        super(a, e);
    }

    @Override
    public boolean execute() {
        saveBackup();
        editor.replaceSelection(app.clipboard);
        return true;
    }
    
}
