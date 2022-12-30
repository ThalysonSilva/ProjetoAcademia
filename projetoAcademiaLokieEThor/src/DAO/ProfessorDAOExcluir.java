/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDAOExcluir {
    
    public boolean ExcluirProfessor(int cod) throws SQLException{
        
        ConexaoDAO conn = new ConexaoDAO();
        int registros;
        
        try (PreparedStatement pstm = conn.getConexao().prepareStatement("delete from profacademia where id_professor = ?")){
            
            pstm.setInt(1, cod);
            
            registros = pstm.executeUpdate();
            
        }//FIM DO METODO EXCLUIR
        
        if (registros == 1){
            return true;
        }else{
            return false;
        }
        
        
    }
    
}
