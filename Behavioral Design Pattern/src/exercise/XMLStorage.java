package exercise;

public class XMLStorage  implements UserStorage {
    @Override
    public void store(User user) {
        // Mô phỏng logic ghi ra file XML
        System.out.println("[XML Storage] Đang lưu trữ...");
        System.out.println("<user>");
        System.out.println("  <name>" + user.getUsername() + "</name>");
        System.out.println("</user>");
        System.out.println("[XML Storage] Lưu thành công!\n");
    }
}
