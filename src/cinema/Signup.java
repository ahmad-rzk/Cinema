/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;



/**
 *
 * @author SuPeR_FaNtASy
 */
public class Signup extends javax.swing.JPanel {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
        forwordd.setVisible(false);
        back.setVisible(false);
        
        this.setVisible(true);
      //  this.setSize(437, 655);
      //  this.setBounds(437, 200, 680, 200);
  //  this.setPreferredSize(new Dimension(437,610));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backwordicn = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        pass1 = new javax.swing.JPasswordField();
        forwordicn = new javax.swing.JLabel();
        forwordd = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setBackground(javax.swing.UIManager.getDefaults().getColor("window"));
        setForeground(new java.awt.Color(255, 255, 255));
        setAutoscrolls(true);
        setFocusCycleRoot(true);
        setFocusTraversalPolicyProvider(true);
        setInheritsPopupMenu(true);
        setOpaque(false);
        setLayout(null);

        backwordicn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/undos.png"))); // NOI18N
        backwordicn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backwordicnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backwordicnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backwordicnMouseExited(evt);
            }
        });
        add(backwordicn);
        backwordicn.setBounds(50, 560, 60, 70);

        phone.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 0, 0));
        phone.setToolTipText("write your phone number");
        phone.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        phone.setOpaque(false);
        add(phone);
        phone.setBounds(60, 470, 320, 80);

        lastname.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        lastname.setForeground(new java.awt.Color(255, 0, 0));
        lastname.setToolTipText("your lastname");
        lastname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        lastname.setOpaque(false);
        add(lastname);
        lastname.setBounds(60, 380, 320, 80);

        id.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        id.setForeground(new java.awt.Color(255, 0, 0));
        id.setToolTipText("insert your id");
        id.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        id.setOpaque(false);
        add(id);
        id.setBounds(60, 20, 320, 80);

        firstname.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        firstname.setForeground(new java.awt.Color(255, 0, 0));
        firstname.setToolTipText("your first name");
        firstname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT Condensed", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        firstname.setOpaque(false);
        add(firstname);
        firstname.setBounds(60, 290, 320, 80);

        pass.setFont(new java.awt.Font("Gill Sans MT", 1, 48)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 0, 51));
        pass.setToolTipText("password goes here");
        pass.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 26), new java.awt.Color(255, 255, 255))); // NOI18N
        pass.setOpaque(false);
        add(pass);
        pass.setBounds(60, 120, 320, 70);

        pass1.setFont(new java.awt.Font("Gill Sans MT", 1, 48)); // NOI18N
        pass1.setForeground(new java.awt.Color(255, 0, 51));
        pass1.setToolTipText("re enter the password");
        pass1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Re enter Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Gill Sans MT", 1, 26), new java.awt.Color(255, 255, 255))); // NOI18N
        pass1.setOpaque(false);
        add(pass1);
        pass1.setBounds(60, 210, 320, 70);

        forwordicn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/img/foword.png"))); // NOI18N
        forwordicn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forwordicnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forwordicnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forwordicnMouseExited(evt);
            }
        });
        add(forwordicn);
        forwordicn.setBounds(330, 570, 60, 50);

        forwordd.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        forwordd.setForeground(new java.awt.Color(255, 255, 255));
        forwordd.setText("sign up");
        add(forwordd);
        forwordd.setBounds(240, 580, 80, 30);

        back.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("back");
        add(back);
        back.setBounds(110, 580, 60, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void backwordicnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backwordicnMouseClicked
       this.setVisible(false);
       Frame1.see();
      
    }//GEN-LAST:event_backwordicnMouseClicked

    private void forwordicnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwordicnMouseEntered
       forwordd.setVisible(true);
    }//GEN-LAST:event_forwordicnMouseEntered

    private void backwordicnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backwordicnMouseEntered
        back.setVisible(true);
    }//GEN-LAST:event_backwordicnMouseEntered

    private void backwordicnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backwordicnMouseExited
      back.setVisible(false);
    }//GEN-LAST:event_backwordicnMouseExited

    private void forwordicnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwordicnMouseExited
      forwordd.setVisible(false);
    }//GEN-LAST:event_forwordicnMouseExited

    private void forwordicnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forwordicnMouseClicked
     
        boolean s=true;
    char nums[]=phone.getText().toCharArray();
    for(int i=0;i<phone.getText().length();i++)
        if(!(nums[i]>='0'&&nums[i]<='9'))s=false;
   
        
        User user;
        
        if((pass.getText()).equals((pass1.getText())))
           if(phone.getText().length()>=9&&phone.getText().length()<=11&&s){
            user =new User(); 
           user.createUser(firstname.getText(), lastname.getText(), id.getText(), pass.getText(), phone.getText());
           if(user.exist==true){new Box("this user alredy exist");}else{new Box("succesfully added",0);this.setVisible(false);Frame1.see();}
           }else new Box("eroor at the input data");else new Box("eroor at the input data");
        
        
       
               
    }//GEN-LAST:event_forwordicnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel backwordicn;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel forwordd;
    private javax.swing.JLabel forwordicn;
    private javax.swing.JTextField id;
    private javax.swing.JTextField lastname;
    private javax.swing.JPasswordField pass;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}