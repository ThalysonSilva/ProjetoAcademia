
package DAO;

import DTO.FuncionariosDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FuncionarioDAOConsulta {
    
    public ArrayList<FuncionariosDTO> PesquisarFuncionarios(){
        
        String sql = "select * from funcionarioacademia";
       // ConexaoDAO conn = new ConexaoDAO();
        PreparedStatement pstm;
        ResultSet rs;
        ArrayList<FuncionariosDTO> lista = new ArrayList<>();
        
        try {
            
           pstm = new ConexaoDAO().getConexao().prepareStatement(sql); 
           rs = pstm.executeQuery();
           
           while(rs.next()){ // Quanto tiver linha, vai ficar girando o while
               
               FuncionariosDTO objFuncionarioDTO = new FuncionariosDTO(null, null, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null);
               objFuncionarioDTO.setId_funcionario(rs.getInt("id_funcionario")); // acessar o objeto e setar o valor do banco
               objFuncionarioDTO.setNome(rs.getString("fun_nome"));
               objFuncionarioDTO.setCpf(rs.getString("fun_cpf"));
               objFuncionarioDTO.setDataadmissao(rs.getString("fun_dataadmissao"));
               objFuncionarioDTO.setFuncao(rs.getString("fun_funcao"));
               objFuncionarioDTO.setTurno(rs.getString("fun_turno"));
               
               lista.add(objFuncionarioDTO); //PEGAR AS INFORAÇÕES DTO E JOGAR DENTRO DA ARRAY LIST
               
           }
                    
                    
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null, "PesquisarALUNOS" + erro);
        }
        return lista;
        
    } // FIM DO METODO PESQUISAR ALUNO
    
    
     public static ResultSet carregaTabelFuncionario(String tipo, String arg) throws SQLException {

        String argumento = tipo + " " + "like '" + arg + "%'";

        ConexaoDAO conexao = new ConexaoDAO();
        PreparedStatement pstm = conexao.getConexao().prepareStatement("SELECT * FROM funcionarioacademia where " + argumento + "");

        ResultSet rs = pstm.executeQuery();

        return rs;

    }

    
    
}
