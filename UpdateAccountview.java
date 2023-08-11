package VIEW;
import MODEL.UpdateAccountmodel;
import CONTROLLER.UpdateAccountcontroller;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
public class UpdateAccountview extends javax.swing.JFrame {
    UpdateAccountcontroller controller;
    UpdateAccountmodel model;
    public UpdateAccountview() {
        controller = new UpdateAccountcontroller(this);
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Moneyplex Bank.png")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
    }
    public UpdateAccountmodel getMymodel()
    {
        model=new UpdateAccountmodel(txtac_no.getText(),txtfirstname.getText(),txtmidname.getText(),txtlastname.getText(),txtaddress.getText(),txtcountry.getText(),txtprofession.getText(),txtemail.getText(),txttypacc.getText(),txtdob.getText(),txtintfor.getText(),txtxintper.getText(),txtdate.getText(),txtphoneno.getText(),txtcitizenshipno.getText(),txtdeposite.getText());
        return model;
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
        btncrt_Acc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnupdate_acc = new javax.swing.JButton();
        btnacc_detail = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        txtlastname = new javax.swing.JTextField();
        txtmidname = new javax.swing.JTextField();
        txtdob = new javax.swing.JTextField();
        txtcitizenshipno = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtphoneno = new javax.swing.JTextField();
        txtprofession = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtac_no = new javax.swing.JTextField();
        txtdeposite = new javax.swing.JTextField();
        txttypacc = new javax.swing.JTextField();
        txtintfor = new javax.swing.JTextField();
        txtxintper = new javax.swing.JTextField();
        txtcountry = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnupdate = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MONEYPLEX");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhome.setBackground(new java.awt.Color(42, 144, 174));
        btnhome.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnhome.setText("DASHBOARD");
        btnhome.setBorderPainted(false);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 50));

        btncustomermg.setBackground(new java.awt.Color(0, 255, 255));
        btncustomermg.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btncustomermg.setText("CUSTOMERS");
        btncustomermg.setBorderPainted(false);
        btncustomermg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomermgActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomermg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 50));

        btntransaction.setBackground(new java.awt.Color(42, 144, 174));
        btntransaction.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
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
        btntransachistory.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btntransachistory.setText("STATEMENT");
        btntransachistory.setBorderPainted(false);
        btntransachistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransachistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btntransachistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 150, 50));

        btnintrest.setBackground(new java.awt.Color(42, 144, 174));
        btnintrest.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnintrest.setText("INTEREST");
        btnintrest.setBorderPainted(false);
        btnintrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnintrestActionPerformed(evt);
            }
        });
        getContentPane().add(btnintrest, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 150, 50));

        btnloan.setBackground(new java.awt.Color(42, 144, 174));
        btnloan.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnloan.setText("LOAN");
        btnloan.setBorderPainted(false);
        btnloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloanActionPerformed(evt);
            }
        });
        getContentPane().add(btnloan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 150, 50));

        btnreport.setBackground(new java.awt.Color(42, 144, 174));
        btnreport.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnreport.setText("MORE...");
        btnreport.setBorderPainted(false);
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });
        getContentPane().add(btnreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 150, 50));

        jPanel1.setBackground(new java.awt.Color(4, 127, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncrt_Acc.setBackground(new java.awt.Color(42, 144, 174));
        btncrt_Acc.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btncrt_Acc.setText("CREATE ACCOUNT");
        btncrt_Acc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btncrt_Acc.setBorderPainted(false);
        btncrt_Acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrt_AccActionPerformed(evt);
            }
        });
        jPanel1.add(btncrt_Acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 50));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        btnupdate_acc.setBackground(new java.awt.Color(0, 255, 255));
        btnupdate_acc.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnupdate_acc.setText("UPDATE ACCOUNT");
        btnupdate_acc.setBorderPainted(false);
        btnupdate_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate_accActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 50));

        btnacc_detail.setBackground(new java.awt.Color(42, 144, 174));
        btnacc_detail.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnacc_detail.setText("ACCOUNT DETAILS");
        btnacc_detail.setBorderPainted(false);
        btnacc_detail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnacc_detailActionPerformed(evt);
            }
        });
        jPanel1.add(btnacc_detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/accountdetails.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 100));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("CUSTOMERS");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 460));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("PROFESSION");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("PHONE NO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("E-MAIL");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("COUNTRY");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CITIZENSHIP NO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("DATE OF BIRTH");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("ADDRESS");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("LAST  NAME");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("MIDDLE NAME");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("FIRST NAME");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("DEPOSIT AMOUNT");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("ACCOUNT NO");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 110, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("INTREST PERCENT");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("INTREST FOR:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("TYPE OF ACCOUNT:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));
        jPanel2.add(txtfirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 160, -1));
        jPanel2.add(txtlastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, -1));

        txtmidname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmidnameActionPerformed(evt);
            }
        });
        jPanel2.add(txtmidname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 160, -1));
        jPanel2.add(txtdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 160, -1));
        jPanel2.add(txtcitizenshipno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 160, -1));

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        jPanel2.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, -1));

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });
        jPanel2.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 140, -1));

        txtphoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphonenoActionPerformed(evt);
            }
        });
        jPanel2.add(txtphoneno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, 160, -1));
        jPanel2.add(txtprofession, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 160, -1));
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 140, -1));
        jPanel2.add(txtac_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 160, -1));
        jPanel2.add(txtdeposite, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 140, -1));
        jPanel2.add(txttypacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 140, -1));
        jPanel2.add(txtintfor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 140, -1));
        jPanel2.add(txtxintper, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 140, -1));
        jPanel2.add(txtcountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 160, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("DATE");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 90, -1));

        btnupdate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        btnsearch.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 860, 460));
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

    private void btnacc_detailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnacc_detailActionPerformed
        this.setVisible(false);
        AccountDetailview ca= new AccountDetailview();
        ca.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnacc_detailActionPerformed

    private void btnupdate_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate_accActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdate_accActionPerformed

    private void btncrt_AccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrt_AccActionPerformed
        this.setVisible(false);
        CreateAccountview ca= new CreateAccountview();
        ca.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btncrt_AccActionPerformed

    private void btnintrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnintrestActionPerformed
        this.setVisible(false);
        Interestview ca= new Interestview();
       ca.setVisible(true);     }//GEN-LAST:event_btnintrestActionPerformed

    private void txtmidnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmidnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmidnameActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void txtphonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphonenoActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
     UpdateAccountcontroller uac =new UpdateAccountcontroller(this);
     uac.upddata(model);
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String accountNumber = txtac_no.getText();
        UpdateAccountmodel account = controller.searchAccount(accountNumber);
        displayAccount(account);
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btntransachistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransachistoryActionPerformed
        this.setVisible(false);
        Statementview ca= new Statementview();
        ca.setVisible(true);    }//GEN-LAST:event_btntransachistoryActionPerformed

    private void btnloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloanActionPerformed
        this.setVisible(false);
        Loanview ca= new Loanview();
        ca.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnloanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
        LoginView ca= new LoginView();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
