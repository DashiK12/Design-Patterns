package Creacionales.Prototype;

public class Rectangle extends Shape{

    private int width,height;

    public Rectangle(int x, int y, String color, int w,int h){
        super(x,y,color);
        width = w;
        height = h;
    }
    public Rectangle(Rectangle source){
        super(source);
        width = source.getWidth();
        height = source.getHeight();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Shape clone() {
        return new Rectangle(this);
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

    public String toString(){
        return "x:"+x+" y: "+y+" "+color+" w: "+width+" h: "+height;
    }
}
