package CONTROLLER;
import MODEL.*;
import VIEW.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Withdrawcontroller {
    Withdrawmodel mymodel;
    Withdrawview view;
    PreparedStatement pst= null;
    public Withdrawcontroller(Withdrawview aView)////constructor
{
    this.view=aView;
            //view.addacc(new RegisterListener());
            new Withdrawcontroller.RegisterListener().actionPerformed();
}
    
    class RegisterListener
{
    
    public void actionPerformed()
    {
        try
        {
        mymodel=view.getMymodel();
        if(checkMyData(mymodel))
        {
//        view.showMessage("Registered Successfully");
        }
        else
        {
//        view.showMessage("Invalid Details");
        }
        }
        catch(Exception e1)
        {
            
        }
    }
}
public boolean checkMyData(Withdrawmodel mymodel) {  
    Connection conn = null;
    try {
        conn = DataConnection.dbconnect();
       String sql = "INSERT INTO statements(id,fname,ava_amt,withdrew_amount,withdrew_date,totalamt) VALUES (?, ?, ?, ?, ?, ?)";
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
}
