//package CONTROLLER;
//import MODEL.Interestmodel;
//import VIEW.Interestview;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//
//public class Interestcontroller {
//    Interestmodel model ;
//    Interestview view;
//public Interestcontroller(Interestview aView)
//{
//    this.view=aView;
//    new Interestcontroller.RegisterListener().actionPerformed();
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
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/crt_account";
//    private static final String DB_USER = "root";
//    private static final String DB_PASSWORD = "khadgi986";
//
//    public Interestmodel searchAccount(String accountNumber) {
//        Interestmodel account = new Interestmodel();
//
//        try {
//            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//            String query = "SELECT * FROM info WHERE id = ?";
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, accountNumber);
//            ResultSet resultSet = statement.executeQuery();
//
//            if (resultSet.next()) {
////                account.setAc_no(resultSet.getString("ac_no"));
//                account.setAc_name(resultSet.getString("fname"));
//                account.setAc_phone(resultSet.getString("phone"));
//                account.setBalance(resultSet.getString("deposit"));
//                account.setCrtdate(resultSet.getString("crt_date"));
//                account.setTypacc(resultSet.getString("typeaccount"));
//                account.setTimep(resultSet.getString("intfor"));
//                account.setIntrate(resultSet.getString("intpercent"));
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return account;
//    }
//    
//    public void dataupd(Interestmodel modell){
//         String accountNumber = modell.getAc_no();
//           try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER,DB_PASSWORD)){
//            String idQuery = "SELECT id FROM info WHERE id= ?";
//            PreparedStatement idStatement = connection.prepareStatement(idQuery);
//            idStatement.setString(1, accountNumber);
//            ResultSet idResultSet = idStatement.executeQuery();
//            if (idResultSet.next()) {
//                int id = idResultSet.getInt("id");
//                String query = "UPDATE info SET deposit = ? WHERE id = ?";
//                PreparedStatement statement = connection.prepareStatement(query);
//                statement.setString(1,modell.getBalance());
//                statement.setString(2, modell.getAc_no());
//                int rowsAffected = statement.executeUpdate();
//                if (rowsAffected > 0) {
//                    System.out.println("Account updated successfully");
//                    JOptionPane.showMessageDialog(null,"Account updated successfully",
//                    "INFORMATION",JOptionPane.INFORMATION_MESSAGE);
//                } else {
//                System.out.println("Failed to update account");
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}



package CONTROLLER;

import MODEL.Interestmodel;
import VIEW.Interestview;
import DAO.InterestDAO;

import javax.swing.JOptionPane;

public class Interestcontroller {
    private Interestmodel model;
    private Interestview view;
    private InterestDAO interestDAO;

    public Interestcontroller(Interestview aView) {
        this.view = aView;
        this.interestDAO = new InterestDAO();
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

    public Interestmodel searchAccount(String accountNumber) {
        return interestDAO.searchAccount(accountNumber);
    }

    public void dataupd(Interestmodel modell) {
        String accountNumber = modell.getAc_no();
        interestDAO.updateAccountBalance(accountNumber, modell.getBalance());
        JOptionPane.showMessageDialog(
            null,
            "Account updated successfully",
            "INFORMATION",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
