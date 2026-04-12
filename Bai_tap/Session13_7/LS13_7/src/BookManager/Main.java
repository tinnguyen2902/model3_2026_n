package BookManager;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        bookManager.loadMenu();
    }
}