/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.FuncionariosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Thalyson
 */
public class FuncionarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public int Funcionario(FuncionariosDTO objFuncionarioDTO) throws SQLException {

        String sql = "insert into funcionarioacademia (fun_nome, fun_dataNascimento, fun_sexo, fun_cpf, fun_rg, fun_telefone, fun_celular, fun_estadocivil, fun_email, fun_dataadmissao, fun_salario, fun_funcao, fun_tipo, fun_turno, fun_endereco) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();
        int registro;

        try ( PreparedStatement pstm = conn.prepareStatement(sql)) {
            pstm.setString(1, objFuncionarioDTO.getNome().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(2, objFuncionarioDTO.getDataNascimento().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(3, objFuncionarioDTO.getSexo().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(4, objFuncionarioDTO.getCpf().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(5, objFuncionarioDTO.getRg().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(6, objFuncionarioDTO.getTelefone().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(7, objFuncionarioDTO.getCelular().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(8, objFuncionarioDTO.getEstadocivil().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(9, objFuncionarioDTO.getEmail().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(10, objFuncionarioDTO.getDataadmissao().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setFloat(11, objFuncionarioDTO.getSalario());
            pstm.setString(12, objFuncionarioDTO.getFuncao().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(13, objFuncionarioDTO.getTipo().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(14, objFuncionarioDTO.getTurno().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
            pstm.setString(15, objFuncionarioDTO.getEnd().toUpperCase().trim());
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
    } // FIM DO METODO FUNCIONARIO(INCLUIR
    
    public boolean EditarFuncionario(FuncionariosDTO objFuncionarioDTO) throws SQLException{ // FALTA CRIAR UMA TRIBUTO NO ALUNOS DTO, ID_ALUNO, "CASO DE ERRO"

        ConexaoDAO conn = new ConexaoDAO();
        int registro;

      
             // colocar where al_cpf se n der certo, ou n tiver o campo do codigo

            try ( PreparedStatement pstm = new ConexaoDAO().conectaBD().prepareStatement("update funcionarioacademia set fun_nome=?, fun_dataNascimento=?, fun_sexo=?,"
                    + " fun_cpf=?, fun_rg=?, fun_telefone=?, fun_celular=?,"
                    + " fun_estadocivil=?, fun_email=?, fun_dataadmissao=?, fun_salario=?, fun_funcao=?, fun_tipo=?, fun_turno=?, fun_endereco=? where id_funcionario=?")){
                pstm.setString(1, objFuncionarioDTO.getNome().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(2, objFuncionarioDTO.getDataNascimento().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(3, objFuncionarioDTO.getSexo().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(4, objFuncionarioDTO.getCpf().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(5, objFuncionarioDTO.getRg().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(6, objFuncionarioDTO.getTelefone().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(7, objFuncionarioDTO.getCelular().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(8, objFuncionarioDTO.getEstadocivil().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(9, objFuncionarioDTO.getEmail().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(10, objFuncionarioDTO.getDataadmissao().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setFloat(11, objFuncionarioDTO.getSalario());
                pstm.setString(12, objFuncionarioDTO.getFuncao().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(13, objFuncionarioDTO.getTipo().toUpperCase().trim());  // o toUPPERcase é para armazenar toda letra maiunscula
                pstm.setString(14, objFuncionarioDTO.getTurno().toUpperCase().trim());
                pstm.setString(15, objFuncionarioDTO.getEnd().toUpperCase().trim());
                pstm.setInt(16, objFuncionarioDTO.getId_funcionario());
                
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
    
} // FIM DA CLASS
