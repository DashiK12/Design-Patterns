package Creacionales.Factory_Method;

public class PuertoTierra extends Puerto{

    public Vehiculo pedido() {
        return new Camion();
    }
    
}
