package Estructurales.Composite;

import java.util.ArrayList;

public class CompoundShapes {
    private ArrayList<Shape> components;

    public CompoundShapes(){
        components = new ArrayList<>();
    }

    public void add(Shape s){
        components.add(s);
    }

    public void remove(Shape s){
        components.remove(s);
    }

    public ArrayList<Shape> getShapes(){
        return components;
    }

    public ArrayList<Double> getAreas(){
        ArrayList<Double> areaList = new ArrayList<>();
        for (Shape shape : components) {
            areaList.add(shape.area());
        }
        return areaList;
    }

    public ArrayList<Double> getPerimeter(){
        ArrayList<Double> perList = new ArrayList<>();
        for (Shape shape : components) {
            perList.add(shape.perimeter());
        }
        return perList;
    }

    
}
