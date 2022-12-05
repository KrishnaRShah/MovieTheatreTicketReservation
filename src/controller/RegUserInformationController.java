package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegUserInformationController {
    private DBController DB;

    //Constructor
    public RegUserInformationController(){
        DB = DBController.getInstance();
    }

    //Method to Register a User in the database
    public boolean registerUser(String username, String pass, String email, String name){

        String searchQuery = "SELECT * FROM users";
        ResultSet results = DB.query(searchQuery);
        boolean temp = false;

        //search for duplicates
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

        //if duplicate found, return false, else return true (successful registration)
        if (temp){
            return false;
        } else {
            String query = "INSERT INTO users (email, registered, password, name) VALUES (?,?,?,?)";
            DB.execute(query, email, 1, pass, name);
            return true;
        }
    }

    //Register the card associated with the user
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

    //Register an Admin in the DB
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

    //Remove a User from the DB
    public void removeUser(String email){
        String query = "DELETE FROM users WHERE email = ?";
        DB.execute(query, email);
    }

    //Get all User information by email in the form of a String array
    public String[] getInfoByEmail(String email) {
        String nameQuery = "SELECT * FROM users WHERE email = ?";
        ResultSet res = DB.query(nameQuery, email);

        //Get name associated with registered email
        String returnedName = "";
        try {
            if (res.next()){
                returnedName = res.getString("name");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        //Get associated card information with registered name
        String cardQuery = "SELECT * FROM cards WHERE name_on_card = ?";
        ResultSet cardRes = DB.query(cardQuery, returnedName);

        String retCardNum = "";
        String retCVV = "";
        String retExpiryDate = "";

        try {
            if (cardRes.next()){
                retCardNum = cardRes.getString("card_number");
                retCVV = cardRes.getString("cvv");
                retExpiryDate = cardRes.getString("expiry_date");
            }
        } catch (SQLException e1){
            e1.printStackTrace();
        }

        //update String[]
        String[] userInfo = new String[4];
        userInfo[0] = returnedName;
        userInfo[1] = retCardNum;
        userInfo[2] = retCVV;
        userInfo[3] = retExpiryDate;

        return userInfo;
    }

    //Check if a User needs to pay the annual fee --> return true if yes, else return false
    public boolean needsToPayFee(String email){
        String query = "SELECT * FROM users WHERE email = ?";
        ResultSet results = DB.query(query, email);
        boolean required = false;
        try {
            if (results.next()){
                int temp = results.getInt("annualFeeDue");
                if (temp == 1){
                    required = true;
                }
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return required;
    }

    //Method to pay the annual fee (updates in the user database)
    public void payAnnualFee(String email){
        String query = "UPDATE users SET annualFeeDue = ? WHERE email = ?";
        DB.execute(query, 0, email);
    }
    
}
