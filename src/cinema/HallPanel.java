/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author SuPeR_FaNtASy
 */
public class HallPanel extends javax.swing.JPanel {
    
    
    
    
    
    
    static JLabel l;
static JPanel hallpanel;
    JScrollPane scrPane;
    
    
     public HallPanel() {
        hallpanel=new JPanel(new GridLayout(0,1));
        hallpanel.setOpaque(false);
        l=new JLabel(new ImageIcon(getClass().getResource("/cinema/img/halladd.png")));
        
        l.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) { new AddHall();}
            @Override
            public void mousePressed(MouseEvent me) {}
            @Override
            public void mouseReleased(MouseEvent me) {}
            @Override
            public void mouseEntered(MouseEvent me) {}
            @Override
            public void mouseExited(MouseEvent me) {}
        
        
        
        });
        
      
        
        
        
        
        
        init();
         this.add(hallpanel);
        hallpanel.setBounds(2,185, 370, 450);
        initComponents();hu.setVisible(false);
       
        
    }

    {
    
    
    
    }
    
   static void init(){
      Vector<Hall> r;
    hallpanel.removeAll();
   
  hallpanel.add(l);
  Hall hall=new Hall();
 r =new Vector<Hall>();
 r=hall.allHall();
  for(int i=0;i<r.size();i++){
  hallpanel.add(new SHsll(r.get(i).getId()+""));
  }hallpanel.setVisible(false);hallpanel.setVisible(true);
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(null);

        hu.setBackground(new java.awt.Color(255, 255, 255));
        hu.setFont(new java.awt.Font("Segoe WP SemiLight", 0, 24)); // NOI18N
        hu.setForeground(new java.awt.Color(204, 204, 204));
        hu.setText("HU cinema");
        hu.setBorder(null);
        hu.setOpaque(false);
        add(hu);
        hu.setBounds(120, 140, 150, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/movie.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        add(jLabel2);
        jLabel2.setBounds(40, 10, 310, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/line.jpg"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(-210, -190, 1530, 910);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
       hu.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
       hu.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
