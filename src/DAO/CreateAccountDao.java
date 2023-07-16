package DAO;
import MODEL.DataConnection;
import MODEL.CreateAccountmodel;
//import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
public class CreateAccountDao {
//    public boolean insertAccount(CreateAccountmodel mymodel) {
//        Connection conn = null;
//        PreparedStatement pst = null;
//         int accountNo = -1;
//        try {
//            conn = DataConnection.dbconnect();
//            
//            String sql = "INSERT INTO info(fname, mname, lname, address, dob, citizenship, nationality, email, phone, profession, typeaccount, intfor, intpercent, crt_date, deposit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//            pst = conn.prepareStatement(sql);
//            pst.setString(1, mymodel.getFname());
//            pst.setString(2, mymodel.getMname());
//            pst.setString(3, mymodel.getLname());
//            pst.setString(4, mymodel.getAddress());
//            pst.setString(5, mymodel.getDob());
//            pst.setInt(6, mymodel.getCitizen_no());
//            pst.setString(7, mymodel.getCountry());
//            pst.setString(8, mymodel.getEmail());
//            pst.setString(9, mymodel.getPhone());
//            pst.setString(10, mymodel.getProfession());
//            pst.setString(11, mymodel.getTyp_acc());
//            pst.setString(12, mymodel.getInt_for());
//            pst.setString(13, mymodel.getInt_per());
//            pst.setString(14, mymodel.getDate());
//            pst.setInt(15, mymodel.getDeposit_amt());
//            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Account Created successfully", "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
//            System.out.println("Data inserted");
//            return true;
//        } catch (Exception e2) {
//            e2.printStackTrace();
//        } finally {
//            if (pst != null) {
//                try {
//                    pst.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (conn != null) {
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//        return false;
//    }
    
    
    
   public boolean insertAccount(CreateAccountmodel mymodel) {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    boolean success = false;

    try {
        conn = DataConnection.dbconnect();
        String sql = "INSERT INTO info(fname, mname, lname, address, dob, citizenship, nationality, email, phone, profession, typeaccount, intfor, intpercent, crt_date, deposit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        pst = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        pst.setString(1, mymodel.getFname());
        pst.setString(2, mymodel.getMname());
        pst.setString(3, mymodel.getLname());
        pst.setString(4, mymodel.getAddress());
        pst.setString(5, mymodel.getDob());
        pst.setInt(6, mymodel.getCitizen_no());
        pst.setString(7, mymodel.getCountry());
        pst.setString(8, mymodel.getEmail());
        pst.setString(9, mymodel.getPhone());
        pst.setString(10, mymodel.getProfession());
        pst.setString(11, mymodel.getTyp_acc());
        pst.setString(12, mymodel.getInt_for());
        pst.setString(13, mymodel.getInt_per());
        pst.setString(14, mymodel.getDate());
        pst.setInt(15, mymodel.getDeposit_amt());

        int affectedRows = pst.executeUpdate();
        if (affectedRows > 0) {
            // Retrieve the generated account number
            rs = pst.getGeneratedKeys();
            if (rs.next()) {
                int accountNo = rs.getInt(1);
                JOptionPane.showMessageDialog(null, "Account Created successfully. Your account number is " + accountNo, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                System.out.println("Data inserted. Account number: " + accountNo);
                success = true;
            }
        }
    } catch (Exception e2) {
        e2.printStackTrace();
    } finally {
        // Close the resources
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return success;
}

}
