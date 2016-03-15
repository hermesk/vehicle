package javafiles;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class register extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    ResultSet rss = null;
    ResultSet rsr = null;
   
    PreparedStatement pst = null;
   
    public register() {
        super("Register user");
        initComponents();
        conn = javaconnect.connecrDb();
        update_table();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
       }
    
   
 private void update_table(){
      try{
          String sql = "select  username,password from users";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          tableusers.setModel( DbUtils.resultSetToTableModel(rs));

      }
      catch(Exception e)
      {
             JOptionPane.showMessageDialog(null,e);
            }
       finally {
                try{
                    if(rs!=null){
                  rs.close();
                  rs=null;
                  pst.close();
                    }
                  }
                 catch(Exception ex){
                  }
                }
       
     }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pwd = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cpwd = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        cmd_register = new javax.swing.JButton();
        cmd_del = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();
        cmd_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableusers = new javax.swing.JTable(){

            public boolean isCellEditable(int rowindex, int colIndex)
            { return false;}

        } ;

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            { 
                String ObjButtons[] = {"Yes","No"};
                int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to exit?","Confirm",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
                if(PromptResult==JOptionPane.YES_OPTION)
                {
                    dispose();
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,e);
                    }
                }
            }
        });
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setText("Username");

        cpwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpwdKeyPressed(evt);
            }
        });

        jLabel2.setText("Password");

        jLabel3.setText("Confirm password");

        cmd_register.setText("Register");
        cmd_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_registerActionPerformed(evt);
            }
        });

        cmd_del.setText("Delete");
        cmd_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_delActionPerformed(evt);
            }
        });

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        cmd_update.setText("Update");
        cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(uname)
                            .addComponent(cpwd)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_register)
                        .addGap(27, 27, 27)
                        .addComponent(cmd_clear)
                        .addGap(28, 28, 28)
                        .addComponent(cmd_update)
                        .addGap(27, 27, 27)
                        .addComponent(cmd_del)))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_register)
                    .addComponent(cmd_clear)
                    .addComponent(cmd_del)
                    .addComponent(cmd_update))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        tableusers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableusers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableusersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableusers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_registerActionPerformed
        // TODO add your handling code here:
        if(uname.getText().trim().isEmpty()||pwd.getText().trim().isEmpty()||cpwd.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
           }
        else if(!pwd.getText().trim().equals(cpwd.getText().trim())){
       JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Password Mismatch!</font></h2></html>");
        }
        else if(uname.getText().length()>0){
        
         try
                     {
                        String check ="SELECT COUNT(*) AS total FROM users  where username = '"+uname.getText()+"'"; 
                        pst=conn.prepareStatement(check);
                        rsr = pst.executeQuery();
                        while(rsr.next()){
                        if(rsr.getInt("total")>0)
                        {
                          JOptionPane.showMessageDialog(null, "username already exist!");
                        }
              else{
         try{
                 String sql = "insert into users(username,password) values (?,?)";
              
                 
                pst=conn.prepareStatement(sql);
                pst.setString(1, uname.getText().trim()); 
                pst.setString(2,md5(pwd.getText()).trim());
                
                pst.execute();
               
                 JOptionPane.showMessageDialog(null, "Saved");
                }
              
        catch(SQLException | HeadlessException e){

        }
                         finally {
                try{
                   if(rs!=null&&pst!=null){
                  rs.close();
                  rs=null;
                  pst.close();
                  pst=null;
                    }
                  }
                 catch(Exception ex){
                  }
                }
       
                        }}
                     }catch (SQLException e) {
                               JOptionPane.showMessageDialog(null, e);
                               
                           }
          finally {
                try{
                   if(rs!=null&&pst!=null){
                  rs.close();
                  rs=null;
                  pst.close();
                  pst=null;
                    }
                  }
                 catch(Exception ex){
                  }
                }
       
         update_table();
        }
                     else{}
        
            
    }//GEN-LAST:event_cmd_registerActionPerformed

    private void tableusersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableusersMouseClicked

        try{
            int row = tableusers.getSelectedRow();
            int col = tableusers.getSelectedColumn();

            String tableclicked = (tableusers.getModel().getValueAt(row, col).toString());
            String sql = "select* from users where username ='"+tableclicked+"'";
             pst=conn.prepareStatement(sql);
             rss = pst.executeQuery();
         if(rss.next()){
         uname.setText(rss.getString("username").trim());
         pwd.setText(rss.getString("password").trim());
         cpwd.setText(rss.getString("password").trim());
         }}
          catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
    finally {
                try{
                  if(rs!=null&&pst!=null){
                  rss.close();
                  rss=null;
                  pst.close();
                  pst=null;
                    }
                  }
                 catch(Exception ex){
                  }
                }
       
    }//GEN-LAST:event_tableusersMouseClicked

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        // TODO add your handling code here:
        uname.setText("");
         pwd.setText("");
         cpwd.setText("");
         
        
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void cmd_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_delActionPerformed
 
        if(uname.getText().isEmpty()||pwd.getText().isEmpty()||cpwd.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
        }
        else if(!pwd.getText().trim().equals(cpwd.getText().trim())){
            
       JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Password mismatch!</font></h2></html>");
        }
        else{
             int d = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete", "Delete", JOptionPane.YES_NO_OPTION);

            if(d==0){

            try {
                String name =  rss.getString("username").trim(); 
                 if(!name.equals("admin")&&!name.equals("root"))
                 {  String sql = "delete from users where username=?";
                     pst=conn.prepareStatement(sql);
                     pst.setString(1, uname.getText().trim());
                     
                     pst.execute();
                     JOptionPane.showMessageDialog(null, "Deleted");
 
                                   }
                 else{     
               JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Cannot Delete Admin Account</font></h2></html>");

                     }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);

            }
             finally {
                try{
                 if(rs!=null&&pst!=null){
                  rss.close();
                  rss=null;
                  pst.close();
                  pst=null;
                 }
                  }
                 catch(Exception ex){
                  }
                }
       
            update_table();
            }}
    }//GEN-LAST:event_cmd_delActionPerformed

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
         if(uname.getText().trim().isEmpty()||pwd.getText().trim().isEmpty()||cpwd.getText().trim().isEmpty()){
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
           }
        else if(!pwd.getText().trim().equals(cpwd.getText().trim())){
       JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Password mismatch!</font></h2></html>");

        }
               
       else{
        try{
                String  value1 = uname.getText().trim();
                String  value2 = md5(pwd.getText().trim());

                String sql = "update users set username='"+value1+"',password='"+value2+"'WHERE username='"+value1+"'";

                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Password  Changed");

                     }
               catch(NumberFormatException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
        }
         finally {
                try{
                  rs.close();
                  pst.close();
                  }
                 catch(Exception ex){
                  }
                }
       
        update_table();

        }
           
    }//GEN-LAST:event_cmd_updateActionPerformed

    private void cpwdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpwdKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             
        if(uname.getText().trim().isEmpty()||pwd.getText().trim().isEmpty()||cpwd.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
           }
        else if(!pwd.getText().trim().equals(cpwd.getText().trim())){
                 JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Password Mismatch!</font></h2></html>");
        }
        else if(uname.getText().length()>0){
        
         try
                     {
                        String check ="SELECT COUNT(*) AS total FROM users  where username = '"+uname.getText()+"'"; 
                        pst=conn.prepareStatement(check);
                        rs = pst.executeQuery();
                        
          while(rs.next()){
             if(rs.getInt("total")>0)
                        {
                          JOptionPane.showMessageDialog(null, "username already exist!");
                        }
          else{
                try{
                 String sql = "insert into users(username,password) values (?,?)";
              
                 
                pst=conn.prepareStatement(sql);
                pst.setString(1, uname.getText().trim()); 
                pst.setString(2,md5(pwd.getText()).trim());
                
                pst.execute();
               
                 JOptionPane.showMessageDialog(null, "Saved");
                }
              
        catch(SQLException | HeadlessException e){

        }
              finally {
                try{
                  rs.close();
                  pst.close();
                  }
                 catch(Exception ex){
                  }
                }
       
             }}
                     }catch (SQLException e) {
                               JOptionPane.showMessageDialog(null, e);
                               
                           }
          finally {
                try{
                  rs.close();
                  pst.close();
                  }
                 catch(Exception ex){
                  }
                }
       
         update_table();
        }
                     else{}
        
            
 }
    }//GEN-LAST:event_cpwdKeyPressed
public void refreshConnection() {
		if (conn == null) {
        conn = javaconnect.connecrDb();
		}
	}

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new register().setVisible(true);
            }
        });
    }
      private String md5(String c) 
      {
       try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[]messageDigest =md.digest(c.getBytes());
            BigInteger number =new BigInteger(1,messageDigest);
            String hashtext = number.toString(16);
            while(hashtext.length()<32){
            hashtext ="0"+hashtext;
            }
            return hashtext;
          }
          catch(Exception ex){
          }
        return null;

       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_del;
    private javax.swing.JButton cmd_register;
    private javax.swing.JButton cmd_update;
    private javax.swing.JPasswordField cpwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTable tableusers;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables

    
}
