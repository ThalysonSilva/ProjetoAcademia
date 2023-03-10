/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VIEW;

import DAO.ProfessorDAOConsulta;
import DTO.ProfessoresDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Jailton.Dayvid
 */
public class TelaConsultaProfessor extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaConsultaProfessor
     */
    public TelaConsultaProfessor() {
        initComponents();
        
      DefaultTableModel modelo = (DefaultTableModel) jTableTCProfessor.getModel();
      jTableTCProfessor.setRowSorter(new TableRowSorter(modelo));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jctipo = new javax.swing.JComboBox<>();
        jtarg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTCProfessor = new javax.swing.JTable();
        Jbcp_Capturar = new javax.swing.JButton();
        Jbcp_ImprimirFichas = new javax.swing.JButton();
        Jbcp_Sair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Tela Consulta Professores");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        jLabel1.setText("Consultar por:");

        jLabel2.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        jLabel2.setText("Digite o Argumento:");

        jctipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selicione:", "Id", "Nome", "CPF", "Turno" }));

        jTableTCProfessor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nome", "CPF", "Fun????o", "Telefone", "Turno"
            }
        ));
        jScrollPane1.setViewportView(jTableTCProfessor);

        Jbcp_Capturar.setBackground(new java.awt.Color(0, 0, 255));
        Jbcp_Capturar.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        Jbcp_Capturar.setText("Pesquisar");
        Jbcp_Capturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbcp_CapturarActionPerformed(evt);
            }
        });

        Jbcp_ImprimirFichas.setBackground(new java.awt.Color(0, 255, 51));
        Jbcp_ImprimirFichas.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        Jbcp_ImprimirFichas.setText("Imprimir Fichas");

        Jbcp_Sair.setBackground(new java.awt.Color(255, 0, 0));
        Jbcp_Sair.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        Jbcp_Sair.setText("Sair");
        Jbcp_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbcp_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jctipo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtarg, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jbcp_Capturar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jbcp_ImprimirFichas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jbcp_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jctipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtarg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Jbcp_Capturar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(Jbcp_ImprimirFichas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(Jbcp_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        setBounds(100, 50, 1317, 583);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

        listarProfessor();

    }//GEN-LAST:event_formInternalFrameOpened

    private void Jbcp_CapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbcp_CapturarActionPerformed

        String tipo = "";
        String escolha = jctipo.getSelectedItem().toString().trim();
        if (escolha.equals("Nome")) { // argumento selecionado vai filtrar e puxar as informa??a????es
            tipo = " " + "prof_nome";
        }
        if (escolha.equals("CPF")) {
            tipo = " " + "prof_cpf";
        }
        if (escolha.equals("Id")) {
            tipo = " " + "id_professor";
        }
        if (escolha.equals("Status")) {
            tipo = " " + "al_situacao";
        }
        if (escolha.equals("Turno")) {
            tipo = " " + "prof_turno";
        }

        String arg = jtarg.getText();

        DefaultTableModel mp1 = (DefaultTableModel) jTableTCProfessor.getModel();
        int l = mp1.getRowCount();

        if (l > 0) {
            while (l > 0) {
                ((DefaultTableModel) jTableTCProfessor.getModel()).removeRow(l - 1);
                l--;
            } // fim do while
        } // FIM DO IF

        try {

            ResultSet rs = ProfessorDAOConsulta.carregaTabelProfessor(tipo, arg);

            DefaultTableModel model = (DefaultTableModel) jTableTCProfessor.getModel();

            while (rs.next()) {
                String Coluna0 = rs.getString("id_professor");
                String Coluna1 = rs.getString("prof_nome").toString().trim();
                String Coluna2 = rs.getString("prof_cpf").toString().trim();
                String Coluna3 = rs.getString("prof_funcao").toString().trim();
                String Coluna4 = rs.getString("prof_telefone").toString().trim();
                String Coluna5 = rs.getString("prof_turno").toString().trim();

                mp1.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4, Coluna5});

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Ocorreu um erro" + erro);
        }

        tamanhocolunas();
        jTableTCProfessor.setAutoCreateRowSorter(true);


    }//GEN-LAST:event_Jbcp_CapturarActionPerformed

    private void Jbcp_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbcp_SairActionPerformed
    dispose();
    }//GEN-LAST:event_Jbcp_SairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbcp_Capturar;
    private javax.swing.JButton Jbcp_ImprimirFichas;
    private javax.swing.JButton Jbcp_Sair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTCProfessor;
    private javax.swing.JComboBox<String> jctipo;
    private javax.swing.JTextField jtarg;
    // End of variables declaration//GEN-END:variables

    private void listarProfessor() {

        try {

            ProfessorDAOConsulta objProfessorConsulta = new ProfessorDAOConsulta();
            DefaultTableModel model = (DefaultTableModel) jTableTCProfessor.getModel();
            model.setNumRows(0);

            ArrayList<ProfessoresDTO> lista = objProfessorConsulta.PesquisarProfessor();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getId_professor(),
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getFuncao(),
                    lista.get(num).getTelefone(),
                    lista.get(num).getTurno()
                });

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(this, "Listar Professor" + erro);
        }

    }

    public void tamanhocolunas(){
      
      jTableTCProfessor.getColumnModel().getColumn(0).setMinWidth(100);
      jTableTCProfessor.getColumnModel().getColumn(1).setMinWidth(250);
    
    }
    
    
}
