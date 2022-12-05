package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {
    private DBController DB;

    //Constructor
    public LoginController(){
        DB = DBController.getInstance();
    }

    //Method to verify the user from the database --> if valid login or not
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

    //Method to verify if the admin is valid or not
    public boolean verifyAdmin(String username, String password){
        //SQL query
        String query = "SELECT * FROM users";
        ResultSet results = DB.query(query);
        boolean verified = false;
        try {
            while (results.next()){
                String resUsername = results.getString("email");
                String resPass = results.getString("password");
                int registered = results.getInt("registered");

                if (username.equals(resUsername) && password.equals(resPass) && registered == 3){
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
