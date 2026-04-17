package ProxyPattern.exercise;

import java.io.IOException;

public interface Downloader {
    public void download(String url, String path)throws IOException;
}
