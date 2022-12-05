package view;

import controller.SeatController;
import model.Seat;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class SeatSelect implements ActionListener {
    JPanel mainPanel;
    private JFrame frame = new JFrame("Seat Map");
    JLabel mainLabel;
    JLabel screen;
    private int rows = 6;
    private int columns = 8;
    private Icon res = UIManager.getIcon("OptionPane.errorIcon");
    static JButton confirm;
    JButton reset;
    JPanel gridLayout;
    ButtonGroup group;
    SeatController sc;
    AbstractButton abstractButtom;

    boolean confirmSeat;
    //list to keep track of buttons and different seat maps
    private  ArrayList<Seat> seatList;
    private ArrayList<JToggleButton> buttonArrayList;
    //current seat and temp seat
    private Seat currentSelected;
    private Seat seat = null;
    //which database seat set we should look at
    private  String seatChoice;


    public SeatSelect(String seatChoice) {
        //get data from required seat database
        this.seatChoice = seatChoice;
        currentSelected = new Seat(0,"0", " ");
        sc = new SeatController(seatChoice);

        //set size of array
        int size = (rows * columns) + 1;
        seatList = new ArrayList<Seat>(size);
        //create null map for index 0
        seatList.add(0, null);

        buttonArrayList = new ArrayList<JToggleButton>(size);
        buttonArrayList.add(0,null);
        //frame stuff for debugging
        this.frame.setSize(600, 600);
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout((LayoutManager)null);

        //create Screen label and add it to frame
        String title = "Screen";
        this.mainLabel = new JLabel(title, 0);
        this.mainLabel.setFont(new Font("Serif", 1, 20));
        this.mainLabel.setBounds(438, 15, 150, 30);
        this.mainPanel.add(this.mainLabel);


        //screen string label --> used for debuggin
        String screenstring = "Screen";
        this.screen = new JLabel(screenstring);
        this.screen.setBounds(265, 50, 150, 20);
        this.mainPanel.add(this.screen);

        //create grid layout for seat map
        gridLayout = new JPanel(new GridLayout(this.columns, this.rows));
        gridLayout.setBounds(188, 55, 650, 350);

        //Create Seat Map
        int charNum = 65;
        int idNumTemp = 1;
        for(int column = 0; column < this.columns; ++column) {
            for(int row = 0; row < this.rows; ++row) {
                //create string for button
                String addString = String.valueOf(row + 1);
                //create final int for button
                final int idNum = idNumTemp;
                //creating a button for each seat
                final JToggleButton button = new JToggleButton((char)charNum + addString);
                button.setSize(65, 10);
                //id of seat
                String id = String.valueOf(idNum);

                //create a seat class for each seat
                seat = new Seat(idNum,"1", (char)charNum + addString);
                seatList.add(idNum, seat);
                buttonArrayList.add(idNum,button);
                //check if seat is reserved --> look through database given
                String reserved = sc.reserveSeat(id);

                // if reserved seat won't be able to be selected
                if(reserved.equals("0")){
                    setButton(button);
                }
                //otherwise we create a button for the seat
                else{
                    //creating button listener
                    button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            abstractButtom = (AbstractButton)event.getSource();
                            boolean ifSelected = abstractButtom.getModel().isSelected();
                            //if button is pressed and we havent confirmed our selection
                            if (ifSelected && !SeatSelect.this.confirmSeat) {
                                //set button display
                                setButton(button);
                                //create a current selected seat for retrieving data
                                Seat tempSeat = seatList.get(idNum);
                                tempSeat.setSeatReserved("0");
                                currentSelected = tempSeat;
                                seatList.set(idNum, tempSeat);
                                clearButton(idNum);
                            }
                            //other wise button display is normal
                            else if (!SeatSelect.this.confirmSeat) {
                                notButton(button);
                            }

                        }
                    });}
                idNumTemp++;
                gridLayout.add(button);
            }
            ++charNum;
        }

        //main panle stuff for debuggin
        this.mainPanel.add(gridLayout);

        String confirmString = "Confirm Seats";


        //reset button used for resetting database --> used for debuggin
        String resetString = "Reset Test";
        this.reset = new JButton(resetString);
        this.reset.setBounds(428, 475, 150, 30);
        this.reset.addActionListener(this);
    }


// When reset is pressed we reset all seats of the current database
    public void actionPerformed(ActionEvent var1) {
        if (var1.getSource() == this.reset) {
            this.confirmSeat = false;
            for(int i = 1; i < seatList.size(); i++){
                sc.updateSeat(String.valueOf(i), "1");
            }
        }

    }

    //set seat to selected and update the button display
    public  void setButton(JToggleButton button){
        button.setIcon(SeatSelect.this.res);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
    }

    //Set current seat to selected once we confirm our selection
    public  void clearButton(int id){
        for(int i = 1; i < buttonArrayList.size();i++){
            if(i == id) continue;
            if(sc.reserveSeat(String.valueOf(i)).equals("0")) continue;

            Seat tempSeat = seatList.get(i);
            tempSeat.setSeatReserved("1");
            seatList.set(i, tempSeat);

            notButton(buttonArrayList.get(i));
            buttonArrayList.get(i).setSelected(false);
        }
    }

    //set not selected and update display
    public void notButton(JToggleButton button){
        button.setIcon((Icon)null);
        button.setBackground((Color)null);
        button.setBorderPainted(true);
        button.setFocusPainted(true);
        button.setContentAreaFilled(true);
    }

    //get price of current seat
    public String getPrice(){
        if(currentSelected.getSeatNumber() == 0) return " ";
        String temp = sc.ticketPrice(String.valueOf(currentSelected.getSeatNumber()));
        return  temp;
    }

    //get current selected seat
    public Seat getSeat(){
        return currentSelected;
    }

    //get seat list -> used for debuggin
    public String getSeatChoice() {
        return seatChoice;
    }

}

