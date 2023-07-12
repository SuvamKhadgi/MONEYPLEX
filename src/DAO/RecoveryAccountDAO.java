package DAO;

import MODEL.DataConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RecoveryAccountDAO {

    public static String getSecurityQuestion(String phoneNumber) {
        String securityQuestion = null;
        try {
            Connection conn = DataConnection.dbconnect();
            PreparedStatement pst = conn.prepareStatement("SELECT secu_que FROM e_info WHERE emp_phone = ?");
            pst.setString(1, phoneNumber);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                securityQuestion = rs.getString("secu_que");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return securityQuestion;
    }

    public static boolean checkAnswer(String phoneNumber, String securityQuestion, String answer) {
        try {
            Connection conn = DataConnection.dbconnect();
            PreparedStatement pst = conn.prepareStatement("SELECT que_ans FROM e_info WHERE emp_phone = ? AND secu_que=?");
            pst.setString(1, phoneNumber);
            pst.setString(2, securityQuestion);

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String storedAnswer = rs.getString("que_ans");
                return storedAnswer.equals(answer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updatePassword(String phoneNumber, String newPassword) {
        try {
            Connection conn = DataConnection.dbconnect();
            PreparedStatement pst = conn.prepareStatement("UPDATE e_info SET emp_password = ? WHERE emp_phone = ?");
            pst.setString(1, newPassword);
            pst.setString(2, phoneNumber);

            int rowsAffected = pst.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
