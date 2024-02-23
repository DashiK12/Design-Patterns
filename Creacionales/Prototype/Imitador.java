package Creacionales.Prototype;

import java.util.ArrayList;

public class Imitador {
    private ArrayList<Shape> shapes;

    public Imitador(){
        shapes = new ArrayList<>();
        Shape c = new Circle(10,15,"Red",4);
        shapes.add(c);
        Shape c2 = c.clone();
        shapes.add(c2);
        Shape r = new Rectangle(5,5,"Green",15,10);
        Shape r2 = r.clone();
        shapes.add(r);
        shapes.add(r2);
    }

    public void print(){
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }

    public void dup(){
        ArrayList<Shape> list = new ArrayList<>();
        for (Shape shape : shapes) {
            list.add(shape.clone());
        }
        shapes.addAll(list);
    }

    public static void main(String[] args) {
        Imitador i = new Imitador();
        i.print();
        System.out.println();
        i.dup();
        i.print();
    }
}
