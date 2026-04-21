package exercise;

public class MySQLStorage implements UserStorage{
    @Override
    public void store(User user) {
        // Mô phỏng logic insert vào CSDL
        System.out.println("[MySQL Storage] Đang kết nối tới CSDL...");
        System.out.println("Thực thi query: INSERT INTO users name : " + user.getUsername() );
        System.out.println("[MySQL Storage] Lưu thành công!\n");
    }
}
