package VIEW;
import MODEL.DataConnection;
import java.awt.Image;
//import java.awt.List;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class Statementview extends javax.swing.JFrame {
    public Statementview() {
        initComponents();
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Moneyplex Bank.png")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
        txtmybill.setEditable(false);
        txtdates.setVisible(false);
        txtdpamt.setVisible(false);
        txtdpdate.setVisible(false);
        txtavamt.setVisible(false);
        txtwitamt.setVisible(false);
        txttol.setVisible(false);
        txttypac.setVisible(false);
        txtacno.setVisible(false);
        txtacname.setVisible(false);
        txtcrtdate.setVisible(false);
        txtotal.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtmybill = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtaccno = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtacno = new javax.swing.JTextField();
        txtacname = new javax.swing.JTextField();
        txtcrtdate = new javax.swing.JTextField();
        txtotal = new javax.swing.JTextField();
        txttypac = new javax.swing.JTextField();
        txtdates = new javax.swing.JTextField();
        txtwitamt = new javax.swing.JTextField();
        txttol = new javax.swing.JTextField();
        txtdpamt = new javax.swing.JTextField();
        txtdpdate = new javax.swing.JTextField();
        txtavamt = new javax.swing.JTextField();

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

        btntransachistory.setBackground(new java.awt.Color(0, 255, 255));
        btntransachistory.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btntransachistory.setText("STATEMENT");
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

        btnloan.setBackground(new java.awt.Color(42, 144, 174));
        btnloan.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btnloan.setText("LOAN");
        btnloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloanActionPerformed(evt);
            }
        });
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

        txtmybill.setColumns(20);
        txtmybill.setRows(5);
        jScrollPane1.setViewportView(txtmybill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 480, 360));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("PRINT ME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 610, 150, 30));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("ACCOUNT NO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, 30));
        getContentPane().add(txtaccno, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 130, 30));

        jButton2.setBackground(new java.awt.Color(204, 255, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 100, 30));

        jPanel1.setBackground(new java.awt.Color(4, 127, 181));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 255, 255));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jButton3.setText("GENERATE STATEMENT");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 220, 50));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setText("LOG OUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/state.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 110, 100));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("STATEMENT");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 220, 460));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));
        getContentPane().add(txtacno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 520, -1, -1));
        getContentPane().add(txtacname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));
        getContentPane().add(txtcrtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));
        getContentPane().add(txtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));
        getContentPane().add(txttypac, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        getContentPane().add(txtdates, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtwitamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwitamtActionPerformed(evt);
            }
        });
        getContentPane().add(txtwitamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));
        getContentPane().add(txttol, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        txtdpamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdpamtActionPerformed(evt);
            }
        });
        getContentPane().add(txtdpamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));
        getContentPane().add(txtdpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        txtavamt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtavamtActionPerformed(evt);
            }
        });
        getContentPane().add(txtavamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 10, 10));

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
       ca.setVisible(true); 
    }//GEN-LAST:event_btnintrestActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           txtmybill.print();
       }catch(Exception e){     
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Connection conn = DataConnection.dbconnect();
    String s = txtaccno.getText();
    try {
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM info WHERE id=?");
         PreparedStatement pt = conn.prepareStatement("SELECT * FROM statements WHERE id=?");
         pt.setString(1, s);
        pst.setString(1, s);

        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            txtotal.setText(rs.getString(16));
            txtacname.setText(rs.getString(2));
            txtacno.setText(rs.getString(1));
            txttypac.setText(rs.getString(12));
            txtcrtdate.setText(rs.getString(15));
    
        txtmybill.setText("""
                          \t\t  MONEYPLEX BANK
                          \t\tDILLIBAZAR,KATHMANDU
                          \t\tPHONE NO: 9841000000
                          ***************************************************************************************************
                          \t\tBANK STATEMENT
                          ***************************************************************************************************""");
        txtmybill.setText(txtmybill.getText()+"\n"+"ACCOUNT INFORMATION:"
                + "\n"+"ACCOUNT NUMBER:\t"+txtacno.getText()
                + "\n"+"ACCOUNT HOLDER \t"+txtacname.getText()
                + "\n"+"ACCOUNT TYPE \t"+txttypac.getText()
                + "\n"+"STARTED DATE \t"+txtcrtdate.getText()
                + "\n"+"***************************************************************************************************"
                + "\n"+"\t\tTRANSACTIONS");
        ResultSet rss = pt.executeQuery();
        while(rss.next()) {
        txtdates.setText(rss.getString(5));
         txtwitamt.setText(rss.getString(4));
         txttol.setText(rss.getString(6));
         txtdpdate.setText(rss.getString(8));
         txtdpamt.setText(rss.getString(7));
         txtavamt.setText(rss.getString(3));
         txtmybill.setText(txtmybill.getText()
                +"\n"+"AVAILABLE BALANCE"+"\t\t\t\t"+txtavamt.getText()
                +"\n"+"WITHDREW" +"\t\t"+txtdates.getText()+"\t\t"+txtwitamt.getText()
                +"\n"+"DEPOSIT"+"\t\t"+txtdpdate.getText()+"\t\t"+txtdpamt.getText()
                +"\n"+"TOTAL BALANCE" +"\t\t\t"+txttol.getText()
                +"\n"+"***************************************************************************************************");
        }
         txtmybill.setText(txtmybill.getText()
                + "\n"+"***************************************************************************************************"
                + "\n"+"TOTAL BALANCE:\t\t\t\t"+txtotal.getText());
        
            }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloanActionPerformed
        this.setVisible(false);
        Loanview ca= new Loanview();
        ca.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnloanActionPerformed

    private void txtdpamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdpamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdpamtActionPerformed

    private void txtwitamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwitamtActionPerformed
        txtwitamt.setVisible(false);
    }//GEN-LAST:event_txtwitamtActionPerformed

    private void txtavamtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtavamtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtavamtActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        LoginView ca= new LoginView();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        this.setVisible(false);
        Moreview ca= new Moreview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnreportActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Statementview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncustomermg;
    private javax.swing.JButton btnhome;
    private javax.swing.JButton btnintrest;
    private javax.swing.JButton btnloan;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btntransachistory;
    private javax.swing.JButton btntransaction;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtaccno;
    private javax.swing.JTextField txtacname;
    private javax.swing.JTextField txtacno;
    private javax.swing.JTextField txtavamt;
    private javax.swing.JTextField txtcrtdate;
    private javax.swing.JTextField txtdates;
    private javax.swing.JTextField txtdpamt;
    private javax.swing.JTextField txtdpdate;
    private javax.swing.JTextArea txtmybill;
    private javax.swing.JTextField txtotal;
    private javax.swing.JTextField txttol;
    private javax.swing.JTextField txttypac;
    private javax.swing.JTextField txtwitamt;
    // End of variables declaration//GEN-END:variables
}
