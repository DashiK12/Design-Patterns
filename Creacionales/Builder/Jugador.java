package Creacionales.Builder;

public class Jugador {
    CraftingStation station;

    public Jugador(CraftingStation c){
        station = c;
    }

    public void changeStation(CraftingStation c){
        station = c;
    }

    public void craftSword(){
        station.reset();
        station.setAD(20);
        station.setAS(10);
        station.setMaterial("Iron");
        station.setDBType("no effect");
    }

    public void craftEnchantedSword(){
        station.reset();
        station.setAD(40);
        station.setAS(15);
        station.setMaterial("Diamond");
        station.setDBType("Shock");
    }
}
