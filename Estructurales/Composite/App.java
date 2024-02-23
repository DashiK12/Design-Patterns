package Estructurales.Composite;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        
        Shape s1,s2,s3,s4,s5,s6;

        s1 = new Circle(3,0,0);
        s2 = new Circle(7,0,0);
        s3 = new Rectangle(0, 0, 2, 1);
        s4 = new Rectangle(0, 0, 15, 5);
        s5 = new Triangle(0, 0, 1,4,7,3,6,8);
        s6 = new Triangle(0, 0, 1,3,5,2,6,4);
        
        CompoundShapes composite = new CompoundShapes();
        composite.add(s1);
        composite.add(s2);
        composite.add(s3);
        composite.add(s4);
        composite.add(s5);
        composite.add(s6);

        ArrayList<Double> resultsA = composite.getAreas();
        ArrayList<Double> resultsP = composite.getPerimeter();
        
        System.out.print("Perimetros: ");
        for (Double d : resultsP) {
            System.out.print(d+", ");
        }
        System.out.println();
        System.out.print("Areas: ");
        for (Double d : resultsA) {
            System.out.print(d+", ");
        }

        
    }
}