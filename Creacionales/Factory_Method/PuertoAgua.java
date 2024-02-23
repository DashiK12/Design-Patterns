package Creacionales.Factory_Method;

public class PuertoAgua extends Puerto{

    public Vehiculo pedido(){
        return new Barco();
    }
    
}
