package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SeatController {
    private DBController DB;
    private String seatQuery;

    public SeatController(String seatChoice){

        DB = DBController.getInstance();
        seatQuery = seatChoice;
    }


    public void updateSeat(String id, String reserved){
        String query = "UPDATE " + seatQuery + " SET reserved = ? WHERE id = ?";
        DB.execute(query, reserved, id);
    }

    public String reserveSeat(String id){
        //SQL query
//        String query = "SELECT * FROM seats";
        String query = "SELECT * FROM " + seatQuery;
        ResultSet results = DB.query(query);
        String resVerified = " ";
        try {
            while (results.next()){
                String resId = results.getString("id");
                resVerified = results.getString("reserved");

                if (id.equals(resId)){
                    break;
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return resVerified;
    }

    public String ticketPrice(String id){
        //SQL query
        String query = "SELECT * FROM " + seatQuery;
        ResultSet results = DB.query(query);
        String resPrice = " ";
        try {
            while (results.next()){
                String resId = results.getString("id");
                resPrice = results.getString("price");

                if (id.equals(resId)){
                    break;
                }
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        return resPrice;
    }


}
