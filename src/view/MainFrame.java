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
    private JButton adminBtn;

    public MainFrame() {

        setContentPane(mainMenuPanel);
        setTitle("Movie Theatre Ticket Reservation System");
        setSize(450, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //If login button was pressed, open login frame
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginFrame loginframe = new LoginFrame();
                loginframe.setVisible(true);
            }
        });

        //If continue as guest button was pressed, open the movie selection frame
        continueAsGuestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //OPEN MOVIES TAB HERE
                SelectionForm selectionForm = new SelectionForm(false, "");
                selectionForm.setVisible(true);
            }
        });

        //If cancel ticket button pressed, open Cancel Ticket Frame
        cancelTicketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //OPEN TICKET CANCELLATION FORM HERE
                CancelTicketFrame cancelFrame = new CancelTicketFrame();
                cancelFrame.setVisible(true);
            }
        });

        //If register button pressed, open account registration frame
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //OPEN CREATE AN ACCOUNT FORM HERE
                RegisterUserFrame regUserFrame = new RegisterUserFrame();
                regUserFrame.setVisible(true);

            }
        });

        //If administrator button pressed, open admin frame
        adminBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AdminFrame adminFrame = new AdminFrame();
                adminFrame.setVisible(true);

            }
        });
    }

}
