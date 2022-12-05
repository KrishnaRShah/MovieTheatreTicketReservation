package controller;

import model.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketController {

    private DBController DB;
    private Ticket ticket;

    //Constructor
    public TicketController(Ticket ticket){
        DB = DBController.getInstance();
        this.ticket = ticket;
    }

    //Default Constructor
    public TicketController(){
        DB = DBController.getInstance();
    }

    //Method to return the seatID from the database, depending on the seat number
    public int getSeatID(int seatNumber){
        String query = "SELECT * FROM tickets WHERE seat_id = ?";
        ResultSet res = DB.query(query, seatNumber);
        int seatID = -1;
        try {
            if (res.next()){
                seatID = res.getInt("seat_id");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return seatID;
    }

    //Method to return theatreID, with seat number as input
    public int getTheatreID(int seatNumber){
        String query = "SELECT * FROM tickets WHERE seat_id = ?";
        ResultSet res = DB.query(query, seatNumber);
        int theatreID = -1;
        try {
            if (res.next()){
                theatreID = res.getInt("theatre_id");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return theatreID;
    }

    //Method to return ticket date of purchase
    public String getPurchasedDate(int seatNumber){
        String query = "SELECT * FROM tickets WHERE seat_id = ?";
        ResultSet res = DB.query(query, seatNumber);
        String resShowtime = "";
        try {
            if (res.next()){
                resShowtime = res.getString("showtime");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return resShowtime;
    }

    //Method to return ticket price
    public String getTicketPrice(int seatNumber){
        String query = "SELECT * FROM tickets WHERE seat_id = ?";
        ResultSet res = DB.query(query, seatNumber);
        String resPrice = "";
        try {
            if (res.next()){
                resPrice = res.getString("ticket_price");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return resPrice;
    }

    //Method to remove a ticket from the database
    public void removeTicketFromDB(int seatNumber){
        String query = "DELETE FROM tickets WHERE seat_id = ?";
        DB.execute(query, seatNumber);
    }

    //Method to add a ticket into the database
    public void addTicketDB(){
        System.out.println(ticket.getEmail());
        System.out.println(ticket.getint());
        System.out.println(ticket.getDateOfPurchase());
        String query = "INSERT INTO tickets (user_email, seat_id, purchased_date, theatre_id, ticket_price, showtime) VALUES (?,?,?,?,?,?)";
        DB.execute(query, ticket.getEmail(), ticket.getint(), ticket.getDateOfPurchase(), ticket.getTheatreID(), ticket.getTicketPrice(),ticket.getDateOfMovie());
    }
}
