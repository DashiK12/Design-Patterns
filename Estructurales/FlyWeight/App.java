package Estructurales.FlyWeight;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        String [] names = {"normal","dry","fall","elder"};
        String [] colors = {"Lgreen","brown","orange","Dgreen"};
        String [] textures =  {"default.png","dry.png","autumn.png","leaf.png"};
        Forest f = new Forest();

        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            
            f.plantTree(r.nextInt(150), r.nextInt(150), names[r.nextInt(4)],  colors[r.nextInt(4)],  textures[r.nextInt(4)]);
        }

        f.show();
        
    }
}
