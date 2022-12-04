package view;

import controller.RegUserInformationController;
import controller.SearchMovieController;
import controller.ShowtimesController;
import controller.TicketController;
import model.Seat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

public class SelectionForm extends JFrame {
    private JPanel selectionPanel;
    private JTabbedPane optionsTabbedPane;
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

    private JButton finalConfirmBtn;
    private JButton sendGenReceiptBtn;
    private JLabel paymentSuccessMessage;
    private JLabel finalFeeLabel;
    private JPanel earlyMoviesPane;
    private JPanel earlyMoviePanel1;
    private JPanel earlyMoviePanel2;
    private JLabel earlyMovie1Name;
    private JLabel earlyMovie1Desc;
    private JLabel earlyMovie1Length;
    private JLabel earlyMovie1Img;
    private JRadioButton earlyChoice1;
    private JLabel earlyMovie2Img;
    private JLabel earlyMovie2Name;
    private JLabel earlyMovie2Desc;
    private JLabel earlyMovie2Length;
    private JRadioButton earlyChoice2;
    private JPanel guestPaymentPanel;
    private JLabel payNameLabel;
    private JLabel payEmailLabel;
    private JLabel payCardLabel;
    private JLabel payCVVLabel;
    private JLabel payExpiryLabel;

    private JTextField tfName;
    private JTextField tfEmail;
    private JTextField tfCardnum;
    private JTextField tfCVV;
    private JTextField tfExpiryDate;

    private SeatSelect seatSelect;

    private boolean isRegistered;
    private boolean confirmPressed = false;
    private int choice = -1;
    private int theatreChoice = -1;
    private int showtimeChoice = -1;

    private int seatChoice = -1;
    private String priceChoice = "";

    private String firstDate;
    private String firstTime;
    private String secondDate;
    private String secondTime;

    private String fullname;
    private String email;
    private String cardnumber;
    private String CVV;
    private String expiryDate;

    private String regUserEmail;

    private int ticketNumber = 1;
    private String seatQuery = "seats";
    private HashMap<Integer, String> idNameMap = new HashMap<>();
    private HashMap<Integer, String> theatreNameMap = new HashMap<>();
    private HashMap<Integer, String> showtimeChoiceMap = new HashMap<>();

    private ArrayList<SeatSelect> listofSeatMaps;

