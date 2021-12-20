/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author mochammadhairullah
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHelper {
    private static Connection koneksi;
 
    public static void bukaKoneksi(){
            if(koneksi == null){
                try{
                    String url = "jdbc:mysql://localhost:3306/db_perpus";
                    String user = "root";
                    String password = "";
//                    DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                    koneksi = DriverManager.getConnection(url, user, password);
                }
                catch (SQLException t){
                    System.out.println("Error koneksi!");
                }
            }
        }
 
    public static int insertQueryGetId(String query) {
        bukaKoneksi();
        int num = 0;
        int result = -1;
 
        try {
            try (Statement stmt = koneksi.createStatement()) {
                num = stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
                ResultSet rs = stmt.getGeneratedKeys();
                
                if (rs.next()){
                    result = rs.getInt(1);
                }
                rs.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            result = -1;
        }
        return result;
    }
 
    public static boolean executeQuery(String query){
        bukaKoneksi();
        boolean result = false;
 
        try{
            try (Statement stmt = koneksi.createStatement()) {
                stmt.executeUpdate(query);
                
                result = true;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    return result;
 }
 
    public static ResultSet selectQuery(String query){
        bukaKoneksi();
        ResultSet rs = null;

        try{
            Statement stmt = koneksi.createStatement();
            rs = stmt.executeQuery(query);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
//    public static void main(String[] args) {
//        DBHelper dbh = new DBHelper();
//        dbh.bukaKoneksi();
//    }
}
