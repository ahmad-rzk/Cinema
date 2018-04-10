/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import com.sun.glass.ui.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author SuPeR_FaNtASy
 */
public class Moviepanel extends javax.swing.JPanel {
   

 static Movie mov=new Movie();
     JScrollPane scrPane;
     static Vector<Movie> n;
      static Vector<Movie> sn;
    static JPanel movpanel=new JPanel(new GridLayout(0,3));
    
   static JLabel ign;
    
    public Moviepanel() {
        
         ign=new JLabel();
        ign.setIcon(new ImageIcon(getClass().getResource("/cinema/img/addmov.png")));
        ign.addMouseListener(new MouseListener() {

             @Override
             public void mouseClicked(MouseEvent me) {
                 new NewMovie();
             }

             @Override
             public void mousePressed(MouseEvent me) {
              
             }

             @Override
             public void mouseReleased(MouseEvent me) {
                
             }

             @Override
             public void mouseEntered(MouseEvent me) {
                
             }

             @Override
             public void mouseExited(MouseEvent me) {
                
             }
         });
        
        
        
        movpanel.setOpaque(false);
        movpanel.setBounds(0,0,765,640);
       init();
        
       scrPane = new JScrollPane(movpanel);
       
       scrPane.setOpaque(false);
       scrPane.setBounds(0,55, 770, 640);
       scrPane.setVerticalScrollBar(new JScrollBar());
      
        this.add(scrPane);
        initComponents();
        n=mov.allmovies(); 
    
        
    }

    final void init(){
    movpanel.removeAll();
//n=new Vector<Movie>();
n=mov.allmovies(); 
Smoviep []s=new Smoviep[n.size()];
for(int i=0;i<n.size();i++){
s[i]=new Smoviep(n.get(i).getTitle(),n.get(i).getCover(),n.get(i).getPrice()+"",n.get(i).getPro_year()+"",n.get(i));
movpanel.add(s[i]);
/*if(i==0)s[i].setBounds(x, y, x1, y1);else{
if(i%2==0)s[i].setBounds(x, y+=120, x1, y1);
else s[i].setBounds(x+=100, y, x1, y1);}
i2++;
if(i2%2==0&&i2!=0){x=0;y=0;x1+=100;y1+=120;}*/

//movpanel.add(s[i]);
}movpanel.setVisible(false);movpanel.setVisible(true);
    }
static void update(){
    n=mov.allmovies();
    sn=n;}
   static void admin(){
      
        movpanel.removeAll();
    update();
    
        jButton1.setVisible(false);
     jButton2.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
          jTextField4.setVisible(false);
         titlee.setVisible(false);
          jLabel1.setVisible(false);
    movpanel.add(ign);

Smoviep []s=new Smoviep[sn.size()];
for(int i=0;i<sn.size();i++){
s[i]=new Smoviep(sn.get(i).getTitle(),sn.get(i).getCover(),sn.get(i).getPrice()+"",sn.get(i).getPro_year()+"",sn.get(i));
s[i].jLabel1.setVisible(true);
s[i].jButton1.setFont(new Font(Font.DIALOG,Font.BOLD,18));
s[i].jButton1.setText("modify");
movpanel.add(s[i]);}
    movpanel.setVisible(false);movpanel.setVisible(true);
    
    }
 void init2(){
    
movpanel.removeAll();
n=mov.movies(titlee.getText());
Smoviep []s=new Smoviep[n.size()];
for(int i=0;i<n.size();i++){
s[i]=new Smoviep(n.get(i).getTitle(),n.get(i).getCover(),n.get(i).getPrice()+"",n.get(i).getPro_year()+"",n.get(i));
movpanel.add(s[i]);
}movpanel.setVisible(false);movpanel.setVisible(true);
 }
 void init3(){
    
movpanel.removeAll();
n=mov.dateMovie(jTextField4.getText()+"-"+jTextField3.getText()+"-"+jTextField2.getText());
Smoviep []s=new Smoviep[n.size()];
for(int i=0;i<n.size();i++){
s[i]=new Smoviep(n.get(i).getTitle(),n.get(i).getCover(),n.get(i).getPrice()+"",n.get(i).getPro_year()+"",n.get(i));
movpanel.add(s[i]);
}movpanel.setVisible(false);movpanel.setVisible(true);
 }
 
 void excuteupdate(){
 movpanel.setVisible(false);movpanel.setVisible(true);
 
 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlee = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setOpaque(false);
        setLayout(null);

        titlee.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titlee.setForeground(new java.awt.Color(204, 0, 102));
        titlee.setText("Title");
        titlee.setOpaque(false);
        add(titlee);
        titlee.setBounds(0, 0, 160, 52);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Damas", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(157, 0, 150, 52);

        jTextField2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 0, 102));
        jTextField2.setText("dd");
        jTextField2.setOpaque(false);
        add(jTextField2);
        jTextField2.setBounds(370, 0, 80, 52);

        jTextField3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 0, 102));
        jTextField3.setText("mm");
        jTextField3.setOpaque(false);
        add(jTextField3);
        jTextField3.setBounds(450, 0, 80, 52);

        jTextField4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 0, 102));
        jTextField4.setText("yy");
        jTextField4.setOpaque(false);
        add(jTextField4);
        jTextField4.setBounds(530, 0, 80, 52);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Damas", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(610, 0, 110, 52);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/undos.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(310, 0, 60, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        init2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       init();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        init3();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField3;
    private static javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField titlee;
    // End of variables declaration//GEN-END:variables
}
