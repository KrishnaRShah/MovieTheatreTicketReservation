package controller;

public class TicketController {

    private DBController DB;

    public TicketController(){
        DB = DBController.getInstance();
    }

    public int getSeatNumber(int ticketID){
        return 0;
    }

    public int getTicketID(int seatNumber){
        return 0;
    }

    public String getPurchasedDate(int ticketID){
        return "";
    }

    public void addTicketDB(String email, int seatNumber, String dateOfPurchase, int theatreID, String price){
        String query = "INSERT INTO tickets (user_email, seat_id, purchased_date, theatre_id, ticket_price) VALUES (?,?,?,?,?)";
        DB.execute(query, email, seatNumber, dateOfPurchase, theatreID, price);
    }
}
