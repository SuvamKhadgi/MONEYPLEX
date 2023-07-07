//package DAO;
//
//import MODEL.DataConnection;
//import MODEL.FundTransfermodel;
//import VIEW.FundTransferview;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import javax.swing.table.DefaultTableModel;
//
//public class FundTransferDAO {
//    private Connection connection;
//FundTransferview view;
//    public boolean checkMyData(FundTransfermodel model) {
//        connection = DataConnection.dbconnect();
//        String senderAccount = model.getSenderac();
//        String recipientAccount = model.getReciverac();
//        double transferAmount = Double.parseDouble(model.getTransferamt());
//        String date = model.getDate();
//        String reference = model.getReference();
//
//        try {
//            double senderBalance = getAccountBalance(senderAccount);
//            if (senderBalance >= transferAmount) {
//                if (accountExists(recipientAccount)) {
//                    double recipientDeposit = getAccountDeposit(recipientAccount);
//                    if (recipientDeposit >= transferAmount) {
//                        transferMoney(senderAccount, recipientAccount, transferAmount, date, reference);
//                        return true;
//                    } else {
//                        System.out.println("Recipient has insufficient deposit.");
//                    }
//                } else {
//                    System.out.println("Recipient account not found.");
//                }
//            } else {
//                System.out.println("Sender has insufficient funds.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//
//    private void logTransaction(String senderAccount, String recipientAccount, double transferAmount, String date, String reference) throws SQLException {
//        String query = "INSERT INTO transfer (sender, reciver, dates, amount, reference) VALUES (?, ?, ?, ?, ?)";
//        try (PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setString(1, senderAccount);
//            statement.setString(2, recipientAccount);
//            statement.setDouble(4, transferAmount);
//            statement.setString(3, date);
//            statement.setString(5, reference);
//            statement.executeUpdate();
//        }
//    }
//
//    private void transferMoney(String senderAccount, String recipientAccount, double transferAmount, String date, String reference) throws SQLException {
//        double senderBalance = getAccountBalance(senderAccount);
//        double updatedSenderBalance = senderBalance - transferAmount;
//        updateAccountBalance(senderAccount, updatedSenderBalance);
//
//        double recipientBalance = getAccountBalance(recipientAccount);
//        double updatedRecipientBalance = recipientBalance + transferAmount;
//        updateAccountBalance(recipientAccount, updatedRecipientBalance);
//
//        logTransaction(senderAccount, recipientAccount, transferAmount, date, reference);
//    }
//
//    private void updateAccountBalance(String accountNumber, double newBalance) throws SQLException {
//        String query = "UPDATE info SET deposit = ? WHERE id = ?";
//        try (PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setDouble(1, newBalance);
//            statement.setString(2, accountNumber);
//            statement.executeUpdate();
//        }
//    }
//
//    private double getAccountBalance(String accountNumber) throws SQLException {
//        String query = "SELECT deposit FROM info WHERE id = ?";
//        double balance = 0.0;
//        try (PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setString(1, accountNumber);
//            ResultSet result = statement.executeQuery();
//            if (result.next()) {
//                balance = result.getDouble("deposit");
//            }
//        }
//        return balance;
//    }
//
//    private double getAccountDeposit(String accountNumber) throws SQLException {
//        String query = "SELECT deposit FROM info WHERE id = ?";
//        double balance = 0.0;
//        try (PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setString(1, accountNumber);
//            ResultSet result = statement.executeQuery();
//            if (result.next()) {
//                balance = result.getDouble("deposit");
//            }
//        }
//        return balance;
//    }
//
//    private boolean accountExists(String accountNumber) throws SQLException {
//        String query = "SELECT COUNT(*) FROM info WHERE id = ?";
//        int count = 0;
//        try (PreparedStatement statement = connection.prepareStatement(query)) {
//            statement.setString(1, accountNumber);
//            ResultSet result = statement.executeQuery();
//            if (result.next()) {
//                count = result.getInt(1);
//            }
//        }
//        return count > 0;
//    }
//    
//    public void checkMyDataa(FundTransferview view) {
//    try {
//        connection = DataConnection.dbconnect();
//        Statement statement = connection.createStatement();
//        String sql = "SELECT * FROM transfer";
//        ResultSet resultSet = statement.executeQuery(sql);
//        DefaultTableModel tableModel = (DefaultTableModel) view.getTblTransfer().getModel();
//        tableModel.setRowCount(0);
//        while (resultSet.next()) {
//            String sender = resultSet.getString("sender");
//            String receiver = resultSet.getString("reciver");
//            String date = resultSet.getString("dates");
//            String amount = resultSet.getString("amount");
//            String reference = resultSet.getString("reference");
//            String[] rowData = { sender, receiver, date, amount, reference };
//            tableModel.addRow(rowData);
//        }
//        connection.close();
//    } catch (Exception e) {
//        e.printStackTrace();
//    }
//}
//
//}

