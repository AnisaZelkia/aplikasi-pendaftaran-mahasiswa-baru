/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author AGUN
 */
public class log extends javax.swing.JFrame {

    /**
     * Creates new form log
     */
    public log() {
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

        us = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        show = new javax.swing.JLabel();
        disable = new javax.swing.JLabel();
        btn_login = new javax.swing.JLabel();
        tambah_akun = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        us.setBackground(new java.awt.Color(48, 14, 51));
        us.setColumns(20);
        us.setFont(us.getFont().deriveFont(us.getFont().getSize()-3f));
        us.setForeground(new java.awt.Color(255, 255, 255));
        us.setText("email");
        us.setBorder(null);
        us.setCaretColor(new java.awt.Color(255, 255, 255));
        us.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        us.setOpaque(false);
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });
        us.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usKeyTyped(evt);
            }
        });
        getContentPane().add(us, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 220, 30));

        txt_password.setBackground(new java.awt.Color(48, 14, 51));
        txt_password.setColumns(20);
        txt_password.setFont(txt_password.getFont().deriveFont(txt_password.getFont().getSize()+2f));
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setText("Password");
        txt_password.setBorder(null);
        txt_password.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_password.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_password.setOpaque(false);
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 262, 200, 30));

        show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showMouseClicked(evt);
            }
        });
        getContentPane().add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 274, 20, 10));

        disable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                disableMouseClicked(evt);
            }
        });
        getContentPane().add(disable, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 274, 20, 10));

        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 100, 30));

        tambah_akun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambah_akunMouseClicked(evt);
            }
        });
        getContentPane().add(tambah_akun, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 460, 20, 30));

        jLabel2.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 40, 20, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        setSize(new java.awt.Dimension(900, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
         
        try {
            String sql = "SELECT * FROM user WHERE email='"+us.getText()+"' AND pass='"+txt_password.getText()+"'";
           java.sql.Connection conn = (Connection)koneksi2.Koneksi();
            java.sql.Statement st = conn.createStatement();
            java.sql.ResultSet result = st.executeQuery(sql);
            if(result.next()){
                if(us.getText().equals(result.getString("email")) && txt_password.getText().equals(result.getString("pass"))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                      Home3 tampilkan = new Home3();
       tampilkan.show();
       dispose();  
                }
            }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_btn_loginMouseClicked

    private void showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showMouseClicked
        disable.setVisible(true);
        disable.setEnabled(true);
        txt_password.setEchoChar((char)0);
        ImageIcon A= new ImageIcon(getClass().getResource("/img/login2.jpg"));
        jLabel1.setIcon(A);
        show.setVisible(false);
        show.setEnabled(false);
    }//GEN-LAST:event_showMouseClicked

    private void disableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_disableMouseClicked
        show.setVisible(true);
        show.setEnabled(true);
        txt_password.setEchoChar((char)8226);
        ImageIcon A= new ImageIcon(getClass().getResource("/img/login.jpg"));
        jLabel1.setIcon(A);
        disable.setVisible(false);
        disable.setEnabled(false);
    }//GEN-LAST:event_disableMouseClicked

    private void tambah_akunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambah_akunMouseClicked
      //  new sign().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tambah_akunMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0;i = i + 0.1)
        {
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(50);
                
                
            }
            catch(InterruptedException e)
            {
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void usKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_usKeyTyped

    private void usKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_usKeyReleased

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
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(log.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new log().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_login;
    private javax.swing.JLabel disable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel show;
    private javax.swing.JLabel tambah_akun;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField us;
    // End of variables declaration//GEN-END:variables
}
