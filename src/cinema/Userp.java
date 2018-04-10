/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author SuPeR_FaNtASy
 */
public class Userp extends javax.swing.JPanel {
JPanel tickpan; 
   User user; 
    public Userp() {
        tickpan=new JPanel();
        tickpan.setBounds(10, 340, 370, 240);
        tickpan.setLayout(new GridLayout(4,4));
        tickpan.setOpaque(false);
        tickpan.setVisible(false);
        initComponents();
   
    this.setVisible(true); }
   
    void newcomp(User user){
   this.user=user;
        //initComponents();
        uname.setText(user.getUsername());
        lname.setText(user.getLname());
        phone.setText(user.getPhonenumber());
        firstname.setText(user.getFname());
        first.setVisible(false);
        neww.setVisible(false);
        old.setVisible(false);
        last.setVisible(false);
        phonet.setVisible(false);
        apply.setVisible(false);}
    
    
   
    
    
    
    
    
    
    
   
    
    
     /*void inittick(){
         
    tickpan.removeAll();
        Ticket t=new Ticket();
        Movie m=new Movie();
        Time  tm=new Time();
    
      Vector<Ticket>v=new Vector<Ticket>();
    Vector<Movie> vm=new Vector<Movie>();
    Vector<Time> vt=new Vector<Time>();
   
    
    vm=m.allmovies();
    v=t.ticketbyuser(Frame1.id1.getText());
    vt=tm.allTime();
   
    JButton delete ;
    JLabel name;JLabel date;JLabel stime;
    String id="",tim="",dt="";
     int ticketid=0;
   
    
    
    for(int i=0;i<v.size();i++){
    delete = new JButton("delete");
    
    for(int j=0;j<vm.size();j++){
    if((vm.get(j).getId())==v.get(i).getMovieId()){id=vm.get(j).getTitle();System.out.println("1st loop");break;}
    }
    
    for(int j=0;j<vm.size();j++){
    if((vt.get(j).getId())==v.get(i).getTimeId()){tim=(vt.get(j).getMovieStart()).substring(11,16);
    dt=vt.get(j).getMovieDate().substring(0, 10);System.out.println("2st loop");
    break;}
    }
   name=new JLabel(id);
    date=new JLabel(dt);
    stime=new JLabel(tim);
    delete.setOpaque(false);
    ticketid=v.get(i).getId();
    delete.addActionListener(new act(ticketid));
    name=new JLabel(id);
    name.setFont(new Font(Font.DIALOG,Font.BOLD,14));
    tickpan.add(name);
    date=new JLabel(dt);
    date.setFont(new Font(Font.DIALOG,Font.BOLD,14));
    stime=new JLabel(tim);
   stime.setFont(new Font(Font.DIALOG,Font.BOLD,14));
   tickpan.add(new JLabel("fv"));tickpan.add(new JLabel("fv"));
   tickpan.add(date);
    tickpan.add(stime);
    tickpan.add(delete);System.out.println("added comp");System.out.println(i);
    }
    System.out.println("visable");
    tickpan.setVisible(false);
    tickpan.setVisible(true);
    this.setVisible(false);this.setVisible(true);
         
    }

   class act implements ActionListener{
int id;

        public act(int id) {
            this.id = id;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            Ticket t=new Ticket();
            t.deleteTicket(id+"");
            inittick();
        }*/
   
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icn = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        phone = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        apply = new javax.swing.JButton();
        old = new javax.swing.JTextField();
        first = new javax.swing.JTextField();
        last = new javax.swing.JTextField();
        phonet = new javax.swing.JTextField();
        neww = new javax.swing.JTextField();
        tickets = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        deletee = new javax.swing.JButton();
        signout = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setLayout(null);

        icn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/User-Files-icon.png"))); // NOI18N
        add(icn);
        icn.setBounds(-30, 10, 210, 256);

        uname.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        uname.setForeground(new java.awt.Color(255, 255, 255));
        uname.setText("jLabel1");
        add(uname);
        uname.setBounds(190, 30, 220, 60);

