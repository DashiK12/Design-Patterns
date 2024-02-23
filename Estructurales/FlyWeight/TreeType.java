package Estructurales.FlyWeight;

public class TreeType {
    private String name,color,texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void show(int x, int y){
        System.out.println("["+x+","+y+"]-("+name+", "+color+", "+texture+") ");
    }

}
