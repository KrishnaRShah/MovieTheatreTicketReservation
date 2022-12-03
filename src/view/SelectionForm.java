package view;

import controller.SearchMovieController;
import controller.ShowtimesController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class SelectionForm extends JFrame {
    private JPanel selectionPanel;
    private JTabbedPane earlyAnnouncementTab;
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
    private JPanel showtimePanel1;
    private JPanel showtimePanel2;
    private JRadioButton timeSelect1;
    private JRadioButton timeSelect2;
    private JLabel selectedLabel2;
    private JLabel timeLabel2;
    private JLabel dateLabel1;
    private JLabel timeLabel1;
    private JLabel selectedLabel;
    private JLabel dateLabel2;
    private JLabel finalSelectedMovie;
    private JLabel finalSelectedTheatre;
    private JLabel finalSelectedShowtime;
    private JLabel finalSelectedSeat;
    private JLabel theatreSelected1;
    private JLabel theatreSelected2;
    private JPanel earlyAnnouncementsPanel;

    private boolean isRegistered;
    private int choice;
    private int theatreChoice;
    private int showtimeChoice;

    private HashMap<Integer, String> idNameMap = new HashMap<>();
    private HashMap<Integer, String> theatreNameMap = new HashMap<>();

    public SelectionForm(boolean isRegisteredUser){

        isRegistered = isRegisteredUser;

        if (isRegistered){
            System.out.println("Registered User joined");
        } else {
            System.out.println("Unregistered User Joined");
        }

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

        ButtonGroup group3 = new ButtonGroup();
        group3.add(timeSelect1);
        group3.add(timeSelect2);

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

                    idNameMap.put(choice, "Black Panther");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
                }

                if (e.getSource().equals(dragonBallRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/dragonball.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 2;

                    idNameMap.put(choice, "Dragon Ball");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
                }

                if (e.getSource().equals(theDarkKnightRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/batman.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 3;

                    idNameMap.put(choice, "The Dark Knight");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
                }

                if (e.getSource().equals(interstellarRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/interstellar.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 4;

                    idNameMap.put(choice, "Interstellar");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
                }


                if (e.getSource().equals(jujutsuKaisenRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/jkaisen.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 5;

                    idNameMap.put(choice, "Jujutsu Kaisen");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
                }


                if (e.getSource().equals(womanIsKingRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/wking.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 6;

                    idNameMap.put(choice, "Women is King");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
                }


                if (e.getSource().equals(antManRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/antman.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 7;

                    idNameMap.put(choice, "Ant Man");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
                }


                if (e.getSource().equals(demonSlayerRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/demonslayer.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 8;

                    idNameMap.put(choice, "Demon Slayer");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
                }


                if (e.getSource().equals(tarzanRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/tarzan.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 9;

                    idNameMap.put(choice, "Tarzan");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
                }


                if (e.getSource().equals(tokyoDriftRadioButton)){
                    ImageIcon temp = new ImageIcon("MovieTheatreTicketReservation/src/view/images/tdrift.jpg");
                    ImageIcon icon = scaleImage(temp, 200, 300);
                    icon.getImage().flush();
                    moveImageLabel.setIcon(icon);
                    moveImageLabel.setVisible(true);
                    choice = 10;

                    idNameMap.put(choice, "Tokyo Drift");

                    setSummaryLengthInfo(choice);

                    setShowtimeInfo(choice);
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
                    theatreNameMap.put(theatreChoice, "Landmark Cinemas");

                    setTheatreInfo(theatreChoice);
                }
                if (e.getSource().equals(theatreSelect2)){
                    theatreChoice = 2;
                    theatreNameMap.put(theatreChoice, "Cineplex Cinemas");

                    setTheatreInfo(theatreChoice);
                }
                if (e.getSource().equals(theatreSelect3)){
                    theatreChoice = 3;
                    theatreNameMap.put(theatreChoice, "SilverCity Cinemas");

                    setTheatreInfo(theatreChoice);
                }
                if (e.getSource().equals(theatreSelect4)){
                    theatreChoice = 4;
                    theatreNameMap.put(theatreChoice, "Globe Cinemas");

                    setTheatreInfo(theatreChoice);
                }
            }
        };
        theatreSelect1.addActionListener(listener1);
        theatreSelect2.addActionListener(listener1);
        theatreSelect3.addActionListener(listener1);
        theatreSelect4.addActionListener(listener1);

        ActionListener listener2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(timeSelect1)){
                    showtimeChoice = 1;
                } else {
                    showtimeChoice = 2;
                }
            }
        };

        timeSelect1.addActionListener(listener2);
        timeSelect2.addActionListener(listener2);
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

    public void setSummaryLengthInfo(int choice){
        SearchMovieController smc = new SearchMovieController();
        String summary = smc.getSummary(choice);
        labelDescription.setText("Description: " + summary);

        String length = smc.getLength(choice);
        lengthLabel.setText("Length: " + length + " minutes");
    }

    public void setShowtimeInfo(int choice){
        ShowtimesController showtimeController = new ShowtimesController();
        String[] showtimeInfo = showtimeController.getShowtimeInfo(choice);

        String firstDate = showtimeInfo[0];
        String firstTime = showtimeInfo[1];
        String secondDate = showtimeInfo[2];
        String secondTime = showtimeInfo[3];

        timeLabel1.setText("Time: " + firstTime);
        timeLabel2.setText("Time: " + secondTime);
        dateLabel1.setText("Date: " + firstDate);
        dateLabel2.setText("Date: " + secondDate);

        selectedLabel.setText("Movie Selected: " + idNameMap.get(choice));
        selectedLabel2.setText("Movie Selected: " + idNameMap.get(choice));
    }

    public void setTheatreInfo(int choice){
        theatreSelected1.setText("Theatre: " + theatreNameMap.get(choice));
        theatreSelected2.setText("Theatre: " + theatreNameMap.get(choice));
    }
}
