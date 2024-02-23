package Estructurales.Proxy;

public interface ThirdPartyYTLib {
    public void listVideos();
    public void getVideoInfo(int id);
    public void downloadVideo(int id);
}
