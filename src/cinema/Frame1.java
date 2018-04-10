/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author SuPeR_FaNtASy
 */
public class  Frame1 extends javax.swing.JFrame {
   
    static void see(){
    login.setVisible(true);
        pass.setVisible(true);
        signup.setVisible(true);
        profilelogo.setVisible(true);
      id1.setVisible(true);
    }
    
   User user;
Userp p=new Userp();

Moviepanel mp;
    Signup signuppanel;
    
    
    
    public Frame1() {
        
      mp=new Moviepanel();
     
      add(mp);
      mp.setBounds(0,27,775,710);
      mp.setVisible(false);
          add(p);
  p.setBounds(775,27,465,710);
      
      signuppanel=new Signup();
      signuppanel.setBounds(0, 25, 437, 700);
        this.add(signuppanel);
        signuppanel.setVisible(false);
        initComponents();
      
        this.setTitle("Cinema");
        this.setSize(437, 700);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
       
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        minm = new javax.swing.JLabel();
        titlebar = new javax.swing.JLabel();
        profilelogo = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        id1 = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        login = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/close.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(410, 0, 34, 30);

        minm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/min.png"))); // NOI18N
        minm.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        minm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minmMouseClicked(evt);
            }
        });
        getContentPane().add(minm);
        minm.setBounds(380, 0, 30, 30);

        titlebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/title.png"))); // NOI18N
        titlebar.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        titlebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titlebarMouseDragged(evt);
            }
        });
        titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlebarMousePressed(evt);
            }
        });
        getContentPane().add(titlebar);
        titlebar.setBounds(-20, 0, 1450, 30);

        profilelogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/profile.png"))); // NOI18N
        getContentPane().add(profilelogo);
        profilelogo.setBounds(90, 90, 260, 230);

        pass.setBackground(new java.awt.Color(0, 0, 0));
        pass.setFont(new java.awt.Font("Gill Sans MT", 1, 48)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 0, 51));
        pass.setToolTipText("password goes here");
        pass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 26), new java.awt.Color(255, 255, 255))); // NOI18N
        pass.setOpaque(false);
        getContentPane().add(pass);
        pass.setBounds(60, 460, 320, 70);

        id1.setBackground(new java.awt.Color(0, 0, 0));
        id1.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        id1.setForeground(new java.awt.Color(255, 0, 0));
        id1.setToolTipText("insert your id");
        id1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        id1.setOpaque(false);
        getContentPane().add(id1);
        id1.setBounds(60, 360, 320, 80);

        signup.setBackground(new java.awt.Color(102, 102, 102));
        signup.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Sign up");
        signup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup);
        signup.setBounds(230, 580, 150, 40);

        login.setBackground(new java.awt.Color(102, 102, 102));
        login.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Log in");
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(60, 580, 150, 40);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/bk1.jpg"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(2000, 1300));
        getContentPane().add(background);
        background.setBounds(-50, -40, 1560, 850);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int x,y;
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minmMouseClicked
 this.setExtendedState(JFrame.ICONIFIED);       
    }//GEN-LAST:event_minmMouseClicked

    private void titlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMousePressed
      x=evt.getX();y=evt.getY();
    }//GEN-LAST:event_titlebarMousePressed

    private void titlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseDragged
      this.setLocation(evt.getXOnScreen()-x,evt.getYOnScreen()-y);
    }//GEN-LAST:event_titlebarMouseDragged
Timer t;
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       if(id1.getText().equalsIgnoreCase("ahmad_nemer")&&pass.getText().equalsIgnoreCase("1434382")){
           this.setVisible(false);
          AdminFrame af= new AdminFrame();
         
       }
       else { user=new User();
       user.loadUser(id1.getText(), pass.getText());
       if(user.exist==false){new Box("wrong username or password");}
       else{
       
       t=new Timer(24,new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent ae) {
              if(id1.getX()>=-350){id1.setLocation(id1.getX()-10, id1.getY());
              pass.setLocation(pass.getX()-10, pass.getY());
              signup.setLocation(signup.getX(), signup.getY()+10);
              login.setLocation(login.getX(), login.getY()+10);
              profilelogo.setLocation(profilelogo.getX(), profilelogo.getY()-10);
              }
              if(id1.getX()<=-350&&getWidth()<=1150){
                  setSize(getWidth()+25, getHeight()+1);
                  setLocationRelativeTo(null);
              }
              if(id1.getX()<=-300&&getWidth()>=1150){
                  close.setLocation(1135, close.getY());
                  minm.setLocation(1105, minm.getY());
                  t.stop();
                mp.setVisible(true);
               p.newcomp(user);
                 
                  
              }
           }
       
       
       
       });
       t.start();
       
       }
       }
       
    }//GEN-LAST:event_loginActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
       login.setVisible(false);
        pass.setVisible(false);
        signup.setVisible(false);
        profilelogo.setVisible(false);
      id1.setVisible(false);
      
        
        
       
    signuppanel.setVisible(true);
       
      this.repaint();
      
    }//GEN-LAST:event_signupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    public static javax.swing.JTextField id1;
    private static javax.swing.JButton login;
    private javax.swing.JLabel minm;
    private static javax.swing.JPasswordField pass;
    private static javax.swing.JLabel profilelogo;
    private static javax.swing.JButton signup;
    private javax.swing.JLabel titlebar;
    // End of variables declaration//GEN-END:variables
}
