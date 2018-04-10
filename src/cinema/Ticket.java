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
import java.util.Date;
import java.util.Vector;

public class Ticket {
    private int id;
    private int timeId;
    private int movieId;
    private int hallId;
    private String username;

    public int getId() {
        return id;
    }

    public int getTimeId() {
        return timeId;
    }

    public int getMovieId() {
        return movieId;
    }

    public int getHallId() {
        return hallId;
    }

    public String getUsername() {
        return username;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }

    public void setUsername(String username) {
        this.username = username;
    }
  
    public Ticket(){
       // ticketchange();
    }
    public Ticket(int id,int timeId,int movieId,int hallId,String username){
      //  ticketchange();
        Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Ticket");
            st.executeUpdate("insert into Ticket(ID,timeid,movieid,hallid,username)"+
                                                "values("+id+","+timeId+","+movieId+","+hallId+",'"+username+"')");
            
            con.close();
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
    }

    public Vector allTicket(){
        Connection con;
        Statement st;
        ResultSet rs;
        Vector<Ticket>allTicket=null;
        try{
            con=DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from ticket");
            allTicket=new Vector<Ticket>();
            Ticket t;
            while(rs.next()){
                t=new Ticket();
                t.hallId=rs.getInt("hallid");
                t.id=rs.getInt("id");
                t.movieId=rs.getInt("movieId");
                t.timeId=rs.getInt("timeId");
                t.username=rs.getString("username");
                allTicket.add(t);
            }
        con.close();
        }
        catch(Exception ex){ex.printStackTrace();}
        return allTicket;
    }
public void updateTicket(int id,int timeId,int movieId,int hallId,String username){
       Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Ticket");
                
                    st.executeUpdate("update ticket set movieid="+movieId+",timeid="+timeId+"',hallid="+hallId+",username='"
                            +username+"' where id="+id);
                con.close();
                System.out.println("update");
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
}
public void deleteTicket(String id,String Timeid){
             Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Ticket");
            st.executeUpdate("delete from Ticket where id="+id+" and timeid="+Timeid);
              
            con.close();
         
       }
       catch(Exception ex){ex.printStackTrace();}
    }
public Vector ticketbyuser(String u){
        Connection con;
        Statement st;
        ResultSet rs;
        Vector<Ticket>Ticket=null;
        try{
            con=DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from ticket");
            Ticket=new Vector<Ticket>();
            Ticket t;
            while(rs.next()){
                if(u.equalsIgnoreCase(rs.getString("username"))){
                t=new Ticket();
                t.hallId=rs.getInt("hallid");
                t.id=rs.getInt("id");
                t.movieId=rs.getInt("movieId");
                t.timeId=rs.getInt("timeId");
                t.username=rs.getString("username");
                Ticket.add(t);}
            }
        con.close();
        }
        catch(Exception ex){ex.printStackTrace();}
        return Ticket;
    }




public Vector ticketbymovie(String m,String ti){
        Connection con;
        Statement st;
        ResultSet rs;
        Vector<Ticket>Ticket=null;
        try{
            con=DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from ticket");
            Ticket=new Vector<Ticket>();
            Ticket t;
            while(rs.next()){
                if(m.equalsIgnoreCase(rs.getString("movieid"))&&ti.equalsIgnoreCase(rs.getString("timeid"))){
                t=new Ticket();
                t.hallId=rs.getInt("hallid");
                t.id=rs.getInt("id");
                t.movieId=rs.getInt("movieId");
                t.timeId=rs.getInt("timeId");
                t.username=rs.getString("username");
                Ticket.add(t);}
            }
        con.close();
        }
        catch(Exception ex){ex.printStackTrace();}
        return Ticket;
    }
 /*final void ticketchange(){
 Connection con;
        Statement st;
        ResultSet rs;
        Date dd=new Date();
 try{
            con=DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from ticket");
           
           
            while(rs.next()){
                System.out.println(rs.getString("timebooked"));
                System.out.println(rs.getString("timebooked").substring(11, 13));
                  System.out.println(rs.getString("timebooked").substring(14, 16));
                if(Integer.parseInt(rs.getString("timebooked").substring(11, 13))<=(2+dd.getHours())){
                if(Integer.parseInt(rs.getString("timebooked").substring(14, 16))<=(dd.getMinutes()))
                deleteTicket(rs.getString("id"));
                }
                
                
            }
        con.close();
        }
        catch(Exception ex){ex.printStackTrace();}
 
 }*/
 
 
 public Vector seats(String id){
      Connection con;
            Statement st;
            ResultSet rs;
             Vector<Ticket> seats = null;
            try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from ticket");
            seats=new Vector<Ticket>();
            Ticket s;
            while(rs.next()){
                if(id.equalsIgnoreCase(rs.getInt("timeid")+"")){
                      s=new Ticket();
                      s.id=rs.getInt("id");
                      s.hallId=rs.getInt("hallid");
                      s.movieId=rs.getInt("movieid");
                      s.timeId=rs.getInt("timeid");
                      s.username=rs.getString("username");
                      seats.add(s);
                      
                }
            }
            con.close();
            }
            catch(Exception ex){ex.printStackTrace();}
            
            return seats;
        }
public boolean checkTicket(String username,int timeid){
          Connection con;
            Statement st;
            ResultSet rs;
            try{
                con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
                st=con.createStatement();
                rs=st.executeQuery("select * from Ticket");
                int b=0;
                while(rs.next()){
                        if(rs.getString("username").equalsIgnoreCase(username)&&rs.getInt("timeid")==timeid){
                            b+=1;
                        }
                          if(b>=2){
                              return false;
                          }}
            }
            catch(Exception ex){ex.printStackTrace();}
            return true;
}

 
int count(int hallid){
          Connection con;
            Statement st;
            ResultSet rs;
            int b=0;
try{


             con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
                st=con.createStatement();
                rs=st.executeQuery("select * from Ticket");
                
   while(rs.next()){
   if(rs.getInt("hallid")==hallid){b++;}
   }
con.close();
}catch(Exception e){
e.printStackTrace();
}
return 105-b;

} 
 
 
 
}