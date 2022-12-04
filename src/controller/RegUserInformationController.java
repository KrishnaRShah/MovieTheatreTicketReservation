package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegUserInformationController {
    private DBController DB;

    public RegUserInformationController(){
        DB = DBController.getInstance();
    }

    public boolean registerUser(String username, String pass, String email, String name){

        String searchQuery = "SELECT * FROM users";
        ResultSet results = DB.query(searchQuery);
        boolean temp = false;
        try {
            while (results.next()){
                String resEmail = results.getString("email");

                //found a duplicate
                if (email.equals(resEmail)){
                    temp = true;
                    break;
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        if (temp){
            return false;
        } else {
            String query = "INSERT INTO users (email, registered, password, name) VALUES (?,?,?,?)";
            DB.execute(query, email, 1, pass, name);
            return true;
        }
    }

    public boolean registerCard(String name, String cardNumber, String CVV, String expiryDate){
        String searchQuery = "SELECT * FROM cards";
        ResultSet results = DB.query(searchQuery);
        boolean temp = false;
        int prevUserID = 0;
        try {
            while (results.next()){
                String resNumber = results.getString("card_number");
                String resName = results.getString("name_on_card");
                prevUserID = results.getInt("user_id");

                //found a duplicate
                if (name.equals(resName) || cardNumber.equals(resNumber)){
                    temp = true;
                    break;
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        if (temp){
            return false;
        } else {
            String query = "INSERT INTO cards (name_on_card, card_number, expiry_date, cvv, user_id) VALUES (?,?,?,?,?)";
            DB.execute(query, name, cardNumber, expiryDate, CVV, prevUserID + 1);
            return true;
        }
    }

    public void registerAdmin(String pass, String email, String name){

        String searchQuery = "SELECT * FROM users";
        ResultSet results = DB.query(searchQuery);
        boolean temp = false;
        try {
            while (results.next()){
                String resEmail = results.getString("email");

                //found a duplicate
                if (email.equals(resEmail)){
                    temp = true;
                    break;
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }

        if (temp){
            return;
        } else {
            String query = "INSERT INTO users (email, registered, password, name) VALUES (?,?,?,?)";
            DB.execute(query, email, 3, pass, name);
            return;
        }
    }

    public void removeUser(String email){
        String query = "DELETE FROM users WHERE email = ?";
        DB.execute(query, email);
    }
    
}
