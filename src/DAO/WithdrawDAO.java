package DAO;

import MODEL.DataConnection;
import MODEL.Withdrawmodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class WithdrawDAO {
    public boolean checkMyData(Withdrawmodel mymodel) {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = DataConnection.dbconnect();
            String sql = "INSERT INTO statements(id, fname, ava_amt, withdrew_amount, withdrew_date, totalamt) VALUES (?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, mymodel.getId());
            pst.setString(2, mymodel.getName());
            pst.setString(3, mymodel.getAva_amt());
            pst.setString(4, mymodel.getWith_amt());
            pst.setString(5, mymodel.getDate());
            pst.setString(6, mymodel.getTotal());

            pst.executeUpdate();
            System.out.println("Data inserted");
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }

    public void chkdata(Withdrawmodel momodel) {
        Connection conn = DataConnection.dbconnect();
        String s = momodel.getId();

        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM info WHERE id=?");
            pst.setString(1, s);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                momodel.setName(rs.getString("fname"));
                momodel.setAva_amt(rs.getString("deposit"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkdataa(Withdrawmodel mymodell) {
        String accountNumber = mymodell.getId();
        String url = "jdbc:mysql://localhost:3306/crt_account";
        String username = "root";
        String password = "khadgi986";
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String idQuery = "SELECT id FROM info WHERE id= ?";
            PreparedStatement idStatement = connection.prepareStatement(idQuery);
            idStatement.setString(1, accountNumber);
            ResultSet idResultSet = idStatement.executeQuery();
            if (idResultSet.next()) {
                int id = idResultSet.getInt("id");
                String query = "UPDATE info SET deposit = ? WHERE id = ?";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1, mymodell.getTotal());
                statement.setString(2, mymodell.getId());
                int rowsAffected = statement.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "AMOUNT WITHDRAW SUCCESSFULL", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Account updated successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "FAILED TO WITHDRAW", "FAILED", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Failed to update account");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

