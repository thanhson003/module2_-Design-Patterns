package exercise;

public class Main {
    public static void main(String[] args) {
            // Tạo một đối tượng User
            User myUser = new User("Nguyen Van A");

            // ---------------------------------------------------------
            // Chạy thử với XMLStorage
            // ---------------------------------------------------------
            System.out.println("--- KIỂM THỬ VỚI XML STORAGE ---");
            UserStorage xmlStorage = new XMLStorage();
            UserController controllerXML = new UserController(xmlStorage);
            controllerXML.store(myUser);

            // ---------------------------------------------------------
            // Chạy thử với MySQLStorage
            // ---------------------------------------------------------
            System.out.println("--- KIỂM THỬ VỚI MYSQL STORAGE ---");
            UserStorage mysqlStorage = new MySQLStorage();
            UserController controllerMySQL = new UserController(mysqlStorage);
            controllerMySQL.store(myUser);

        /* Mẹo: Bạn cũng có thể dùng lại controller hiện tại và chỉ cần thay đổi strategy:
        controllerXML.setStorage(new MySQLStorage());
        controllerXML.store(myUser);
        */
        }
    }

