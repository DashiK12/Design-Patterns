package Estructurales.Facade;

public class File {
    private String name,type;

    public File(String n,String t){
        setName(n);
        type = t;
    }

    public void setName(String n){
        name = n;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName(){
        return name;
    }

    public String getFileName(){
        return name+"."+type;
    }
}