package DAO;

import MODEL.DataConnection;
import MODEL.FundTransfermodel;
import VIEW.FundTransferview;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FundTransferDAO {
    private Connection connection;
    FundTransferview view;
    public boolean checkMyData(FundTransfermodel model) {
        connection = DataConnection.dbconnect();
        System.out.println("suvam");
        String senderAccount = model.getSenderac();
        String recipientAccount = model.getReciverac();
        double transferAmount = Double.parseDouble(model.getTransferamt());
        String date = model.getDate();
        String reference = model.getReference();

        try {
            double senderBalance = getAccountBalance(senderAccount);
            if (senderBalance >= transferAmount) {
                if (accountExists(recipientAccount)) {
                    double recipientDeposit = getAccountDeposit(recipientAccount);
                    if (recipientDeposit >= transferAmount) {
                        transferMoney(senderAccount, recipientAccount, transferAmount, date, reference);
                        JOptionPane.showMessageDialog(null, "Transfer successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "recipient has insufficient deposit.", "FAILED", JOptionPane.ERROR_MESSAGE);
                        System.out.println("Recipient has insufficient deposit.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Recipient account not found.", "FAILED", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Recipient account not found.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Sender has insufficient funds!", "FAILED", JOptionPane.ERROR_MESSAGE);
                System.out.println("Sender has insufficient funds.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void logTransaction(String senderAccount, String recipientAccount, double transferAmount, String date, String reference) throws SQLException {
        String query = "INSERT INTO transfer (sender, reciver, dates, amount, reference) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, senderAccount);
            statement.setString(2, recipientAccount);
            statement.setDouble(4, transferAmount);
            statement.setString(3, date);
            statement.setString(5, reference);
            statement.executeUpdate();
        }
    }

    private void transferMoney(String senderAccount, String recipientAccount, double transferAmount, String date, String reference) throws SQLException {
        double senderBalance = getAccountBalance(senderAccount);
        double updatedSenderBalance = senderBalance - transferAmount;
        updateAccountBalance(senderAccount, updatedSenderBalance);

        double recipientBalance = getAccountBalance(recipientAccount);
        double updatedRecipientBalance = recipientBalance + transferAmount;
        updateAccountBalance(recipientAccount, updatedRecipientBalance);

        logTransaction(senderAccount, recipientAccount, transferAmount, date, reference);
    }

    private void updateAccountBalance(String accountNumber, double newBalance) throws SQLException {
        String query = "UPDATE info SET deposit = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, newBalance);
            statement.setString(2, accountNumber);
            statement.executeUpdate();
        }
    }

    private double getAccountBalance(String accountNumber) throws SQLException {
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

    private boolean accountExists(String accountNumber) throws SQLException {
        String query = "SELECT COUNT(*) FROM info WHERE id = ?";
        int count = 0;
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, accountNumber);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                count = result.getInt(1);
            }
        }
        return count > 0;
    }

    public void checkMyDataa(FundTransferview view) {
        try {
            connection = DataConnection.dbconnect();
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM transfer";
            ResultSet resultSet = statement.executeQuery(sql);
            DefaultTableModel tableModel = (DefaultTableModel) view.getTblTransfer().getModel();
            tableModel.setRowCount(0);
            while (resultSet.next()) {
                String sender = resultSet.getString("sender");
                String receiver = resultSet.getString("reciver");
                String date = resultSet.getString("dates");
                String amount = resultSet.getString("amount");
                String reference = resultSet.getString("reference");
                String[] rowData = { sender, receiver, date, amount, reference };
                tableModel.addRow(rowData);
            }
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
