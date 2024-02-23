package Creacionales.Prototype;

public class Circle extends Shape{

    private int radius;

    public Circle(int x, int y, String color, int rad){
        super(x,y,color);
        radius = rad;
    }

    public Circle(Circle source){
        super(source);
        radius = source.getRadius();
    }

    public Shape clone() {
        return new Circle(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public int getRadius(){
        return radius;
    }

    public String toString(){
        return "x:"+x+" y: "+y+" "+color+" r: "+radius;
    }
}
