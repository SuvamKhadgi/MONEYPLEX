package DAO;

import MODEL.UpdateAccountmodel;
import MODEL.DataConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UpdateAccountDAO {
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

    public void updateAccount(UpdateAccountmodel modell) {
        String accountNumber = modell.getid();
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)){
            String idQuery = "SELECT id FROM info WHERE id= ?";
            PreparedStatement idStatement = connection.prepareStatement(idQuery);
            idStatement.setString(1, accountNumber);
            ResultSet idResultSet = idStatement.executeQuery();
            if (idResultSet.next()) {
                int id = idResultSet.getInt("id");
                String query = "UPDATE info SET fname = ?, mname = ?, lname = ?, address = ?, dob = ?, citizenship = ?, nationality = ?, email = ?, phone = ?, profession = ?, typeaccount = ?, intfor = ?, intpercent = ?, crt_date = ?, deposit = ? WHERE id = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, modell.getFname());
                statement.setString(2, modell.getMname());
                statement.setString(3, modell.getLname());
                statement.setString(4, modell.getAddress());
                statement.setString(5, modell.getDob());
                statement.setString(6, modell.getCitizen_no());
                statement.setString(7, modell.getCountry());
                statement.setString(8, modell.getEmail());
                statement.setString(9, modell.getPhone());
                statement.setString(10, modell.getProfession());
                statement.setString(11, modell.getTyp_acc());
                statement.setString(12, modell.getInt_for());
                statement.setString(13, modell.getInt_per());
                statement.setString(14, modell.getDate());
                statement.setString(15, modell.getDeposit_amt());
                statement.setString(16, modell.getid());
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Account updated successfully");
                    JOptionPane.showMessageDialog(null, "ACCOUNT UPDATED SUCCESSFULLY","SUCCESS",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("Failed to update account");
                    JOptionPane.showMessageDialog(null, "ACCOUNT UPDATED FAILED","FAILED",JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
