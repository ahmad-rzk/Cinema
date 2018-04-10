/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;









public class SeatsFrame extends javax.swing.JFrame {
Vector<Ticket> vt=new Vector<Ticket>();
int seatid;
    Movie m;
    Time time;
    Ticket t;
    public SeatsFrame(Time time,Movie m) {
        
        this.time=time;
        this.m=m;
        t=new Ticket();
        vt=t.ticketbymovie(m.getId()+"",time.getId()+"");
        initComponents();
        init();
        seatspan.setLayout(new GridLayout(7,17));
        header.setText("Boking for "+m.getTitle()+" in hall no "+time.getHallId()+" in "+time.getMovieDate().substring(0, 10)+" from "+time.getMovieStart().substring(11,16)+" to  "+time.getMovieEnd().substring(11,16)+", available seats");
        lower.setVisible(false);conform.setVisible(false);conform.addActionListener(new conf());
        
        this.setSize(837, 568);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    class act implements ActionListener{



    @Override
    public void actionPerformed(ActionEvent ae) {
        JButton n=(JButton) ae.getSource();
        if(n.getBackground().equals(Color.RED)){new Box("this seat is alredy taken");}
        else{
          lower.setText("are you sure you want to book seat no "+n.getText()+" at "+time.getMovieStart().substring(11,16)+" ?");
            lower.setVisible(true);conform.setVisible(true);
           seatid=Integer.parseInt(n.getText());
           
          /*  Ticket t=new Ticket(Integer.parseInt(n.getText()),time.getId(),time.getHallId(),m.getId(),Frame1.id1.getText());
        new Box("ticket booked plese conform the ticket");
            setVisible(false);*/
        }
    }

}
class conf implements ActionListener{

        
              public void actionPerformed(ActionEvent ae) {
                  Ticket r=new Ticket();
                  if(r.checkTicket(Frame1.id1.getText(), time.getId())){
                  Ticket t=new Ticket(seatid,time.getId(),m.getId(),time.getHallId(),Frame1.id1.getText());
        new Box("ticket booked ",0);
            setVisible(false);}else new Box("sorry u alredy booked two seats ");
              }}
    
    
    final void init(){
        int []seatsarr=new int[105];
        for(int i=0;i<seatsarr.length;i++){seatsarr[i]=i+1;}
        JButton seat;
        for(int i=0;i<seatsarr.length;i++){
            seat=new JButton();
            seat.setText(seatsarr[i]+"");
            seat.setBorder(new BevelBorder(BevelBorder.RAISED));
            seat.setForeground(Color.BLACK);
            seat.addActionListener(new act());
            for (int j=0;j<vt.size();j++){
                if (vt.get(j).getId() == seatsarr[i]) {
                    seat.setBackground(Color.RED);break;
                }
            }
           
            seatspan.add(seat);
           
            
            if(seatsarr[i]%5==0&&seatsarr[i]!=0){
            if(seatsarr[i]%15==0){}
            else{seatspan.add(new JLabel("...."));}
            }//end if
            
            }
   seatspan.setVisible(false); seatspan.setVisible(true);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minm = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        titlebar = new javax.swing.JLabel();
        seatspan = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        lower = new javax.swing.JLabel();
        conform = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        minm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/min.png"))); // NOI18N
        minm.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        minm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minmMouseClicked(evt);
            }
        });
        getContentPane().add(minm);
        minm.setBounds(780, 0, 30, 30);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/close.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(810, 0, 20, 30);

        titlebar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/title.png"))); // NOI18N
        titlebar.setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
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

        seatspan.setOpaque(false);

        javax.swing.GroupLayout seatspanLayout = new javax.swing.GroupLayout(seatspan);
        seatspan.setLayout(seatspanLayout);
        seatspanLayout.setHorizontalGroup(
            seatspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );
        seatspanLayout.setVerticalGroup(
            seatspanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(seatspan);
        seatspan.setBounds(0, 100, 840, 400);

        header.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        header.setForeground(new java.awt.Color(255, 255, 255));
        header.setText("jLabel2");
        getContentPane().add(header);
        header.setBounds(10, 40, 810, 40);

        lower.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        lower.setForeground(new java.awt.Color(255, 255, 255));
        lower.setText("are you sure you wanna book seat no 5 at 14:00 ?");
        getContentPane().add(lower);
        lower.setBounds(60, 510, 560, 50);

        conform.setBackground(new java.awt.Color(0, 0, 0));
        conform.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        conform.setForeground(new java.awt.Color(255, 255, 255));
        conform.setText("Conform");
        conform.setOpaque(false);
        getContentPane().add(conform);
        conform.setBounds(620, 520, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/bk.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-250, 0, 1180, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents
int x,y;
    private void titlebarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseDragged
        this.setLocation(evt.getXOnScreen()-x,evt.getYOnScreen()-y);
    }//GEN-LAST:event_titlebarMouseDragged

    private void titlebarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMousePressed
        x=evt.getX();y=evt.getY();
    }//GEN-LAST:event_titlebarMousePressed

    private void minmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minmMouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minmMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_closeMouseClicked

    
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
            java.util.logging.Logger.getLogger(SeatsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new SeatsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JButton conform;
    private javax.swing.JLabel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lower;
    private javax.swing.JLabel minm;
    private javax.swing.JPanel seatspan;
    private javax.swing.JLabel titlebar;
    // End of variables declaration//GEN-END:variables
}
