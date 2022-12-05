package model;

import java.util.ArrayList;

public class Theatre {
    private String theatreName;
    private String address;
    private ArrayList<Movie> movies;

    public Theatre(String name, String address, ArrayList<Movie> movies){
        this.theatreName = name;
        this.address = address;
        this.movies = movies;
    }

    /* GETTERS */
    public String getTheatreName(){
        return theatreName;
    }

    public String getTheatreAddress(){
        return address;
    }

    public ArrayList<Movie> getMoviesAtTheatre(){
        return movies;
    }

    /* SETTERS */
    public void addMovie(Movie movie){
        movies.add(movie);
    }

    public void setTheatreName(String theatreName){
        this.theatreName = theatreName;
    }

    public void setAddress(String address){
        this.address = address;
    }
}
