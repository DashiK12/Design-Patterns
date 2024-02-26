package Comportamiento.Command;

public class CopyCommand extends Command{

    public CopyCommand(App a, Editor e) {
        super(a, e);
    }

    @Override
    public boolean execute() {
        app.clipboard = editor.getSelection();
        return false;
    }
    
}