        firstname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 255, 255));
        firstname.setText("jLabel2");
        add(firstname);
        firstname.setBounds(190, 130, 100, 60);

        lname.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lname.setForeground(new java.awt.Color(255, 255, 255));
        lname.setText("jLabel3");
        add(lname);
        lname.setBounds(290, 130, 120, 60);

        phone.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));
        phone.setText("07865452222225");
        add(phone);
        phone.setBounds(190, 210, 190, 50);
        add(jSeparator1);
        jSeparator1.setBounds(10, 280, 370, 20);

        apply.setBackground(new java.awt.Color(102, 102, 102));
        apply.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        apply.setForeground(new java.awt.Color(255, 255, 255));
        apply.setText("apply");
        apply.setOpaque(false);
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });
        add(apply);
        apply.setBounds(190, 510, 190, 70);

        old.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        old.setForeground(new java.awt.Color(255, 0, 0));
        old.setToolTipText("your first name");
        old.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "old password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        old.setOpaque(false);
        add(old);
        old.setBounds(10, 500, 180, 80);

        first.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        first.setForeground(new java.awt.Color(255, 0, 0));
        first.setToolTipText("your first name");
        first.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        first.setOpaque(false);
        add(first);
        first.setBounds(10, 340, 180, 80);

        last.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        last.setForeground(new java.awt.Color(255, 0, 0));
        last.setToolTipText("your first name");
        last.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        last.setOpaque(false);
        add(last);
        last.setBounds(190, 340, 190, 80);

        phonet.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        phonet.setForeground(new java.awt.Color(255, 0, 0));
        phonet.setToolTipText("your first name");
        phonet.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "phone number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        phonet.setOpaque(false);
        add(phonet);
        phonet.setBounds(10, 420, 180, 80);

        neww.setFont(new java.awt.Font("OCR A Extended", 1, 18)); // NOI18N
        neww.setForeground(new java.awt.Color(255, 0, 0));
        neww.setToolTipText("your first name");
        neww.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "new password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        neww.setOpaque(false);
        add(neww);
        neww.setBounds(190, 420, 190, 80);

        tickets.setBackground(new java.awt.Color(102, 102, 102));
        tickets.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        tickets.setForeground(new java.awt.Color(255, 255, 255));
        tickets.setText("Tickets");
        tickets.setOpaque(false);
        tickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketsMouseClicked(evt);
            }
        });
        tickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketsActionPerformed(evt);
            }
        });
        add(tickets);
        tickets.setBounds(10, 590, 370, 40);

        edit.setBackground(new java.awt.Color(102, 102, 102));
        edit.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("edit");
        edit.setOpaque(false);
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        add(edit);
        edit.setBounds(10, 290, 370, 40);

        deletee.setBackground(new java.awt.Color(102, 102, 102));
        deletee.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        deletee.setForeground(new java.awt.Color(255, 255, 255));
        deletee.setText("delete acount");
        deletee.setOpaque(false);
        deletee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteeActionPerformed(evt);
            }
        });
        add(deletee);
        deletee.setBounds(200, 640, 180, 40);

        signout.setBackground(new java.awt.Color(102, 102, 102));
        signout.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        signout.setForeground(new java.awt.Color(255, 255, 255));
        signout.setText("sign out");
        signout.setOpaque(false);
        signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutActionPerformed(evt);
            }
        });
        add(signout);
        signout.setBounds(10, 640, 180, 40);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/baaack.jpg"))); // NOI18N
        add(back);
        back.setBounds(0, 0, 410, 790);
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        first.setText(user.getFname());
        last.setText(user.getLname());
        phonet.setText(user.getPhonenumber());
        
        first.setVisible(true);
        neww.setVisible(true);
        old.setVisible(true);
        last.setVisible(true);
        phonet.setVisible(true);
        apply.setVisible(true);
    }//GEN-LAST:event_editActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
       if (evt.getClickCount()>=2){
       first.setVisible(false);
        neww.setVisible(false);
        old.setVisible(false);
        last.setVisible(false);
        phonet.setVisible(false);
        apply.setVisible(false);
       
       }
    }//GEN-LAST:event_editMouseClicked

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed
      
        boolean s=true;
    char nums[]=phonet.getText().toCharArray();
    for(int i=0;i<phonet.getText().length();i++)
        if(!(nums[i]>='0'&&nums[i]<='9'))s=false;
        
        
        if ((user.getPass().equals(old.getText()))&&(phonet.getText().length()>=9&&phonet.getText().length()<=11&&s)){
       user.changeInfo(first.getText(), last.getText(), user.getUsername(), neww.getText(), phonet.getText());
       new Box("data changed",0);
       user.loadUser(user.getUsername(), neww.getText());
       firstname.setText(user.getUsername());
        lname.setText(user.getLname());
        phone.setText(user.getPhonenumber());
       }else {new Box("re modify your data");}
    }//GEN-LAST:event_applyActionPerformed

    private void deleteeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteeActionPerformed
       user.deletUser(user.getUsername());
       System.exit(0);
       
    }//GEN-LAST:event_deleteeActionPerformed

    private void signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutActionPerformed
 System.exit(0);
    }//GEN-LAST:event_signoutActionPerformed

    private void ticketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketsActionPerformed
        first.setVisible(false);
        neww.setVisible(false);
        old.setVisible(false);
        last.setVisible(false);
        phonet.setVisible(false);
        apply.setVisible(false);
      //  inittick();
        new UTicket(user);
    }//GEN-LAST:event_ticketsActionPerformed

    private void ticketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ticketsMouseClicked
       if(evt.getClickCount()>=2){
          
           tickpan.setVisible(false);}
    }//GEN-LAST:event_ticketsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apply;
    private javax.swing.JLabel back;
    private javax.swing.JButton deletee;
    private javax.swing.JButton edit;
    private javax.swing.JTextField first;
    private javax.swing.JLabel firstname;
    private javax.swing.JLabel icn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField last;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField neww;
    private javax.swing.JTextField old;
    private javax.swing.JLabel phone;
    private javax.swing.JTextField phonet;
    private javax.swing.JButton signout;
    private javax.swing.JButton tickets;
    private javax.swing.JLabel uname;
    // End of variables declaration//GEN-END:variables
}
