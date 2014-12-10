/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package titlescreen;

/**
 *
 * @author bcturner
 */
public class titleScreenForm extends javax.swing.JFrame {

    /**
     * Creates new form titleScreenForm
     */
    
    public titleScreenForm() {
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

        orderingGameLabel = new javax.swing.JLabel();
        brickGameButton = new javax.swing.JLabel();
        BubbleGameButton = new javax.swing.JLabel();
        teamsButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        backgroundLayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        orderingGameLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/OrderingGameLabel.png"))); // NOI18N
        orderingGameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderingGameLabelMouseClicked(evt);
            }
        });
        getContentPane().add(orderingGameLabel);
        orderingGameLabel.setBounds(420, 100, 230, 220);

        brickGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/brickGameLabel.png"))); // NOI18N
        brickGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brickGameButtonMouseClicked(evt);
            }
        });
        getContentPane().add(brickGameButton);
        brickGameButton.setBounds(210, 100, 210, 210);

        BubbleGameButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bubbleGameLabel.png"))); // NOI18N
        BubbleGameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BubbleGameButtonMouseClicked(evt);
            }
        });
        getContentPane().add(BubbleGameButton);
        BubbleGameButton.setBounds(0, 100, 210, 210);

        teamsButton.setText("Team and Points");
        teamsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamsButtonActionPerformed(evt);
            }
        });
        getContentPane().add(teamsButton);
        teamsButton.setBounds(427, 370, 150, 29);

        titleLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        titleLabel.setText("Welcome to Fraction Interaction!");
        getContentPane().add(titleLabel);
        titleLabel.setBounds(170, 10, 300, 40);

        backgroundLayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/background.png"))); // NOI18N
        getContentPane().add(backgroundLayer);
        backgroundLayer.setBounds(0, 0, 640, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BubbleGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BubbleGameButtonMouseClicked
        System.out.println("Pressed");
    }//GEN-LAST:event_BubbleGameButtonMouseClicked

    private void brickGameButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brickGameButtonMouseClicked
        System.out.println("Pressed");
    }//GEN-LAST:event_brickGameButtonMouseClicked

    private void orderingGameLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderingGameLabelMouseClicked
        System.out.println("Pressed");
    }//GEN-LAST:event_orderingGameLabelMouseClicked

    private void teamsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamsButtonActionPerformed
        System.out.println("Pressed");
    }//GEN-LAST:event_teamsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(titleScreenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(titleScreenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(titleScreenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(titleScreenForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new titleScreenForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BubbleGameButton;
    private javax.swing.JLabel backgroundLayer;
    private javax.swing.JLabel brickGameButton;
    private javax.swing.JLabel orderingGameLabel;
    private javax.swing.JButton teamsButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
