package model;

public class Payment {
    private User user;
    private String cardNumber;
    private String CVV;
    private String expiryDate;
    private String name;
    private String email;

    public Payment(User user, String number, String code, String date, String name, String email){
        this.user = user;
        this.cardNumber = number;
        this.CVV = code;
        this.expiryDate = date;
        this.name = name;
        this.email = email;
    }

    /* GETTERS */
    private User getPaymentUser(){
        return user;
    }

    private String getCardNumber(){
        return cardNumber;
    }

    private String getCVV(){
        return CVV;
    }

    private String getExpiry(){
        return expiryDate;
    }

    private String getName(){
        return name;
    }

    private String getPaymentEmail(){
        return email;
    }

    /* SETTERS */

    private void setPaymentUser(User user){
        this.user = user;
    }

    private void setCardNumber(String cardNum){
        this.cardNumber = cardNum;
    }

    private void setCardCVV(String CVV){
        this.CVV = CVV;
    }

    private void setExpiryDate(String date){
        this.expiryDate = date;
    }

    private void setPaymentName(String name){
        this.name = name;
    }

    private void setEmail(String email){
        this.email = email;
    }
}
