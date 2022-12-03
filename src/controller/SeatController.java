package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SeatController {
    private DBController DB;

    public SeatController(){
        DB = DBController.getInstance();
    }


    public  void updateSeat(String id, String reserved){
        DB.execute("UPDATE seats SET reserved = ? WHERE id = ?", reserved, id);
    }

    public String reserveSeat(String id){
        //SQL query
        String query = "SELECT * FROM seats";
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

    public  String ticketPrice(String id){
        //SQL query
        String query = "SELECT * FROM seats";
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
