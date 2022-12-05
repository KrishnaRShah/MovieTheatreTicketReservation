package model;

public class Showtime{
    private String date;
    private String time;

    public Showtime(String date, String time){
        this.date = date;
        this.time = time;
    }

    /* GETTERS */
    public String getDate(){
        return date;
    }

    public String getTime(){
        return time;
    }

    /* SETTERS */
    public void setDate(String date){
        this.date = date;
    }

    public void setTime(String time){
        this.time = time;
    }
}