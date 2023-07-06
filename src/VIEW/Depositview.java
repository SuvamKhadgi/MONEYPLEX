package VIEW;

import CONTROLLER.Depositcontroller;
import MODEL.Depositmodel;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Depositview extends javax.swing.JFrame {
Depositmodel model;
    public Depositview() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Moneyplex Bank.png")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(formatter);
        txtdate.setText(formattedDate);
    }
    
     public void addacc(ActionListener log)
    {
        btnwithdraw.addActionListener(log);
    }
        public Depositmodel getMymodel()
    {
        model=new Depositmodel(txtAccN.getText(),txtcustomerN.getText(),txtavailableA.getText(),txtwithdrawA.getText(),txtdate.getText(),txttotalbal.getText());
        return model;
    }
        public void resetme(){
        txtAccN.setText("");
        txtwithdrawA.setText(" ");
        txtcustomerN.setText(" ");
        txtavailableA.setText(" ");
        txtphoneN.setText(" ");
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
        lblAccN = new javax.swing.JLabel();
        txtAccN = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        lblcustomerN = new javax.swing.JLabel();
        txtcustomerN = new javax.swing.JTextField();
        lblwithdrawA = new javax.swing.JLabel();
        txtwithdrawA = new javax.swing.JTextField();
        lbldate = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        lblphoneN = new javax.swing.JLabel();
        txtphoneN = new javax.swing.JTextField();
        checkcorrect = new javax.swing.JCheckBox();
        btnwithdraw = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        lblavailableA = new javax.swing.JLabel();
        txtavailableA = new javax.swing.JTextField();
        txttotalbal = new javax.swing.JTextField();
        lblphoneN1 = new javax.swing.JLabel();
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

        btncustomermg.setBackground(new java.awt.Color(42, 144, 174));
        btncustomermg.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btncustomermg.setText("CUSTOMERS");
        btncustomermg.setBorderPainted(false);
        btncustomermg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomermgActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomermg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 50));

        btntransaction.setBackground(new java.awt.Color(0, 255, 255));
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

        jButton1.setBackground(new java.awt.Color(42, 144, 174));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton1.setText("WITHDRAW CASH");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 50));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        jButton3.setBackground(new java.awt.Color(42, 144, 174));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton3.setText("FUND TRANSFER");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 50));

        jButton4.setBackground(new java.awt.Color(0, 255, 255));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton4.setText("DEPOSIT CASH");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/depo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 100));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("TRANSACTION");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 460));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccN.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblAccN.setText("ACCOUNT NO:-");
        jPanel2.add(lblAccN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 150, 30));

        txtAccN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccNActionPerformed(evt);
            }
        });
        jPanel2.add(txtAccN, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 200, 30));

        btnsearch.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnsearch.setText("SEARCH");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel2.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 100, 30));

        lblcustomerN.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblcustomerN.setText("CUSTOMER NAME");
        jPanel2.add(lblcustomerN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 140, 30));

        txtcustomerN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustomerNActionPerformed(evt);
            }
        });
        jPanel2.add(txtcustomerN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 200, 30));

        lblwithdrawA.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblwithdrawA.setText("DEPOSIT AMOUNT");
        jPanel2.add(lblwithdrawA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 180, 30));

        txtwithdrawA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwithdrawAActionPerformed(evt);
            }
        });
        jPanel2.add(txtwithdrawA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 200, 30));

        lbldate.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbldate.setText("DEPOSIT DATE");
        jPanel2.add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 30));
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 200, 30));

        lblphoneN.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblphoneN.setText("TOTAL BALANCE");
        jPanel2.add(lblphoneN, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 150, 30));

        txtphoneN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneNActionPerformed(evt);
            }
        });
        jPanel2.add(txtphoneN, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 200, 30));

        checkcorrect.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        checkcorrect.setText("I CONFIRM THE ABOVE INFORMATION IS CORRECT.");
        checkcorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkcorrectActionPerformed(evt);
            }
        });
        jPanel2.add(checkcorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 430, -1));

        btnwithdraw.setBackground(new java.awt.Color(0, 0, 0));
        btnwithdraw.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnwithdraw.setForeground(new java.awt.Color(0, 255, 102));
        btnwithdraw.setText("DEPOSIT");
        btnwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnwithdrawActionPerformed(evt);
            }
        });
        jPanel2.add(btnwithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 130, 40));

        btncancel.setBackground(new java.awt.Color(0, 0, 0));
        btncancel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 0, 0));
        btncancel.setText("RESET");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 130, 40));

        lblavailableA.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblavailableA.setText("AVAILABLE AMOUNT");
        jPanel2.add(lblavailableA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 160, 30));
        jPanel2.add(txtavailableA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 200, 30));

        txttotalbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalbalActionPerformed(evt);
            }
        });
        jPanel2.add(txttotalbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 200, 30));

        lblphoneN1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblphoneN1.setText("PHONE NO");
        jPanel2.add(lblphoneN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 860, 460));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btntransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransactionActionPerformed

    }//GEN-LAST:event_btntransactionActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed
        this.setVisible(false);
        DashBoardview ca= new DashBoardview();
        ca.setVisible(true);
    }//GEN-LAST:event_btnhomeActionPerformed

    private void btncustomermgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomermgActionPerformed
        this.setVisible(false);
        CreateAccountview ca= new CreateAccountview();
        ca.setVisible(true);
    }//GEN-LAST:event_btncustomermgActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        AccountDetailview ca= new AccountDetailview();
        ca.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        FundTransferview ca= new FundTransferview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Withdrawview ca= new Withdrawview();
        ca.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnintrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnintrestActionPerformed
        this.setVisible(false);
        Interestview ca= new Interestview();
       ca.setVisible(true);     }//GEN-LAST:event_btnintrestActionPerformed

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

    private void txtAccNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccNActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        Depositcontroller cac= new Depositcontroller(this);
        cac.chkData(model);
         txtcustomerN.setText(model.getName());
         txtavailableA.setText(model.getAva_amt());
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtcustomerNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustomerNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustomerNActionPerformed

    private void txtwithdrawAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwithdrawAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwithdrawAActionPerformed

    private void txtphoneNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneNActionPerformed

    private void checkcorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkcorrectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkcorrectActionPerformed

    private void btnwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnwithdrawActionPerformed
        if(checkcorrect.isSelected()){
        double availableAmount = Double.parseDouble(txtavailableA.getText());
        double withdrawAmount = Double.parseDouble(txtwithdrawA.getText());
        double newAmount = availableAmount + withdrawAmount;
        txttotalbal.setText(String.valueOf(newAmount));
            Depositcontroller cac= new Depositcontroller(this);
            cac.checkMyData(model);
            cac.checkData(model);
        }else{
          JOptionPane.showMessageDialog(null, "PLEASE CONFIRM THE DEPOSIT FIRST","CONFIRMATION REQUEST",JOptionPane.WARNING_MESSAGE);

        }
           
    }//GEN-LAST:event_btnwithdrawActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        resetme();        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void txttotalbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttotalbalActionPerformed

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

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Depositview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
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
    private javax.swing.JButton btnwithdraw;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkcorrect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAccN;
    private javax.swing.JLabel lblavailableA;
    private javax.swing.JLabel lblcustomerN;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblphoneN;
    private javax.swing.JLabel lblphoneN1;
    private javax.swing.JLabel lblwithdrawA;
    private javax.swing.JTextField txtAccN;
    private javax.swing.JTextField txtavailableA;
    private javax.swing.JTextField txtcustomerN;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtphoneN;
    private javax.swing.JTextField txttotalbal;
    private javax.swing.JTextField txtwithdrawA;
    // End of variables declaration//GEN-END:variables
}
