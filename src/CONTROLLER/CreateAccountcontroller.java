//package CONTROLLER;
//import MODEL.*;
//import VIEW.*;
//import java.sql.*;
//public class CreateAccountcontroller {
//    CreateAccountmodel mymodel;
//    CreateAccountview view;
//    PreparedStatement pst= null;
//public CreateAccountcontroller(CreateAccountview aView)////constructor
//{
//    this.view=aView;
//            //view.addacc(new RegisterListener());
//            new RegisterListener().actionPerformed();
//}
//class RegisterListener
//{
//    
//    public void actionPerformed()
//    {
//        try
//        {
//        mymodel=view.getMymodel();
//        if(checkMyData(mymodel))
//        {
//        view.showMessage("Registered Successfully");
//        }
//        else
//        {
//        view.showMessage("Invalid Details");
//        }
//        }
//        catch(Exception e1)
//        {
//            
//        }
//    }
//}
//
//
//          
//public boolean checkMyData(CreateAccountmodel mymodel) {  
//    Connection conn = null;
//    try {
//        conn = DataConnection.dbconnect();
//       
//       String sql = "INSERT INTO info(fname, mname, lname, address,dob,citizenship,nationality, email,phone, profession,typeaccount,intfor, intpercent,crt_date,deposit) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
//        pst = conn.prepareStatement(sql);
//        pst.setString(1, mymodel.getFname());
//        pst.setString(2, mymodel.getMname());
//        pst.setString(3, mymodel.getLname());
//        pst.setString(4, mymodel.getAddress());
//        pst.setString(5, mymodel.getDob());
//        pst.setInt(6, mymodel.getCitizen_no());
//        pst.setString(7, mymodel.getCountry());
//        pst.setString(8, mymodel.getEmail());
//        pst.setString(9, mymodel.getPhone());
//        pst.setString(10, mymodel.getProfession());
//        pst.setString(11, mymodel.getTyp_acc());
//        pst.setString(12, mymodel.getInt_for());
//        pst.setString(13, mymodel.getInt_per());
//        pst.setString(14, mymodel.getDate());
//        pst.setInt(15, mymodel.getDeposit_amt());
//        pst.executeUpdate();
//        System.out.println("Data inserted");
//        return true;
//    } catch (Exception e2) {
//        e2.printStackTrace();
//    } finally {
//        if (pst != null) {
//            try {
//                pst.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        if (conn != null) {
//            try {
//                conn.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    return false;
//}
//    
//}


package CONTROLLER;

import DAO.CreateAccountDao;
import MODEL.CreateAccountmodel;
import VIEW.CreateAccountview;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountcontroller {
    private CreateAccountDao createAccountDAO;
    private CreateAccountview view;
    public ActionListener getRegisterListener() {
        return new RegisterListener();
    }

    public CreateAccountcontroller(CreateAccountview view) {
        this.view = view;
        this.createAccountDAO = new CreateAccountDao();
        view.addRegisterListener(new RegisterListener());

    }

   class RegisterListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            CreateAccountmodel mymodel = view.getMymodel();
            if (checkMyData(mymodel)) {
                view.showMessage("Registered Successfully");
            } else {
                view.showMessage("Invalid Details");
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}


    public boolean checkMyData(CreateAccountmodel mymodel) {
        return createAccountDAO.insertAccount(mymodel);
    }
}
