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
}
