/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

/**
 *
 * @author USER
 */
public class I6 extends javax.swing.JFrame {

    /**
     * Creates new form I6
     */
    public I6() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        I6 = new javax.swing.JLabel();
        procesov = new javax.swing.JButton();
        vol = new javax.swing.JButton();
        ajustes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        I6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\NetBeansProjects\\check\\M6.jpg")); // NOI18N
        I6.setText("jLabel1");
        getContentPane().add(I6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 467, -1));

        procesov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procesovActionPerformed(evt);
            }
        });
        getContentPane().add(procesov, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 140, 35));

        vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volActionPerformed(evt);
            }
        });
        getContentPane().add(vol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 47, 35));

        ajustes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajustesActionPerformed(evt);
            }
        });
        getContentPane().add(ajustes, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void procesovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procesovActionPerformed
        new I8().setVisible(true);
    }//GEN-LAST:event_procesovActionPerformed

    private void volActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volActionPerformed
       new I5().setVisible(true);
    }//GEN-LAST:event_volActionPerformed

    private void ajustesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajustesActionPerformed
        new I7().setVisible(true);
    }//GEN-LAST:event_ajustesActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(I6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel I6;
    private javax.swing.JButton ajustes;
    private javax.swing.JButton procesov;
    private javax.swing.JButton vol;
    // End of variables declaration//GEN-END:variables
}
