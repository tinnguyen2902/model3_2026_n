package StoreManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StoreManagerDatabasa {
    Connection conn = null;
        try {
        conn =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/MD3_SS13_7" +
                        "user=root&password=123");
    } catch (
    SQLException ex) {
        // handle any errors
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
}
// đã xong