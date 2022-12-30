/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ProfessoresDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfessorDAO {
    
    public int Professor(ProfessoresDTO objProfessorDTO) throws SQLException {
        
        Connection conn;
        //ResultSet rs;

        String sql = "insert into profacademia (prof_nome, prof_datanascimento, prof_sexo, prof_cpf, prof_telefone, prof_endereco, prof_salario, prof_funcao, prof_horastrabalhada, prof_turno) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        int registro;
        
        try ( PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objProfessorDTO.getNome().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(2, objProfessorDTO.getDataNascimento().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(3, objProfessorDTO.getSexo().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(4, objProfessorDTO.getCpf().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(5, objProfessorDTO.getTelefone().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(6, objProfessorDTO.getEnd().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setFloat(7, objProfessorDTO.getSalario());            
            pstm.setString(8, objProfessorDTO.getFuncao().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setInt(9, objProfessorDTO.getHorasTrab());
            pstm.setString(10, objProfessorDTO.getTurno().toUpperCase().trim());
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
    
    public boolean EditarProfessor(ProfessoresDTO objProfessorDTO) throws SQLException { // FALTA CRIAR UMA TRIBUTO NO ALUNOS DTO, ID_ALUNO, "CASO DE ERRO"

        
        int registro;

        // colocar where al_cpf se n der certo, ou n tiver o campo do codigo
        try ( PreparedStatement pstm = new ConexaoDAO().conectaBD().prepareStatement("update profacademia set prof_nome=?, prof_datanascimento=?, prof_sexo=?, prof_cpf=?, prof_telefone=?, prof_endereco=?, prof_salario=?, prof_funcao=?, prof_horastrabalhada=?, prof_turno=? where id_professor=?")) {
            pstm.setString(1, objProfessorDTO.getNome().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(2, objProfessorDTO.getDataNascimento().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(3, objProfessorDTO.getSexo().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(4, objProfessorDTO.getCpf().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(5, objProfessorDTO.getTelefone().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(6, objProfessorDTO.getEnd().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setFloat(7, objProfessorDTO.getSalario());            
            pstm.setString(8, objProfessorDTO.getFuncao().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setInt(9, objProfessorDTO.getHorasTrab());
            pstm.setString(10, objProfessorDTO.getTurno().toUpperCase().trim());
            pstm.setInt(11, objProfessorDTO.getId_professor());
            registro = pstm.executeUpdate();            
        }
        
        if (registro == 1) {
            return true;
        } else {
            return false;
        }

        //return false;
    }// Fim METODO EDITAR
    
}
