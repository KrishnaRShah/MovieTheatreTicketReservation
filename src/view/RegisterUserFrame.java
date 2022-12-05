package view;

import controller.RegUserInformationController;

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
    private JTextField tfFullName;

    private String inFullName;
    private String inUsername;
    private String inPass;
    private String inEmail;
    private String inCardNum;
    private String inCVV;
    private String inExpiryDate;

    public RegisterUserFrame() {
        setContentPane(regUserPanel);
        setTitle("Create An Account");
        setSize(900, 500);
        setMinimumSize(new Dimension(900, 500));
        setResizable(false);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Check if the inputs are valid
                //If invalid, print error message
                if (tfUsername.getText().equals("") || tfPassword.getText().equals("") || tfEmail.getText().equals("") ||
                        tfCardNum.getText().equals("") || tfCVV.getText().equals("") || tfExpiryDate.getText().equals("")
                        || tfCVV.getText().length() != 3 || tfCardNum.getText().length() != 16 || !tfExpiryDate.getText().contains("/")
                        || tfFullName.getText().equals("")) {
                    successText.setText("One or more inputs is invalid!");
                } else {
                    inFullName = tfFullName.getText();
                    inUsername = tfUsername.getText();
                    inPass = tfPassword.getText();
                    inEmail = tfEmail.getText();
                    inCardNum = tfCardNum.getText();
                    inCVV = tfCVV.getText();
                    inExpiryDate = tfExpiryDate.getText();

                    //if successfully registered user, print message, else print error message if account exists already
                    RegUserInformationController regController = new RegUserInformationController();
                    boolean temp = regController.registerUser(inUsername, inPass, inEmail, inFullName);
                    boolean newTemp = regController.registerCard(inFullName, inCardNum, inCVV, inExpiryDate);
                    if (newTemp && temp){
                        successText.setText("Registering User!");
                    } else {
                        successText.setText("Account Already Exists!");
                    }
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
