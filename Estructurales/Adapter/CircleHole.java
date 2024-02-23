package Estructurales.Adapter;

public class CircleHole {
    private int radius;

    public CircleHole(int r){
        radius = r;
    }

    public int getRadius(){
        return radius;
    }

    public boolean fits(CircleShape shape){
        return shape.getRadius()<radius;
    }
}
