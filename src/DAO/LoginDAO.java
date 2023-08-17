package DAO;

import MODEL.loginmodel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {
    public boolean checkMyData(loginmodel mymodel) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crt_account", "root", "khadgi986");
            String sql = "select * from e_info where emp_phone=? and emp_password=?";
            try {
                PreparedStatement pst = connection.prepareStatement(sql);
                pst.setString(1, mymodel.getUsername());
                pst.setString(2, mymodel.getPassword());
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    return true;
                }
            } catch (Exception e) {
                // Handle exception
            }
        } catch (Exception e) {
            // Handle exception
        }
        return false;
    }
}
