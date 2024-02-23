package Creacionales.Builder;

public class CraftingTable implements CraftingStation{
    private Sword item;

    public void reset(){
        item = new Sword();
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

    public Sword getItem() {
        return item;
    }
    
}
