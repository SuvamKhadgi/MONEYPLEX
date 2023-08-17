//
//package CONTROLLER;
//import MODEL.*;
//import VIEW.*;
//import java.sql.*;
//import javax.swing.JOptionPane;
//public class logincontroller {
//loginmodel mymodel;
//LoginView myview;
//ResultSet rs;
//PreparedStatement pst;
//Statement stmt;
//
//public logincontroller(LoginView myView)
//{
//    this.myview=myView;
//    new LoginList().actionPerformed();
//}
//    public void setVisible(boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//class LoginList
//{
//    public void actionPerformed() 
//    {
//        try
//        {
//        mymodel=myview.getMymodel();
//        if(checkMyData(mymodel))
//        {
//            DashBoardview s=new DashBoardview();
//            s.setVisible(true);
//        }
//        else
//        {
//            myview.showMessageBox("Invalid username or password");
//            
//        }
//        }
//        catch(Exception e1)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
//        {
//            
//        }
//    }
//}
//
//public boolean checkMyData(loginmodel mymodel) throws Exception
//{
//       try {
//       Class.forName("com.mysql.cj.jdbc.Driver");
//       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crt_account", "root", "khadgi986");
//           String sql="select * from e_info where emp_phone='"+mymodel.getUsername()+"' and emp_password='"+mymodel.getPassword()+"'";
//           try
//           { 
//              stmt=connection.createStatement();
//              rs=stmt.executeQuery(sql);
//              if(rs.next())
//              {
//               return true;
//              }
//              
//           }
//           catch(Exception e)
//           {   
//           } 
//       }
//       catch(Exception e)
//       {          
//       }
//    return false;
//}   
//}

package CONTROLLER;

import MODEL.loginmodel;
import VIEW.LoginView;
import VIEW.DashBoardview;
import DAO.LoginDAO;

public class logincontroller {
    private loginmodel mymodel;
    private LoginView myview;

    public logincontroller(LoginView myView) {
        this.myview = myView;
        new LoginList().actionPerformed();
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    class LoginList {
        public void actionPerformed() {
            try {
                mymodel = myview.getMymodel();
                if (checkMyData(mymodel)) {
                    DashBoardview s = new DashBoardview();
                    s.setVisible(true);
                } else {
                    myview.showMessageBox("Invalid username or password");
                }
            } catch (Exception e1) {
                // Handle exception
            }
        }
    }

    public boolean checkMyData(loginmodel mymodel) throws Exception {
        try {
            LoginDAO loginDAO = new LoginDAO();
            return loginDAO.checkMyData(mymodel);
        } catch (Exception e) {
            // Handle exception
        }
        return false;
    }
}
