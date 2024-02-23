package Creacionales.Factory_Method;

public class Barco implements Vehiculo{

    boolean loaded;
    
    public Barco(){
        loaded = true;
    }

    public void transportar(){
        loaded = false;
    }

    public void entrega() {
        System.out.println("Barco entrego paquete.");
    }
    
}
