
package CONTROLLER;
import MODEL.*;
import VIEW.*;
import java.sql.*;
public class logincontroller {
loginmodel mymodel;
LoginView myview;
ResultSet rs;
PreparedStatement pst;
Statement stmt;

public logincontroller(LoginView myView)
{
    this.myview=myView;
    new LoginList().actionPerformed();
}

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


class LoginList
{
    public void actionPerformed() 
    {
        try
        {
        mymodel=myview.getMymodel();
        if(checkMyData(mymodel))
        {
            DashBoardview s=new DashBoardview();
            s.setVisible(true);
        }
        else
        {
        }
        }
        catch(Exception e1)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
        {
            
        }
    }
}

public boolean checkMyData(loginmodel mymodel) throws Exception
{
       try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crt_account", "root", "khadgi986");
           String sql="select * from e_info where emp_phone='"+mymodel.getUsername()+"' and emp_password='"+mymodel.getPassword()+"'";
           try
           { 
              stmt=connection.createStatement();
              rs=stmt.executeQuery(sql);
              if(rs.next())
              {
               return true;
              }
              
           }
           catch(Exception e)
           {   
           } 
       }
       catch(Exception e)
       {          
       }
    return false;
}   
}
