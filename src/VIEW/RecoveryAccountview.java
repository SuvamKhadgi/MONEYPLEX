
package VIEW;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import MODEL.*;
import CONTROLLER.*;
import java.awt.event.ActionListener;
import org.junit.Assert;
public class RecoveryAccountview extends javax.swing.JFrame {
    RecoveryAccountmodel model1;
    RecoveryAccountcontroller controller;
    public RecoveryAccountview() {
        initComponents();
        controller = new RecoveryAccountcontroller();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtephone = new javax.swing.JTextField();
        txtanswer = new javax.swing.JTextField();
        txtepassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnsrch = new javax.swing.JButton();
        btnregister = new javax.swing.JButton();
        txtque = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NEW ADMIN REGISTER");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtephone.setBorder(null);
        txtephone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtephoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtephoneFocusLost(evt);
            }
        });
        txtephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtephoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 250, 30));

        txtanswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtanswer.setBorder(null);
        txtanswer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtanswerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtanswerFocusLost(evt);
            }
        });
        txtanswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtanswerActionPerformed(evt);
            }
        });
        getContentPane().add(txtanswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 250, 30));

        txtepassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtepassword.setBorder(null);
        txtepassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtepasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtepasswordFocusLost(evt);
            }
        });
        txtepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtepasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 250, 30));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("ANSWER");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("NEW PASSWORD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("SECURITY QUESTION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 180, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("PHONE NUMBER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, 20));

        btnsrch.setBackground(new java.awt.Color(223, 224, 229));
        btnsrch.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnsrch.setForeground(new java.awt.Color(255, 255, 255));
        btnsrch.setText("SEARCH");
        btnsrch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnsrch.setContentAreaFilled(false);
        btnsrch.setDoubleBuffered(true);
        btnsrch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsrchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsrch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 90, 30));

        btnregister.setBackground(new java.awt.Color(223, 224, 229));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("REGISTER");
        btnregister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnregister.setContentAreaFilled(false);
        btnregister.setDoubleBuffered(true);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 90, 30));

        txtque.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtque.setBorder(null);
        txtque.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtqueFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtqueFocusLost(evt);
            }
        });
        txtque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqueActionPerformed(evt);
            }
        });
        getContentPane().add(txtque, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 250, 30));

        jButton1.setBackground(new java.awt.Color(223, 224, 229));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GO BACK TO LOGIN");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 160, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ACCOUNT RECOVERY ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 320, 50));

        jLabel3.setBackground(new java.awt.Color(42, 144, 174));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 360, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/back ground 1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("PASSWORD");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtephoneActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtephoneActionPerformed

    public RecoveryAccountmodel getMymodel()
    {
        model1=new RecoveryAccountmodel(txtephone.getText(),txtque.getText(),txtanswer.getText(),txtepassword.getText());
        return model1;
    }
     public void showMessage(String msg)
    {
        JOptionPane.showMessageDialog(this,msg);
    }
    public void addLoginListner(ActionListener log)
{
    btnregister.addActionListener(log);
}
    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
   String number = txtephone.getText();
        String securityQuestion = txtque.getText();
        String answer = txtanswer.getText();
        String newPassword = txtepassword.getText();
        
        if (controller.reg(number, securityQuestion, answer)) {
        // Update the password with the new password provided by the user
        if (controller.updatePasswordInDatabase(number, newPassword)) {
            JOptionPane.showMessageDialog(null, "Password reset successful!");
            LoginView s= new LoginView();
            s.setVisible(true);
            this.hide();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update the password.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Your answer does not match the security question.");
    }
//        RecoveryAccountcontroller na= new RecoveryAccountcontroller(this);
//        na.
    }//GEN-LAST:event_btnregisterActionPerformed

    private void txtephoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtephoneFocusGained

    }//GEN-LAST:event_txtephoneFocusGained

    private void txtanswerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtanswerFocusGained
 
             // TODO add your handling code here:
    }//GEN-LAST:event_txtanswerFocusGained

    private void txtepasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtepasswordFocusGained
 
             // TODO add your handling code here:
    }//GEN-LAST:event_txtepasswordFocusGained
    private void txtephoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtephoneFocusLost
        {   

        }    }//GEN-LAST:event_txtephoneFocusLost

    private void txtanswerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtanswerFocusLost
        { 
        }    }//GEN-LAST:event_txtanswerFocusLost

    private void txtepasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtepasswordFocusLost
        {
        }    }//GEN-LAST:event_txtepasswordFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    LoginView s=new LoginView();
            s.setVisible(true);
            this.hide();    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtanswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtanswerActionPerformed
       
    }//GEN-LAST:event_txtanswerActionPerformed

    private void txtepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtepasswordActionPerformed
       
    }//GEN-LAST:event_txtepasswordActionPerformed

    private void txtqueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtqueFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqueFocusGained

    private void txtqueFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtqueFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqueFocusLost

    private void txtqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqueActionPerformed

    private void btnsrchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsrchActionPerformed
//        String accountNumber =txtephone.getText();
        RecoveryAccountcontroller rac= new RecoveryAccountcontroller(this);
        rac.srchno(model1);
        txtque.setText(model1.getQuestion());
    }//GEN-LAST:event_btnsrchActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecoveryAccountview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregister;
    private javax.swing.JButton btnsrch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtanswer;
    private javax.swing.JTextField txtepassword;
    private javax.swing.JTextField txtephone;
    private javax.swing.JTextField txtque;
    // End of variables declaration//GEN-END:variables
}
