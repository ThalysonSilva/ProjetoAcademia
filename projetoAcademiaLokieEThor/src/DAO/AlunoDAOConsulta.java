package DAO;

import DTO.AlunosDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlunoDAOConsulta {

    public ArrayList<AlunosDTO> PesquisarAlunos() {

        String sql = "select * from alunoacademia";
        // ConexaoDAO conn = new ConexaoDAO();
        PreparedStatement pstm;
        ResultSet rs;
        ArrayList<AlunosDTO> lista = new ArrayList<>();

        try {

            pstm = new ConexaoDAO().getConexao().prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) { // Quanto tiver linha, vai ficar girando o while

                AlunosDTO objAlunosDTO = new AlunosDTO(null, null, null, null, null, null, 0, 0, 0, null, null, null);
                objAlunosDTO.setId_aluno(rs.getInt("id_aluno")); // acessar o objeto e setar o valor do banco
                objAlunosDTO.setNome(rs.getString("al_nome"));
                objAlunosDTO.setCpf(rs.getString("al_cpf"));
                objAlunosDTO.setDataNascimento(rs.getString("al_datanascimento"));
                objAlunosDTO.setTelefone(rs.getString("al_telefone"));
                objAlunosDTO.setSituacao(rs.getString("al_situacao"));
                objAlunosDTO.setMulta(rs.getInt("al_multa"));
                

                lista.add(objAlunosDTO); //PEGAR AS INFORAÇÕES DTO E JOGAR DENTRO DA ARRAY LIST

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "PesquisarALUNOS" + erro);
        }
        return lista;

    } // FIM DO METODO PESQUISAR ALUNO

    //Pesquisar com argumento \/
    public static ResultSet carregaTabelaAluno(String tipo, String arg) throws SQLException {

        String argumento = tipo + " " + "like '" + arg + "%'";

        ConexaoDAO conexao = new ConexaoDAO();
        PreparedStatement pstm = conexao.getConexao().prepareStatement("SELECT * FROM alunoacademia where " + argumento + "");

        ResultSet rs = pstm.executeQuery();

        return rs;

    }

} // FIM DA CLASS
