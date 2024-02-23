package Creacionales.Abstract_Factory;

import java.util.ArrayList;

public class Cliente{
    private AbstractFactory carpinteria;
    private ArrayList<Mueble> misMuebles;

    public Cliente(AbstractFactory f){
        carpinteria = f;
        misMuebles = new ArrayList<>();
    }

    public void crearMuebles(){
        misMuebles.add(carpinteria.crearEscritorio());
        misMuebles.add(carpinteria.crearMesa());
        misMuebles.add(carpinteria.crearSilla());
    }

    public void usarMuebles(){
        for (Mueble mueble : misMuebles) {
            mueble.usar();
        }
    }
}
