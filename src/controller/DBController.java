package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.*;


public class DBController {

    //Member variables used for connecting database
    private Connection connector;
    static DBController instance;
    String DB_URL = "jdbc:mysql://localhost:3306/480fp";
    String DB_USERNAME = "ensf";
    String DB_PASSWORD = "480";

    //Constructor to intialize connection to database
    private DBController(){
        try {
            this.connector = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Get instance method to make sure DBController is singleton
    public static DBController getInstance() { 
		if (instance == null){
			instance = new DBController();
        }
		return instance;
	}


}



/*
 * 
 * 
 * TESTING TO CHECK IF I CAN GRAB/UPDATE FROM DATABASE
 * 
 * 
 */

//RESULTS USED FOR TESTING
//static ResultSet results;

// public static void print(DBController test){
    
//     try {
//         Statement testStatement = connector.createStatement();
//         results = testStatement.executeQuery("SELECT * FROM movie_shows");

//         while (results.next()){
//             System.out.println("Print results: " + results.getString("id") + ", " + results.getString("showtime"));
//         }

//     }catch (SQLException e) {
//         e.printStackTrace();
//     }
// }

// public static void update(DBController test){
    
//     try {
        
//         String query = "INSERT INTO movie_archive (id,name, summary, length, date_available) VALUES (?,?,?,?,?)";
//         PreparedStatement myStmt = connector.prepareStatement(query);

//         myStmt.setString(1, "121");
//         myStmt.setString(2, "Krishna's Movie");
//         myStmt.setString(3, "GROUP 18");
//         myStmt.setString(4, "30");
//         myStmt.setString(5, "2022-12-01");

        
//         int rowCount = myStmt.executeUpdate();
//         System.out.println("Rows affected: " + rowCount);
        
//         myStmt.close();

//     } catch (SQLException ex) {
//         ex.printStackTrace();
//     }
// }




// public static void main(String[] args) {

//     DBController test = new DBController();

//     print(test);

//     //update(test);

//     System.out.println("work??");
    
// }
