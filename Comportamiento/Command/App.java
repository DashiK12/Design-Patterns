package Comportamiento.Command;

import java.util.Random;

public class App {
    public Editor activeEditor;
    public String clipboard;
    public CommandHistory history;
    public TextHistory thistory;

    public App(){
        history = new CommandHistory();
        thistory = new TextHistory();

    }

    public void executeCommand(Command c){
        if(c.execute()){
            history.push(c);
            thistory.push(clipboard);
        }
    }

    public void undo(){
        Command c = history.pop();
        if(c!=null){
            c.undo();
            thistory.pop();
        }
    }

    public void setClipboard(String s){
        clipboard = s;
    }

    public String getClipboard(){
        return clipboard;
    }

    public String getText(){
        return thistory.getText();
    }

    public static void main(String[] args) {
        /*
        App a = new App();
        Editor e = new Editor();
        CopyCommand copy = new CopyCommand(a, e);
        UndoCommand undo = new UndoCommand(a, e);
        CutCommand cut = new CutCommand(a, e);
        PasteCommand paste = new PasteCommand(a, e);
        
        e.replaceSelection("Texto 1");

        System.out.println("clipboard: " + a.getClipboard());
        System.out.println("selected: " + e.getSelection());
        System.out.println("text: "+ a.getText());

        a.executeCommand(copy);
        System.out.println("\nCommand copy:");
        System.out.println("clipboard: " + a.getClipboard());
        System.out.println("selected: " + e.getSelection());
        System.out.println("text: "+ a.getText());
        
        a.executeCommand(cut);
        System.out.println("\nCommand cut:");
        System.out.println("clipboard: " + a.getClipboard());
        System.out.println("selected: " + e.getSelection());
        System.out.println("text: "+ a.getText());
        
        a.executeCommand(paste);
        System.out.println("\nCommand paste:");
        System.out.println("clipboard: " + a.getClipboard());
        System.out.println("selected: " + e.getSelection());
        System.out.println("text: "+ a.getText());
        
        a.executeCommand(paste);
        System.out.println("\nCommand paste:");
        System.out.println("clipboard: " + a.getClipboard());
        System.out.println("selected: " + e.getSelection());
        System.out.println("text: "+ a.getText());

        a.executeCommand(undo);
        System.out.println("\nCommand undo:");
        System.out.println("clipboard: " + a.getClipboard());
        System.out.println("selected: " + e.getSelection());
        System.out.println("text: "+ a.getText());
        */
        int grid[][] = new int[10][10];
        Random r = new Random();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(j!=0)grid[i][j] =i/j;
                else grid[i][j] =0;
            }
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]%2==0){
                    System.out.print(grid[i][j]+" ");
                }
                else{
                    System.out.print("--");
                }
            }
            System.out.println();
        }


    }
}
