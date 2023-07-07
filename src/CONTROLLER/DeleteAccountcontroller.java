package CONTROLLER;
import MODEL.*;
import VIEW.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class DeleteAccountcontroller {
    DeleteAccountmodel mymodel;
    DeleteAccountview view;
    PreparedStatement pst= null;
    public DeleteAccountcontroller(DeleteAccountview aView)////constructor
{
    this.view=aView;
     new DeleteAccountcontroller.RegisterListener().actionPerformed();
}
    
    class RegisterListener
{
    
    public void actionPerformed()
    {
        try
        {
        mymodel=view.getMymodel();
        }
        catch(Exception e1)
        {
            
        }
    }
}
public boolean checkMyData(DeleteAccountmodel mymodel) {  
    Connection conn = DataConnection.dbconnect();
        String s = mymodel.getId();

        try {
            PreparedStatement pst = conn.prepareStatement("SELECT * FROM info WHERE id=?");
            pst.setString(1, s);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                 String firstName = rs.getString("fname");
    String lastName = rs.getString("lname");
    String fullName = firstName + " " + lastName;
    
    mymodel.setName(fullName);

                mymodel.setPhone(rs.getString("phone"));
                mymodel.setDate(rs.getString("crt_date"));
                mymodel.setBalance(rs.getString("deposit"));
                mymodel.setAcc_type(rs.getString("typeaccount"));
                mymodel.setPhone(rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return false;
}
public void deletdata(DeleteAccountmodel modell){
    Connection conn = DataConnection.dbconnect();
    String s = modell.getId();
    
    try {
        PreparedStatement pst = conn.prepareStatement("delete FROM info WHERE id=?");
        pst.setString(1, s);
        int rowsAffected  = pst.executeUpdate();
        PreparedStatement pstt = conn.prepareStatement("delete FROM e_info WHERE emp_phone=?");
        pstt.setString(1, s);
        int rowsAffecteds = pstt.executeUpdate();
        System.out.println("deleted");
        JOptionPane.showMessageDialog(null, "ACCOUNT DELETED SUCESSFULLY", "Success", JOptionPane.INFORMATION_MESSAGE);
   } catch (Exception e) {
        System.out.println("fail");
        e.printStackTrace(); // Prints the exception stack trace if an error occurs
    } finally {
      
    }
}
}
