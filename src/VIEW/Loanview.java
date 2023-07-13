package VIEW;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Loanview extends javax.swing.JFrame {
double loan;
double interest;
double month;
double payment;
double MonthlyPayment;
String name;
String Account;

    public Loanview() {
        initComponents();
        setExtendedState(NORMAL);

        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Moneyplex Bank.png")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnhome = new javax.swing.JButton();
        btncustomermg = new javax.swing.JButton();
        btntransaction = new javax.swing.JButton();
        btntransachistory = new javax.swing.JButton();
        btnintrest = new javax.swing.JButton();
        btnloan = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtacctype = new javax.swing.JTextField();
        txtwithdrawal = new javax.swing.JTextField();
        txtdeposit = new javax.swing.JTextField();
        txtoverdraft = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblinterest = new javax.swing.JLabel();
        lblpayment = new javax.swing.JLabel();
        lblmonthlypayment = new javax.swing.JLabel();
        txtamountloan = new javax.swing.JTextField();
        txtinterest = new javax.swing.JTextField();
        txtmthpayment = new javax.swing.JTextField();
        txtnumpayment = new javax.swing.JTextField();
        lblamtloan = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLoanReport = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        btnloancalculator = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
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
        btncustomermg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomermgActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomermg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 50));

        btntransaction.setBackground(new java.awt.Color(42, 144, 174));
        btntransaction.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btntransaction.setText("TRANSACTION");
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
        btntransachistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransachistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btntransachistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 150, 50));

        btnintrest.setBackground(new java.awt.Color(42, 144, 174));
        btnintrest.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnintrest.setText("INTEREST");
        btnintrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnintrestActionPerformed(evt);
            }
        });
        getContentPane().add(btnintrest, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 150, 50));

        btnloan.setBackground(new java.awt.Color(0, 255, 255));
        btnloan.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnloan.setText("LOAN");
        getContentPane().add(btnloan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 150, 50));

        btnreport.setBackground(new java.awt.Color(42, 144, 174));
        btnreport.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnreport.setText("MORE...");
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });
        getContentPane().add(btnreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 150, 50));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel13.setText("LOAN");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 70, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1080, 70));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("Full Name");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("Address");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Account Type");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Withdrawal");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setText("Deposit");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setText("Overdraft Required?");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel3.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 160, 30));

        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });
        jPanel3.add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 160, 30));

        txtacctype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtacctypeActionPerformed(evt);
            }
        });
        jPanel3.add(txtacctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 160, 30));
        jPanel3.add(txtwithdrawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 160, 30));
        jPanel3.add(txtdeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 160, 30));

        txtoverdraft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoverdraftActionPerformed(evt);
            }
        });
        jPanel3.add(txtoverdraft, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 160, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 570, 290));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblinterest.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblinterest.setText("Interest Rate");
        jPanel4.add(lblinterest, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        lblpayment.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblpayment.setText("Number of Payments");
        jPanel4.add(lblpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        lblmonthlypayment.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblmonthlypayment.setText("Monthly Payment");
        jPanel4.add(lblmonthlypayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel4.add(txtamountloan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 170, -1));
        jPanel4.add(txtinterest, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 170, -1));

        txtmthpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmthpaymentActionPerformed(evt);
            }
        });
        jPanel4.add(txtmthpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 170, -1));
        jPanel4.add(txtnumpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 170, -1));

        lblamtloan.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblamtloan.setText("Amount of Loan");
        jPanel4.add(lblamtloan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 500, 130));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLoanReport.setColumns(20);
        jLoanReport.setRows(5);
        jScrollPane1.setViewportView(jLoanReport);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 130));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 500, 150));

        jPanel6.setBackground(new java.awt.Color(0, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnloancalculator.setBackground(new java.awt.Color(102, 255, 255));
        btnloancalculator.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnloancalculator.setText("CALCULATE LOAN");
        btnloancalculator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloancalculatorActionPerformed(evt);
            }
        });
        jPanel6.add(btnloancalculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 170, 30));

        btnreset.setBackground(new java.awt.Color(102, 255, 255));
        btnreset.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel6.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 100, 30));

        btnexit.setBackground(new java.awt.Color(255, 102, 102));
        btnexit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnexit.setText("LOG OUT");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel6.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 30));

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1080, 70));
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
this.setVisible(false);
        CreateAccountview ca= new CreateAccountview();

       ca.setVisible(true);
    }//GEN-LAST:event_btncustomermgActionPerformed

    private void btnintrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnintrestActionPerformed
