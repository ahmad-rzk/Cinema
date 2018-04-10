
package cinema;

/**
 *
 * @author SuPeR_FaNtASy
 */
public class Admin {
   
    //data field admin..............
    private final String fname="Ahmad";
    private final String lname="Nemer";
    private final String username="ahmad_nemer";
    private final String pass="1434382";
    
//load main admin................
    public void loadAdmin(String username,String pass){
        if(username.equalsIgnoreCase(this.username)&&pass.equals(this.pass)){
            System.out.println("true");
        }else
            System.out.println("false");
    }
}
