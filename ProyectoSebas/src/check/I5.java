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
public class I5 extends javax.swing.JFrame {

    /**
     * Creates new form I5
     */
    public I5() {
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

        I5 = new javax.swing.JLabel();
        cali = new javax.swing.JButton();
        bogota = new javax.swing.JButton();
        medellin = new javax.swing.JButton();
        herramientas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        I5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/M5.jpg"))); // NOI18N
        I5.setText("jLabel1");
        getContentPane().add(I5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 463, -1));

        cali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caliActionPerformed(evt);
            }
        });
        getContentPane().add(cali, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 54, 44));

        bogota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bogotaActionPerformed(evt);
            }
        });
        getContentPane().add(bogota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, 54, 44));

        medellin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medellinActionPerformed(evt);
            }
        });
        getContentPane().add(medellin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 54, 43));

        herramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                herramientasActionPerformed(evt);
            }
        });
        getContentPane().add(herramientas, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 40, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caliActionPerformed
        new I9().setVisible(true);
    }//GEN-LAST:event_caliActionPerformed

    private void bogotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bogotaActionPerformed
       new I10().setVisible(true);
    }//GEN-LAST:event_bogotaActionPerformed

    private void medellinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medellinActionPerformed
        new I11().setVisible(true);
    }//GEN-LAST:event_medellinActionPerformed

    private void herramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_herramientasActionPerformed
        new I6().setVisible(true);
    }//GEN-LAST:event_herramientasActionPerformed

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
            java.util.logging.Logger.getLogger(I5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel I5;
    private javax.swing.JButton bogota;
    private javax.swing.JButton cali;
    private javax.swing.JButton herramientas;
    private javax.swing.JButton medellin;
    // End of variables declaration//GEN-END:variables
}
