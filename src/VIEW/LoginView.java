
package VIEW;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import MODEL.*;
import CONTROLLER.*;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import junit.framework.Assert;
public class LoginView extends javax.swing.JFrame {
    loginmodel model;
    public LoginView() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("finalpic1.jpg")));
        Image img1=  myimage.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
        msgbox.setEditable(false);
        msgbox2.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnewadm = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        txtterms_conditions = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtprivacy_policy = new javax.swing.JCheckBox();
        btnnewadm1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextArea = new javax.swing.JScrollPane();
        msgbox = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgbox2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BANK MANAGMENT SYSTEM");
        setBackground(new java.awt.Color(102, 204, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnnewadm.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnnewadm.setText("CLICK HERE");
        btnnewadm.setBorder(null);
        btnnewadm.setBorderPainted(false);
        btnnewadm.setContentAreaFilled(false);
        btnnewadm.setFocusCycleRoot(true);
        btnnewadm.setFocusPainted(false);
        btnnewadm.setFocusable(false);
        btnnewadm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewadmActionPerformed(evt);
            }
        });
        getContentPane().add(btnnewadm, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 80, 20));

        txtusername.setBackground(new java.awt.Color(40, 40, 38));
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setBorder(null);
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 23));
        txtusername.getAccessibleContext().setAccessibleName("");

        txtpassword.setBackground(new java.awt.Color(40, 40, 38));
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setBorder(null);
        txtpassword.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, 120, 25));

        txtterms_conditions.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtterms_conditions.setText("TERMS AND CONDITIONS");
        txtterms_conditions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtterms_conditionsActionPerformed(evt);
            }
        });
        getContentPane().add(txtterms_conditions, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 160, 150));

        txtprivacy_policy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtprivacy_policy.setText("PRIVACY & POLICY");
        txtprivacy_policy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprivacy_policyActionPerformed(evt);
            }
        });
        getContentPane().add(txtprivacy_policy, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 161, -1));

        btnnewadm1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnnewadm1.setText("CLICK HERE");
        btnnewadm1.setBorder(null);
        btnnewadm1.setBorderPainted(false);
        btnnewadm1.setContentAreaFilled(false);
        btnnewadm1.setFocusCycleRoot(true);
        btnnewadm1.setFocusPainted(false);
        btnnewadm1.setFocusable(false);
        btnnewadm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewadm1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnnewadm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 90, 20));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel3.setText("USERNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 15)); // NOI18N
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel6.setText("FORGOT PASSWORD?");
        jLabel6.setToolTipText("");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel7.setText("NEW ACCOUNT?");
        jLabel7.setToolTipText("");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, -1, 30));

        btnlogin.setBackground(new java.awt.Color(22, 64, 96));
        btnlogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("LOGIN");
        btnlogin.setBorder(null);
        btnlogin.setBorderPainted(false);
        btnlogin.setContentAreaFilled(false);
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 110, 13));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/LOGIN.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

        msgbox.setColumns(20);
        msgbox.setRows(5);
        jTextArea.setViewportView(msgbox);

        getContentPane().add(jTextArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        msgbox2.setColumns(20);
        msgbox2.setRows(5);
        jScrollPane1.setViewportView(msgbox2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void validatation(){
        if(txtusername.getText().length()==0){ 
            JOptionPane.showMessageDialog(this,"PLEASE ENTER VALID USERNAME","SORRY",JOptionPane.ERROR_MESSAGE);
        }
        if(txtpassword.getText().length()==0){ 
            JOptionPane.showMessageDialog(this,"PLEASE CORRECT PASSWORD","SORRY",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
        
        Assert.assertEquals(false,txtusername.getText().length()==0);
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        Assert.assertEquals(false,txtpassword.getText().length()==0);
    }//GEN-LAST:event_txtpasswordActionPerformed

    public loginmodel getMymodel()
    {
        model=new loginmodel(txtusername.getText(),txtpassword.getText());
        return model;
    }
    public void showMessageBox(String msg)
    {
        JOptionPane.showMessageDialog(this,msg,"SORRY",JOptionPane.ERROR_MESSAGE);
    }
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
      validatation();
        if(txtprivacy_policy.isSelected()&&txtterms_conditions.isSelected()){   
           logincontroller l=new logincontroller(this);
        }
        else{
          System.out.println("wrong");
          JOptionPane.showMessageDialog(this,"PLEASE AGREE BOTH TERMS AND CONDITION", "ERROR", JOptionPane.ERROR_MESSAGE);
        }             
    }//GEN-LAST:event_btnloginActionPerformed

    private void txtprivacy_policyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprivacy_policyActionPerformed
 if (txtprivacy_policy.isSelected()) {
     String longText ="At our bank application, we prioritize the privacy and security of our customers'"
                            + "information. We adhere to strict data protection measures to safeguard personal and financial details. "
                            + "We collect only necessary information for account management and transaction processing, and never share it with unauthorized parties."
                            + " Our systems employ robust encryption and firewalls to ensure data integrity and prevent unauthorized access."
                            + " We regularly update security protocols and maintain strict confidentiality policies to maintain the trust"
                            + " and confidence of our valued customers.";
        msgbox.setText(longText);
        msgbox.setWrapStyleWord(true);
        msgbox.setLineWrap(true);
        msgbox.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(msgbox);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                    JOptionPane.showMessageDialog(this,scrollPane );
                }

    }//GEN-LAST:event_txtprivacy_policyActionPerformed

    private void btnnewadmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewadmActionPerformed
        NewAdminview s=new NewAdminview();
            s.setVisible(true);
            this.hide();
    }//GEN-LAST:event_btnnewadmActionPerformed

    private void txtterms_conditionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtterms_conditionsActionPerformed
        if (txtterms_conditions.isSelected()) {
             String longText1 ="By using our bank application, you agree to comply with the following terms and conditions."
                     + " The bank reserves the right to modify or update these terms at any time without prior notice. "
                     + "You are responsible for maintaining the security of your login credentials and ensuring the accuracy of the information provided. "
                     + "Unauthorized use of the application is strictly prohibited. The bank is not liable for any loss or damage arising from the use of the application"
                     + " or any errors or interruptions in its functionality. The bank reserves the right to suspend or terminate access to the application for any reason."
                     + " All transactions conducted through the application are subject to the bank's standard terms and fees. By using the application, you consent to "
                     + "the collection and use of your personal information in accordance with our privacy policy.";
                    // Show popup message when checkbox text is clicked
                     msgbox2.setText(longText1);
        msgbox2.setWrapStyleWord(true);
        msgbox2.setLineWrap(true);
        msgbox2.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(msgbox2);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                    JOptionPane.showMessageDialog(this, scrollPane);
                }
    }//GEN-LAST:event_txtterms_conditionsActionPerformed

    private void btnnewadm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewadm1ActionPerformed
        RecoveryAccountview s=new RecoveryAccountview();
            s.setVisible(true);
            this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_btnnewadm1ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnnewadm;
    private javax.swing.JButton btnnewadm1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jTextArea;
    private javax.swing.JTextArea msgbox;
    private javax.swing.JTextArea msgbox2;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JCheckBox txtprivacy_policy;
    private javax.swing.JCheckBox txtterms_conditions;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
 }
