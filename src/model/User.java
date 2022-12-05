package model;

public class User {
    private Ticket ticket;
    private Payment paymentMethod;
    private Seat seat;

    public User(Ticket ticket, Payment payment, Seat seat){
        this.ticket = ticket;
        this.paymentMethod = payment;
        this.seat = seat;
    }

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
