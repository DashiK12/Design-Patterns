package Estructurales.Facade;

public class VideoConverter {
    
    public VideoConverter(){
    }

    public File convert(File file, String format){
        String name = file.getName();
        File f = new File(name,file.getType());

        if(format == "mp4") //ej
            f = new MP4(name);
        else if(format == "mp3")
            f = new MP3(name);
        else if(format == "mov")
            f = new Mov(name);
        
        return f;
    }
}
