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

    //Constructor to initialize connection to database
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

    //Main Query Method --> Returns a ResultSet object
    public ResultSet query(String query, Object... args){
        try{
            PreparedStatement statement = connector.prepareStatement(query);

            for (int i = 0; i < args.length; i++){
                statement.setObject(i + 1, args[i]);
            }

            ResultSet results = statement.executeQuery();
            return results;
        } catch(SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    //Main Execute Method --> Executes queries and updates the DB
    public void execute(String query, Object... args){
        try {
            PreparedStatement statement = connector.prepareStatement(query);
            for (int i = 0; i < args.length; i++){
                statement.setObject(i + 1, args[i]);
            }

            statement.execute();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

}

