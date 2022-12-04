package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CancellationController {

    private DBController DB;

    public CancellationController(){
        DB = DBController.getInstance();
    }

    public boolean verifyUser(String email) {
        //SQL query
        String query = "SELECT * FROM users";
        ResultSet results = DB.query(query);
        boolean verified = false;
        try {
            while (results.next()) {
                String resUsername = results.getString("email");

                if (email.equals(resUsername)) {
                    verified = true;
                    break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return verified;
    }


}
