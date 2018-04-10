/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author SuPeR_FaNtASy
 */
public class UTicket extends javax.swing.JFrame {

    User user;
    public UTicket(User user) {
        this.user=user;
        initComponents();
        inittick();
        tickpan.setLayout(new GridLayout(0,4));
        this.setSize(833, 470);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    final void inittick(){
         
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
     int ticketid=0,timeid=0;
   
    
    
    for(int i=0;i<v.size();i++){
    delete = new JButton("delete");
    
    for(int j=0;j<vm.size();j++){
    if((vm.get(j).getId())==v.get(i).getMovieId()){id=vm.get(j).getTitle();break;}
    }
    
    for(int j=0;j<vm.size();j++){
    if((vt.get(j).getId())==v.get(i).getTimeId()){tim=(vt.get(j).getMovieStart()).substring(11,16);
    dt=vt.get(j).getMovieDate().substring(0, 10);
    break;}
    }
   name=new JLabel(id);
    date=new JLabel(dt);
    stime=new JLabel(tim);
    delete.setOpaque(false);
    ticketid=v.get(i).getId();
    timeid=v.get(i).getTimeId();
    delete.addActionListener(new act(ticketid,timeid));
    name=new JLabel(id);
    name.setForeground(Color.WHITE);
    name.setFont(new Font(Font.DIALOG,Font.BOLD,18));
    tickpan.add(name);
    date=new JLabel(dt);
    date.setForeground(Color.WHITE);
    date.setFont(new Font(Font.DIALOG,Font.BOLD,18));
    stime=new JLabel(tim);
    stime.setForeground(Color.WHITE);
   stime.setFont(new Font(Font.DIALOG,Font.BOLD,18));
   
   tickpan.add(date);
    tickpan.add(stime);
    tickpan.add(delete);
    }
    
    tickpan.setVisible(false);
    tickpan.setVisible(true);
    this.setVisible(false);this.setVisible(true);
         
    }

   class act implements ActionListener{
int id;
int tid;

        public act(int id,int tid) {
            this.id = id;
            this.tid=tid;
        }

        @Override
        public void actionPerformed(ActionEvent ae) {
            Ticket t=new Ticket();
            t.deleteTicket(id+"",tid+"");
            inittick();
        }}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        minm = new javax.swing.JLabel();
        titlebar = new javax.swing.JLabel();
        tickpan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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
        close.setBounds(810, 0, 20, 30);

        minm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/min.png"))); // NOI18N
        minm.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        minm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minmMouseClicked(evt);
            }
        });
        getContentPane().add(minm);
        minm.setBounds(780, 0, 33, 30);

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

        tickpan.setOpaque(false);

        javax.swing.GroupLayout tickpanLayout = new javax.swing.GroupLayout(tickpan);
        tickpan.setLayout(tickpanLayout);
        tickpanLayout.setHorizontalGroup(
            tickpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        tickpanLayout.setVerticalGroup(
            tickpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        getContentPane().add(tickpan);
        tickpan.setBounds(0, 30, 830, 440);

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
            java.util.logging.Logger.getLogger(UTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new UTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel minm;
    private javax.swing.JPanel tickpan;
    private javax.swing.JLabel titlebar;
    // End of variables declaration//GEN-END:variables
}
