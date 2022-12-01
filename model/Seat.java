package model;

public class Seat {
    private int seatNumber;
    private boolean booked;
    private boolean reserved;

    /* GETTERS */
    public int getSeatNumber(){
        return seatNumber;
    }

    public boolean isBooked(){
        return booked;
    }

    public boolean isReserved(){
        return reserved;
    }

    /* SETTERS */
    public void setSeatNumber(int number){
        this.seatNumber = number;
    }

    public void setSeatBooked(boolean booked){
        this.booked = booked;
    }

    public void setSeatReserved(boolean reserved){
        this.reserved = reserved;
    }
}
