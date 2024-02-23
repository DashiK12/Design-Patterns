package Creacionales.Factory_Method;

//creator
public abstract class Puerto {
    public void entrega(){
        Vehiculo myv= pedido();
        myv.transportar();
        myv.entrega();
    };
    public abstract Vehiculo pedido();
}
