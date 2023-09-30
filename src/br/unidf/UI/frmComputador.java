package br.unidf.UI;

import br.unidf.DAL.ComputadorDAL;
import br.unidf.DTO.ComputadorDTO;
import br.unidf.utils.DocumenUtil;
import static br.unidf.utils.MessageUtil.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.PlainDocument;

public class frmComputador extends javax.swing.JFrame {

    private ComputadorDAL computadorDAL;
    private List<ComputadorDTO> computadorDTOs;

    public frmComputador() {
        initComponents();
        computadorDAL = new ComputadorDAL();
        this.computadorDTOs = new ArrayList<>();
        this.defaultInitBtn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIncluirCom = new javax.swing.JButton();
        btnAlterarCom = new javax.swing.JButton();
        btnExcluirCom = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMostrarTodosCom = new javax.swing.JButton();
        txtCodigoIDCom = DocumenUtil.getTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvClientes = new javax.swing.JTable();
        btnLimparCom = new javax.swing.JButton();
        btnPesquisarCom = new javax.swing.JButton();
        btnSairCom = new javax.swing.JButton();
        txtTamanhoMonitorCom = DocumenUtil.getTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVelocidadeCom = DocumenUtil.getTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro de Clientes");
        setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        setResizable(false);

        btnIncluirCom.setMnemonic('I');
        btnIncluirCom.setText("Incluir");
        btnIncluirCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirComActionPerformed(evt);
            }
        });

        btnAlterarCom.setMnemonic('A');
        btnAlterarCom.setText("Alterar");
        btnAlterarCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarComActionPerformed(evt);
            }
        });

        btnExcluirCom.setMnemonic('E');
        btnExcluirCom.setText("Excluir");
        btnExcluirCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirComActionPerformed(evt);
            }
        });

        jLabel2.setText("Código(ID)");

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("Cadastro de computador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        btnMostrarTodosCom.setMnemonic('M');
        btnMostrarTodosCom.setText("Mostrar Todos");
        btnMostrarTodosCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarTodosComActionPerformed(evt);
            }
        });

        jLabel3.setText("Tamanho do Monitor");

        dgvClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código (ID)", "Tamanho do Monitor", "Velocidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dgvClientes);

        btnLimparCom.setMnemonic('L');
        btnLimparCom.setText("Limpar");
        btnLimparCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparComActionPerformed(evt);
            }
        });

        btnPesquisarCom.setMnemonic('P');
        btnPesquisarCom.setText("Pesquisar");
        btnPesquisarCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarComActionPerformed(evt);
            }
        });

        btnSairCom.setMnemonic('S');
        btnSairCom.setText("Sair");
        btnSairCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairComActionPerformed(evt);
            }
        });

        txtTamanhoMonitorCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanhoMonitorComActionPerformed(evt);
            }
        });

        jLabel5.setText("Velocidade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addComponent(btnIncluirCom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterarCom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluirCom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMostrarTodosCom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimparCom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSairCom))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtCodigoIDCom, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarCom))
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTamanhoMonitorCom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtVelocidadeCom, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoIDCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarCom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTamanhoMonitorCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVelocidadeCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluirCom)
                    .addComponent(btnAlterarCom)
                    .addComponent(btnExcluirCom)
                    .addComponent(btnMostrarTodosCom)
                    .addComponent(btnLimparCom)
                    .addComponent(btnSairCom))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairComActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairComActionPerformed

    private void btnIncluirComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirComActionPerformed
        ComputadorDTO computadorDTO = getFields();
        this.computadorDAL.incluirComputador(computadorDTO);
    }//GEN-LAST:event_btnIncluirComActionPerformed

    private void btnAlterarComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarComActionPerformed
        ComputadorDTO computadorDTO = getFields();
        if (this.txtCodigoIDCom.isEnabled())
            showMessage("Não é possivel atualizar sem ter realizado uma pesquisado antes.");
        else {
            this.computadorDAL.alterarComputador(computadorDTO);
            showMessage("Dados atualizado com sucesso!!!");
        }
    }//GEN-LAST:event_btnAlterarComActionPerformed

    private void btnExcluirComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirComActionPerformed
        if (this.txtCodigoIDCom.isEnabled())
            showMessage("Não é possivel atualizar sem ter realizado uma pesquisado antes.");
        else {
            ComputadorDTO computadorDTO = getFields();
            this.computadorDAL.excluirComputador(computadorDTO.getComId());
            showMessage("Dado excluido com sucesso!!!");
            btnLimparComActionPerformed(evt);
            this.clearAllFields();
        }
    }//GEN-LAST:event_btnExcluirComActionPerformed

    private void btnMostrarTodosComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarTodosComActionPerformed
        this.computadorDTOs = this.computadorDAL.selecionarListaComputadores();
    }//GEN-LAST:event_btnMostrarTodosComActionPerformed

    private void btnLimparComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparComActionPerformed
        this.txtCodigoIDCom.setEditable(true);
        this.defaultInitBtn();
        this.clearAllFields();
    }//GEN-LAST:event_btnLimparComActionPerformed

    private void btnPesquisarComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarComActionPerformed
        if (this.txtCodigoIDCom.getText().isBlank()) {
            return;
        }
        
        final Integer id = Integer.valueOf(this.txtCodigoIDCom.getText());
        ComputadorDTO computadorDTO = this.computadorDAL.selecionarComputadorPorID(id);
        if (Objects.isNull(computadorDTO)) {
            showMessage("Dados não encontrado com o ID informado");
            return;
        }
        
        this.txtCodigoIDCom.setText(computadorDTO.getComId().toString());
        this.txtTamanhoMonitorCom.setText(computadorDTO.getComTamanhoMonitor().toString());
        this.txtVelocidadeCom.setText(computadorDTO.getComVelocidade().toString());
        
        this.txtCodigoIDCom.setEditable(false);
        this.txtCodigoIDCom.setEnabled(false);
        this.btnPesquisarCom.setEnabled(false);
        this.btnExcluirCom.setEnabled(true);
        this.btnAlterarCom.setEnabled(true);
        
    }//GEN-LAST:event_btnPesquisarComActionPerformed

    private void txtTamanhoMonitorComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanhoMonitorComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTamanhoMonitorComActionPerformed

    private ComputadorDTO getFields() {
        Integer tamanhoMonitor = null;
        Integer velocidade = null;
        Integer id = null;

        if (!this.txtCodigoIDCom.getText().isBlank()) {
            id = Integer.valueOf(this.txtCodigoIDCom.getText());
        }

        if (!this.txtTamanhoMonitorCom.getText().isBlank()) {
            tamanhoMonitor = Integer.valueOf(this.txtTamanhoMonitorCom.getText());
        }

        if (!this.txtVelocidadeCom.getText().isBlank()) {
            velocidade = Integer.valueOf(this.txtVelocidadeCom.getText());
        }

        return new ComputadorDTO(id, tamanhoMonitor, velocidade);
    }
    
    private void clearAllFields(){
        this.txtCodigoIDCom.setDocument(new PlainDocument());
        this.txtCodigoIDCom.setEditable(true);
        this.txtCodigoIDCom.setEnabled(true);
        this.txtTamanhoMonitorCom.setDocument(new PlainDocument());
        this.txtVelocidadeCom.setDocument(new PlainDocument());
    }

    private void defaultInitBtn() {
        this.btnPesquisarCom.setEnabled(true);
        this.btnPesquisarCom.setToolTipText("Buscar um computador por ID");
        
        this.btnIncluirCom.setEnabled(false);
        this.btnIncluirCom.setToolTipText("Incluir um novo computador");
        
        this.btnExcluirCom.setEnabled(false);
        this.btnExcluirCom.setToolTipText("Excluir o computador que foi pesquisado em tela");
        
        this.btnAlterarCom.setEnabled(false);
        this.btnAlterarCom.setToolTipText("Alterar os dados do computador que foi pesquisado em tela");
        
        this.btnLimparCom.setToolTipText("Limpar todos os campos");
        
        
        DocumentListener documentListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                isValidInclude();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                isValidInclude();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                isValidInclude();
            }
        };
        
        this.txtTamanhoMonitorCom.getDocument().addDocumentListener(documentListener);
        this.txtVelocidadeCom.getDocument().addDocumentListener(documentListener);
    }
    
    private void isValidInclude(){
       if (txtTamanhoMonitorCom.getText().isBlank()
                || txtVelocidadeCom.getText().isBlank()) {
            btnIncluirCom.setEnabled(false);
        } else {
            btnIncluirCom.setEnabled(true);
        }
    }

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmComputador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCom;
    private javax.swing.JButton btnExcluirCom;
    private javax.swing.JButton btnIncluirCom;
    private javax.swing.JButton btnLimparCom;
    private javax.swing.JButton btnMostrarTodosCom;
    private javax.swing.JButton btnPesquisarCom;
    private javax.swing.JButton btnSairCom;
    private javax.swing.JTable dgvClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigoIDCom;
    private javax.swing.JTextField txtTamanhoMonitorCom;
    private javax.swing.JTextField txtVelocidadeCom;
    // End of variables declaration//GEN-END:variables
}
