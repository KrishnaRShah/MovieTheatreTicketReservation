package view;

import controller.LoginController;
import controller.RegUserInformationController;
import controller.SearchMovieController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminFrame extends JFrame{
    private JPanel adminPanel;
    private JTabbedPane adminTabs;
    private JTextField tfEmail;
    private JTextField tfPass;
    private JButton adLoginBtn;
    private JLabel loginSuccessLabel;
    private JLabel loginPanel;
    private JPanel adminPrivPanel;
    private JTextField tfRemMovie;
    private JButton remMovieBtn;
    private JTextField tfAddMovie;
    private JTextField tfAddDesc;
    private JTextField tfAddLength;
    private JTextField tfAddDate;
    private JButton addMovieBtn;
    private JTextField tfRemEmail;
    private JButton removeUserButton;
    private JTextField tfAddEmail;
    private JTextField tfAddPass;
    private JTextField tfAddName;
    private JButton addAdminButton;
    private JLabel remMovLabel;
    private JLabel addMovLabel;
    private JLabel remUserLabel;
    private JLabel addAdminLabel;

    private String adminEmail;
    private String adminPass;

    public AdminFrame(){
        setSize(900, 600);
        setTitle("Admin Panel");
        setContentPane(adminPanel);

        adminTabs.remove(adminPrivPanel);

        adLoginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(adLoginBtn)){
                    adminEmail = tfEmail.getText();
                    adminPass = tfPass.getText();

                    if (adminEmail.equals("") || adminPass.equals("")){
                        loginSuccessLabel.setText("Missing/Invalid Fields");
                    } else {
                        LoginController lc = new LoginController();
                        boolean isAdmin = lc.verifyAdmin(adminEmail, adminPass);
                        if (isAdmin){
                            loginSuccessLabel.setText("Logging in as admin!");
                            adminTabs.add("Admin Privileges", adminPrivPanel);

                        } else {
                            loginSuccessLabel.setText("Invalid User!");
                        }
                    }
                }
            }
        });


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                SearchMovieController smc = new SearchMovieController();

                if (e.getSource().equals(remMovieBtn)){
                    //SEARCH MOVIES AND ADD HERE
                    if (tfRemMovie.getText().equals("")){
                        remMovLabel.setText("Invalid Input");
                    } else {
                        smc.removeMovie(tfRemMovie.getText());
                        remMovLabel.setText("Removed Movie");
                    }

                }

                if (e.getSource().equals(addMovieBtn)){
                    if (tfAddMovie.getText().equals("") || tfAddDesc.getText().equals("") || tfAddLength.getText().equals("") || tfAddDate.getText().equals("")){
                        addMovLabel.setText("Invalid Input");
                    } else {
                        smc.addMovie(tfAddMovie.getText(), tfAddDesc.getText(), tfAddLength.getText(), tfAddDate.getText());
                        addMovLabel.setText("Added Movie");
                    }
                }

            }
        };
        remMovieBtn.addActionListener(listener);
        addMovieBtn.addActionListener(listener);


        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                RegUserInformationController rc = new RegUserInformationController();

                if (e.getSource().equals(removeUserButton)){
                    //ADD USER HERE
                    if (tfRemEmail.getText().equals("")){
                        remUserLabel.setText("Invalid Input");
                    } else {
                        rc.removeUser(tfRemEmail.getText());
                        remUserLabel.setText("Successfully removed user.");
                    }

                }

                if (e.getSource().equals(addAdminButton)){
                    //ADD ADMIN HERE
                    if (tfAddPass.getText().equals("") || tfAddEmail.getText().equals("") || tfAddName.getText().equals("")){
                        addAdminLabel.setText("Invalid Input");
                    } else {
                        rc.registerAdmin(tfAddPass.getText(), tfAddEmail.getText(), tfAddName.getText());
                        addAdminLabel.setText("Successfully Added Admin");
                    }

                }

            }
        };
        removeUserButton.addActionListener(listener1);
        addAdminButton.addActionListener(listener1);
    }
}
