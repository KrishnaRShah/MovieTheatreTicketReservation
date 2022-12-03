package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowtimesController {
    private DBController DB;

    public ShowtimesController(){
        DB = DBController.getInstance();
    }

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
