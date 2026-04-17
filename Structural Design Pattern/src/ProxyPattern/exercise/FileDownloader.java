package ProxyPattern.exercise;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader {
    private String userAgent;

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String url, String path) throws IOException  {
        URL urlObj = new URL(url);
        URLConnection connection = urlObj.openConnection();

        connection.setRequestProperty("User-Agent", userAgent);

        try (InputStream inputStream = connection.getInputStream()) {
            FileOutputStream fos = new FileOutputStream(path);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Tải file thành công về: " + path);
        }
    }
}
