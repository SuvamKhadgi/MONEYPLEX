package VIEW;

import MODEL.DataConnection;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import java.sql.ResultSet;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javaswingdev.chart.ModelPieChart;
import javaswingdev.chart.PieChart;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class DashBoardview extends javax.swing.JFrame {
    PreparedStatement pst = null;
    public DashBoardview() {
        initComponents();
        setExtendedState(NORMAL);
        ImageIcon myimage = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Moneyplex Bank.png")));
        Image img1 = myimage.getImage();
        Image img2 = img1.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        jLabel1.setIcon(i);
        piecht();
        bargrph();
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
        pieChart1 = new javaswingdev.chart.PieChart();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MONEYPLEX");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhome.setBackground(new java.awt.Color(0, 255, 255));
        btnhome.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        btnhome.setText("DASHBOARD");
        btnhome.setBorder(null);
        btnhome.setBorderPainted(false);
        btnhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 50));

        btncustomermg.setBackground(new java.awt.Color(42, 144, 174));
        btncustomermg.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        btncustomermg.setText("CUSTOMERS");
        btncustomermg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomermgActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomermg, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 50));

        btntransaction.setBackground(new java.awt.Color(42, 144, 174));
        btntransaction.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        btntransaction.setText("TRANSACTION");
        btntransaction.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btntransaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransactionActionPerformed(evt);
            }
        });
        getContentPane().add(btntransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, 50));

        btntransachistory.setBackground(new java.awt.Color(42, 144, 174));
        btntransachistory.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        btntransachistory.setText("STATEMENT");
        btntransachistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntransachistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btntransachistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 150, 50));

        btnintrest.setBackground(new java.awt.Color(42, 144, 174));
        btnintrest.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        btnintrest.setText("INTEREST");
        btnintrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnintrestActionPerformed(evt);
            }
        });
        getContentPane().add(btnintrest, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 150, 50));

        btnloan.setBackground(new java.awt.Color(42, 144, 174));
        btnloan.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        btnloan.setText("LOAN");
        btnloan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloanActionPerformed(evt);
            }
        });
        getContentPane().add(btnloan, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, 150, 50));

        btnreport.setBackground(new java.awt.Color(42, 144, 174));
        btnreport.setFont(new java.awt.Font("Comic Sans MS", 1, 17)); // NOI18N
        btnreport.setText("MORE...");
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });
        getContentPane().add(btnreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 130, 150, 50));

        pieChart1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        getContentPane().add(pieChart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 490, 460));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 620, 460));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void piecht(){
    try{
        Connection conn = DataConnection.dbconnect();
        String sqol = "SELECT typeaccount FROM info";
        pst = conn.prepareStatement(sqol);
        ResultSet rs = pst.executeQuery();

        int fixedAccountCount = 0;
        int savingAccountCount = 0;
        int currentAccountCount = 0;

        while (rs.next()) {
            String accountType = rs.getString("typeaccount");
            if (accountType.equalsIgnoreCase("fixed account")) {
                fixedAccountCount++;
            } else if (accountType.equalsIgnoreCase("saving account")) {
                savingAccountCount++;
            } else if (accountType.equalsIgnoreCase("current account")) {
                currentAccountCount++;
            }
        }

        getContentPane().setBackground(new Color(255, 255, 255));
        pieChart1.setChartType(PieChart.PeiChartType.DONUT_CHART);
        pieChart1.addData(new ModelPieChart("FIXED ACCOUNT", fixedAccountCount, new Color(23, 126, 238)));
        pieChart1.addData(new ModelPieChart("SAVING ACCOUNT", savingAccountCount, new Color(221, 65, 65)));
        pieChart1.addData(new ModelPieChart("CURRENT ACCOUNT", currentAccountCount, new Color(196, 151, 58)));
    }
    catch(Exception e){
        
    }
}
 
public void bargrph() {
    try {
        Connection conn = DataConnection.dbconnect();
        String sql = "SELECT deposit_amount, withdrew_amount, deposit_date, withdrew_date FROM statements";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        
        DefaultCategoryDataset bardata = new DefaultCategoryDataset();
         int totalDepositAmount = 0;
        int totalWithdrawAmount = 0;
        while (rs.next()) {
            int depositAmount = rs.getInt("deposit_amount");
            int withdrawAmount = rs.getInt("withdrew_amount");
            String depositDate = rs.getString("deposit_date");
            String withdrawDate = rs.getString("withdrew_date");
             if (depositDate != null) {
                totalDepositAmount += depositAmount;
                bardata.setValue(totalDepositAmount, "Total Deposit Amount", depositDate);
            }
            
            if (withdrawDate != null) {
                totalWithdrawAmount += withdrawAmount;
                bardata.setValue(totalWithdrawAmount, "Total Withdraw Amount", withdrawDate);
            }
        }
        JFreeChart barChart = ChartFactory.createBarChart(
            "TRANSACTIONS", "Date", "Amount", bardata,
            PlotOrientation.VERTICAL, true, true, false
        );
        
        // Customize the appearance of the bar chart
        CategoryPlot barchart = barChart.getCategoryPlot();
        
        // Set series paint for each dataset series (Deposit Amount and Withdraw Amount)
        BarRenderer renderer = (BarRenderer) barchart.getRenderer();
        renderer.setSeriesPaint(0, Color.BLUE); // Deposit Amount - Blue
        renderer.setSeriesPaint(1, Color.RED);  // Withdraw Amount - Red
        
        barchart.setRangeGridlinePaint(Color.RED);
        
        // Rotate the category labels to avoid overlapping
        CategoryAxis domainAxis = barchart.getDomainAxis();
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_45);
        
        // Create the chart panel and display it
        ChartPanel barpanel = new ChartPanel(barChart);
        
        jPanel1.removeAll();
        jPanel1.add(barpanel, BorderLayout.CENTER);
        jPanel1.validate();
        
        // Close database resources
        rs.close();
        pst.close();
        conn.close();    } catch (Exception e) {
        e.printStackTrace(); // Or handle the exception appropriately
    }

}
    private void btntransactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransactionActionPerformed
        this.setVisible(false);
        Withdrawview ca= new Withdrawview();

       ca.setVisible(true);
    }//GEN-LAST:event_btntransactionActionPerformed

    private void btnhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhomeActionPerformed

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

    private void btntransachistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntransachistoryActionPerformed
        this.setVisible(false);
        Statementview ca= new Statementview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btntransachistoryActionPerformed

    private void btnloanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloanActionPerformed
        this.setVisible(false);
        Loanview ca= new Loanview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnloanActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        this.setVisible(false);
        Moreview ca= new Moreview();
        ca.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnreportActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoardview().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javaswingdev.chart.PieChart pieChart1;
    // End of variables declaration//GEN-END:variables
}
