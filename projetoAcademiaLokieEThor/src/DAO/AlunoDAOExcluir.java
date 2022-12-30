
package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AlunoDAOExcluir {
    
    public boolean ExcluirAluno(int cod) throws SQLException{
        
        ConexaoDAO conn = new ConexaoDAO();
        int registros;
        
        try (PreparedStatement pstm = conn.getConexao().prepareStatement("delete from alunoacademia where id_aluno = ?")){
            
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
