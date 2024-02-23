package Creacionales.Builder;

public class App {
    public static void main(String[] args) {
        CraftingTable ct = new CraftingTable();
        
        Jugador j = new Jugador(ct);
        j.craftSword();
        Sword s = ct.getItem();
        System.out.println(s.showStats());

        Forge f = new Forge();
        j.changeStation(f);
        j.craftEnchantedSword();
        EnchantedSword es = f.getItem();
        System.out.println(es.showStats());

        

    }
}
