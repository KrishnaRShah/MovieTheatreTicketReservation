package model;

public class Seat {
    private int seatNumber;
    private boolean booked;
    private String reserved;
    private  String seatId;

    //constructor
    public Seat(int seatNumber, String reserved, String id){
        this.seatNumber = seatNumber;
        this.reserved = reserved;
        this.seatId = id;
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

    public String getSeatId(){return  seatId;}

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

    public  void setSeatId(String seatId){this.seatId = seatId;}

}
