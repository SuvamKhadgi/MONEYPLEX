package VIEW;
import CONTROLLER.Interestcontroller;
import MODEL.Interestmodel;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
public class Interestview extends javax.swing.JFrame {
Interestcontroller controller;
Interestmodel model;
//private JTextField txtac_no;
    public Interestview() {
        controller = new Interestcontroller(this);
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Moneyplex Bank.png")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i); 
//        txtac_no = new JTextField();
    }
    public Interestmodel getMymodel(){
        model=new Interestmodel(txtac_no.getText(),txtac_name.getText(),txtac_phone.getText(),txttol_balance.getText(),txtcrtdate.getText(),txttyp_ac.getText(),txttimep.getText(),txtintrate.getText());
        return model;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrptyp_acc = new javax.swing.ButtonGroup();
        btngrpint_for = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnhome = new javax.swing.JButton();
        btncustomer = new javax.swing.JButton();
        btntransaction = new javax.swing.JButton();
        btntransachistory = new javax.swing.JButton();
        btnintrest = new javax.swing.JButton();
        btnloan = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnupdate = new javax.swing.JButton();
        txtac_no = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtac_name = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        txttimep = new javax.swing.JTextField();
        txtac_phone = new javax.swing.JTextField();
        txttyp_ac = new javax.swing.JTextField();
        txttol_balance = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcrtdate = new javax.swing.JTextField();
        txtintrate = new javax.swing.JTextField();
        txtint_acc = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        btncalculate = new javax.swing.JButton();
        timePeriodComboBox = new javax.swing.JComboBox<>();
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

        btncustomer.setBackground(new java.awt.Color(42, 144, 174));
        btncustomer.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btncustomer.setText("CUSTOMERS");
        btncustomer.setBorderPainted(false);
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 50));

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

        btnintrest.setBackground(new java.awt.Color(0, 255, 255));
        btnintrest.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnintrest.setText("INTEREST");
        btnintrest.setBorderPainted(false);
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

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("INTEREST GAINED");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.setBorderPainted(false);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 50));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/intra.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 100));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("INTEREST");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 460));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnupdate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 100, 30));

        txtac_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtac_noActionPerformed(evt);
            }
        });
        jPanel2.add(txtac_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 190, 30));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("ACCOUNT NO:-");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 30, 130, 30));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("AC HOLDER'S NAME");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, 30));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("AC HOLDER'S PHONE ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setText("AVAILABLE BALANCE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 30));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("TYPE OF ACCOUNT");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 30));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("INTEREST RATE");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, 30));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("TOTAL BALANCE");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 150, 30));

        txtac_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtac_nameActionPerformed(evt);
            }
        });
        jPanel2.add(txtac_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 160, 30));
        jPanel2.add(txtbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 160, 30));
        jPanel2.add(txttimep, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 160, 30));
        jPanel2.add(txtac_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 160, 30));
        jPanel2.add(txttyp_ac, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 160, 30));

        txttol_balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttol_balanceActionPerformed(evt);
            }
        });
        jPanel2.add(txttol_balance, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 160, 30));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("TIME PERIOD");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 130, 30));
        jPanel2.add(txtcrtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 160, 30));

        txtintrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtintrateActionPerformed(evt);
            }
        });
        jPanel2.add(txtintrate, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 160, 30));

        txtint_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtint_accActionPerformed(evt);
            }
        });
        jPanel2.add(txtint_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 160, 30));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setText("CREATED DATE");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, 30));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setText("INTEREST ACCRUED");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 170, 30));

        btnsearch.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 100, 30));

        btncalculate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btncalculate.setText("CACULATE");
        btncalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateActionPerformed(evt);
            }
        });
        jPanel2.add(btncalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 120, 30));

        timePeriodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "3 months", "6 months", "1 year" }));
        jPanel2.add(timePeriodComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 160, 30));

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

    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed
        this.setVisible(false);
        CreateAccountview ca= new CreateAccountview();
        ca.setVisible(true);
    }//GEN-LAST:event_btncustomerActionPerformed

    private void txtac_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtac_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtac_noActionPerformed

    private void txttol_balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttol_balanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttol_balanceActionPerformed

    private void txtac_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtac_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtac_nameActionPerformed

    private void txtintrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtintrateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtintrateActionPerformed

    private void txtint_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtint_accActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtint_accActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String accountNumber = txtac_no.getText();
        Interestmodel account = controller.searchAccount(accountNumber);
        displayAccount(account);
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btncalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateActionPerformed
        calculateInterest();
    }//GEN-LAST:event_btncalculateActionPerformed
    private void calculateInterest() {
        double principal = Double.parseDouble(txtbalance.getText());
        double rate = Double.parseDouble(txtintrate.getText());
        double time = getTimePeriodInYears();

        double interest = (principal * rate * time) / 100;
        double totalAmount = principal + interest;

        txtint_acc.setText(String.format("%.2f", interest));
        txttol_balance.setText(String.format("%.2f", totalAmount));
    }
    private double getTimePeriodInYears() {
        String timePeriod = (String) timePeriodComboBox.getSelectedItem();
        if (timePeriod.equals("3 months")) {
            return 0.25; // 3 months = 0.25 years
        } else if (timePeriod.equals("6 months")) {
            return 0.5; // 6 months = 0.5 years
        } else if (timePeriod.equals("1 year")) {
            return 1.0; // 1 year = 1.0 years
        } else {
            return 0.0; // Invalid time period, return 0
        }
    }
    private void btntransachistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransachistoryActionPerformed
        this.setVisible(false);
        Statementview ca= new Statementview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btntransachistoryActionPerformed

    private void btnloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloanActionPerformed
        this.setVisible(false);
        Loanview ca= new Loanview();
        ca.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnloanActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        Interestcontroller icc= new Interestcontroller(this);
        icc.dataupd(model);
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        LoginView ca= new LoginView();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        this.setVisible(false);
        Moreview ca= new Moreview();
        ca.setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_btnreportActionPerformed

    private void displayAccount(Interestmodel account) {
        txtac_name.setText(account.getAc_name());
        txtac_phone.setText(account.getAc_phone());
        txtbalance.setText(account.getBalance());
        txtcrtdate.setText(account.getCrtdate());
        txttyp_ac.setText(account.getTypacc());
        txttimep.setText(account.getTimep());
        txtintrate.setText(account.getIntrate());
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override  
            public void run() {
                new Interestview().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalculate;
    private javax.swing.JButton btncustomer;
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> timePeriodComboBox;
    private javax.swing.JTextField txtac_name;
    private javax.swing.JTextField txtac_no;
    private javax.swing.JTextField txtac_phone;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcrtdate;
    private javax.swing.JTextField txtint_acc;
    private javax.swing.JTextField txtintrate;
    private javax.swing.JTextField txttimep;
    private javax.swing.JTextField txttol_balance;
    private javax.swing.JTextField txttyp_ac;
    // End of variables declaration//GEN-END:variables

}
