
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
public class NewAdminview extends javax.swing.JFrame {
    NewAdminmodel model1;
    public NewAdminview() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("back ground.jpg")));
        Image img1=  myimage.getImage();
        Image img2=img1.getScaledInstance(jLabel1.getWidth(),jLabel1.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
        addPlaceholderstyle(txtefname);
        addPlaceholderstyle(txtelname);
        addPlaceholderstyle(txtephone);
        addPlaceholderstyle(txteemail);
        addPlaceholderstyle(txtepassword); 
    }
    public void validation(){
         if(txteemail.getText().length()==0){ 
            JOptionPane.showMessageDialog(this,"PLEASE ENTER VALID EMAIL","SORRY",JOptionPane.ERROR_MESSAGE);
        }
          if(txtefname.getText().length()==0){ 
            JOptionPane.showMessageDialog(this,"PLEASE ENTER FIRST NAME","SORRY",JOptionPane.ERROR_MESSAGE);
        }
           if(txtelname.getText().length()==0){ 
            JOptionPane.showMessageDialog(this,"PLEASE ENTER LAST NAME","SORRY",JOptionPane.ERROR_MESSAGE);
        }
            if(txtepassword.getText().length()==0){ 
            JOptionPane.showMessageDialog(this,"PLEASE ENTER PASSWORD","SORRY",JOptionPane.ERROR_MESSAGE);
        }
             if(txtephone.getText().length()==0){ 
            JOptionPane.showMessageDialog(this,"PLEASE ENTER VALID PHONE NO","SORRY",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void addPlaceholderstyle (JTextField textField) { 
     Font font =textField.getFont();
     font =font.deriveFont (Font.ITALIC); 
     textField.setFont (font);
     textField.setForeground (Color.black);
        }//font color
    public void removePlaceholderStyle (JTextField textField) {
    Font font= textField.getFont();
    font =font.deriveFont (Font. PLAIN|Font. BOLD);
    textField.setFont (font);
    textField.setForeground (Color.black);
        } //font color
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtefname = new javax.swing.JTextField();
        txtelname = new javax.swing.JTextField();
        txtephone = new javax.swing.JTextField();
        txteemail = new javax.swing.JTextField();
        txtepassword = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnregister = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NEW ADMIN REGISTER");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtefname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtefname.setText("FIRST NAME");
        txtefname.setBorder(null);
        txtefname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtefnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtefnameFocusLost(evt);
            }
        });
        txtefname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtefnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtefname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, 30));

        txtelname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtelname.setText("LAST NAME");
        txtelname.setBorder(null);
        txtelname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtelnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtelnameFocusLost(evt);
            }
        });
        txtelname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtelnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 120, 30));

        txtephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtephone.setText("PHONE NO");
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
        getContentPane().add(txtephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 222, 250, 30));

        txteemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txteemail.setText("E-MAIL ADDRESS");
        txteemail.setBorder(null);
        txteemail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txteemailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txteemailFocusLost(evt);
            }
        });
        txteemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txteemailActionPerformed(evt);
            }
        });
        getContentPane().add(txteemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 275, 250, 30));

        txtepassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtepassword.setText("PASSWORD");
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
        getContentPane().add(txtepassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 250, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("PASSWORD");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("E-MAIL");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 80, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("PHONE NUMBER");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 130, 20));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("LAST NAME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("FIRST NAME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        btnregister.setBackground(new java.awt.Color(223, 224, 229));
        btnregister.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("REGISTER");
        btnregister.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnregister.setContentAreaFilled(false);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 90, 30));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 160, 30));

        jLabel4.setText("NOTE:YOUR PHONE NO WILL BE YOUR USERNAME");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 320, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REGISTRATION FORM");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 320, 50));

        jLabel3.setBackground(new java.awt.Color(42, 144, 174));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 360, 480));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 900, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtephoneActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtephoneActionPerformed

    public NewAdminmodel getMymodel()
    {
        model1=new NewAdminmodel(txtephone.getText(),txtefname.getText(),txtelname.getText(),txteemail.getText(),txtepassword.getText());
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
        validation();
        NewAdmincontroller na= new NewAdmincontroller(this);
    }//GEN-LAST:event_btnregisterActionPerformed

    private void txtefnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtefnameFocusGained
        if(txtefname.getText().equals("FIRST NAME")){
           txtefname.setText(null);
           txtefname.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txtefname);
          }
    }//GEN-LAST:event_txtefnameFocusGained

    private void txtelnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtelnameFocusGained
        if(txtelname.getText().equals("LAST NAME")){
           txtelname.setText(null);
           txtelname.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txtelname);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_txtelnameFocusGained

    private void txtephoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtephoneFocusGained
    if(txtephone.getText().equals("PHONE NO")){
           txtephone.setText(null);
           txtephone.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txtephone);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_txtephoneFocusGained

    private void txteemailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txteemailFocusGained
    if(txteemail.getText().equals("E-MAIL ADDRESS")){
           txteemail.setText(null);
           txteemail.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txteemail);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_txteemailFocusGained

    private void txtepasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtepasswordFocusGained
    if(txtepassword.getText().equals("PASSWORD")){
           txtepassword.setText(null);
           txtepassword.requestFocus();
           //remove placeholder style
           removePlaceholderStyle(txtepassword);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_txtepasswordFocusGained

    private void txtefnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtefnameActionPerformed
        Assert.assertEquals(false,txtefname.getText().length()==0);
    }//GEN-LAST:event_txtefnameActionPerformed
    public void resetme(){
    txtefname.setText("");
    txtepassword.setText(" ");
    txteemail.setText(" ");
    txtelname.setText(" ");
    txtephone.setText(" ");
    }

    private void txtefnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtefnameFocusLost
    if(txtefname.getText().length()==0){
        addPlaceholderstyle(txtefname);
        txtefname.setText("FIRST NAME");    
        }
    }//GEN-LAST:event_txtefnameFocusLost

    private void txtelnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtelnameFocusLost
        {   Assert.assertEquals(false,txtelname.getText().length()==0); 
        }    }//GEN-LAST:event_txtelnameFocusLost

    private void txtephoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtephoneFocusLost
        {    Assert.assertEquals(false,txtephone.getText().length()==0);

        }    }//GEN-LAST:event_txtephoneFocusLost

    private void txteemailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txteemailFocusLost
        { Assert.assertEquals(false,txteemail.getText().length()==0);
        }    }//GEN-LAST:event_txteemailFocusLost

    private void txtepasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtepasswordFocusLost
        {Assert.assertEquals(false,txtepassword.getText().length()==0);
        }    }//GEN-LAST:event_txtepasswordFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    LoginView s=new LoginView();
            s.setVisible(true);
            this.hide();    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtelnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtelnameActionPerformed
        Assert.assertEquals(false,txtelname.getText().length()==0);
    }//GEN-LAST:event_txtelnameActionPerformed

    private void txteemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txteemailActionPerformed
       
    }//GEN-LAST:event_txteemailActionPerformed

    private void txtepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtepasswordActionPerformed
       
    }//GEN-LAST:event_txtepasswordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAdminview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregister;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txteemail;
    private javax.swing.JTextField txtefname;
    private javax.swing.JTextField txtelname;
    private javax.swing.JTextField txtepassword;
    private javax.swing.JTextField txtephone;
    // End of variables declaration//GEN-END:variables
}
