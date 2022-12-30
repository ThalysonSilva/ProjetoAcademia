package DAO;

import DTO.AlunosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AlunoDAO {

    Connection conn;
    //PreparedStatement pstm;
    //ResultSet rs;

    // Cadastrar Aluno
    public int Aluno(AlunosDTO objAlunosDTO) throws SQLException {

        String sql = "insert into alunoacademia (al_nome, al_cpf, al_telefone, al_datanascimento, al_sexo, al_endereco, al_modalidade, al_valorapagar, al_datacadastro, al_situacao, al_multa) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        int registro;

        try ( PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objAlunosDTO.getNome().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(2, objAlunosDTO.getCpf().toUpperCase().trim());            // o trim serve para eliminar todo campo vazio dps que finalizar o nome
            pstm.setString(3, objAlunosDTO.getTelefone().toUpperCase().trim());
            pstm.setString(4, objAlunosDTO.getDataNascimento().toUpperCase().trim());
            pstm.setString(5, objAlunosDTO.getSexo().toUpperCase().trim());
            pstm.setString(6, objAlunosDTO.getEnd().toUpperCase().trim());
            pstm.setString(7, objAlunosDTO.getModalidade().toUpperCase().trim());
            pstm.setFloat(8, objAlunosDTO.getMensalidade());
            pstm.setString(9, objAlunosDTO.getDatCadastro());
            pstm.setString(10, objAlunosDTO.getSituacao());
            pstm.setInt(11, objAlunosDTO.getMulta());

            //JOptionPane.showMessageDialog(null, "Aluno Cadastrado com Sucesso!");
            //pstm.execute();
            //pstm.close();
            registro = pstm.executeUpdate();

        }

        PreparedStatement pstmAux = conn.prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmAux.executeQuery();
        int codigo = 0;

        if ((registro == 1) && (rs != null)) {
            rs.next();
            codigo = rs.getInt(1);
            return codigo;

        } else {

            return 0;
        }

    }// FIM METODO INCLUIR

    public boolean Editar(AlunosDTO objAlunosDTO) throws SQLException{ // FALTA CRIAR UMA TRIBUTO NO ALUNOS DTO, ID_ALUNO, "CASO DE ERRO"

        ConexaoDAO conn = new ConexaoDAO();
        int registro;

      
             // colocar where al_cpf se n der certo, ou n tiver o campo do codigo

            try ( PreparedStatement pstm = new ConexaoDAO().conectaBD().prepareStatement("update alunoacademia set al_nome=?, al_cpf=?, al_telefone=?, al_datanascimento=?, al_sexo=?, al_endereco=?, al_modalidade=?, al_valorapagar=?, al_datacadastro=?, al_situacao=?, al_multa=? where id_aluno=?")){
                pstm.setString(1, objAlunosDTO.getNome().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(2, objAlunosDTO.getCpf().toUpperCase().trim());            // o trim serve para eliminar todo campo vazio dps que finalizar o nome
                pstm.setString(3, objAlunosDTO.getTelefone().toUpperCase().trim());
                pstm.setString(4, objAlunosDTO.getDataNascimento().toUpperCase().trim());
                pstm.setString(5, objAlunosDTO.getSexo().toUpperCase().trim());
                pstm.setString(6, objAlunosDTO.getEnd().toUpperCase().trim());
                pstm.setString(7, objAlunosDTO.getModalidade().toUpperCase().trim());
                pstm.setInt(8, objAlunosDTO.getMensalidade());
                pstm.setString(9, objAlunosDTO.getDatCadastro());
                pstm.setString(10, objAlunosDTO.getSituacao().toUpperCase());
                pstm.setInt(11, objAlunosDTO.getMulta());
                pstm.setInt(12, objAlunosDTO.getId_aluno());
                registro = pstm.executeUpdate();

                //JOptionPane.showMessageDialog(null, "Aluno Cadastrado com Sucesso!");
                //pstm.execute();
                //pstm.close();
            }

            if (registro == 1) {
                return true;
            } else {
                return false;
            }

           
        //return false;
    }// Fim METODO EDITAR

}// FIM CLASS