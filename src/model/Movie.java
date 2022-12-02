package model;

import java.util.ArrayList;

//HELLO?
public class Movie {
    private ArrayList<Showtime> showtimes;
    private String movieName;
    private double movieLength;

    public ArrayList<Showtime> getShowtimes(){
        return showtimes;
    }

    public String getMovieName(){
        return movieName;
    }

    public double getMovieLength(){
        return movieLength;
    }

    public void addShowtime(Showtime showtime){
        showtimes.add(showtime);
    }

    public void setMovieName(String name){
        this.movieName = name;
    }

    public void setMovieLength(double length){
        this.movieLength = length;
    }

}
