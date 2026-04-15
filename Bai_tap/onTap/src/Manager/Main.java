package Manager;

import Menu.Manager;

public class Main {
    public static void main(String[] args) {
        // check kết nối vs db ok chưa
//    public static void main(String[] args) {
//        Connection myConn = dbConnect.getConnection();
//        if (myConn != null){
//            System.out.println("kết nối thành công");
//        } else {
//            System.out.println("Kết nối thất bại");
//        }
//    }
        Manager manager = new Manager();
        manager.loadMenu();
    }
}