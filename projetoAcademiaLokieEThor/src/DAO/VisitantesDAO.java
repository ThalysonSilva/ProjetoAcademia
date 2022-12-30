package DAO;

import DTO.VisitantesDTO;
import java.sql.ResultSet; // SE O CODIGO N FUNCIONAR COLOCAR JAVA.SQL.RESULTSET
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VisitantesDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<VisitantesDTO> lista = new ArrayList<>();

    //CADASTRAR VISITANTE
    public int visitanteAluno(VisitantesDTO objVisitantesDTO) throws SQLException {
        int registro;

        String sql = " insert into visitanteacademia (vis_nome, vis_datanascimento, vis_telefone, vis_cpf, vis_sexo, vis_endereco, vis_valordiaria ) values (?, ?, ?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();

        try ( PreparedStatement pstm = conn.prepareStatement(sql)) {

            pstm.setString(1, objVisitantesDTO.getNome().toUpperCase().trim());
            pstm.setString(2, objVisitantesDTO.getDatanascimento().toUpperCase().trim());
            pstm.setString(3, objVisitantesDTO.getTelefone().toUpperCase().trim());
            pstm.setString(4, objVisitantesDTO.getCpf().toUpperCase().trim());
            pstm.setString(5, objVisitantesDTO.getSexo().toUpperCase().trim());
            pstm.setString(6, objVisitantesDTO.getEndereco().toUpperCase().trim());
            pstm.setInt(7, objVisitantesDTO.getValordiaria());
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

    } // FIM DO METODO incluir

    public boolean EditarVisitantes(VisitantesDTO objVisitantesDTO) throws SQLException { // FALTA CRIAR UMA TRIBUTO NO ALUNOS DTO, ID_ALUNO, "CASO DE ERRO"

        ConexaoDAO conn = new ConexaoDAO();
        int registro;

        // colocar where al_cpf se n der certo, ou n tiver o campo do codigo
        try ( PreparedStatement pstm = new ConexaoDAO().conectaBD().prepareStatement("update visitanteacademia set vis_nome=?, vis_datanascimento=?, vis_telefone=?, vis_cpf=?, vis_sexo=?, vis_endereco=?, vis_valordiaria=? where id_visitantes=?")) {
            pstm.setString(1, objVisitantesDTO.getNome().toUpperCase().trim());
            pstm.setString(2, objVisitantesDTO.getDatanascimento().toUpperCase().trim());
            pstm.setString(3, objVisitantesDTO.getTelefone().toUpperCase().trim());
            pstm.setString(4, objVisitantesDTO.getCpf().toUpperCase().trim());
            pstm.setString(5, objVisitantesDTO.getSexo().toUpperCase().trim());
            pstm.setString(6, objVisitantesDTO.getEndereco().toUpperCase().trim());
            pstm.setInt(7, objVisitantesDTO.getValordiaria());
            pstm.setInt(8, objVisitantesDTO.getId_visitante());
            registro = pstm.executeUpdate();

            
        }

        if (registro == 1) {
            return true;
        } else {
            return false;
        }

        //return false;
    }// Fim METODO EDITAR
} // FIM DA CLASS   
