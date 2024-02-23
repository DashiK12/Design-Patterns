package Creacionales.Singleton;

public class Singleton {
    private Singleton instance;

    private Singleton(){
        if(instance==null){
            instance = new Singleton();
        }
    }

    public Singleton getInstance(){
        return instance;
    }
}
