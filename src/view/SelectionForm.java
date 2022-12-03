package view;

import controller.SearchMovieController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectionForm extends JFrame {
    private JPanel selectionPanel;
    private JTabbedPane tabbedPane1;
    private JLabel labelMovies;
    private JRadioButton blackPantherRadioButton;
    private JRadioButton dragonBallRadioButton;
    private JRadioButton theDarkKnightRadioButton;
    private JRadioButton interstellarRadioButton;
    private JRadioButton jujutsuKaisenRadioButton;
    private JRadioButton womanIsKingRadioButton;
    private JRadioButton antManRadioButton;
    private JRadioButton demonSlayerRadioButton;
    private JRadioButton tarzanRadioButton;
    private JRadioButton tokyoDriftRadioButton;
    private JLabel moveImageLabel;
    private JPanel imagePanel;
    private JLabel labelDescription;
    private JLabel lengthLabel;
    private JPanel seatsGridPanel;
    private JLabel theatreImage1;
    private JRadioButton theatreSelect1;
    private JRadioButton theatreSelect2;
    private JRadioButton theatreSelect3;
    private JRadioButton theatreSelect4;
    private JLabel theatreImage2;
    private JLabel theatreImage3;
    private JLabel theatreImage4;

    private int choice;
    private int theatreChoice;

    public SelectionForm(){
        setContentPane(selectionPanel);
        setSize(1050, 600);
        setResizable(false);
        setTitle("Book A Ticket");

        ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/blackpanther.jpg");
        ImageIcon icon = scaleImage(temp, 200, 300);
        icon.getImage().flush();
        moveImageLabel.setIcon(icon);
        moveImageLabel.setVisible(true);

        SearchMovieController smc = new SearchMovieController();
        String summary = smc.getSummary(1);
        labelDescription.setText("Description: " + summary);

        String length = smc.getLength(1);
        lengthLabel.setText("Length: " + length + " minutes");

        ImageIcon temp2 = new ImageIcon("MovieTheatreTicketReservation/src/view/images/landmark.jpg");
        ImageIcon icon2 = scaleImage(temp2, 150, 150);
        icon2.getImage().flush();
        theatreImage1.setIcon(icon2);

        ImageIcon temp3 = new ImageIcon("MovieTheatreTicketReservation/src/view/images/cineplex.jpg");
        ImageIcon icon3 = scaleImage(temp3, 150, 150);
        icon3.getImage().flush();
        theatreImage2.setIcon(icon3);

        ImageIcon temp4 = new ImageIcon("MovieTheatreTicketReservation/src/view/images/silvercity.jpg");
        ImageIcon icon4 = scaleImage(temp4, 150, 150);
        icon4.getImage().flush();
        theatreImage3.setIcon(icon4);

        ImageIcon temp5 = new ImageIcon("MovieTheatreTicketReservation/src/view/images/globe.jpeg");
        ImageIcon icon5 = scaleImage(temp5, 150, 150);
        icon5.getImage().flush();
        theatreImage4.setIcon(icon5);

        ButtonGroup group = new ButtonGroup();
        group.add(blackPantherRadioButton);
        group.add(dragonBallRadioButton);
        group.add(theDarkKnightRadioButton);
        group.add(interstellarRadioButton);
        group.add(jujutsuKaisenRadioButton);
        group.add(womanIsKingRadioButton);
        group.add(antManRadioButton);
        group.add(demonSlayerRadioButton);
        group.add(tarzanRadioButton);
        group.add(tokyoDriftRadioButton);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(theatreSelect1);
        group2.add(theatreSelect2);
        group2.add(theatreSelect3);
        group2.add(theatreSelect4);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(blackPantherRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/blackpanther.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 1;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }

                if (e.getSource().equals(dragonBallRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/dragonball.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 2;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }

                if (e.getSource().equals(theDarkKnightRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/batman.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 3;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }

                if (e.getSource().equals(interstellarRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/interstellar.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 4;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }


                if (e.getSource().equals(jujutsuKaisenRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/jkaisen.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 5;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }


                if (e.getSource().equals(womanIsKingRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/wking.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 6;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }


                if (e.getSource().equals(antManRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/antman.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 7;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }


                if (e.getSource().equals(demonSlayerRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/demonslayer.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 8;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }


                if (e.getSource().equals(tarzanRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/tarzan.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 9;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }


                if (e.getSource().equals(tokyoDriftRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/tdrift.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 10;

                    SearchMovieController smc = new SearchMovieController();
                    String summary = smc.getSummary(choice);
                    labelDescription.setText("Description: " + summary);

                    String length = smc.getLength(choice);
                    lengthLabel.setText("Length: " + length + " minutes");
                }

            }
        };

        blackPantherRadioButton.addActionListener(listener);
        dragonBallRadioButton.addActionListener(listener);
        theDarkKnightRadioButton.addActionListener(listener);
        interstellarRadioButton.addActionListener(listener);
        jujutsuKaisenRadioButton.addActionListener(listener);
        womanIsKingRadioButton.addActionListener(listener);
        antManRadioButton.addActionListener(listener);
        demonSlayerRadioButton.addActionListener(listener);
        tarzanRadioButton.addActionListener(listener);
        tokyoDriftRadioButton.addActionListener(listener);


        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(theatreSelect1)){
                    theatreChoice = 1;
                }
                if (e.getSource().equals(theatreSelect2)){
                    theatreChoice = 2;
                }
                if (e.getSource().equals(theatreSelect3)){
                    theatreChoice = 3;
                }
                if (e.getSource().equals(theatreSelect4)){
                    theatreChoice = 4;
                }
            }
        };
        theatreSelect1.addActionListener(listener1);
        theatreSelect2.addActionListener(listener1);
        theatreSelect3.addActionListener(listener1);
        theatreSelect4.addActionListener(listener1);
    }


    public ImageIcon scaleImage(ImageIcon icon, int w, int h)
    {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();
        if(icon.getIconWidth() > w)
        {
            nw = w;
            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }
        if(nh > h)
        {
            nh = h;
            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }
        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }


}
