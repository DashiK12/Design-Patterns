package Creacionales.Factory_Method;

// producto concreto
public class Camion implements Vehiculo {
    boolean loaded;
    
    public Camion(){
        loaded = true;
    }

    public void transportar(){
        loaded = false;
    }

    public void entrega() {
        System.out.println("Camion entrego paquete.");
    }
}
