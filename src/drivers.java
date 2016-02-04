
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class drivers extends javax.swing.JFrame {

    /**
     * Creates new form drivers
     */
      Connection conn = null;
      ResultSet rs = null;
      PreparedStatement pst = null;
    
    public drivers() {
        initComponents();
        
                 conn = javaconnect.connecrDb();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fname = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmd_save = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        search = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        cmd_viewdrivers = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Driver Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPanel1KeyReleased(evt);
            }
        });

        phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonenoKeyTyped(evt);
            }
        });

        jLabel3.setText("Phone No.");

        jLabel1.setText("First Name");

        cmd_save.setText("Add");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        jLabel2.setText("Sir Name");

        cmd_viewdrivers.setText("View Drivers");
        cmd_viewdrivers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_viewdriversActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cmd_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmd_clear)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(sname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(phoneno, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(search)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_viewdrivers)
                        .addGap(106, 106, 106))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_save)
                    .addComponent(jButton1)
                    .addComponent(cmd_clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(cmd_viewdrivers)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        try{
                 String sql = "insert into drivers(fname,sname,phoneno ) values (?,?,?)";
                 
                 pst=conn.prepareStatement(sql);
                 pst.setString(1, fname.getText());
                 pst.setString(2, sname.getText());
                 pst.setString(3, phoneno.getText());
                 
                 pst.execute();
                // conn.close();
                    JOptionPane.showMessageDialog(null, "Saved");

        
        }
        catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int d = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete", "Delete", JOptionPane.YES_NO_OPTION);
         
        if(d==0){
        String sql = "delete from drivers where phoneno=?";
        
          try {
              pst=conn.prepareStatement(sql);
              pst.setString(1, phoneno.getText());
              
              pst.execute();
                    JOptionPane.showMessageDialog(null, "deleted");

          } catch (SQLException e) {
                   JOptionPane.showMessageDialog(null, e);

          }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
   try{
        String  value1 = fname.getText();
        String  value3 = phoneno.getText();
        
         String sql = "update drivers set fname='"+value1+"',sname='"+value1+"',phoneno='"+value3+"'WHERE phoneno='"+value3+"'";
         
         pst = conn.prepareStatement(sql);
         pst.execute();
        JOptionPane.showMessageDialog(null, "Successfully Updated");

        }
    catch(Exception e)
          {
               JOptionPane.showMessageDialog(null, e);
            }   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyReleased

    private void phonenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenoKeyTyped

        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)|| c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)){
         getToolkit().beep();
         evt.consume();
        }
    }//GEN-LAST:event_phonenoKeyTyped

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "select *from drivers where fname=?  ";

          pst=conn.prepareStatement(sql);
          pst.setString(1, txt_search.getText());
          rs=pst.executeQuery();
          
          if(rs.next()){
            String add1 = rs.getString("fname");
            fname.setText(add1);
            String add2 = rs.getString("sname");
            sname.setText(add2);
            String add3 = rs.getString("phoneno");
            phoneno.setText(add3);
                      
          }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
           
        }
 try{
        String sql = "select *from drivers where sname=?  ";

          pst=conn.prepareStatement(sql);
          pst.setString(1, txt_search.getText());
          rs=pst.executeQuery();
          
          if(rs.next()){
            String add1 = rs.getString("fname");
            fname.setText(add1);
            String add2 = rs.getString("sname");
            sname.setText(add2);
            String add3 = rs.getString("phoneno");
            phoneno.setText(add3);
                      
          }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
           
        }

        
    }//GEN-LAST:event_searchActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        // TODO add your handling code here:
       fname.setText("");
       sname.setText("");
       phoneno.setText("");
       txt_search.setText("");

    }//GEN-LAST:event_cmd_clearActionPerformed

    private void cmd_viewdriversActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_viewdriversActionPerformed
        // TODO add your handling code here:
        
        viewdrivers view = new viewdrivers();
           view.setVisible(true);
    }//GEN-LAST:event_cmd_viewdriversActionPerformed

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
            java.util.logging.Logger.getLogger(drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(drivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new drivers().setVisible(true);
            }
        });
    }
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton cmd_viewdrivers;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField phoneno;
    private javax.swing.JButton search;
    private javax.swing.JTextField sname;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
