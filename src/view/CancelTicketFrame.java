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

        setSize(400, 700);
        setContentPane(cancellationPane);
        setTitle("Cancel A Ticket");
        setResizable(false);

        cancelTicketBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(cancelTicketBtn)){

                    email = tfEmail.getText();
                    seatNumber = tfSeatnumber.getText();

                    if (email.equals("") || seatNumber.equals("")){
                        successLabel.setText("One or more fields invalid!");
                    } else {
                        //ADD TICKET CANCELLATION LOGIC HERE USING TICKET CONTROLLER
                        //1. CHECK IF EMAIL ENTERED IS FOR REGISTERED USER
                        //2. CHECK IF SEAT NUMBER MATCHES ONE IN DB
                        //3. CHECK IF TICKET # MATCHES ONE IN DB
                        //4. IF THEY MATCH,
                        //      --> IF RU, REFUND WHOLE AMOUNT
                        //      --> ELSE, REFUND 85%
                        //      DISPLAY SUCCESS MESSAGE
                        //   ELSE, DISPLAY ERROR MESSAGE

                        CancellationController cancelController = new CancellationController();
                        boolean isRU = cancelController.verifyUser(email);

                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        LocalDateTime today = LocalDateTime.now();
                        String currentDate = today.format(dtf).toString().substring(0, 10);

                        TicketController tc = new TicketController();
                        int seatID = Integer.parseInt(seatNumber);

                        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
                        Date currDate = new Date();
                        Date recDate = new Date();

                        try {
                            currDate = sdformat.parse(currentDate);
                            recDate = sdformat.parse(tc.getPurchasedDate(seatID));
                        } catch (ParseException ex) {
                            ex.printStackTrace();
                        }

                        int todayDateDays = Integer.parseInt(currDate.toString().substring(8, 10));
                        int showtimeDateDays = Integer.parseInt(recDate.toString().substring(8, 10));

                        int theatreID = tc.getTheatreID(seatID);

                        double ticketPrice = Double.parseDouble(tc.getTicketPrice(seatID));

                        if (seatID == tc.getSeatID(seatID) && (currDate.compareTo(recDate) < 0) && (showtimeDateDays - todayDateDays >= 3)){
                            String temp = "seats" + theatreID;
                            SeatController sc = new SeatController(temp);

                            sc.updateSeat(String.valueOf(seatID), "1");
                            tc.removeTicketFromDB(seatID);
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
