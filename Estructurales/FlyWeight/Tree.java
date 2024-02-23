package Estructurales.FlyWeight;

public class Tree {
    private int x, y;
    private TreeType type;

    public Tree(int x, int y, TreeType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void show(){
        type.show(x,y);
    }
}
