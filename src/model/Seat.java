package model;

public class Seat {
    private int seatNumber;
    private boolean booked;
    private String reserved;


    public Seat(int seatNumber, String reserved){
        this.seatNumber = seatNumber;
        this.reserved = reserved;
    }
    /* GETTERS */
    public int getSeatNumber(){
        return seatNumber;
    }

    public boolean isBooked(){
        return booked;
    }

    public String isReserved(){
        return reserved;
    }

    /* SETTERS */
    public void setSeatNumber(int number){
        this.seatNumber = number;
    }

    public void setSeatBooked(boolean booked){
        this.booked = booked;
    }

    public void setSeatReserved(String reserved){
        this.reserved = reserved;
    }
}
