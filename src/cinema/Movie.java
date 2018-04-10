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
import java.util.ArrayList;
import java.util.Vector;


public class Movie {
    
    private int id;
    private String title;
    private String director;
    private int pro_year;
    private int price;
    private String cover;

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
    
    
     public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public int getPro_year() {
            return pro_year;
        }

        public void setPro_year(int pro_year) {
            this.pro_year = pro_year;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
        
        public Movie(){
        }
        public Movie(int id,String title,String director ,int price,int pro_year,String cover ){
        //add movie to the database
       Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from movie");
            st.executeUpdate("insert into movie(title,director,price,pro_year,cover)"+
                                                "values('"+title+"','"+director+"',"+price+","+pro_year+",'"+cover+"')");
            System.out.println("added");
            con.close();
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
        
        }
        public Vector allmovies(){
             Connection con;
            Statement st;
            ResultSet rs;
            Vector<Movie> allmovies=null;
            try{
                 con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
                st=con.createStatement();
                rs=st.executeQuery("select * from movie");
                 allmovies=new Vector<Movie>();
                 Movie r;
                while(rs.next()){
                     r=new Movie();
                    r.director=rs.getString("director");
                    r.title=rs.getString("title");
                    r.id=rs.getInt("id");
                    r.price=rs.getInt("price");
                    r.pro_year=rs.getInt("pro_year");
                    r.cover=rs.getString("cover");
                    allmovies.add(r);
                }
                con.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return allmovies;
            
        
        }
        public Vector movies(String Title){
            Connection con;
            Statement st;
            ResultSet rs;
             Vector<Movie> movies = null;
            try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from movie");
            movies=new Vector<Movie>();Movie r;
            while(rs.next()){
                if(Title.equalsIgnoreCase(rs.getString("title"))){
                      r=new Movie();
                    r.director=rs.getString("director");
                    r.title=Title;
                    r.id=rs.getInt("id");
                    r.price=rs.getInt("price");
                    r.pro_year=rs.getInt("pro_year");
                    r.cover=rs.getString("cover");
                    movies.add(r);
                   
                }
            }
            con.close();
            }
            catch(Exception ex){ex.printStackTrace();}
            
            return movies;
        }
    void updatemovie(int id,String title,String director ,int price,int pro_year,String cover ){
        Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from movie");
                
                    st.executeUpdate("update movie set title='"+title+"',director='"+director+"',price="+price+",pro_year="
                            +pro_year+", cover='"+cover+"' where ID="+id+"");
                con.close();
                System.out.println("update");
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
    
    }
   void deletemovie(int id){
             Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from movie");
            st.executeUpdate("delete from movie where id="+id);
              System.out.println("delete ");
            con.close();
         
       }
       catch(Exception ex){ex.printStackTrace();}
    }










public Movie LoadMovie(int id){
    Connection con;
            Statement st;
            ResultSet rs;
             Movie movie = null;
            try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from movie");
            movie=new Movie();
            while(rs.next()){
                if(id==rs.getInt("ID")){
                      
                    movie.director=rs.getString("director");
                    movie.title=rs.getString("title");
                    movie.id=rs.getInt("id");
                    movie.price=rs.getInt("price");
                    movie.pro_year=rs.getInt("pro_year");
                    movie.cover=rs.getString("cover");
                   
                   
                }
            }
            con.close();
            }
            catch(Exception ex){ex.printStackTrace();}
            
            return movie;
}




public Vector dateMovie(String movieDate){
            Connection con;
            Statement st;
            ResultSet rs;
            Vector<Movie> datemovie=null;
         Vector<Integer> t=null;
            try{
                 con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
                st=con.createStatement();
                rs=st.executeQuery("select * from Time ");
                 datemovie=new Vector<Movie>(); 
                 t = new Vector<Integer>();
                    Time dm;int id;   
                  
                    
                while(rs.next()){
                    String rr=rs.getString("moviedate");
                    if(rr.substring(0, 10).equalsIgnoreCase(movieDate)){
                        if(t.contains(rs.getInt("movieid"))){}
                  else  t.add(rs.getInt("movieid"));
                   
                    
                    }} 
                
                con.close();
                con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
                st=con.createStatement();
                rs=st.executeQuery("select * from Movie ");Movie mov,nov;
                for(int i=0;rs.next();i++){
                nov=new Movie();
               mov= nov.LoadMovie(t.get(i));
                datemovie.add(mov);
                }
        
                con.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
            return datemovie;}}





















