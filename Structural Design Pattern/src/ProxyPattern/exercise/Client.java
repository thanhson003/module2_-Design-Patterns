package ProxyPattern.exercise;

public class Client {
    public static void main(String[] args) {
        String fileUrl = "https://cdn-new.topcv.vn/unsafe/https://static.topcv.vn/company_logos/0ZT9refQobeAkpzsYWBdyaki10IlbFB4_1655288503____f48c9fc932b36c4eec44ec23d223fa18.png";
        String destination = "Structural Design Pattern\\src\\ProxyPattern\\exercise\\codegym_logo.png";

        Downloader proxy = new FileDownloaderProxy();

        try {
            System.out.println("Bắt đầu tải file qua Proxy...");
            proxy.download(fileUrl, destination);
        } catch (Exception e) {
            System.err.println("Lỗi khi tải file: " + e.getMessage());
        }
    }
}