this.setVisible(false);
        Interestview ca= new Interestview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnintrestActionPerformed

    private void txtmthpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmthpaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmthpaymentActionPerformed

    private void txtacctypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtacctypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtacctypeActionPerformed

    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void txtoverdraftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoverdraftActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoverdraftActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnloancalculatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloancalculatorActionPerformed

        
        String iMonthPayment = String .format(txtnumpayment.getText());
        
        if (txtamountloan.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"you must enter amount of loan to borrow",
                    "Loan System",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            loan=Double.parseDouble(txtamountloan.getText());
            String Balance = String .format(txtamountloan.getText());
        }
        //////////////////////////////////////////////////////////
        
         if (txtinterest.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"you must enter Interest Rate",
                    "Loan System",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            interest=Double.parseDouble(txtinterest.getText());
            String iInterest = String .format(txtinterest.getText());
        }
         
         
          //////////////////////////////////////////////////////////
        
         if (txtnumpayment.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"you must enter Number of Payment",
                    "Loan System",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            month=Double.parseDouble(txtnumpayment.getText());
            String iMonth = String .format(txtnumpayment.getText());
        }
         
        payment= loan+((loan * interest)/100);
        
        MonthlyPayment=payment/month;
        String PayMonth = String .format("%.2f",MonthlyPayment);
        txtmthpayment.setText(PayMonth);
        
        name=String.format(txtname.getText());
        Account=String.format(txtacctype.getText());

  
        jLoanReport.append("\t\nLoan System:\n\n" +
        "Customer's Name:\t\t"+name+
        "\nAccount Type:\t\t"+ Account +
        " \nAmount of Loan:\t\t"+loan+
        "\nInterest Rate:\t\t"+interest+
         "\nNumber of Payment:\t\t"+month+
          "\nPayment per Month:\t\t"+ PayMonth+
          "\nTotal Loan Payment:\t\t"+payment+
        "\n\nThanks for using Moneyplex Loan Systems");
         
         
    }//GEN-LAST:event_btnloancalculatorActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        txtamountloan.setText("");
        txtinterest.setText("");
        txtnumpayment.setText("");
        txtacctype.setText("");
        txtaddress.setText("");
        txtname.setText("");
        txtwithdrawal.setText("");
        txtdeposit.setText("");
        txtoverdraft.setText("");
        txtmthpayment.setText("");
        jLoanReport.setText("");
    }//GEN-LAST:event_btnresetActionPerformed

    private void btntransachistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransachistoryActionPerformed
this.setVisible(false);
        Statementview ca= new Statementview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btntransachistoryActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
this.setVisible(false);
        Moreview ca= new Moreview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnreportActionPerformed

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
            java.util.logging.Logger.getLogger(Loanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loanview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loanview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncustomermg;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnintrest;
    private javax.swing.JButton btnloan;
    private javax.swing.JButton btnloancalculator;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btntransachistory;
    private javax.swing.JButton btntransaction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea jLoanReport;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblamtloan;
    private javax.swing.JLabel lblinterest;
    private javax.swing.JLabel lblmonthlypayment;
    private javax.swing.JLabel lblpayment;
    private javax.swing.JTextField txtacctype;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtamountloan;
    private javax.swing.JTextField txtdeposit;
    private javax.swing.JTextField txtinterest;
    private javax.swing.JTextField txtmthpayment;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnumpayment;
    private javax.swing.JTextField txtoverdraft;
    private javax.swing.JTextField txtwithdrawal;
    // End of variables declaration//GEN-END:variables

    private void format(String text) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
