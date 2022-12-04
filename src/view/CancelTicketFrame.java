package view;

import controller.CancellationController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CancelTicketFrame extends JFrame {
    private JLabel emailLabel;
    private JTextField tfEmail;
    private JTextField tfSeatnumber;
    private JTextField tfTicketNum;
    private JButton cancelTicketBtn;
    private JLabel seatNumLabel;
    private JLabel ticketLabel;
    private JLabel successLabel;
    private JPanel cancellationPane;

    private String email;
    private String seatNumber;
    private String ticketNumber;

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
                    ticketNumber = tfTicketNum.getText();

                    if (email.equals("") || seatNumber.equals("") || ticketNumber.equals("")){
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



                    }

                }

            }
        });
    }
}
