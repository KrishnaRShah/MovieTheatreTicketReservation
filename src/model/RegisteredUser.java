package model;

public class RegisteredUser {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private Payment regUserPayment;

    /* GETTERS */
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }

    public Payment getRegUserPayment(){
        return regUserPayment;
    }

    /* SETTERS */
    public void setFName(String fname){
        this.firstName = fname;
    }

    public void setLName(String lname){
        this.lastName = lname;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setRegisteredUserPaymentMethod(Payment payment){
        this.regUserPayment = payment;
    }
}
