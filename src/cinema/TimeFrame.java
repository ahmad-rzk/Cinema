/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import static cinema.HallPanel.l;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author SuPeR_FaNtASy
 */
public class TimeFrame extends javax.swing.JFrame {
static Movie movie;
static JLabel il;
static String cvp;
    public TimeFrame(Movie movie) {
        this.movie=movie;
        cvp=movie.getCover();
        
        il=new JLabel(new ImageIcon(getClass().getResource("/cinema/img/halladd.png")));
        
        il.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent me) {
new NewTime(movie);            }

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
        
        
        
        initComponents();
        cover.setIcon(new ImageIcon(getClass().getResource("/cinema/mov/"+movie.getCover()+".png")));
        title.setText(movie.getTitle());
        price.setText(movie.getPrice()+" jd ");
        year.setText(movie.getPro_year()+"");
        director.setText(movie.getDirector());
        init();
        titletxt.setVisible(false);
        directortxt.setVisible(false);
        pricetxt.setVisible(false);
        yeartxt.setVisible(false);
        update.setVisible(false);
        Browse.setVisible(false);
        this.setSize(746, 653);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
    }

    static void admin(){
        titletxt.setText(movie.getTitle());
        pricetxt.setText(movie.getPrice()+"");
        yeartxt.setText(movie.getPro_year()+"");
        directortxt.setText(movie.getDirector());
        title.setVisible(false);
        price.setVisible(false);
        year.setVisible(false);
        director.setVisible(false);
        
    titletxt.setVisible(true);
        directortxt.setVisible(true);
        pricetxt.setVisible(true);
        yeartxt.setVisible(true);
        update.setVisible(true);
        Browse.setVisible(true);
    init2();TimePanel.add(il);
    
    
    }
    
    
   static void init2(){
        
    TimePanel.removeAll();
    TimePanel.setLayout(new GridLayout(0,1));
    
    Vector<Time> tv=new Vector<Time>();
    Time t=new Time();
    tv=t.timebById(movie.getId()+"");
    for(int i=0;i<tv.size();i++){
    TimePanel.add(new SAtime((tv.get(i)),movie));
    
    
    }
    TimePanel.setVisible(false);TimePanel.setVisible(true);
    
    
    
    }
    
    
    
    static void init(){
        
    TimePanel.removeAll();
    TimePanel.setLayout(new GridLayout(0,1));
    TimePanel.add(new STime());
    Vector<Time> tv=new Vector<Time>();
    Time t=new Time();
    tv=t.timebById(movie.getId()+"");
    for(int i=0;i<tv.size();i++){
    TimePanel.add(new STime((tv.get(i)),movie));
    
    
    }
    TimePanel.setVisible(false);TimePanel.setVisible(true);
    
    
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minm = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        director = new javax.swing.JLabel();
        year = new javax.swing.JLabel();
        hallid4 = new javax.swing.JLabel();
        hallid6 = new javax.swing.JLabel();
        hallid7 = new javax.swing.JLabel();
        hallid5 = new javax.swing.JLabel();
        titlebar = new javax.swing.JLabel();
        cover = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TimePanel = new javax.swing.JPanel();
        update = new javax.swing.JButton();
        Browse = new javax.swing.JButton();
        pricetxt = new javax.swing.JTextField();
        yeartxt = new javax.swing.JTextField();
        directortxt = new javax.swing.JTextField();
        titletxt = new javax.swing.JTextField();
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
        minm.setBounds(690, 0, 33, 30);

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/close.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(720, 0, 30, 30);

        price.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        price.setForeground(new java.awt.Color(255, 255, 255));
        price.setText("price");
        getContentPane().add(price);
        price.setBounds(670, 120, 80, 30);

        title.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("title");
        getContentPane().add(title);
        title.setBounds(230, 120, 140, 30);

        director.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        director.setForeground(new java.awt.Color(255, 255, 255));
        director.setText("director");
        getContentPane().add(director);
        director.setBounds(390, 120, 130, 30);

        year.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        year.setForeground(new java.awt.Color(255, 255, 255));
        year.setText("year");
        getContentPane().add(year);
        year.setBounds(550, 120, 90, 30);

        hallid4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hallid4.setForeground(new java.awt.Color(255, 255, 255));
        hallid4.setText("title");
        getContentPane().add(hallid4);
        hallid4.setBounds(240, 60, 130, 30);

        hallid6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hallid6.setForeground(new java.awt.Color(255, 255, 255));
        hallid6.setText("year");
        getContentPane().add(hallid6);
        hallid6.setBounds(550, 60, 80, 30);

        hallid7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hallid7.setForeground(new java.awt.Color(255, 255, 255));
        hallid7.setText("price");
        getContentPane().add(hallid7);
        hallid7.setBounds(670, 60, 80, 30);

        hallid5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        hallid5.setForeground(new java.awt.Color(255, 255, 255));
        hallid5.setText("director");
        getContentPane().add(hallid5);
        hallid5.setBounds(390, 60, 140, 30);

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
        getContentPane().add(cover);
        cover.setBounds(10, 30, 200, 300);

        jScrollPane1.setOpaque(false);

        TimePanel.setOpaque(false);

        javax.swing.GroupLayout TimePanelLayout = new javax.swing.GroupLayout(TimePanel);
        TimePanel.setLayout(TimePanelLayout);
        TimePanelLayout.setHorizontalGroup(
            TimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
        );
        TimePanelLayout.setVerticalGroup(
            TimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 237, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(TimePanel);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 340, 750, 220);

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("update");
        update.setOpaque(false);
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(540, 270, 110, 34);

        Browse.setBackground(new java.awt.Color(0, 0, 0));
        Browse.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Browse.setForeground(new java.awt.Color(255, 255, 255));
        Browse.setText("Browse");
        Browse.setOpaque(false);
        Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseActionPerformed(evt);
            }
        });
        getContentPane().add(Browse);
        Browse.setBounds(310, 270, 110, 34);

        pricetxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        pricetxt.setForeground(new java.awt.Color(255, 255, 255));
        pricetxt.setText("title");
        pricetxt.setOpaque(false);
        getContentPane().add(pricetxt);
        pricetxt.setBounds(650, 170, 90, 40);

        yeartxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        yeartxt.setForeground(new java.awt.Color(255, 255, 255));
        yeartxt.setText("title");
        yeartxt.setOpaque(false);
        getContentPane().add(yeartxt);
        yeartxt.setBounds(540, 170, 100, 40);

        directortxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        directortxt.setForeground(new java.awt.Color(255, 255, 255));
        directortxt.setText("title");
        directortxt.setOpaque(false);
        getContentPane().add(directortxt);
        directortxt.setBounds(370, 170, 160, 40);

        titletxt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        titletxt.setForeground(new java.awt.Color(255, 255, 255));
        titletxt.setText("title");
        titletxt.setOpaque(false);
        getContentPane().add(titletxt);
        titletxt.setBounds(220, 170, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/bk.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-190, 0, 1180, 760);

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

    private void BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseActionPerformed
               JFileChooser j=new  JFileChooser();
        j.showOpenDialog(j);
        
        cvp =j.getSelectedFile().getName().replace(".png","");
        System.out.println(cvp);

    }//GEN-LAST:event_BrowseActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        movie.updatemovie(movie.getId(), titletxt.getText(), directortxt.getText(), Integer.parseInt(pricetxt.getText()), Integer.parseInt(yeartxt.getText()),cvp);
        Movie nn=new Movie();
       movie=nn.LoadMovie(movie.getId());
       admin();
       Moviepanel.admin();
       this.setVisible(false);
       new Box("movie updated",0);
    }//GEN-LAST:event_updateActionPerformed

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
            java.util.logging.Logger.getLogger(TimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new TimeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Browse;
    private static javax.swing.JPanel TimePanel;
    private javax.swing.JLabel close;
    private static javax.swing.JLabel cover;
    private static javax.swing.JLabel director;
    private static javax.swing.JTextField directortxt;
    private static javax.swing.JLabel hallid4;
    private static javax.swing.JLabel hallid5;
    private static javax.swing.JLabel hallid6;
    private static javax.swing.JLabel hallid7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minm;
    private static javax.swing.JLabel price;
    private static javax.swing.JTextField pricetxt;
    private static javax.swing.JLabel title;
    private javax.swing.JLabel titlebar;
    private static javax.swing.JTextField titletxt;
    private static javax.swing.JButton update;
    private static javax.swing.JLabel year;
    private static javax.swing.JTextField yeartxt;
    // End of variables declaration//GEN-END:variables
}
