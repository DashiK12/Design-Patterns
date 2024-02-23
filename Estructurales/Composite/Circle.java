package Estructurales.Composite;

public class Circle implements Shape {
    
    private double radius;
    private int x,y;

    public Circle(double rad, int x, int y){
        radius = rad;
        this.x=x;
        this.y=y;
    }

    public double area() {
        return Math.PI*radius*radius;
    }

    public double perimeter() {
        return 2*Math.PI*radius;
    }

    public void setPos(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
