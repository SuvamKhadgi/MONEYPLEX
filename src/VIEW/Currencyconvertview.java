package VIEW;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.text.DecimalFormat;
public class Currencyconvertview extends javax.swing.JFrame {
    private DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
     private final String[] currencies = {"USD", "EUR", "JPY", "GBP", "CAD", "AUD", "CHF", "CNY","INR","NEP"};
    private double[] exchangeRates = {1.00, 0.84, 109.65, 0.72, 1.27, 1.30, 0.92, 6.47,87.14,130};
    public Currencyconvertview() {
        initComponents();
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
        btncrnconv = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnabtus = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btndltacc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        toComboBox = new javax.swing.JComboBox<>();
        fromComboBox = new javax.swing.JComboBox<>();
        btnconvert = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        resultLabel = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
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

        btnreport.setBackground(new java.awt.Color(0, 255, 255));
        btnreport.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnreport.setText("MORE...");
        btnreport.setBorderPainted(false);
        getContentPane().add(btnreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 150, 50));

        jPanel1.setBackground(new java.awt.Color(4, 127, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btncrnconv.setBackground(new java.awt.Color(0, 255, 255));
        btncrnconv.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btncrnconv.setText("CURRENCY CONVERSION");
        btncrnconv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btncrnconv.setBorderPainted(false);
        btncrnconv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrnconvActionPerformed(evt);
            }
        });
        jPanel1.add(btncrnconv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 50));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("LOG OUT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        btnabtus.setBackground(new java.awt.Color(42, 144, 174));
        btnabtus.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnabtus.setText("ABOUT US");
        btnabtus.setBorderPainted(false);
        btnabtus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabtusActionPerformed(evt);
            }
        });
        jPanel1.add(btnabtus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/more 3.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, 100));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel3.setText("MORE");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, 40));

        btndltacc.setBackground(new java.awt.Color(42, 144, 174));
        btndltacc.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btndltacc.setText("DELETE ACCOUNT");
        btndltacc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btndltacc.setBorderPainted(false);
        btndltacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndltaccActionPerformed(evt);
            }
        });
        jPanel1.add(btndltacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 460));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("CURRENCY CONVERTER");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 860, 60));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("CONVERT CURRENCY FROM:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("CONVERT CURRENCY  TO:");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        amountField.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        amountField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.add(amountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 180, 30));

        toComboBox.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        toComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(currencies));
        toComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.add(toComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 180, -1));

        fromComboBox.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        fromComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(currencies));
        fromComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel4.add(fromComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 180, -1));

        btnconvert.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnconvert.setText("CONVERT");
        btnconvert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnconvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconvertActionPerformed(evt);
            }
        });
        jPanel4.add(btnconvert, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 90, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setText("AMOUNT:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 860, 300));

        jPanel5.setBackground(new java.awt.Color(0, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        resultLabel.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        resultLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        resultLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultLabelActionPerformed(evt);
            }
        });
        jPanel5.add(resultLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 180, 40));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("CONVERTED AMOUNT:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 40));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 560, 860, 80));
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

    private void btnabtusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabtusActionPerformed
        this.setVisible(false);
        Moreview ca= new Moreview();
        ca.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnabtusActionPerformed

    private void btncrnconvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrnconvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncrnconvActionPerformed

    private void btndltaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndltaccActionPerformed
    this.setVisible(false);
        DeleteAccountview ca= new DeleteAccountview();
        ca.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btndltaccActionPerformed

    private void btntransachistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransachistoryActionPerformed
        this.setVisible(false);
        Statementview ca= new Statementview();
        ca.setVisible(true);    }//GEN-LAST:event_btntransachistoryActionPerformed

    private void btnintrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnintrestActionPerformed
        this.setVisible(false);
        Interestview ca= new Interestview();
        ca.setVisible(true);    }//GEN-LAST:event_btnintrestActionPerformed

    private void btnloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloanActionPerformed
        this.setVisible(false);
        Loanview ca= new Loanview();
        ca.setVisible(true);
    }//GEN-LAST:event_btnloanActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        LoginView ca= new LoginView();
        ca.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnconvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconvertActionPerformed
       try {
                    double amount = Double.parseDouble(amountField.getText());
                    String fromCurrency = (String) fromComboBox.getSelectedItem();
                    String toCurrency = (String) toComboBox.getSelectedItem();
                    double exchangeRate = exchangeRates[getIndex(toCurrency)] / exchangeRates[getIndex(fromCurrency)];
                    double result = amount * exchangeRate;
                    resultLabel.setText(decimalFormat.format(result) + " " + toCurrency);
                } catch (Exception ex) {
                    resultLabel.setText("Invalid input");
                }
    }//GEN-LAST:event_btnconvertActionPerformed

    private void resultLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultLabelActionPerformed
    resultLabel.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_resultLabelActionPerformed
     private int getIndex(String currency) {
        for (int i = 0; i < currencies.length; i++) {
            if (currency.equals(currencies[i])) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Currencyconvertview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JButton btnabtus;
    private javax.swing.JButton btnconvert;
    private javax.swing.JButton btncrnconv;
    private javax.swing.JButton btncustomermg;
    private javax.swing.JButton btndltacc;
    private javax.swing.ButtonGroup btngrpint_for;
    private javax.swing.ButtonGroup btngrptyp_acc;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnintrest;
    private javax.swing.JButton btnloan;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btntransachistory;
    private javax.swing.JButton btntransaction;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> fromComboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField resultLabel;
    private javax.swing.JComboBox<String> toComboBox;
    // End of variables declaration//GEN-END:variables
private String type_acc;
private String int_for;
private String int_per;
}
