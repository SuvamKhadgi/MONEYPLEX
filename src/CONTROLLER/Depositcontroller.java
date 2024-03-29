//package CONTROLLER;
//import MODEL.DataConnection;
//import MODEL.Depositmodel;
//import VIEW.Depositview;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.*;
//import javax.swing.JOptionPane;
//public class Depositcontroller {
//    ResultSet rs;
//    Connection con;
//    Depositmodel model;
//    Depositview view;
//    PreparedStatement pst= null;
//    public Depositcontroller(Depositview aView)
//{
//    this.view=aView;
//    new Depositcontroller.RegisterListener().actionPerformed();
//}
//    
//    class RegisterListener
//{
//    
//    public void actionPerformed()
//    {
//        try
//        {
//        model=view.getMymodel();
//        }
//        catch(Exception e1)
//        {
//            
//        }
//    }
//}
//public boolean checkMyData(Depositmodel mymodel) {  
//    Connection conn = null;
//    try {
//        conn = DataConnection.dbconnect();
//       String sql = "INSERT INTO statements(id,fname,ava_amt,totalamt,deposit_amount,deposit_date) VALUES (?, ?, ?, ?, ?, ?)";
//        pst = conn.prepareStatement(sql);
//        pst.setString(1, mymodel.getId());
//        pst.setString(2, mymodel.getName());
//        pst.setString(3, mymodel.getAva_amt());
//        pst.setString(5, mymodel.getDeposit_amt());
//        pst.setString(6, mymodel.getDate());
//        pst.setString(4, mymodel.getTotal());
//        pst.executeUpdate();
//        System.out.println("Data inserted");
//        return true;
//    } catch (Exception e2) {
//        e2.printStackTrace();
//    } finally {
//        if (pst != null) {
//            try {
//                pst.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        if (conn != null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    return false;
//}
//public void checkdata(Depositmodel mmodel){
//        String accountNumber = mmodel.getId();
//        String url = "jdbc:mysql://localhost:3306/crt_account";
//        String username = "root";
//        String password = "khadgi986";
//        try (Connection connection = DriverManager.getConnection(url, username, password)){
//            String idQuery = "SELECT id FROM info WHERE id= ?";
//            PreparedStatement idStatement = connection.prepareStatement(idQuery);
//            idStatement.setString(1, accountNumber);
//            ResultSet idResultSet = idStatement.executeQuery();
//            if (idResultSet.next()) {
//                int id = idResultSet.getInt("id");
//                String query = "UPDATE info SET deposit = ? WHERE id = ?";
//                PreparedStatement statement = connection.prepareStatement(query);
//                statement.setString(1, mmodel.getTotal());
//                statement.setString(2, mmodel.getId());
//                int rowsAffected = statement.executeUpdate();
//                if (rowsAffected > 0) {
//                    System.out.println("Account updated successfully");
//                    JOptionPane.showMessageDialog(null,"Account updated successfully",
//                        "INFORMATION",JOptionPane.INFORMATION_MESSAGE);
//                } else {
//                    System.out.println("Failed to update account");
//                } 
//            }} catch (SQLException e) {
//                e.printStackTrace();
//            }
//}
//public void chkdata(Depositmodel momodel){
//    Connection conn = DataConnection.dbconnect();
//        String s = momodel.getId();
//        try {
//            PreparedStatement pst = conn.prepareStatement("SELECT * FROM info WHERE id=?");
//            pst.setString(1, s);
//            ResultSet rs = pst.executeQuery();
//            if (rs.next()) {
//                momodel.setName(rs.getString("fname"));
//                momodel.setAva_amt(rs.getString("deposit"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//}
//    
//}


package CONTROLLER;

import MODEL.Depositmodel;
import VIEW.Depositview;
import DAO.DepositDAO;

import javax.swing.JOptionPane;

public class Depositcontroller {
    private Depositmodel model;
    private Depositview view;
    private DepositDAO depositDAO;

    public Depositcontroller(Depositview aView) {
        this.view = aView;
        this.depositDAO = new DepositDAO();
        new RegisterListener().actionPerformed();
    }

    class RegisterListener {
        public void actionPerformed() {
            try {
                model = view.getMymodel();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    public boolean checkMyData(Depositmodel mymodel) {
        return depositDAO.checkMyData(mymodel);
    }

    public void checkData(Depositmodel mmodel) {
        depositDAO.checkData(mmodel);
        // Show success message to user
        JOptionPane.showMessageDialog(
            null,
            "Account updated successfully",
            "INFORMATION",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public void chkData(Depositmodel momodel) {
        depositDAO.chkData(momodel);
    }
}
