package DAO;

import MODEL.Interestmodel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class InterestDAO {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/crt_account";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "khadgi986";

    public Interestmodel searchAccount(String accountNumber) {
        Interestmodel account = new Interestmodel();

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT * FROM info WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, accountNumber);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                account.setAc_name(resultSet.getString("fname"));
                account.setAc_phone(resultSet.getString("phone"));
                account.setBalance(resultSet.getString("deposit"));
                account.setCrtdate(resultSet.getString("crt_date"));
                account.setTypacc(resultSet.getString("typeaccount"));
                account.setTimep(resultSet.getString("intfor"));
                account.setIntrate(resultSet.getString("intpercent"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }

    public void updateAccountBalance(String accountNumber, String newBalance) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "UPDATE info SET deposit = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, newBalance);
            statement.setString(2, accountNumber);
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Account updated successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Account updated successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update account", "FAILED", JOptionPane.ERROR_MESSAGE);
                System.out.println("Failed to update account");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
