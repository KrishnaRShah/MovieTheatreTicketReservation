package view;

import controller.CancellationController;
import controller.SeatController;
import controller.TicketController;
import model.Ticket;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class CancelTicketFrame extends JFrame {
    //variables used
    private JLabel emailLabel;
    private JTextField tfEmail;
    private JTextField tfSeatnumber;
    private JButton cancelTicketBtn;
    private JLabel seatNumLabel;
    private JLabel successLabel;
    private JPanel cancellationPane;


    private String email;
    private String seatNumber;

    public CancelTicketFrame(){

        //set size of frame and add content
        setSize(400, 700);
        setContentPane(cancellationPane);
        setTitle("Cancel A Ticket");
        setResizable(false);

        //create button for window
        cancelTicketBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(cancelTicketBtn)){

                    //get input email and seat number
                    email = tfEmail.getText();
                    seatNumber = tfSeatnumber.getText();

                    if (email.equals("") || seatNumber.equals("")){
                        successLabel.setText("One or more fields invalid!");
                    } else {

                        //Initially check if the user is an RU
                        CancellationController cancelController = new CancellationController();
                        boolean isRU = cancelController.verifyUser(email);

                        //get the seatID based on inputted seat number
                        TicketController tc = new TicketController();
                        int seatID = Integer.parseInt(seatNumber);

                        //set date format and get current date
                        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
                        Date todayDate1 = new Date();
                        
                        //string to get dates from DATAbase and current date with proper format
                        String currDate = "";
                        String showDate = "";
                        
                        //set current date and showtime date
                        currDate = sdformat.format(todayDate1);
                        showDate = tc.getPurchasedDate(seatID);

                        //split strings so we can get the Year, month and day seperate
                        String[] todayparts = currDate.split("-");   //[0] = year [1] = month [2] = day
                        String[] showTimeparts = showDate.split("-");

                        //create and int for today and showtime date int = yyyyMMdd
                        int todayDate = Integer.parseInt(todayparts[0] + todayparts[1] + todayparts[2]); //yearmonthday 20221204
                        int showTimeDate = Integer.parseInt(showTimeparts[0] + showTimeparts[1] + showTimeparts[2]); //20221206


                        //get the theatreID based on the seatID
                        int theatreID = tc.getTheatreID(seatID);

                        //Get the ticket price
                        double ticketPrice = Double.parseDouble(tc.getTicketPrice(seatID));

                        //If valid cancellation request, update the database and print message
                        //else display error message
                        if (seatID == tc.getSeatID(seatID) && (currDate.compareTo(showDate) < 0) && (showTimeDate - todayDate >= 3)){

                            //get Seatcontroller to update database
                            String temp = "seats" + theatreID;
                            SeatController sc = new SeatController(temp);

                            //update database and remove ticket
                            sc.updateSeat(String.valueOf(seatID), "1");
                            tc.removeTicketFromDB(seatID);

                            //if Registered User, return full ticket price, else refund 85%
                            if (isRU){
                                JOptionPane.showMessageDialog(null, "Refunded Full Ticket Price: $" + ticketPrice);
                            } else {
                                double calc = ticketPrice * 0.85;
                                JOptionPane.showMessageDialog(null, ("Refunded Price After Applying 15% Fee: $" + String.format("%.2f", calc)));
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Ticket Or Passed Refund Date");
                        }
                    }

                }

            }
        });
    }
}
