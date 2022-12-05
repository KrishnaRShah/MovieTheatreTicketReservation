package model;

public class Receipt {
    private String movieName;
    private double price;
    private String dateOfPurchase;
    private String timeOfPurchase;
    private Payment paymentMethod;

    public Receipt(String name, double price, String dateOP, String timeOP, Payment payment){
        this.movieName = name;
        this.price = price;
        this.dateOfPurchase = dateOP;
        this.timeOfPurchase = timeOP;
        this.paymentMethod = payment;
    }

    /* GETTERS */
    public String getMovieName(){
        return movieName;
    }

    public double getPrice(){
        return price;
    }

    public String getDateOfPurchase(){
        return dateOfPurchase;
    }

    public String getTimeOfPurchase(){
        return timeOfPurchase;
    }

    public Payment getPaymentMethod(){
        return paymentMethod;
    }

    /* SETTERS */
    public void setReceiptMovieName(String movie){
        this.movieName = movie;
    }

    public void setReceiptPrice(double price){
        this.price = price;
    }

    public void setReceiptDate(String date){
        this.dateOfPurchase = date;
    }

    public void setReceiptTime(String time){
        this.timeOfPurchase = time;
    }

    public void setReceiptPaymentMethod(Payment payment){
        this.paymentMethod = payment;
    }

}
