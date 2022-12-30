package DAO;

import DTO.AlunosDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AlunoDAOPesquisar {
    
   
    AlunosDTO objAlunosDTO = new AlunosDTO(null, null, null, null, null, null, 0, 0, 0, null, null, null);

    
    public boolean PesquisarAluno(AlunosDTO objAlunosDTO) throws SQLException{
        
     int cod=objAlunosDTO.getId_aluno();
     ConexaoDAO conn = new ConexaoDAO();
     
     PreparedStatement pstm = conn.getConexao().prepareStatement("SELECT * FROM alunoacademia where id_aluno = ?");
     pstm.setInt(1,cod);
     
     ResultSet rs = pstm.executeQuery();
        
        if(rs.next()){
        objAlunosDTO.setNome(rs.getString("al_nome"));
        objAlunosDTO.setCpf(rs.getString("al_cpf"));
        objAlunosDTO.setEnd(rs.getString("al_endereco"));
        objAlunosDTO.setDataNascimento(rs.getString("al_datanascimento"));
        objAlunosDTO.setTelefone(rs.getString("al_telefone"));
        objAlunosDTO.setSexo(rs.getString("al_sexo")); // OBS
        objAlunosDTO.setModalidade(rs.getString("al_modalidade")); // OBS
        objAlunosDTO.setMensalidade(rs.getInt("al_valorapagar"));
        objAlunosDTO.setDatCadastro(rs.getString("al_datacadastro"));
        objAlunosDTO.setSituacao(rs.getString("al_situacao")); // OBS
        objAlunosDTO.setMulta(rs.getInt("al_multa"));
        
        } 
        return true;
    }   // FIM DO MÉTODO PESQUISAR TELA
        
    
} // FIM DA CLASS
