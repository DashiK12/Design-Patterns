package Estructurales.Adapter;


public class ShapeAdapter extends CircleShape{

    public ShapeAdapter(SquareShape s) {
        super((int)(s.getWidth() * Math.sqrt(2) / 2));
    }
    
    public int getRadius(){
        return super.getRadius();
    }

    public static void main(String[] args) {
        CircleHole ch = new CircleHole(10);
        CircleShape cSh1 = new CircleShape(5);
        CircleShape cSh2 = new CircleShape(10);
        SquareShape sqSh1 = new SquareShape(13);
        SquareShape sqSh2 = new SquareShape(15);

        CircleShape adapter = new ShapeAdapter(sqSh1);
        CircleShape adapter2 = new ShapeAdapter(sqSh2);

        System.out.println(ch.fits(cSh1));
        System.out.println(ch.fits(cSh2));
        System.out.println(ch.fits(adapter));
        System.out.println(ch.fits(adapter2));



    }
}
