package Estructurales.Facade;

public class App {
    public static void main(String[] args) {
        
        VideoConverter converter = new VideoConverter();
        Mov mov = new Mov("HxH");
        MP3 mp3 = new MP3("SnK");
        File mp4 = converter.convert(mov, "mp4");
        mp4 = (MP4) mp4;
        File mov2 = converter.convert(mp3, "mov");
        //mov2 = (MP3) mov2; //ClassCastException

        System.out.println(mp4.getFileName());
        System.out.println(mov2.getFileName());

    }
}
