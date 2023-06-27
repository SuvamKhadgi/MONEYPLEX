package VIEW;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

public class AccountDetailview extends javax.swing.JFrame {

    public AccountDetailview() {
        initComponents();
//        setExtendedState(NORMAL);

        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Moneyplex Bank.png")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrptyp_acc = new javax.swing.ButtonGroup();
        btngrpint_for = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnhome = new javax.swing.JButton();
        btncustomermg = new javax.swing.JButton();
        btntransaction = new javax.swing.JButton();
        btntransachistory = new javax.swing.JButton();
        btnintrest = new javax.swing.JButton();
        btnloan = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblAccount = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        btsSearch = new javax.swing.JButton();
        lblAccountno = new javax.swing.JLabel();
        lblFirstname = new javax.swing.JLabel();
        lblMiddlename = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblCitizenship = new javax.swing.JLabel();
        lblMobileno = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblAccounttype = new javax.swing.JLabel();
        lnlTotalbalance = new javax.swing.JLabel();
        lblInterestamount = new javax.swing.JLabel();
        lblAccountstatus = new javax.swing.JLabel();
        txtAccountno = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtMiddlename = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtCitizenshipno = new javax.swing.JTextField();
        txtMobileno = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNationality = new javax.swing.JTextField();
        txtAccounttype = new javax.swing.JTextField();
        txtTotalbalance = new javax.swing.JTextField();
        txtInterestAmount = new javax.swing.JTextField();
        txtAccountstatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MONEYPLEX");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhome.setBackground(new java.awt.Color(42, 144, 174));
        btnhome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnhome.setText("DASHBOARD");
        btnhome.setBorderPainted(false);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 50));

        btncustomermg.setBackground(new java.awt.Color(0, 255, 255));
        btncustomermg.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btncustomermg.setText("CUSTOMERS");
        btncustomermg.setBorderPainted(false);
        btncustomermg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomermgActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomermg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 50));

        btntransaction.setBackground(new java.awt.Color(42, 144, 174));
        btntransaction.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btntransaction.setText("TRANSACTION");
        btntransaction.setBorderPainted(false);
        btntransaction.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btntransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransactionActionPerformed(evt);
            }
        });
        getContentPane().add(btntransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, 50));

        btntransachistory.setBackground(new java.awt.Color(42, 144, 174));
        btntransachistory.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btntransachistory.setText("STATEMENT");
        btntransachistory.setBorderPainted(false);
        getContentPane().add(btntransachistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 150, 50));

        btnintrest.setBackground(new java.awt.Color(42, 144, 174));
        btnintrest.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnintrest.setText("INTREST");
        btnintrest.setBorderPainted(false);
        getContentPane().add(btnintrest, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 150, 50));

        btnloan.setBackground(new java.awt.Color(42, 144, 174));
        btnloan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnloan.setText("LOAN");
        btnloan.setBorderPainted(false);
        getContentPane().add(btnloan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 150, 50));

        btnreport.setBackground(new java.awt.Color(42, 144, 174));
        btnreport.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnreport.setText("MORE...");
        btnreport.setBorderPainted(false);
        getContentPane().add(btnreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 150, 50));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(42, 144, 174));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setText("CREATE ACCOUNT");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 50));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("LOG OUT");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        jButton3.setBackground(new java.awt.Color(42, 144, 174));
        jButton3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton3.setText("UPDATE ACCOUNT");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 50));

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton4.setText("ACCOUNT DETAILS");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/accountdetails.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 100));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("CUSTOMERS");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 460));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAccount.setText("Account No.");
        jPanel2.add(lblAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txtAccount.setBorder(null);
        jPanel2.add(txtAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 140, -1));

        btsSearch.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btsSearch.setText("Search");
        btsSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(btsSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        lblAccountno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAccountno.setText("Account No:");
        jPanel2.add(lblAccountno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lblFirstname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblFirstname.setText("First Name:");
        jPanel2.add(lblFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lblMiddlename.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMiddlename.setText("Middle Name:");
        jPanel2.add(lblMiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        lblLastname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLastname.setText("Last Name:");
        jPanel2.add(lblLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        lblAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAddress.setText("Address:");
        jPanel2.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        lblDOB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDOB.setText("DOB:");
        jPanel2.add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        lblCitizenship.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCitizenship.setText("Citizenship No:");
        jPanel2.add(lblCitizenship, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        lblMobileno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMobileno.setText("Mobile No:");
        jPanel2.add(lblMobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        lblNationality.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNationality.setText("Nationality:");
        jPanel2.add(lblNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email Address:");
        jPanel2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        lblAccounttype.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAccounttype.setText("Account Type:");
        jPanel2.add(lblAccounttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        lnlTotalbalance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lnlTotalbalance.setText("Total Balance:");
        jPanel2.add(lnlTotalbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        lblInterestamount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblInterestamount.setText("Interest Amount:");
        jPanel2.add(lblInterestamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        lblAccountstatus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAccountstatus.setText("Account Status:");
        jPanel2.add(lblAccountstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        txtAccountno.setBorder(null);
        txtAccountno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountnoActionPerformed(evt);
            }
        });
        jPanel2.add(txtAccountno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 140, -1));

        txtFirstname.setBorder(null);
        jPanel2.add(txtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 140, -1));

        txtMiddlename.setBorder(null);
        txtMiddlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMiddlenameActionPerformed(evt);
            }
        });
        jPanel2.add(txtMiddlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, -1));

        txtLastname.setBorder(null);
        jPanel2.add(txtLastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 140, -1));

        txtAddress.setBorder(null);
        jPanel2.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 140, -1));

        txtDOB.setBorder(null);
        jPanel2.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 140, -1));

        txtCitizenshipno.setBorder(null);
        jPanel2.add(txtCitizenshipno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 140, -1));

        txtMobileno.setBorder(null);
        txtMobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMobilenoActionPerformed(evt);
            }
        });
        jPanel2.add(txtMobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 140, -1));

        txtEmail.setBorder(null);
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 140, -1));

        txtNationality.setBorder(null);
        jPanel2.add(txtNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 140, -1));

        txtAccounttype.setBorder(null);
        jPanel2.add(txtAccounttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 130, -1));

        txtTotalbalance.setBorder(null);
        jPanel2.add(txtTotalbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 130, -1));

        txtInterestAmount.setBorder(null);
        jPanel2.add(txtInterestAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 130, -1));

        txtAccountstatus.setBorder(null);
        jPanel2.add(txtAccountstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, 130, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 860, 460));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btntransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransactionActionPerformed
