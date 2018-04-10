
package cinema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

class Time{
    private  int id;
    private int movieId;
    private String movieDate;
    private String movieStart;
    private String movieEnd;
    private int hallId;
    public int getId() {
        return id;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public String getMovieStart() {
        return movieStart;
    }

    public String getMovieEnd() {
        return movieEnd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public void setMovieStart(String movieStart) {
        this.movieStart = movieStart;
    }

    public void setMovieEnd(String movieEnd) {
        this.movieEnd = movieEnd;
    }

    public int getHallId() {
        return hallId;
    }

    public void setHallId(int hallId) {
        this.hallId = hallId;
    }
    
public Time(){
}
public Time(int id,int movieId,String movieDate,String movieStart,String movieEnd,int hallId){
      Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Time");
            st.executeUpdate("insert into Time(movieid,moviedate,moviestart,movieend,hallid)"+
                                                "values("+movieId+",'"+movieDate+"','"+movieStart+"','"+movieEnd+"',"+hallId+")");
            System.out.println("added");
            con.close();
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
}

 public Vector allTime(){
             Connection con;
            Statement st;
            ResultSet rs;
            Vector<Time> allTime=null;
            try{
                 con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
                st=con.createStatement();
                rs=st.executeQuery("select * from Time");
                 allTime=new Vector<Time>();
                    Time t;
                while(rs.next()){
                    t=new Time();
                    t.movieId=rs.getInt("movieid");
                    t.hallId=rs.getInt("hallid");
                    t.id=rs.getInt("id");
                    t.movieDate=rs.getString("moviedate");
                    t.movieStart=rs.getString("moviestart");       
                    t.movieEnd=rs.getString("movieend");
                    allTime.add(t);
                }
                con.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return allTime;
            
        
        }

public void UpdateTime(int id,int movieId,String movieDate,String movieStart,String movieEnd,int hallId){
        Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Time");
                
                    st.executeUpdate("update Time set movieid="+movieId+",movieDate='"+movieDate+"',moviestart='"+movieStart+"',movieEnd='"
                            +movieEnd+"',hallid="+hallId+" where ID="+id);
                con.close();
                System.out.println("update");
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
    
}
void deleteTime(int id){
             Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from Time");
            st.executeUpdate("delete from Time where id="+id);
              System.out.println("delete ");
            con.close();
         
       }
       catch(Exception ex){ex.printStackTrace();}
    }




 public Vector timebById(String id){
             Connection con;
            Statement st;
            ResultSet rs;
            Vector<Time> allTime=null;
            try{
                 con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
                st=con.createStatement();
                rs=st.executeQuery("select * from Time");
                 allTime=new Vector<Time>();
                    Time t;
                while(rs.next()){
                    if(rs.getString("movieid").equalsIgnoreCase(id)){
                    t=new Time();
                    t.movieId=rs.getInt("movieid");
                    t.hallId=rs.getInt("hallid");
                    t.id=rs.getInt("id");
                    t.movieDate=rs.getString("moviedate");
                    t.movieStart=rs.getString("moviestart");       
                    t.movieEnd=rs.getString("movieend");
                    allTime.add(t);}
                }
                con.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return allTime;
            
        
        }
 
 boolean checkTime(int moviestart,int movieend,String moviedate,int hallid){
     Connection con;
            Statement st;
            ResultSet rs;
            boolean exist=true;
              try{
                 con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
                st=con.createStatement();
                rs=st.executeQuery("select * from Time");
                String ss = null,ff;
                int hh,bb;
                while(rs.next()){
                    if(rs.getString("hallid").equals(hallid+"")){
                    if(rs.getString("moviedate").substring(0, 10).equalsIgnoreCase(moviedate)){
                     ss=rs.getString("moviestart").substring(11, 13);
                     ff=rs.getString("movieend").substring(11, 13);
                     hh=Integer.parseInt(ss);
                     bb=Integer.parseInt(ff);
                        System.out.println(hh+"    "+bb);
                    if(moviestart>=hh && movieend<=bb)
                    { exist=false;break;}
                       
                    
                    }}
                     
                     /* hh=Double.parseDouble(ss);
                 bb=Double.parseDouble(ff);*/
                    //System.out.println(rs.getString("moviestart").substring(12,19));
                 /*if(ss.equalsIgnoreCase(timestart) || ff.equalsIgnoreCase(timeend));
                    return false;
*/                 
                /*timestart-timeend>=0 &&*/
                
              } return exist;}
              
              catch(Exception ex){ex.printStackTrace();}
              return exist;
}

}