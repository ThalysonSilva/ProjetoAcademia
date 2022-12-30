
package DAO;

import DTO.VisitantesDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VisitantesDAOConsulta {
    
    public ArrayList<VisitantesDTO> PesquisarVisitantes(){
        
        String sql = "select * from visitanteacademia";
       // ConexaoDAO conn = new ConexaoDAO();
        PreparedStatement pstm;
        ResultSet rs;
        ArrayList<VisitantesDTO> lista = new ArrayList<>();
        
        try {
            
           pstm = new ConexaoDAO().getConexao().prepareStatement(sql); 
           rs = pstm.executeQuery();
           
           while(rs.next()){ // Quanto tiver linha, vai ficar girando o while
               
               VisitantesDTO objVisitantesDTO = new VisitantesDTO(0, null, null, null, null, null, null, 0);
               objVisitantesDTO.setId_visitante(rs.getInt("id_visitantes")); // acessar o objeto e setar o valor do banco
               objVisitantesDTO.setNome(rs.getString("vis_nome"));
               objVisitantesDTO.setCpf(rs.getString("vis_cpf"));
               objVisitantesDTO.setDatanascimento(rs.getString("vis_datanascimento"));
               objVisitantesDTO.setTelefone(rs.getString("vis_telefone"));
               objVisitantesDTO.setValordiaria(rs.getInt("vis_valordiaria"));
               
               lista.add(objVisitantesDTO); //PEGAR AS INFORAÇÕES DTO E JOGAR DENTRO DA ARRAY LIST
               
           }
                    
                    
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "Pesquisar Visitantes" + erro);
        }
        return lista;
        
    } // FIM DO METODO PESQUISAR ALUNO
    
    
     public static ResultSet carregaTabelVisitantes(String tipo, String arg) throws SQLException {

        String argumento = tipo + " " + "like '" + arg + "%'";

        ConexaoDAO conexao = new ConexaoDAO();
        PreparedStatement pstm = conexao.getConexao().prepareStatement("SELECT * FROM visitanteacademia where " + argumento + "");

        ResultSet rs = pstm.executeQuery();

        return rs;

    } 

    
}
