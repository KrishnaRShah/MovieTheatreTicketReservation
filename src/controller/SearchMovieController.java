package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchMovieController {
    private DBController DB;

    //Constructor
    public SearchMovieController(){
        DB = DBController.getInstance();
    }

    //Method to get Movie Description
    public String getSummary(int id){
        String query = "SELECT * FROM movie_archive WHERE id = ?";
        ResultSet results = DB.query(query, id);
        String summary = "";
        try{
            if (results.next()){
                summary = results.getString("summary");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return summary;

    }

    //Method to get movie Length from DB
    public String getLength(int id){
        String query = "SELECT * FROM movie_archive WHERE id = ?";
        ResultSet results = DB.query(query, id);
        String length = "";
        try {
            if (results.next()){
                length = results.getString("length");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }

        return length;
    }

    //Method to remove a movie from the DB
    public void removeMovie(String movieName){
        String query = "DELETE FROM movie_archive WHERE name = ?";
        DB.execute(query, movieName);
    }

    //Method to add a movie into the DB along with movie information
    public void addMovie(String movieName, String movieDesc, String movieLength, String dateAvail){
        String query = "INSERT INTO movie_archive (name, summary, length, date_available) VALUES (?,?,?,?)";
        DB.execute(query, movieName, movieDesc, movieLength, dateAvail);
    }
}
