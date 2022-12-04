package controller;

import model.Ticket;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketController {

    private DBController DB;
    private Ticket ticket;

    public TicketController(Ticket ticket){
        DB = DBController.getInstance();
        this.ticket = ticket;
    }

    public TicketController(){
        DB = DBController.getInstance();
    }


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

    public void removeTicketFromDB(int seatNumber){
        String query = "DELETE FROM tickets WHERE seat_id = ?";
        DB.execute(query, seatNumber);
    }

//    public void addTicketDB(String email, int seatNumber, String dateOfPurchase, int theatreID, String price, String showtime){
//        String query = "INSERT INTO tickets (user_email, seat_id, purchased_date, theatre_id, ticket_price, showtime) VALUES (?,?,?,?,?,?)";
//        DB.execute(query, email, seatNumber, dateOfPurchase, theatreID, price, showtime);
//    }

   public void addTicketDB(){
        System.out.println(ticket.getEmail());
        System.out.println(ticket.getint());
        System.out.println(ticket.getDateOfPurchase());
        String query = "INSERT INTO tickets (user_email, seat_id, purchased_date, theatre_id, ticket_price, showtime) VALUES (?,?,?,?,?,?)";
        DB.execute(query, ticket.getEmail(), ticket.getint(), ticket.getDateOfPurchase(), ticket.getTheatreID(), ticket.getTicketPrice(),ticket.getDateOfMovie());
    }
}
