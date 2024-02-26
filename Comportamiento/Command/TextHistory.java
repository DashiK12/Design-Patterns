package Comportamiento.Command;

import java.util.Stack;

public class TextHistory {
    private Stack<String> history;

    public TextHistory(){
        history = new Stack<>();
    }

    public void push(String c){
        history.add(c);
    }

    public String pop(){
        return history.pop();
    }

    @SuppressWarnings("unchecked")
    public String getText(){
        
        Stack<String> s1 = (Stack<String>) history.clone();
        Stack<String> s2 = new Stack<>();
        while(!s2.empty())
            s2.push(s1.pop());
        String sout = "";
        while(!s1.empty())
            sout+= s1.pop()+" ";
        return sout;

    }
}
