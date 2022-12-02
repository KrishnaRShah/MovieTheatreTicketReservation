package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {
    private DBController DB;

    public LoginController(){
        DB = DBController.getInstance();
    }

    public boolean verifyUser(String username, String password){
        //SQL query
        String query = "SELECT * FROM users";
        ResultSet results = DB.query(query);
        boolean verified = false;
        try {
            while (results.next()){
                String resUsername = results.getString("email");
                String resPass = results.getString("password");

                if (username.equals(resUsername) && password.equals(resPass)){
                    verified = true;
                    break;
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        return verified;
    }
}
