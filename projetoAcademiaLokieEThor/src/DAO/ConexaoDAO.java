package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conectaBD(){
        Connection conn = null;
        
        try {
            String url = "jdbc:mysql://localhost:3306/academialokiethor?user=root&password=";
            conn = DriverManager.getConnection(url);
            
            
            
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "ConexaoDAO"+ erro.getMessage()); // o que vai aparecer no Erro.
            
        }
        return conn;
    }
 
    public Connection getConexao(){
        
        return conectaBD();
    }
}  
   

