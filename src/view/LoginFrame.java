package view;

import controller.LoginController;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class LoginFrame extends JFrame {
    private JLabel titleLabel1;
    private JLabel titleLabel2;
    private JLabel labelUsername;
    private JTextField tfUsername;
    private JLabel labelPassword;
    private JPasswordField tfPass;
    private JButton btnLogin;
    private JPanel loginFormPanel;
    private JPanel loginTitlePanel;
    private JPanel loginPanel;
    private JButton cancelButton;
    private JLabel successText;

    private String inUsername;
    private String inPass;

    public LoginFrame() {
        setContentPane(loginPanel);
        setTitle("Login As RU");
        setSize(700, 500);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inUsername = tfUsername.getText();
                inPass = tfPass.getText();

                if (inUsername.equals("") || inPass.equals("") || inUsername.equals(" ") || inPass.equals(" ")) {
                    successText.setText("Invalid! One or more forms are missing!");
                } else {
                    successText.setText("Input entered.");
                }

                LoginController lc = new LoginController();


                if (lc.verifyUser(inUsername, inPass)){
                    successText.setText("Logging in!");

                    SelectionForm selectionForm = new SelectionForm(true, inUsername);
                    selectionForm.setVisible(true);

                    dispose();
                } else {
                    successText.setText("Not Registered!");
                }

                //CHECK WITH DB HERE IF VALID PASSWORD, IF VALID PASSWORD, CONTINUE TO MOVIE ANNOUNCEMENT
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
