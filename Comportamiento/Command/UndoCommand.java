package Comportamiento.Command;

public class UndoCommand extends Command{

    public UndoCommand(App a, Editor e) {
        super(a, e);
    }

    public boolean execute() {
        app.undo();
        return false;
    }
    
}
