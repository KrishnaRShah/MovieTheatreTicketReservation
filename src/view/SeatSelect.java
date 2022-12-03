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
    JButton confirm;
    JButton reset;


    boolean confirmSeat;
    //list to keep track of button
    private  ArrayList<Seat> seatList;
    private ArrayList<JToggleButton> buttonArrayList;


    JPanel gridLayout;
    ButtonGroup group;
    //create list of lists to keep track of [ID,RESEREVED,PRICE?]

    AbstractButton abstractButtom;
    Seat currentSelected;
    SeatController sc;
    private Seat seat = null;

    public SeatSelect( ) {

        currentSelected = new Seat(0,"0", " ");
        sc = new SeatController();
        int size = (rows * columns) + 1;


        seatList = new ArrayList<Seat>(size);
        seatList.add(0, null);

        buttonArrayList = new ArrayList<JToggleButton>(size);
        buttonArrayList.add(0,null);
        //frame stuff
        this.frame.setSize(600, 600);
        this.mainPanel = new JPanel();
        this.mainPanel.setLayout((LayoutManager)null);


        String title = "Screen";
        this.mainLabel = new JLabel(title, 0);
        this.mainLabel.setFont(new Font("Serif", 1, 20));
        this.mainLabel.setBounds(438, 15, 150, 30);
        this.mainPanel.add(this.mainLabel);


        String screenstring = "Screen";
        this.screen = new JLabel(screenstring);
        this.screen.setBounds(265, 50, 150, 20);
        this.mainPanel.add(this.screen);


        gridLayout = new JPanel(new GridLayout(this.columns, this.rows));
        gridLayout.setBounds(188, 55, 650, 350);
        int charNum = 65;

        //create list
        group = new ButtonGroup();

        int idNumTemp = 1;
        for(int column = 0; column < this.columns; ++column) {
            for(int row = 0; row < this.rows; ++row) {
                //get string
                String addString = String.valueOf(row + 1);
                final int idNum = idNumTemp;
                //creating a button for each seat
                final JToggleButton button = new JToggleButton((char)charNum + addString);
                button.setSize(65, 10);
                //id of seat
                String id = String.valueOf(idNum);

                seat = new Seat(idNum,"1", (char)charNum + addString);
                seatList.add(idNum, seat);
                buttonArrayList.add(idNum,button);
                //check if seat is reserved
                String reserved = sc.reserveSeat(id);

                // if reserved seat wont be able to be selected
                if(reserved.equals("0")){
                    setButton(button);
                }
                //other wise we create a button for the seat
                else{
                    //button action listner
                    button.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent event) {
                            abstractButtom = (AbstractButton)event.getSource();
                            boolean ifSelected = abstractButtom.getModel().isSelected();
                            if (ifSelected && !SeatSelect.this.confirmSeat) {
                                setButton(button);

                                Seat tempSeat = seatList.get(idNum);
                                tempSeat.setSeatReserved("0");
                                currentSelected = tempSeat;
                                seatList.set(idNum, tempSeat);
                                clearButton(idNum);
                                System.out.println("INDEX " + idNum);
                                System.out.println(seatList.get(idNum).isReserved());
                            } else if (!SeatSelect.this.confirmSeat) {
                                notButton(button);
                            }

                        }
                    });}
                idNumTemp++;
                gridLayout.add(button);
            }

            ++charNum;
        }


        this.mainPanel.add(gridLayout);

        String confirmString = "Confirm Seats";
//        this.confirm = new JButton(confirmString);
//        this.confirm.setBounds(443, 420, 150, 30);
//        this.confirm.addActionListener(this);
//        this.mainPanel.add(this.confirm);

        String resetString = "Reset Test";
        this.reset = new JButton(resetString);
        this.reset.setBounds(428, 475, 150, 30);
        this.reset.addActionListener(this);


//        this.mainPanel.add(this.reset);
//        System.out.println("I HATE THIS FAY FHIS");
//        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        this.frame.add(this.mainPanel);
//        this.frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent var1) {
//        if (var1.getSource() == this.confirm) {
//            this.confirmSeat = true;
//            System.out.println(currentSelected.getSeatNumber());
//            for(int i = 1; i < seatList.size(); i++){
//                if(seatList.get(i).isReserved().equals("0")){
//                    sc.updateSeat(String.valueOf(i), "0");
//                }
//            }
//        }

        if (var1.getSource() == this.reset) {
            this.confirmSeat = false;
            for(int i = 1; i < seatList.size(); i++){
                sc.updateSeat(String.valueOf(i), "1");
            }
        }

    }
    //set seat to selected
    public  void setButton(JToggleButton button){
        button.setIcon(SeatSelect.this.res);
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
    }

    public  void clearButton(int id){
        for(int i = 1; i < buttonArrayList.size();i++){
            if(i == id) continue;
            if(sc.reserveSeat(String.valueOf(i)).equals("0")) continue;

            Seat tempSeat = seatList.get(i);
            tempSeat.setSeatReserved("1");
            seatList.set(i, tempSeat);

            //reset button
            notButton(buttonArrayList.get(i));
            buttonArrayList.get(i).setSelected(false);

        }
    }
    //set not selected
    public void notButton(JToggleButton button){
        button.setIcon((Icon)null);
        button.setBackground((Color)null);
        button.setBorderPainted(true);
        button.setFocusPainted(true);
        button.setContentAreaFilled(true);
    }

    public String getPrice(){
        if(currentSelected.getSeatNumber() == 0) return " ";
        String temp = sc.ticketPrice(String.valueOf(currentSelected.getSeatNumber()));
        return  temp;
    }
    public JPanel getMainPanel(){
        return mainPanel;
    }

    public Seat getSeat(){
        return currentSelected;
    }

//    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SeatSelect();
//            }
//        });
//    }
}

