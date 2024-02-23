package Estructurales.Composite;

public class Rectangle implements Shape{
    private int centreX,centreY,width,height;

    public Rectangle(int x,int y, int w, int h){
        centreX=x;
        centreY=y;
        width=w;
        height=h;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return (width*2)+(height*2);
    }

    public void setPos(int x, int y) {
        centreX=x;
        centreY=y;
    }

    public int getX(){
        return centreX;
    }
    
    public int getY(){
        return centreY;
    }
    
}
