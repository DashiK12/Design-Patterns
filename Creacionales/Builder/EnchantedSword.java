package Creacionales.Builder;

public class EnchantedSword {
    private int AD;
    private int AS;
    private String material;
    private String DBType;

    
    public int getAD() {
        return AD;
    }
    public void setAD(int aD) {
        AD = aD;
    }
    public int getAS() {
        return AS;
    }
    public void setAS(int AS) {
        this.AS = AS;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getDBType() {
        return DBType;
    }
    public void setDBType(String debuffType) {
        this.DBType = debuffType;
    }

    public String showStats(){
        return material+" sword: "+AD+" AD, "+AS+" AS, Debuff type: "+DBType;
    }

}
