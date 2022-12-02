package model;

public class Ticket {
    private int ticketID;
    private Seat seat;
    private User user;
    private Theatre theatre;
    private Showtime showtime;
    private double ticketPrice;

    /* GETTERS */
    public int getTicketID(){
        return ticketID;
    }

    public Seat getSeat(){
        return seat;
    }

    public User getUser(){
        return user;
    }

    public Theatre getTheatre(){
        return theatre;
    }

    public Showtime getShowtime(){
        return showtime;
    }

    public double getTicketPrice(){
        return ticketPrice;
    }

    /* SETTERS */
    public void setTicketID(int id){
        this.ticketID = id;
    }

    public void setTicketPrice(double price){
        this.ticketPrice = price;
    }

    public void setTicketSeat(Seat seat){
        this.seat = seat;
    }

    public void setTicketUser(User user){
        this.user = user;
    }

    public void setTicketTheatre(Theatre theatre){
        this.theatre = theatre;
    }

    public void setTicketShowtime(Showtime showtime){
        this.showtime = showtime;
    }

}

