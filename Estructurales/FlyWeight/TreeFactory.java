package Estructurales.FlyWeight;

import java.util.ArrayList;

public class TreeFactory {
    private static ArrayList<TreeType> types= new ArrayList<>();

    public static TreeType getTreeType(String name, String color, String texture){
        TreeType type = new TreeType(name, color, texture);
        if (!types.contains(type)){
            types.add(type);
        }
        return type;
    }
}
