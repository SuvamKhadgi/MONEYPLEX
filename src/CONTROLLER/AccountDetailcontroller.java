package CONTROLLER;
//import MODEL.AccountDetailmodel;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//public class AccountDetailcontroller {
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/crt_account";
//    private static final String DB_USER = "root";
//    private static final String DB_PASSWORD = "khadgi986";
//    public AccountDetailmodel searchAccount(String accountNumber) {
//        AccountDetailmodel account = new AccountDetailmodel();
//        try {
//            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
//            String query = "SELECT * FROM info WHERE id = ?";
//            PreparedStatement statement = connection.prepareStatement(query);
//            statement.setString(1, accountNumber);
//            ResultSet resultSet = statement.executeQuery();
//
//            if (resultSet.next()) {
////                account.setAc_no(resultSet.getString("ac_no"));
//                account.setFname(resultSet.getString("fname"));
//                account.setMname(resultSet.getString("mname"));
//                account.setLname(resultSet.getString("lname"));
//                account.setCountry(resultSet.getString("nationality"));
//                account.setAddress(resultSet.getString("address"));
//                account.setDob(resultSet.getString("dob"));
//                account.setPhone(resultSet.getString("phone"));
//                account.setDeposit_amt(resultSet.getString("deposit"));
//                account.setDate(resultSet.getString("crt_date"));
//                account.setTyp_acc(resultSet.getString("typeaccount"));
//                account.setInt_for(resultSet.getString("intfor"));
//                account.setInt_per(resultSet.getString("intpercent"));
//                account.setCitizen_no(resultSet.getString("citizenship"));
//                account.setEmail(resultSet.getString("email"));
//                 account.setProfession(resultSet.getString("profession"));
//            }
//
//            resultSet.close();
//            statement.close();
//            connection.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return account;
//    }
//    
//}

import DAO.AccountDetailDao;
import MODEL.AccountDetailmodel;

public class AccountDetailcontroller {
    private AccountDetailDao accountDetailDao;

    public AccountDetailcontroller() {
        this.accountDetailDao = new AccountDetailDao();
    }

    public AccountDetailmodel searchAccount(String accountNumber) {
        return accountDetailDao.searchAccount(accountNumber);
    }
}
