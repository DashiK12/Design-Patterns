package Creacionales.Abstract_Factory;

public class Contratista {
    public static void main(String[] args) {
        
        AbstractFactory carpinteriaRustica = new CarpinteriaRustica();
        AbstractFactory carpinteriaModerna = new CarpinteriaModerna();

        Cliente [] clientes= {new Cliente(carpinteriaModerna),
                              new Cliente(carpinteriaRustica),
                              new Cliente(carpinteriaModerna)};
        for (Cliente cliente : clientes) {
            cliente.crearMuebles();
            cliente.usarMuebles();
            System.out.println();
        }
    }
}
