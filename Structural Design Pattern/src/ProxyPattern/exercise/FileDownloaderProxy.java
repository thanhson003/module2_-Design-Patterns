package ProxyPattern.exercise;

import java.io.IOException;

public class FileDownloaderProxy implements Downloader {
    @Override
    public void download(String url, String path) throws IOException {
        String fileName = "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:120.0) Gecko/20100101 Firefox/120.0";
        FileDownloader fileDownloader = new FileDownloader(fileName);
        fileDownloader.download(url, path);
    }
}
