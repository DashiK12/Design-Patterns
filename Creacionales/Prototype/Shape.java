package Creacionales.Prototype;

public abstract class Shape {
    protected int x,y;
    protected String color;

    public Shape(int x, int y, String color){
        this.x=x;
        this.y=y;
        this.color=color;
    }

    public Shape(Shape source){
        x = source.getX();
        y = source.getY();
        color = source.getColor();
    }

    public abstract Shape clone();
    public abstract int getX();
    public abstract int getY();
    public abstract String getColor();
    public abstract String toString();
    
}