package model;

import java.util.ArrayList;

public class Movie {
    private ArrayList<Showtime> showtimes;
    private String movieName;
    private double movieLength;

    //Constructor
    public Movie(ArrayList<Showtime> times, String name, double movieLength){
        this.showtimes = times;
        this.movieName = name;
        this.movieLength = movieLength;
    }

    //Get arraylist of showtimes
    public ArrayList<Showtime> getShowtimes(){
        return showtimes;
    }

    //get movie name
    public String getMovieName(){
        return movieName;
    }

    //Get movie length
    public double getMovieLength(){
        return movieLength;
    }

    //Add a showtime
    public void addShowtime(Showtime showtime){
        showtimes.add(showtime);
    }

    //Set movie name
    public void setMovieName(String name){
        this.movieName = name;
    }

    //Set movie length
    public void setMovieLength(double length){
        this.movieLength = length;
    }

}
