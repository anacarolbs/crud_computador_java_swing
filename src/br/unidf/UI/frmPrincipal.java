package br.unidf.UI;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {
    public frmPrincipal() {
        initComponents();
        inserirIcone();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFundoComputador = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        itmSairComputador = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        mnuCadastrosComputador = new javax.swing.JMenu();
        itmCadComputador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Computadores");
        setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        setResizable(false);

        lblFundoComputador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/unidf/UI/ipil.jpg"))); // NOI18N

        itmSairComputador.setMnemonic('f');
        itmSairComputador.setText("Aplicativo Computador");

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        itmSairComputador.add(exitMenuItem);

        menuBar.add(itmSairComputador);

        mnuCadastrosComputador.setText("Cadastros");

        itmCadComputador.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itmCadComputador.setText("Computadores");
        itmCadComputador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadComputadorActionPerformed(evt);
            }
        });
        mnuCadastrosComputador.add(itmCadComputador);

        menuBar.add(mnuCadastrosComputador);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFundoComputador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblFundoComputador)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja Sair do Sistema?", "Aplicativo Computador", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
            this.dispose();
        }

    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void itmCadComputadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadComputadorActionPerformed
        if ((frmComputador == null) || (!frmComputador.isVisible())) {
            frmComputador = new frmComputador();
            frmComputador.setVisible(true);
        }
    }//GEN-LAST:event_itmCadComputadorActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem itmCadComputador;
    private javax.swing.JMenu itmSairComputador;
    private javax.swing.JLabel lblFundoComputador;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuCadastrosComputador;
    // End of variables declaration//GEN-END:variables
    private frmComputador frmComputador;
    
    private void inserirIcone() {
//       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconComputador.png")));
    }

}
