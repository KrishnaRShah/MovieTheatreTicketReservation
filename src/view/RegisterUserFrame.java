package MovieTheatreTicketReservation.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterUserFrame extends JFrame {
    private JLabel registerUserText1;
    private JLabel registerUserText2;
    private JTextField tfUsername;
    private JTextField tfPassword;
    private JTextField tfEmail;
    private JTextField tfCardNum;
    private JTextField tfCVV;
    private JTextField tfExpiryDate;
    private JButton submitButton;
    private JButton cancelButton;
    private JLabel lbUsername;
    private JPanel regUserPanel;
    private JLabel successText;

    private String inUsername;
    private String inPass;
    private String inEmail;
    private String inCardNum;
    private String inCVV;
    private String inExpiryDate;

    public RegisterUserFrame(){
        setContentPane(regUserPanel);
        setTitle("Create An Account");
        setSize(850, 500);
        setMinimumSize(new Dimension(850, 500));

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (tfUsername.getText().equals("") || tfPassword.getText().equals("") || tfEmail.getText().equals("") ||
                        tfCardNum.getText().equals("") || tfCVV.getText().equals("") || tfExpiryDate.getText().equals("")
                        || tfCVV.getText().length() > 3) {
                    successText.setText("One or more inputs is invalid!");
                } else {
                    inUsername = tfUsername.getText();
                    inPass = tfPassword.getText();
                    inEmail = tfEmail.getText();
                    inCardNum = tfCardNum.getText();
                    inCVV = tfCVV.getText();
                    inExpiryDate = tfExpiryDate.getText();

                    successText.setText("Registering User!");

                    System.out.println(inUsername);
                    System.out.println(inPass);
                    System.out.println(inEmail);
                    System.out.println(inCardNum);
                    System.out.println(inCVV);
                    System.out.println(inExpiryDate);
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
