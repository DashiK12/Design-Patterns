package Creacionales.Abstract_Factory;

public class CarpinteriaRustica implements AbstractFactory{

    @Override
    public Mesa crearMesa() {
        return new MesaRustica();
    }

    @Override
    public Silla crearSilla() {
        return new SillaRustica();
    }

    @Override
    public Escritorio crearEscritorio() {
        return new EscritorioRustico();
    }
    
}
