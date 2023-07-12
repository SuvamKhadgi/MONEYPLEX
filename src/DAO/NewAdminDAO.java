package DAO;

import MODEL.DataConnection;
import MODEL.NewAdminmodel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NewAdminDAO {
    public boolean checkMyData(NewAdminmodel mymodel1) {
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = DataConnection.dbconnect();
            String sql = "INSERT INTO e_info(emp_fname, emp_lname, emp_phone, secu_que,que_ans, emp_password) VALUES (?, ?, ?,?, ?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, mymodel1.getFname());
            pst.setString(2, mymodel1.getLname());
            pst.setString(3, mymodel1.getPhone());
            pst.setString(4, mymodel1.getQuestion());
             pst.setString(5, mymodel1.getAnswer());
              pst.setString(6, mymodel1.getPassword());
            
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
}
