package Creacionales.Abstract_Factory;

public class CarpinteriaModerna implements AbstractFactory {

    public Mesa crearMesa() {
        return new MesaModerna();
    }

    public Silla crearSilla() {
        return new SillaModerna();
    }

    public Escritorio crearEscritorio() {
        return new EscritorioModerno();
    }
    
}
