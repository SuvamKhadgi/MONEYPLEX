//
//package CONTROLLER;
//import MODEL.DataConnection;
//import MODEL.RecoveryAccountmodel;
//import VIEW.RecoveryAccountview;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Connection;
//import java.sql.SQLException;
//public class RecoveryAccountcontroller {
//    
//    private RecoveryAccountmodel mymodel1;
//    private RecoveryAccountview myview1;
//public RecoveryAccountcontroller(){
//    
//}
//    public RecoveryAccountcontroller(RecoveryAccountview myView) {
//        this.myview1 = myView;
//        mymodel1=myview1.getMymodel();
//    }
//    public boolean reg(String number, String securityQuestion, String answer){
//        
//        try{
//            Connection conn = DataConnection.dbconnect();  
//          PreparedStatement   pst = conn.prepareStatement("SELECT que_ans FROM e_info WHERE emp_phone = ? AND secu_que=?");
//        pst.setString(1, number);
//        pst.setString(2, securityQuestion);
//
//        ResultSet rs = pst.executeQuery();
//        if (rs.next()) {
//            String storedAnswer = rs.getString("que_ans");
//            return storedAnswer.equals(answer);
//        }
//        }catch(Exception e){
//                
//                }
//        return false;
//        }
//    public boolean updatePasswordInDatabase(String NUMBER, String newPassword) {
//    try {
//        Connection conn = DataConnection.dbconnect(); 
//        PreparedStatement pst = conn.prepareStatement("UPDATE e_info SET emp_password = ? WHERE emp_phone = ?");
//        pst.setString(1, newPassword);
//        pst.setString(2, NUMBER);
//
//        int rowsAffected = pst.executeUpdate();
//        return rowsAffected > 0;
//    } catch (SQLException e) {
//    }
//
//    return false;
//}
//    public void srchno(RecoveryAccountmodel model2){
//        Connection conn = DataConnection.dbconnect();  
//        String s = model2.getPhone();
//        try{
//             PreparedStatement pst = conn.prepareStatement("SELECT * FROM e_info WHERE emp_phone=?");
//        pst.setString(1, s);
//        ResultSet rs = pst.executeQuery();
//        if (rs.next()) {
//                    model2.setQuestion(rs.getString("secu_que"));
//                   
//        }
//        }catch(Exception e){
//            
//        }
//    }
//
//    }


package CONTROLLER;

import DAO.RecoveryAccountDAO;
import MODEL.RecoveryAccountmodel;
import VIEW.RecoveryAccountview;

public class RecoveryAccountcontroller {

    private RecoveryAccountmodel mymodel1;
    private RecoveryAccountview myview1;

    public RecoveryAccountcontroller() {

    }

    public RecoveryAccountcontroller(RecoveryAccountview myView) {
        this.myview1 = myView;
        mymodel1 = myview1.getMymodel();
    }

    public void srchno(RecoveryAccountmodel model2) {
        String phoneNumber = model2.getPhone();
        String securityQuestion = RecoveryAccountDAO.getSecurityQuestion(phoneNumber);
        if (securityQuestion != null) {
            model2.setQuestion(securityQuestion);
        }
    }

    public boolean reg(String number, String securityQuestion, String answer) {
        return RecoveryAccountDAO.checkAnswer(number, securityQuestion, answer);
    }

    public boolean updatePasswordInDatabase(String phoneNumber, String newPassword) {
        return RecoveryAccountDAO.updatePassword(phoneNumber, newPassword);
    }
}
