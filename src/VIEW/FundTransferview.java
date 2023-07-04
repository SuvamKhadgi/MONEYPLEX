package VIEW;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;

public class FundTransferview extends javax.swing.JFrame {
    private Connection connection; // Database connection object

    public FundTransferview() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Moneyplex Bank.png")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel4.getWidth(), jLabel4.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel4.setIcon(i);
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crt_account", "root", "khadgi986");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to connect to the database.", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrptyp_acc = new javax.swing.ButtonGroup();
        btngrpint_for = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
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
        lbltransferamount = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lblreference = new javax.swing.JLabel();
        lblsendersacc = new javax.swing.JLabel();
        lblrecipientsacc = new javax.swing.JLabel();
        txtsendersacc = new javax.swing.JTextField();
        txtrecipientsacc = new javax.swing.JTextField();
        txttransferamount = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        txtreference = new javax.swing.JTextField();
        checkcorrect = new javax.swing.JCheckBox();
        btntransfer = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton3.setText("FUND TRANSFER");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 50));

        jButton4.setBackground(new java.awt.Color(42, 144, 174));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButton4.setText("DEPOSIT CASH");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/moneytranfer.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 100, 100));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("TRANSACTION");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 460));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltransferamount.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbltransferamount.setText("Transfer Amount");
        jPanel2.add(lbltransferamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 210, 40));

        lbldate.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lbldate.setText("Date");
        jPanel2.add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 130, 40));

        lblreference.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblreference.setText("Reference");
        jPanel2.add(lblreference, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 140, 40));

        lblsendersacc.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblsendersacc.setText("Sender's Account No.");
        jPanel2.add(lblsendersacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 68, 210, 30));

        lblrecipientsacc.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblrecipientsacc.setText("Recipient's Acc No.");
        jPanel2.add(lblrecipientsacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 210, 40));
        jPanel2.add(txtsendersacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 170, 30));
        jPanel2.add(txtrecipientsacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 170, 30));
        jPanel2.add(txttransferamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 170, 30));

        txtdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateActionPerformed(evt);
            }
        });
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 170, 30));
        jPanel2.add(txtreference, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 170, 30));

        checkcorrect.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        checkcorrect.setText("I confirm that above information is correct.");
        jPanel2.add(checkcorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 295, 430, 30));

        btntransfer.setBackground(new java.awt.Color(0, 0, 0));
        btntransfer.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btntransfer.setForeground(new java.awt.Color(51, 255, 0));
        btntransfer.setText("Transfer");
        btntransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransferActionPerformed(evt);
            }
        });
        jPanel2.add(btntransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 100, 30));

        btncancel.setBackground(new java.awt.Color(0, 0, 0));
        btncancel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 0, 0));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        jPanel2.add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 100, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 860, 460));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

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
        Depositview ca= new Depositview();
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
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnintrestActionPerformed

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

    private void btntransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransferActionPerformed
        if (checkcorrect.isSelected()) {
                    checkAndTransferMoney();
                } else {
                    JOptionPane.showMessageDialog(null, "Please confirm the transfer.", "Confirmation Required",
                            JOptionPane.WARNING_MESSAGE);
                }
 
    }//GEN-LAST:event_btntransferActionPerformed

    private void txtdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateActionPerformed

    }//GEN-LAST:event_txtdateActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed

    }//GEN-LAST:event_btncancelActionPerformed
private void checkAndTransferMoney() {
    String senderAccount = txtsendersacc.getText();
    String recipientAccount = txtrecipientsacc.getText();
    double transferAmount = Double.parseDouble(txttransferamount.getText());
    String date = txtdate.getText();
    String reference = txtreference.getText();

    try {
        // Check sender's account balance in the database
        double senderBalance = getAccountBalance(senderAccount);
        if (senderBalance >= transferAmount) {
            // Check recipient's account existence in the database
//            if (accountExists(recipientAccount)) {
                // Check recipient's deposit balance in the database
                double recipientDeposit = getAccountDeposit(recipientAccount);
                if (recipientDeposit >= transferAmount) {
                    // Perform the money transfer
                    transferMoney(senderAccount, recipientAccount, transferAmount);
                    JOptionPane.showMessageDialog(null, "Transfer successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Recipient has insufficient deposit.", "Error", JOptionPane.ERROR_MESSAGE);
                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Recipient account not found.", "Error", JOptionPane.ERROR_MESSAGE);
//            }
        } else {
            JOptionPane.showMessageDialog(null, "Sender has insufficient funds.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Failed to check account details.", "Error", JOptionPane.ERROR_MESSAGE);
    }


        // Clear the fields after transfer
//        resetFields();
    }

private void transferMoney(String senderAccount, String recipientAccount, double transferAmount) throws SQLException {
    // Deduct the transfer amount from the sender's account
    double senderBalance = getAccountBalance(senderAccount);
    double updatedSenderBalance = senderBalance - transferAmount;
    updateAccountBalance(senderAccount, updatedSenderBalance);

    // Add the transfer amount to the recipient's account
    double recipientBalance = getAccountBalance(recipientAccount);
    double updatedRecipientBalance = recipientBalance + transferAmount;
    updateAccountBalance(recipientAccount, updatedRecipientBalance);

    // Log the transaction details in the database or any other logging mechanism
//    logTransaction(senderAccount, recipientAccount, transferAmount);
}

private void updateAccountBalance(String accountNumber, double newBalance) throws SQLException {
    String query = "UPDATE info SET deposit = ? WHERE id = ?";
    try (PreparedStatement statement = connection.prepareStatement(query)) {
        statement.setDouble(1, newBalance);
        statement.setString(2, accountNumber);
        statement.executeUpdate();
    }
}
//
//private void logTransaction(String senderAccount, String recipientAccount, double transferAmount ) throws SQLException {
//    String query = "INSERT INTO transactions (sender_account, recipient_account, transfer_amount, date, reference) VALUES (?, ?, ?, ?, ?)";
//    try (PreparedStatement statement = connection.prepareStatement(query)) {
//        statement.setString(1, senderAccount);
//        statement.setString(2, recipientAccount);
//        statement.setDouble(3, transferAmount);
////        statement.setString(4, date);
////        statement.setString(5, reference);
//        statement.executeUpdate();
//    }
//}

    private double getAccountBalance(String accountNumber) throws SQLException {
        // Retrieve the account balance from the database
        String query = "SELECT deposit FROM info WHERE id = ?";
        double balance = 0.0;

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, accountNumber);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                balance = result.getDouble("deposit");
            }
        }

        return balance;
    }
    private double getAccountDeposit(String accountNumber) throws SQLException {
        // Retrieve the account balance from the database
        String query = "SELECT deposit FROM info WHERE id = ?";
        double balance = 0.0;

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, accountNumber);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                balance = result.getDouble("deposit");
            }
        }

        return balance;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FundTransferview().setVisible(true);
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
    private javax.swing.JButton btntransachistory;
    private javax.swing.JButton btntransaction;
    private javax.swing.JButton btntransfer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkcorrect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblrecipientsacc;
    private javax.swing.JLabel lblreference;
    private javax.swing.JLabel lblsendersacc;
    private javax.swing.JLabel lbltransferamount;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtrecipientsacc;
    private javax.swing.JTextField txtreference;
    private javax.swing.JTextField txtsendersacc;
    private javax.swing.JTextField txttransferamount;
    // End of variables declaration//GEN-END:variables
private String type_acc;
private String int_for;
private String int_per;
}
