
package cinema;

//library..........
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.Statement;
import javax.swing.JOptionPane;
//User class.................
    public class User {
//data field user ....................
       private String fname="";
       private String lname="";
       private String username="";
       private String pass="";
       private String phonenumber="";
    boolean exist;
//Load user...................
    public void loadUser(String username,String pass){
       Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from user");
            exist=false;
            
                    while(rs.next()){
                        if(username.equalsIgnoreCase(rs.getString("username")) && pass.equals(rs.getString("pass"))){
                            fname=rs.getString("fname");
                            lname=rs.getString("lname");
                            this.username=rs.getString("username");
                            this.pass=rs.getString("pass");
                            phonenumber=rs.getNString("phonenumber");
                            con.close();
                           
                            exist=true;
                            break;}}
                    if(exist==false){//new Box("wrong username or password");
                    con.close();}
                
       }
       catch(Exception ex){
       ex.printStackTrace();}
       }
   
    //create user......................
    public void createUser(String fname,String lname,String username,String pass,String phonenumber){
       Connection con;
       Statement st;
       ResultSet rs;
       try{
           con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
           st=con.createStatement();
           rs=st.executeQuery("select * from user");
           exist=false;
           
               while(rs.next()){
                   if(username.equalsIgnoreCase(rs.getString("username"))){
                       con.close();
                       System.out.println("username is database");
                       exist=true;
                       break;}}
               if(exist==false){
                   st.executeUpdate("insert into user( username,pass,fname,lname,phonenumber) "
                    + "values ('"+username+"','"+pass+"','"+fname+"','"+lname+"','"+phonenumber+"')");
                   con.close();
                   System.out.println("data added");
               }
       
       }
       catch(Exception ex)
       {ex.printStackTrace();}
    } 
    
//set and get datafield..................................
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
    
    //change password user..................
    public void changePass(String newpass){
       Connection con;
       Statement st;
       ResultSet rs;
       try{
        con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
        st=con.createStatement();
        rs=st.executeQuery("select * from user");
        boolean exist=false;       
            while(rs.next()){
                if(pass.equalsIgnoreCase(rs.getString("pass"))){
                    st.executeUpdate("update user set pass='"+newpass+"'"+"where username='"+this.username+"'");
                    System.out.println("succses change password");
                   con.close();
                    exist=true;
                    break;
                }
            }
            if(exist==false){System.out.println("not correct old password");con.close();}
        
       }
    catch(Exception ex){ex.printStackTrace();}
    }
    
    //change info user............................
    public void changeInfo(String fname,String lname,String username,String pass,String phonenumber){
       Connection con;
       Statement st;
       ResultSet rs;
       try{
         con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
         st=con.createStatement();
         rs=st.executeQuery("select * from user");
         if(fname!=null&&lname!=null&&username!=null&&pass!=null&&phonenumber!=null){
             st.executeUpdate("update user set fname='"+fname+"',lname='"+lname+"',username='"+username+"',pass='"+pass+"',phonenumber='"+phonenumber+"'"
                     +"where username='"+this.username+"'");
             con.close();
             System.out.println("sucssees change info");
         }else {System.out.println("field empty");con.close();}
       }
       catch(Exception ex){ex.printStackTrace();}
    }
         public void deletUser(String username){
           Connection con;
       Statement st;
       ResultSet rs;
       try{
            con = DriverManager.getConnection("jdbc:ucanaccess://cenima.accdb");
            st=con.createStatement();
            rs=st.executeQuery("select * from user");
            st.executeUpdate("delete from user where username='"+username+"'");
              System.out.println("delete ");
            con.close();
         
       }
       catch(Exception ex){ex.printStackTrace();}
    }   
            }
