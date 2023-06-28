package CONTROLLER;

//
//import MODEL.DataConnection;
//import MODEL.Interestmodel;
//import VIEW.Interestview;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class Interestcontroller {
//ResultSet rs;
//PreparedStatement pst;
//Connection con;
//Interestview myview;
//Interestmodel mymodel;
//Statement stmt;
//String no1;
//public Interestcontroller(Interestview myView)
//{
//    this.myview=myView;
//    
////    new logincontroller.LoginList().actionPerformed();
//}
//public Interestcontroller(String Accno){
//    no1= Accno;
//}
//public boolean checkMyData(Interestmodel mymodel) throws Exception
//{ 
//}

import MODEL.Interestmodel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Interestcontroller {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/crt_account";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "khadgi986";

    public Interestmodel searchAccount(String accountNumber) {
        Interestmodel account = new Interestmodel();

        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            String query = "SELECT * FROM info WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, accountNumber);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
//                account.setAc_no(resultSet.getString("ac_no"));
                account.setAc_name(resultSet.getString("fname"));
                account.setAc_phone(resultSet.getString("phone"));
                account.setBalance(resultSet.getString("deposit"));
                account.setCrtdate(resultSet.getString("crt_date"));
                account.setTypacc(resultSet.getString("typeaccount"));
                account.setTimep(resultSet.getString("intfor"));
                account.setIntrate(resultSet.getString("intpercent"));
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return account;
    }
}
