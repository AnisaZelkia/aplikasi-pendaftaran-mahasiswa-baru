/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;

public class koneksi2 {
    
    private static Connection con;
    
    public static Connection Koneksi() throws SQLException{
        
        try{
            String user = "root";
            String pass ="";
            String url = "jdbc:mysql://localhost:3306/final";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url,user,pass);
        }
        catch(SQLException e){
            System.out.println("Koneksi Gagal" + e.getMessage());
        }
        return con;
    }
}
