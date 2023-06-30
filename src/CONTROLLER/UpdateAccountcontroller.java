package CONTROLLER;
import MODEL.CreateAccountmodel;
import MODEL.DataConnection;
import MODEL.UpdateAccountmodel;
import VIEW.CreateAccountview;
import VIEW.UpdateAccountview;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class UpdateAccountcontroller {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/crt_account";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "khadgi986";
    public UpdateAccountmodel searchAccount(String accountNumber) {
        UpdateAccountmodel account = new UpdateAccountmodel();
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String query = "SELECT * FROM info WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, accountNumber);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                account.setFname(resultSet.getString("fname"));
                account.setMname(resultSet.getString("mname"));
                account.setLname(resultSet.getString("lname"));
                account.setCountry(resultSet.getString("nationality"));
                account.setAddress(resultSet.getString("address"));
                account.setDob(resultSet.getString("dob"));
                account.setPhone(resultSet.getString("phone"));
                account.setDeposit_amt(resultSet.getString("deposit"));
                account.setDate(resultSet.getString("crt_date"));
                account.setTyp_acc(resultSet.getString("typeaccount"));
                account.setInt_for(resultSet.getString("intfor"));
                account.setInt_per(resultSet.getString("intpercent"));
                account.setCitizen_no(resultSet.getString("citizenship"));
                account.setEmail(resultSet.getString("email"));
                account.setProfession(resultSet.getString("profession"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }
//public void updateAccount(String accountNumber,UpdateAccountmodel updatedAccount) {
//    Connection connection = null;
//        PreparedStatement statement = null;
//        try {
//            connection  = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//            String query = "UPDATE info SET fname = ?, mname = ?, lname = ?, address = ?, dob = ?, citizenship = ?, nationality = ?, email = ?, phone = ?, profession = ?, typeaccount = ?, intfor = ?, intpercent = ?, crt_date = ?, deposit = ? WHERE id = ?";
//            statement = connection.prepareStatement(query);
//            statement.setString(1, accountNumber);
//            statement.setString(2, updatedAccount.getFname());
//            statement.setString(3, updatedAccount.getMname());
//            statement.setString(4, updatedAccount.getLname());
//            statement.setString(5, updatedAccount.getAddress());
//            statement.setString(6, updatedAccount.getDob());
//            statement.setString(7, updatedAccount.getCitizen_no());
//            statement.setString(8, updatedAccount.getCountry());
//            statement.setString(9, updatedAccount.getEmail());
//            statement.setString(10, updatedAccount.getPhone());
//            statement.setString(11, updatedAccount.getProfession());
//            statement.setString(12, updatedAccount.getTyp_acc());
//            statement.setString(13, updatedAccount.getInt_for());
//            statement.setString(14, updatedAccount.getInt_per());
//            statement.setString(15, updatedAccount.getDate());
//            statement.setString(16, updatedAccount.getDeposit_amt());
////            statement.setString(1, updatedAccount.getid()); // Assuming 'id' is the field for the account number
////            statement.executeUpdate();
////            statement.close();
////            connection.close();
////        } catch (SQLException e) {
////            e.printStackTrace();
////        }
//            int rowsAffected = statement.executeUpdate();
//            if (rowsAffected > 0) {
//                System.out.println("Account updated successfully");
//            } else {
//                System.out.println("Failed to update account");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//    }
//
//  }  
}
