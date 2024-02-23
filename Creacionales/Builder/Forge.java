package Creacionales.Builder;

public class Forge implements CraftingStation{
    private EnchantedSword item;

    public void reset(){
        item = new EnchantedSword();
    }
    public void setAD(int s) {
        item.setAD(s);
    }

    public void setAS(int s) {
        item.setAS(s);
    }

    public void setMaterial(String m) {
        item.setMaterial(m);
    }

    public void setDBType(String t) {
        item.setDBType(t);
    }

    public EnchantedSword getItem() {
        return item;
    }
}
