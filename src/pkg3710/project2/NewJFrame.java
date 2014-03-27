/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3710.project2;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author nzayatz14
 */
public class NewJFrame extends javax.swing.JFrame {
    private int clicks = 0;
    //private JFrameSupport support = new JFrameSupport();
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cup1 = new javax.swing.JLabel();
        Cup2 = new javax.swing.JLabel();
        Cup3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        btnCup1 = new javax.swing.JButton();
        btnCup3 = new javax.swing.JButton();
        btnCup2 = new javax.swing.JButton();
        PlaceBet = new javax.swing.JLabel();
        Level = new javax.swing.JLabel();
        WinPercentage = new javax.swing.JLabel();
        MoneyLeft = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cup Game Bruh");

        Cup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg3710/project2/imgres.jpg"))); // NOI18N

        Cup2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg3710/project2/imgres.jpg"))); // NOI18N

        Cup3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg3710/project2/imgres.jpg"))); // NOI18N

        jButton1.setText("Go!");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtAmount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        btnCup1.setText("Cup 1");

        btnCup3.setText("Cup 3");

        btnCup2.setText("Cup 2");

        PlaceBet.setText("Place Bet:");

        Level.setText("Level:");

        WinPercentage.setText("Win Percentage:");

        MoneyLeft.setText("Money Left:");

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.META_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(115, 115, 115)
                .add(btnCup1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(btnCup2)
                .add(142, 142, 142)
                .add(btnCup3)
                .add(113, 113, 113))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(PlaceBet)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txtAmount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(303, 303, 303))
            .add(layout.createSequentialGroup()
                .add(40, 40, 40)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(Cup1)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(WinPercentage)
                                    .add(Level)
                                    .add(MoneyLeft))))
                        .add(18, 18, 18)
                        .add(Cup2)))
                .add(18, 18, 18)
                .add(Cup3)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(43, 43, 43)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Cup3)
                    .add(Cup2)
                    .add(Cup1))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(btnCup1)
                    .add(btnCup3)
                    .add(btnCup2))
                .add(103, 103, 103)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txtAmount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(PlaceBet, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton1)
                .add(21, 21, 21)
                .add(MoneyLeft)
                .add(18, 18, 18)
                .add(Level)
                .add(18, 18, 18)
                .add(WinPercentage)
                .add(89, 89, 89))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Timer time = new Timer();
        final int Cup2X = Cup2.getX();
        final int Cup1X = Cup1.getX();
        //System.out.println("("+Cup1.getX()+","+Cup1.getY()+") (" +Cup2.getX()+","+Cup2.getY()+")");
        time.schedule(new TimerTask(){
            @Override
            public void run(){ 
                if(clicks == 0){
                if(Cup1.getX()<Cup2X){
                    Cup1.setLocation(Cup1.getX()+1,JFrameSupport.curve1to2(Cup1.getX()+1));
                    Cup2.setLocation(Cup2.getX()-1, JFrameSupport.curve2to1(Cup2.getX()-1));
                }else{
                    clicks++;
                    this.cancel();
                }
                }else if (clicks == 1){
                    if(Cup1.getX()>Cup2X){
                    Cup1.setLocation(Cup1.getX()-1,JFrameSupport.curve2to1(Cup1.getX()-1));
                    Cup2.setLocation(Cup2.getX()+1,JFrameSupport.curve1to2(Cup2.getX()+1));
                }else{
                    clicks--;
                    this.cancel();
                }
                }
                
            }
        }, 0,1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        
    }//GEN-LAST:event_txtAmountActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cup1;
    private javax.swing.JLabel Cup2;
    private javax.swing.JLabel Cup3;
    private javax.swing.JLabel Level;
    private javax.swing.JLabel MoneyLeft;
    private javax.swing.JLabel PlaceBet;
    private javax.swing.JLabel WinPercentage;
    private javax.swing.JButton btnCup1;
    private javax.swing.JButton btnCup2;
    private javax.swing.JButton btnCup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
