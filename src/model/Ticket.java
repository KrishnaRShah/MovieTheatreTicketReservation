package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ticket {
    private int ticketID;
    private int seatID;
    private  int theatreID;
    private String theatre;
    private String ticketPrice;
    private String dateOfPurchase;
    private String email;
    private String cardNumber;
    private String dateOfMovie;
    private String fullName;
    private String seat;
    private String movieName;
    public static int receiptNumber = 1;

    public Ticket(int seatID, String theatre, String ticketPrice,
                   String dateOfPurchase, String email, String cardNumber,
                   int theatreID, String fullName, String seat, String dateOfMovie,
                    String movieName){
        this.seatID = seatID;
        this.theatre = theatre;
        this.ticketPrice = ticketPrice;
        this.dateOfPurchase = dateOfPurchase;
        this.email = email;
        this.cardNumber = cardNumber;
        this.theatreID = theatreID;
        this.fullName = fullName;
        this.seat = seat;
        this.dateOfMovie = dateOfMovie;
        this.movieName = movieName;
    }
    /* GETTERS */
    public int getTicketID(){
        return ticketID;
    }

    public int getint(){
        return seatID;
    }

    public int getTheatreID() {
        return theatreID;
    }

    public String getTheatre(){
        return theatre;
    }

    public String getTicketPrice(){
        return ticketPrice;
    }

    public String getEmail(){return email;}

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public String getDateOfMovie(){
        return dateOfMovie;
    }

    //Method to print the receipt and ticket info in a .TXT file
    public void printReceipt(){
        File receiptFile = null;
        FileWriter myWriter = null;
        String fileName = "ReceiptAndTicket"+receiptNumber+".txt";

       String sendToFIle = "Printed Reciept\n\n" +
        "Ticket For:\n" +
        "Name: " + fullName + "\n" +
        "Email: " + email + "\n" +
        "Card Charged: " + cardNumber + "\n" +
        "Date Purchased: " + dateOfPurchase + "\n\n" +
        "Ticket Details:\n" +
        "Movie: " + movieName + "\n" +
        "Showtime: " + dateOfMovie + "\n" +
        "Theatre: " + theatre + "\n" +
        "Price: " + ticketPrice + "\n" +
        "Seat: " + seat + " SeatID: " + seatID + "\n\n" +
        "Enjoy your movie!";

        try {
            receiptFile = new File(fileName);
            myWriter = new FileWriter(fileName);

            myWriter.write(sendToFIle);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /* SETTERS */
    public void setTicketID(int id){
        this.ticketID = id;
    }

    public void setTicketPrice(String price){
        this.ticketPrice = price;
    }

    public void setTicketint(int seatID){
        this.seatID = seatID;
    }

    public void setTicketString(String theatre){
        this.theatre = theatre;
    }

}

