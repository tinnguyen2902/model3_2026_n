package Manager;

import Menu.Menu;
import database.dbcontact;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // check kết nối database
//            Connection myConn = dbcontact.getConnection();
//            if (myConn != null) {
//                System.out.println("kết nối thành công");
//            } else {
//                System.out.println("Kết nối thất bại");
//            }
        // liên kết với menu
        Menu menu = new Menu();
        menu.loadMenu();
    }
}