this.setVisible(false);
        Withdrawview ca= new Withdrawview();

       ca.setVisible(true);
    }//GEN-LAST:event_btntransactionActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
this.setVisible(false);
        DashBoardview ca= new DashBoardview();
       ca.setVisible(true);
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btncustomermgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomermgActionPerformed

    }//GEN-LAST:event_btncustomermgActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
        UpdateAccountview ca= new UpdateAccountview();

       ca.setVisible(true);    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
        CreateAccountview ca= new CreateAccountview();

       ca.setVisible(true);    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAccountnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountnoActionPerformed

    private void txtMobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMobilenoActionPerformed

    private void txtMiddlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMiddlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMiddlenameActionPerformed

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountDetailview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncustomermg;
    private javax.swing.ButtonGroup btngrpint_for;
    private javax.swing.ButtonGroup btngrptyp_acc;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnintrest;
    private javax.swing.JButton btnloan;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btntransachistory;
    private javax.swing.JButton btntransaction;
    private javax.swing.JButton btsSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAccountno;
    private javax.swing.JLabel lblAccountstatus;
    private javax.swing.JLabel lblAccounttype;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCitizenship;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblInterestamount;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblMiddlename;
    private javax.swing.JLabel lblMobileno;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lnlTotalbalance;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtAccountno;
    private javax.swing.JTextField txtAccountstatus;
    private javax.swing.JTextField txtAccounttype;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCitizenshipno;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtInterestAmount;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtMiddlename;
    private javax.swing.JTextField txtMobileno;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtTotalbalance;
    // End of variables declaration//GEN-END:variables

}
