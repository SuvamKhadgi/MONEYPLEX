package DAO;

import MODEL.DataConnection;
import MODEL.Depositmodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DepositDAO {
    private PreparedStatement pst = null;

    public boolean checkMyData(Depositmodel mymodel) {
        Connection conn = null;
        try {
            conn = DataConnection.dbconnect();
            String sql = "INSERT INTO statements(id, fname, ava_amt, totalamt, deposit_amount, deposit_date) VALUES (?, ?, ?, ?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, mymodel.getId());
            pst.setString(2, mymodel.getName());
            pst.setString(3, mymodel.getAva_amt());
            pst.setString(5, mymodel.getDeposit_amt());
            pst.setString(6, mymodel.getDate());
            pst.setString(4, mymodel.getTotal());
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

    public void checkData(Depositmodel mmodel) {
        Connection conn = null;
        PreparedStatement idStatement = null;
        PreparedStatement statement = null;
        ResultSet idResultSet = null;

        try {
            conn = DataConnection.dbconnect();
            String accountNumber = mmodel.getId();
            String idQuery = "SELECT id FROM info WHERE id = ?";
            idStatement = conn.prepareStatement(idQuery);
            idStatement.setString(1, accountNumber);
            idResultSet = idStatement.executeQuery();

            if (idResultSet.next()) {
                int id = idResultSet.getInt("id");
                String query = "UPDATE info SET deposit = ? WHERE id = ?";
                statement = conn.prepareStatement(query);
                statement.setString(1, mmodel.getTotal());
                statement.setString(2, mmodel.getId());
                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "AMOUNT DEPOSITED", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Account updated successfully");
                } else {
                    JOptionPane.showMessageDialog(null, "SORRY! FAILED TO DEPOSIT", "FAILED", JOptionPane.ERROR_MESSAGE);
                    System.out.println("Failed to update account");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (idResultSet != null) {
                try {
                    idResultSet.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (idStatement != null) {
                try {
                    idStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
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
    }

    public void chkData(Depositmodel momodel) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = DataConnection.dbconnect();
            String s = momodel.getId();
            pst = conn.prepareStatement("SELECT * FROM info WHERE id = ?");
            pst.setString(1, s);
            rs = pst.executeQuery();

            if (rs.next()) {
                momodel.setName(rs.getString("fname"));
                momodel.setAva_amt(rs.getString("deposit"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
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
    }
}