this.setVisible(false);
        Moreview ca= new Moreview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnreportActionPerformed
    private void displayAccount(UpdateAccountmodel account) {
        txtfirstname.setText(account.getFname());
        txtmidname.setText(account.getMname());
        txtlastname.setText(account.getLname());
        txtaddress.setText(account.getAddress());
        txtdob.setText(account.getDob());
        txtcitizenshipno.setText(account.getCitizen_no());
        txtcountry.setText(account.getCountry());
        txtemail.setText(account.getEmail());
        txtphoneno.setText(account.getPhone());
        txtprofession.setText(account.getProfession());
        txtdate.setText(account.getDate());
        txttypacc.setText(account.getTyp_acc());
        txtintfor.setText(account.getInt_for());
        txtxintper.setText(account.getInt_per());
        txtdeposite.setText(account.getDeposit_amt());
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateAccountview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacc_detail;
    private javax.swing.JButton btncrt_Acc;
    private javax.swing.JButton btncustomermg;
    private javax.swing.ButtonGroup btngrpint_for;
    private javax.swing.ButtonGroup btngrptyp_acc;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnintrest;
    private javax.swing.JButton btnloan;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btntransachistory;
    private javax.swing.JButton btntransaction;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdate_acc;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtac_no;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcitizenshipno;
    private javax.swing.JTextField txtcountry;
    public javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtdeposite;
    private javax.swing.JTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtintfor;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtmidname;
    private javax.swing.JTextField txtphoneno;
    private javax.swing.JTextField txtprofession;
    private javax.swing.JTextField txttypacc;
    private javax.swing.JTextField txtxintper;
    // End of variables declaration//GEN-END:variables
}