    public SelectionForm(boolean isRegisteredUser, String RUEmail){

        isRegistered = isRegisteredUser;

        seatsGridPanel.setLayout(null);
        if (isRegistered){
            System.out.println("Registered User joined");
            regUserEmail = RUEmail;
            tfName.setVisible(false);
            tfEmail.setVisible(false);
            tfCardnum.setVisible(false);
            tfCVV.setVisible(false);
            tfExpiryDate.setVisible(false);

            getRegisteredUserInfo(regUserEmail);
            email = RUEmail;

        } else {
            System.out.println("Unregistered User Joined");
            optionsTabbedPane.remove(0);
        }

        setContentPane(selectionPanel);
        setSize(1050, 600);
        setResizable(false);
        setTitle("Book A Ticket");
        seatsGridPanel.setLayout(null);

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

        //EARLY MOVIES
        ImageIcon early1 = new ImageIcon("MovieTheatreTicketReservation/src/view/images/legomovie.jpg");
        ImageIcon early1icon = scaleImage(early1, 200, 300);
        early1icon.getImage().flush();
        earlyMovie1Img.setIcon(early1icon);
        earlyMovie1Img.setVisible(true);

        ImageIcon early2 = new ImageIcon("MovieTheatreTicketReservation/src/view/images/wows.jpg");
        ImageIcon early2icon = scaleImage(early2, 200, 300);
        early2icon.getImage().flush();
        earlyMovie2Img.setIcon(early2icon);
        earlyMovie2Img.setVisible(true);

        earlyMovie1Name.setText("Movie: The Lego Movie 2");
        earlyMovie1Desc.setText("Description: " + smc.getSummary(11));
        earlyMovie1Length.setText("Length: " + smc.getLength(11) + " minutes");

        earlyMovie2Name.setText("Movie: Wolf Of Wall Street");
        earlyMovie2Desc.setText("Description: " + smc.getSummary(12));
        earlyMovie2Length.setText("Length: " + smc.getLength(12) + " minutes");
        //END EARLY MOVIES

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

        ButtonGroup earlyGroup = new ButtonGroup();
        earlyGroup.add(earlyChoice1);
        earlyGroup.add(earlyChoice2);

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

                    setPaymentInfo();
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

                    setPaymentInfo();
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

                    setPaymentInfo();
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

                    setPaymentInfo();
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

                    setPaymentInfo();
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

                    setPaymentInfo();
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

                    setPaymentInfo();
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

                    setPaymentInfo();
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

                    setPaymentInfo();
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

                    setPaymentInfo();
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
                    setPaymentInfo();
                    updateSeatMap();
                }
                if (e.getSource().equals(theatreSelect2)){
                    theatreChoice = 2;
                    theatreNameMap.put(theatreChoice, "Cineplex Cinemas");

                    setTheatreInfo(theatreChoice);
                    setPaymentInfo();
                    updateSeatMap();
                }
                if (e.getSource().equals(theatreSelect3)){
                    theatreChoice = 3;
                    theatreNameMap.put(theatreChoice, "SilverCity Cinemas");

                    setTheatreInfo(theatreChoice);
                    setPaymentInfo();
                    updateSeatMap();
                }
                if (e.getSource().equals(theatreSelect4)){
                    theatreChoice = 4;
                    theatreNameMap.put(theatreChoice, "Globe Cinemas");

                    setTheatreInfo(theatreChoice);
                    setPaymentInfo();
                    updateSeatMap();
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
                    showtimeChoiceMap.put(showtimeChoice, firstDate + " " + firstTime);
                    setPaymentInfo();
                } else {
                    showtimeChoice = 2;
                    showtimeChoiceMap.put(showtimeChoice, secondDate + " " + secondTime);
                    setPaymentInfo();
                }
            }
        };

        timeSelect1.addActionListener(listener2);
        timeSelect2.addActionListener(listener2);

        listofSeatMaps = new ArrayList<SeatSelect>(5);
        for(int i = 0; i < 5; i++){
            if(i > 0){
                seatQuery = "seats" + i;
            }
//            final SeatSelect seatTemp = new SeatSelect(seatQuery);
            listofSeatMaps.add(i, new SeatSelect(seatQuery));
        }

        //create intial layout
        updateSeatMap();
        seatsGridPanel.add(seatSelect.mainLabel);
        seatsGridPanel.add(seatSelect.gridLayout);
        seatsGridPanel.add(seatSelect.reset);


        ActionListener listener3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource().equals(finalConfirmBtn)){


                    if (!isRegistered){
                        fullname = tfName.getText();
                        email = tfEmail.getText();
                        cardnumber = tfCardnum.getText();
                        CVV = tfCVV.getText();
                        expiryDate = tfExpiryDate.getText();
                    }

                    if (fullname.equals("") || email.equals("") || cardnumber.equals("") || CVV.equals("") || expiryDate.equals("")
                    || cardnumber.length() != 16 || CVV.length() != 3 || !expiryDate.contains("/") || choice == -1
                            || theatreChoice == -1 || showtimeChoice == -1 || seatChoice == -1 || priceChoice.equals("")){
                        paymentSuccessMessage.setText("One or more fields are missing or invalid!");
                        confirmPressed = false;
                    } else {
                        confirmPressed = true;
                        paymentSuccessMessage.setText(" ");
                        seatSelect.sc.updateSeat(String.valueOf(seatChoice), "0");
                        seatSelect.confirmSeat = true;

                        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                        LocalDateTime today = LocalDateTime.now();
                        String dateOfPurchase = today.format(dtf).toString().substring(0, 10);

                        System.out.println("Date of Purchase : " + dateOfPurchase);

                        TicketController tc = new TicketController();
                        tc.addTicketDB(email, seatChoice, dateOfPurchase, theatreChoice, priceChoice);

                        JOptionPane.showMessageDialog(null, "Payment and Ticket Processed Successfully! Enjoy your movie!");

//                        System.out.println(ticketNumber);
//                        ticketNumber++;
                        //ADD EMAIL SENDING LOGIC HERE / UPDATE ANY DBS ETC.
                    }
                }

                if (e.getSource().equals(sendGenReceiptBtn)){

                    if (!confirmPressed){
                        paymentSuccessMessage.setText("Please confirm a booking!");
                    } else {
                        //ADD RECEIPT AND PRINTING LOGIC
                        paymentSuccessMessage.setText("Printing ticket and sending email!");
                    }
                }
            }
        };
        finalConfirmBtn.addActionListener(listener3);
        sendGenReceiptBtn.addActionListener(listener3);

        //EARLY CHOICE ACTION LISTENER
        ActionListener listener4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource().equals(earlyChoice1)){
                    choice = 11;
                    idNameMap.put(choice, "The Lego Movie 2");
                    setShowtimeInfo(choice);
                    setPaymentInfo();
                }

                if (e.getSource().equals(earlyChoice2)){
                    choice = 12;
                    idNameMap.put(choice, "Wolf Of Wall Street");
                    setShowtimeInfo(choice);
                    setPaymentInfo();
                }
            }
        };
        earlyChoice1.addActionListener(listener4);
        earlyChoice2.addActionListener(listener4);
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

        firstDate = showtimeInfo[0];
        firstTime = showtimeInfo[1];
        secondDate = showtimeInfo[2];
        secondTime = showtimeInfo[3];

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

    public void setPaymentInfo(){
        finalSelectedMovie.setText("Movie: " + idNameMap.get(choice));
        finalSelectedTheatre.setText("Theatre: " + theatreNameMap.get(theatreChoice));
        finalSelectedShowtime.setText("Showtime: " + showtimeChoiceMap.get(showtimeChoice));
        finalSelectedSeat.setText("Seat: " + seatSelect.getSeat().getSeatId());
        finalFeeLabel.setText("Price: " + seatSelect.getPrice());
    }

    public void getRegisteredUserInfo(String email){
        RegUserInformationController regUserInfoControl = new RegUserInformationController();
        String[] userInfo = regUserInfoControl.getInfoByEmail(email);

        payNameLabel.setText("Name: " + userInfo[0]);
        payEmailLabel.setText("Email: " + email);
        payCardLabel.setText("Card Number: " + userInfo[1]);
        payCVVLabel.setText("CVV: " + userInfo[2]);
        payExpiryLabel.setText("Expiry Date: " + userInfo[3]);

        fullname = userInfo[0];
        cardnumber = userInfo[1];
        CVV = userInfo[2];
        expiryDate = userInfo[3];

    }

    public void updateSeatMap(){
            if(theatreChoice == -1){
                seatSelect = listofSeatMaps.get(0);
            }else {
                seatSelect = listofSeatMaps.get(theatreChoice);
            }
            seatsGridPanel.removeAll();
            seatsGridPanel.add(seatSelect.mainLabel);
            seatsGridPanel.add(seatSelect.gridLayout);
            seatsGridPanel.add(seatSelect.reset);
        String confirmString = "Set Seat";
        SeatSelect.confirm = new JButton(confirmString);
        SeatSelect.confirm.setBounds(443, 420, 150, 30);

        SeatSelect.confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource().equals(SeatSelect.confirm)) {
//                    seatSelect = listofSeatMaps.get(theatreChoice);
                    System.out.println(seatSelect.getSeat().getSeatId());
                    priceChoice = seatSelect.getPrice();
                    seatChoice = seatSelect.getSeat().getSeatNumber();
                    setPaymentInfo();
                    System.out.println("LOL");
                    System.out.println(theatreChoice);
                }
            }
        });
        seatsGridPanel.add(SeatSelect.confirm);
    }
}
