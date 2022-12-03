package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JLabel mainTitleLabel;
    private JButton loginButton;
    private JButton continueAsGuestButton;
    private JButton cancelTicketButton;
    public JPanel mainMenuPanel;
    private JButton registerButton;

    public MainFrame() {

        setContentPane(mainMenuPanel);
        setTitle("Movie Theatre Ticket Reservation System");
        setSize(450, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginFrame loginframe = new LoginFrame();
                loginframe.setVisible(true);
            }
        });

        continueAsGuestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //OPEN MOVIES TAB HERE
                SelectionForm selectionForm = new SelectionForm();
                selectionForm.setVisible(true);
            }
        });


        cancelTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //OPEN TICKET CANCELLATION FORM HERE

            }
        });


        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //OPEN CREATE AN ACCOUNT FORM HERE
                RegisterUserFrame regUserFrame = new RegisterUserFrame();
                regUserFrame.setVisible(true);

            }
        });
    }

}
