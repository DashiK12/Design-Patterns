package Estructurales.Composite;

public class Triangle implements Shape{

    private int centreX,centreY;
    private float x1,x2,x3,y1,y2,y3;

    public Triangle(int centreX, int centreY, float x1, float x2, float x3, float y1, float y2, float y3) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.x1 = x1;this.y1 = y1;
        this.x2 = x2;this.y2 = y2;
        this.x3 = x3;this.y3 = y3;
    }
    
    public double area(){
        return (0.5)*Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
    }

    public double perimeter(){
        double AB,AC,BC;
        AB = Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        AC = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        BC = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        return AB+AC+BC;
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
