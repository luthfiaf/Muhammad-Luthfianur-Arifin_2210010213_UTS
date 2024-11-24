
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class koneksi {
    
    private static final String DB = "jdbc:mysql://localhost/inventarisbarang_db";

public static Connection getKoneksi(){
    Connection conn = null;
    MysqlDataSource data = new MysqlDataSource();
    data.setUser("root");
    data.setPassword("");
    data.setURL(DB);
    try {
        conn = data.getConnection();
    } catch (SQLException ex) {
        Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
    }
    return conn;
}
    
}
