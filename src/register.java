
import java.awt.HeadlessException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class register extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
   
    public register() {
        super("Register user");
        initComponents();
        conn = javaconnect.connecrDb();
        update_table();
       
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
        tableusers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel1.setText("Username");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpwd)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_register)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmd_clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmd_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmd_del)))
                .addContainerGap())
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
                .addContainerGap(29, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_registerActionPerformed
        // TODO add your handling code here:
        if(uname.getText().isEmpty()||pwd.getText().isEmpty()||cpwd.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Fill all the fields!");
           }
        else if(!pwd.getText().equals(cpwd.getText())){
        JOptionPane.showMessageDialog(null, "Password Mismatch!");
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
                // String mpwd = (pwd.getText());
                 //String mypwd =md5(mpwd);
                 
                pst=conn.prepareStatement(sql);
                pst.setString(1, uname.getText()); 
                pst.setString(2,md5(pwd.getText()));
                
                pst.execute();
               
                 JOptionPane.showMessageDialog(null, "Saved");
                }
              
        catch(SQLException | HeadlessException e){

        }}}
                     }catch (SQLException e) {
                               JOptionPane.showMessageDialog(null, e);
                               
                           }
         update_table();
        }
                     else{}
        
            
    }//GEN-LAST:event_cmd_registerActionPerformed

    private void tableusersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableusersMouseClicked
        // TODO add your handling code here:
         try{
            int row = tableusers.getSelectedRow();
            int col = tableusers.getSelectedColumn();

            String tableclicked = (tableusers.getModel().getValueAt(row, col).toString());
            String sql = "select* from users where username ='"+tableclicked+"'";
             pst=conn.prepareStatement(sql);
             rs = pst.executeQuery();
         if(rs.next()){
         uname.setText(rs.getString("username"));
         pwd.setText(rs.getString("password"));
         cpwd.setText(rs.getString("password"));
         }}
          catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
   
    }//GEN-LAST:event_tableusersMouseClicked

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        // TODO add your handling code here:
        uname.setText("");
         pwd.setText("");
         cpwd.setText("");
         
        
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void cmd_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_delActionPerformed
        // TODO add your handling code here:
        if(uname.getText().isEmpty()||pwd.getText().isEmpty()||cpwd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Fill all the fields!");
        }
        else if(!pwd.getText().equals(cpwd.getText())){
            JOptionPane.showMessageDialog(null, "Password Mismatch!");
        }
        else{
             int d = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete", "Delete", JOptionPane.YES_NO_OPTION);

            if(d==0){
                String sql = "delete from users where username=?";

            try {
                String name =  rs.getString("username"); 
                 if(!name.equals("admin")&&!name.equals("root"))
                 {
                     pst=conn.prepareStatement(sql);
                     pst.setString(1, uname.getText());
                     
                     pst.execute();
                     JOptionPane.showMessageDialog(null, "Deleted");
 
                                   }
                 else{
                          JOptionPane.showMessageDialog(null, "Cannot Delete Admin Account");
  
                     }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);

            }
            update_table();
            }}
    }//GEN-LAST:event_cmd_delActionPerformed

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
         if(uname.getText().isEmpty()||pwd.getText().isEmpty()||cpwd.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Fill all the fields!");
           }
        else if(!pwd.getText().equals(cpwd.getText())){
        JOptionPane.showMessageDialog(null, "Password Mismatch!");
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
        
        update_table();

        }
           
    }//GEN-LAST:event_cmd_updateActionPerformed

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
