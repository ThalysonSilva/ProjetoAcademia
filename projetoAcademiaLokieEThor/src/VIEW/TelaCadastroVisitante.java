/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package VIEW;

import DAO.VisitantesDAO;
import DAO.VisitantesDAOExcluir;
import DTO.VisitantesDTO;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jailton.Dayvid
 */
public class TelaCadastroVisitante extends javax.swing.JInternalFrame {

    int acao;
    VisitantesDAOExcluir objVisitanteExcluir;

    VisitantesDTO objVisitantesDTO = new VisitantesDTO(0, null, null, null, null, null, null, 0);

    public TelaCadastroVisitante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jFTF_CPFVis = new javax.swing.JFormattedTextField();
        jFTF_TelefoneVis = new javax.swing.JFormattedTextField();
        jComboBoxSexoVis = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jFTF_DataNascVis = new javax.swing.JFormattedTextField();
        jTF_NomeVis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTF_CodVis = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jFTF_ValorDiariaVis = new javax.swing.JFormattedTextField();
        jButtonNovoVis = new javax.swing.JButton();
        jButtonCancelarVis = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTF_EnderecoVis = new javax.swing.JTextField();
        jButtonExcluirVis = new javax.swing.JButton();
        jButtonEditarVis = new javax.swing.JButton();
        jButtonSalvarVis = new javax.swing.JButton();
        jButtonSairVis = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Visitantes");
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(750, 600));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Visitantes"));

        jLabel1.setText("CPF:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Contato:");

        jLabel4.setText("Sexo:");

        try {
            jFTF_CPFVis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_CPFVis.setEnabled(false);

        try {
            jFTF_TelefoneVis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_TelefoneVis.setEnabled(false);

        jComboBoxSexoVis.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        jComboBoxSexoVis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione:", "Masculino", "Feminino", " " }));
        jComboBoxSexoVis.setEnabled(false);

        jLabel5.setText("Data de Nascimento:");

        try {
            jFTF_DataNascVis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTF_DataNascVis.setEnabled(false);

        jTF_NomeVis.setEnabled(false);
        jTF_NomeVis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTF_NomeVisKeyReleased(evt);
            }
        });

        jLabel8.setText("C??digo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFTF_TelefoneVis, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jTF_CodVis))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTF_NomeVis, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jFTF_CPFVis, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jFTF_DataNascVis)
                        .addComponent(jComboBoxSexoVis, 0, 180, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFTF_DataNascVis)
                            .addComponent(jTF_NomeVis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTF_CodVis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jFTF_TelefoneVis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSexoVis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTF_CPFVis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addGap(34, 34, 34))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagamentos"));

        jLabel7.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        jLabel7.setText("Valor da Diaria:");

        try {
            jFTF_ValorDiariaVis.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFTF_ValorDiariaVis, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTF_ValorDiariaVis, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButtonNovoVis.setBackground(new java.awt.Color(0, 0, 255));
        jButtonNovoVis.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jButtonNovoVis.setText("Novo");
        jButtonNovoVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoVisActionPerformed(evt);
            }
        });

        jButtonCancelarVis.setBackground(new java.awt.Color(255, 0, 0));
        jButtonCancelarVis.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jButtonCancelarVis.setText("Cancelar");
        jButtonCancelarVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarVisActionPerformed(evt);
            }
        });

        jLabel6.setText("Endere??o:");

        jTF_EnderecoVis.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTF_EnderecoVis, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTF_EnderecoVis, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        jButtonExcluirVis.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        jButtonExcluirVis.setText("Excluir");
        jButtonExcluirVis.setEnabled(false);
        jButtonExcluirVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirVisActionPerformed(evt);
            }
        });

        jButtonEditarVis.setBackground(new java.awt.Color(0, 255, 51));
        jButtonEditarVis.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jButtonEditarVis.setText("Editar");
        jButtonEditarVis.setEnabled(false);
        jButtonEditarVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarVisActionPerformed(evt);
            }
        });

        jButtonSalvarVis.setBackground(new java.awt.Color(204, 204, 255));
        jButtonSalvarVis.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 16)); // NOI18N
        jButtonSalvarVis.setText("Salvar");
        jButtonSalvarVis.setEnabled(false);
        jButtonSalvarVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarVisActionPerformed(evt);
            }
        });

        jButtonSairVis.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSairVis.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 15)); // NOI18N
        jButtonSairVis.setText("Sair");
        jButtonSairVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairVisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonCancelarVis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonExcluirVis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonNovoVis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButtonEditarVis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSairVis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalvarVis, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonNovoVis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jButtonCancelarVis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalvarVis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditarVis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSairVis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExcluirVis, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        setBounds(255, 0, 1017, 769);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoVisActionPerformed
        // Metodo para ativar bot??o Novo
        acao = 1;
        botaonovovisitantes();
    }//GEN-LAST:event_jButtonNovoVisActionPerformed

    private void jButtonCancelarVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarVisActionPerformed
        // Metodo para ativar bot??o Cancelar

        botaocancelarvisitantes();
    }//GEN-LAST:event_jButtonCancelarVisActionPerformed

    private void jButtonEditarVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarVisActionPerformed
        // Metodo para ativar bot??o Editar
        acao = 2;
        botaoeditarvisitantes();
    }//GEN-LAST:event_jButtonEditarVisActionPerformed

    private void jButtonSalvarVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarVisActionPerformed
        regrasDeCampos();
    }//GEN-LAST:event_jButtonSalvarVisActionPerformed

    private void jButtonSairVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairVisActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairVisActionPerformed

    private void jButtonExcluirVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirVisActionPerformed
        excluirVisitantes();
    }//GEN-LAST:event_jButtonExcluirVisActionPerformed

    private void jTF_NomeVisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTF_NomeVisKeyReleased
        jTF_NomeVis.setText(jTF_NomeVis.getText().replaceAll("[^a-z | ^A-Z]", ""));
    }//GEN-LAST:event_jTF_NomeVisKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelarVis;
    private javax.swing.JButton jButtonEditarVis;
    private javax.swing.JButton jButtonExcluirVis;
    private javax.swing.JButton jButtonNovoVis;
    private javax.swing.JButton jButtonSairVis;
    private javax.swing.JButton jButtonSalvarVis;
    private javax.swing.JComboBox<String> jComboBoxSexoVis;
    private javax.swing.JFormattedTextField jFTF_CPFVis;
    private javax.swing.JFormattedTextField jFTF_DataNascVis;
    private javax.swing.JFormattedTextField jFTF_TelefoneVis;
    private javax.swing.JFormattedTextField jFTF_ValorDiariaVis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTF_CodVis;
    private javax.swing.JTextField jTF_EnderecoVis;
    private javax.swing.JTextField jTF_NomeVis;
    // End of variables declaration//GEN-END:variables

    public void botaonovovisitantes() {

        jTF_CodVis.setEnabled(false);
        jTF_NomeVis.setEnabled(true);
        jFTF_DataNascVis.setEnabled(true);
        jFTF_TelefoneVis.setEnabled(true);
        jFTF_CPFVis.setEnabled(true);
        jComboBoxSexoVis.setEnabled(true);
        jTF_EnderecoVis.setEnabled(true);
        jFTF_ValorDiariaVis.setEnabled(true);

        jButtonEditarVis.setEnabled(true);
        jButtonSalvarVis.setEnabled(true);
        jButtonCancelarVis.setEnabled(true);

        jTF_CodVis.setText("");
        jTF_NomeVis.setText("");
        jFTF_DataNascVis.setText("");
        jFTF_TelefoneVis.setText("");
        jFTF_CPFVis.setText("");
        jTF_EnderecoVis.setText("");
        jFTF_ValorDiariaVis.setText("");

    } // fim do metodo Bot??o_Novo_Visitantes!!

    public void botaocancelarvisitantes() {

        jTF_CodVis.setText("");
        jTF_NomeVis.setText("");
        jFTF_DataNascVis.setText("");
        jFTF_TelefoneVis.setText("");
        jFTF_CPFVis.setText("");
        jTF_EnderecoVis.setText("");
        jFTF_ValorDiariaVis.setText("");

        jTF_CodVis.setEnabled(true);
        jTF_NomeVis.setEnabled(false);
        jFTF_DataNascVis.setEnabled(false);
        jFTF_TelefoneVis.setEnabled(false);
        jFTF_CPFVis.setEnabled(false);
        jComboBoxSexoVis.setEnabled(false);
        jTF_EnderecoVis.setEnabled(false);
        jFTF_ValorDiariaVis.setEnabled(false);

        jButtonEditarVis.setEnabled(false);
        jButtonSalvarVis.setEnabled(false);
        jButtonCancelarVis.setEnabled(false);
        jButtonExcluirVis.setEnabled(false);

    }// fim do metodo Bot??o_Cancelar_Visitantes!!

    public void botaoeditarvisitantes() {

        jTF_CodVis.setEnabled(false);
        jTF_NomeVis.setEnabled(true);
        jFTF_DataNascVis.setEnabled(true);
        jFTF_TelefoneVis.setEnabled(true);
        jFTF_CPFVis.setEnabled(true);
        jComboBoxSexoVis.setEnabled(true);
        jTF_EnderecoVis.setEnabled(true);
        jFTF_ValorDiariaVis.setEnabled(true);

        jButtonEditarVis.setEnabled(true);
        jButtonSalvarVis.setEnabled(true);
        jButtonCancelarVis.setEnabled(true);
        jButtonExcluirVis.setEnabled(true);

    }// fim do metodo Bot??o_Editar_Visitantes!!

    public void regrasDeCampos() {

        if (jTF_NomeVis.getText().isEmpty()) { // codigo para verificar se o campo ta vazio

            JOptionPane.showMessageDialog(null, "Campo Nome obrigatorio");
            jTF_NomeVis.requestFocus(); // voltar para o campo nome para usuario preencher

        } else if (jFTF_DataNascVis.getText().equals("  /  /    ")) {

            JOptionPane.showMessageDialog(null, "Campo Data de Nascimento obrigatorio");
            jFTF_DataNascVis.requestFocus();

        } else if (jFTF_TelefoneVis.getText().equals("(  )     -    ")) {

            JOptionPane.showMessageDialog(null, "Campo Contato obrigatorio");
            jFTF_TelefoneVis.requestFocus();

        } else if (jFTF_CPFVis.getText().equals("   .   .   -  ")) {

            JOptionPane.showMessageDialog(null, "Campo CPF obrigatorio");
            jFTF_CPFVis.requestFocus();

        } else if (jComboBoxSexoVis.getSelectedItem().equals("Selecione:")) {

            JOptionPane.showMessageDialog(null, "Selecione seu genero");
            jComboBoxSexoVis.requestFocus();

        } else if (jTF_EnderecoVis.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Campo Endere??o obrigatorio");
            jTF_EnderecoVis.requestFocus();

        } else if (jFTF_ValorDiariaVis.getText().equals("  ")) {

            JOptionPane.showMessageDialog(null, "Campo valor diario obrigatorio");
            jFTF_ValorDiariaVis.requestFocus();

        } else {

            validarDate();

        }

    } //FIM DO METODO REGRAS DE CAMPO

    public void validarDate() {

        // PROCESSO PARA VALIDAR CAMPO
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();

        Date dataNascimento;
        try {
            dataNascimento = sdf.parse(jFTF_DataNascVis.getText());

            cal.setTime(dataNascimento);
            cal.add(Calendar.MONTH, 2);

            int year = cal.get(Calendar.YEAR);
            dataNascimento = cal.getTime();

            Date atualData = new Date();
            cal.setTime(atualData);

            int atualYear = cal.get(Calendar.YEAR);
            int idade = atualYear - year;

            if (idade < 16) {

                JOptionPane.showMessageDialog(null, "Idade minima para Visitantes ?? de 16 anos");
                jFTF_DataNascVis.requestFocus();

            } else {
                salvarVisitantes();

            }
        } catch (ParseException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVisitante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    public void salvarVisitantes() {

        // Metodo para ativar bot??o Salvar
        int cod;

        objVisitantesDTO = new VisitantesDTO(0, null, null, null, null, null, null, 0);

        objVisitantesDTO.setNome(jTF_NomeVis.getText());
        objVisitantesDTO.setDatanascimento(jFTF_DataNascVis.getText());
        objVisitantesDTO.setTelefone(jFTF_TelefoneVis.getText());
        objVisitantesDTO.setCpf(jFTF_CPFVis.getText());
        objVisitantesDTO.setSexo((String) jComboBoxSexoVis.getSelectedItem());
        objVisitantesDTO.setEndereco(jTF_EnderecoVis.getText());
        objVisitantesDTO.setValordiaria(Integer.parseInt(jFTF_ValorDiariaVis.getText())); // TEM QUE MODIFICAR PARA FLOAT, NO BD E NO DTO.

        jTF_CodVis.setEnabled(true);
        jTF_NomeVis.setEnabled(false);
        jFTF_DataNascVis.setEnabled(false);
        jFTF_TelefoneVis.setEnabled(false);
        jFTF_CPFVis.setEnabled(false);
        jComboBoxSexoVis.setEnabled(false);
        jTF_EnderecoVis.setEnabled(false);
        jFTF_ValorDiariaVis.setEnabled(false);

        jButtonEditarVis.setEnabled(true);
        jButtonSalvarVis.setEnabled(false);
        jButtonCancelarVis.setEnabled(false);

        try {
            VisitantesDAO objVisitantesDAO = new VisitantesDAO();
            if (acao == 1) {
                cod = objVisitantesDAO.visitanteAluno(objVisitantesDTO);
                jTF_CodVis.setText(String.valueOf(cod));
                JOptionPane.showMessageDialog(this, "Salvo com sucesso");

            }
            if (acao == 2) {

                objVisitantesDTO.setId_visitante(Integer.parseInt(jTF_CodVis.getText()));

                if (objVisitantesDAO.EditarVisitantes(objVisitantesDTO)) {

                    JOptionPane.showMessageDialog(this, "Alterado com sucesso!");

                }

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Opera????o deu erro" + e.getMessage());
        }

    }// fim do metodo Bot??o_Salvar_Visitantes!!

    public void excluirVisitantes() {

        if (jTF_CodVis.getText().equals("")) {  //  ESSE IF VAI SER PARA FAZER UMA VERIFICA????O, SE TEM CODIGO OU N??O..

            JOptionPane.showMessageDialog(this, "Digite o C??digo");

        } else { // SE TIVER CODIGO VAI FAZER A SEGUINTE OPERA????O

            int codigo = Integer.parseInt(jTF_CodVis.getText());  // ESSA VARIVEL VAI CARREGAR OS VALORES DO CAMPO CITADO.
            objVisitanteExcluir = new VisitantesDAOExcluir(); // codigo para instanciar o objeto

            try {

                if (JOptionPane.showConfirmDialog(this, "Confirma a exclus??o do Aluno?", "Confirma????o",
                        JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) { // codigo para da 3 op????es ao usuario, sim, n??o e cancelar
                    // codigo a cima vai ser muito utilizado para perguntar algo ao usuario
                    if (objVisitanteExcluir.ExcluirVisitante(codigo)) { // se a caixa for respondida com sim, ele vai retornar a mensagem a baixo e executar.
                        JOptionPane.showMessageDialog(this, "Excluido com sucesso !");
                        botaocancelarvisitantes();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao excluir o registro");
                    }
                } else {

                    JOptionPane.showMessageDialog(this, "Opera????o Cancelada !");
                    botaocancelarvisitantes();

                }

            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(this, "Erro: Exclus??o N??o Realizada" + erro.getMessage());
            }

        }

    } // FIM DO METODO EXCLUIR VISITANTES

}// fim da classe principal
