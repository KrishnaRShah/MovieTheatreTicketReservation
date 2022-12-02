package model;

public class User {
    private Ticket ticket;
    private Payment paymentMethod;
    private Seat seat;

    /* GETTERS */
    public Ticket getUserTicket(){
        return ticket;
    }

    public Payment getUserPayment(){
        return paymentMethod;
    }

    public Seat getUserSeat(){
        return seat;
    }

    /* SETTERS */
    public void setUserTicket(Ticket ticket){
        this.ticket = ticket;
    }

    public void setUserPaymentMethod(Payment method){
        this.paymentMethod = method;
    }

    public void setUserSeat(Seat seat){
        this.seat = seat;
    }

}
