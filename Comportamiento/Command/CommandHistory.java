package Comportamiento.Command;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history;

    public CommandHistory(){
        history = new Stack<>();
    }

    public void push(Command c){
        history.add(c);
    }

    public Command pop(){
        return history.pop();
    }
}
