package Estructurales.FlyWeight;

import java.util.ArrayList;

public class Forest {
    ArrayList<Tree> trees;

    public Forest(){
        trees = new ArrayList<>();
    }

    public Tree plantTree(int x, int y,String name, String color, String texture){
        TreeType type = TreeFactory.getTreeType(name, color, texture);
        Tree tree = new Tree(x,y,type);
        trees.add(tree);
        return tree;
    }

    public void show(){
        for (Tree tree : trees) {
            tree.show();
        }
    }
}
