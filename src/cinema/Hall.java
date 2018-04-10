/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

public class Hall {
    //data field hall.............
    private int id;
  //  private int seats;
    private boolean status;
    
    //delet hall.............
    public void deletHall(String id){
       Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Hall");
            st.executeUpdate("delete from Hall where id="+id);
            con.close();
            System.out.println("delet from hall");
       }
       catch(Exception ex){ex.printStackTrace();}
    }

    public int getId() {
        return id;
    }

 /*   public int getSeats() {
        return seats;
    }*/

    public boolean isStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

  /*  public void setSeats(int seats) {
        this.seats = seats;
    }*/

    public void setStatus(boolean status) {
        this.status = status;
    }
public void addHall(String id){
      Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Hall");
            boolean exist =false;
            while(rs.next()){
                if(id.equals(rs.getInt("ID"))){
                    con.close();
                    System.out.println("hall id exist");
                    exist=true;
                    break;
                }}
                if(exist==false){
                    st.executeUpdate("insert into Hall(ID)"+
                                                    "values ("+id+")");
                    con.close();
                    System.out.println("Added sucssees");
                }
       }
       catch(Exception ex){ex.printStackTrace();}
}   
public void updateHall(String oldid,String newid){
       Connection con;
       Statement st;
       ResultSet rs;
       try{
           con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Hall");
            st.executeUpdate("update Hall set ID="+newid+" where ID="+oldid);
            con.close();
            
       }
       catch(Exception ex){ex.printStackTrace();}
}

/*public void updateSeats(int seats,int id){
    Connection con;
       Statement st;
       ResultSet rs;
       try{
           con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Hall");
            st.executeUpdate("update Hall set seats ="+seats
                                            + " where ID ="+id);
            con.close();
            System.out.println("seats update");
       }
       catch(Exception ex){ex.printStackTrace();}
}*/


public Vector allHall(){
      Connection con;
            Statement st;
            ResultSet rs;
            Vector<Hall> allhalls=null;
            try{
                 con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
                st=con.createStatement();
                rs=st.executeQuery("select * from hall");
                 allhalls=new Vector<Hall>();
                 Hall h;
                 while(rs.next()){
                     h=new Hall();
                     h.id=rs.getInt("id");
                     h.status=rs.getBoolean("status");
                     allhalls.add(h);
                 }
            con.close();
            }
            catch(Exception ex){ex.printStackTrace();}

            return allhalls;
}

}
