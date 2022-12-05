package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowtimesController {
    private DBController DB;

    //Constructor
    public ShowtimesController(){
        DB = DBController.getInstance();
    }

    //Method to return showtime info --> returns String[] containing Date and Time of movie
    public String[] getShowtimeInfo(int id){
        String query = "SELECT * FROM movie_shows WHERE movie_id = ?";
        ResultSet results = DB.query(query, id);

        String temp = "";
        try{
            while (results.next()){
                temp = temp + results.getString("showtime") + " ";
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        String[] showtimeInfo = temp.split(" ");
        return showtimeInfo;

    }


    
}
