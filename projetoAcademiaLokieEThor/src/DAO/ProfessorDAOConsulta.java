package DAO;

import DTO.ProfessoresDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProfessorDAOConsulta {

    public ArrayList<ProfessoresDTO> PesquisarProfessor() {

        String sql = "select * from profacademia";
        // ConexaoDAO conn = new ConexaoDAO();
        PreparedStatement pstm;
        ResultSet rs;
        ArrayList<ProfessoresDTO> lista = new ArrayList<>();

        try {

            pstm = new ConexaoDAO().getConexao().prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) { // Quanto tiver linha, vai ficar girando o while

                ProfessoresDTO objProfessorDTO = new ProfessoresDTO(0, null, null, null, null, null, null, null, null, 0, 0);
                objProfessorDTO.setId_professor(rs.getInt("id_professor")); // acessar o objeto e setar o valor do banco
                objProfessorDTO.setNome(rs.getString("prof_nome"));
                objProfessorDTO.setCpf(rs.getString("prof_cpf"));
                objProfessorDTO.setFuncao(rs.getString("prof_funcao"));
                objProfessorDTO.setTelefone(rs.getString("prof_telefone"));
                objProfessorDTO.setTurno(rs.getString("prof_turno"));

                lista.add(objProfessorDTO); //PEGAR AS INFORAÇÕES DTO E JOGAR DENTRO DA ARRAY LIST

            }

        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Pesquisar Professor" + erro);
        }
        return lista;

    } // FIM DO METODO PESQUISAR ALUNO

    public static ResultSet carregaTabelProfessor(String tipo, String arg) throws SQLException {

        String argumento = tipo + " " + "like '" + arg + "%'";

        ConexaoDAO conexao = new ConexaoDAO();
        PreparedStatement pstm = conexao.getConexao().prepareStatement("SELECT * FROM profacademia where " + argumento + "");

        ResultSet rs = pstm.executeQuery();

        return rs;

    }

} // FIM DA CLASS

