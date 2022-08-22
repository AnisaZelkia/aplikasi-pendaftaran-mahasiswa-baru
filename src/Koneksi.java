/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Koneksi {
    
    public static void main(String[] args){
        String user = "root";
        String pass ="";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/final";
            
            Connection conn = DriverManager.getConnection(url ,user,pass );
            System.out.println("Koneksi Sukses");
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Koneksi gagal");
        }
        catch(ClassNotFoundException e){
    }
}
}
