package javafiles;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class admindrivers extends javax.swing.JFrame {

   
      Connection conn = null;
      ResultSet rs = null;
      PreparedStatement pst = null;
    
    public admindrivers() {
       super("Factroy Drivers");
           initComponents();
           conn = javaconnect.connecrDb();
           update_table();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }
 private void update_table(){
      try{
          String sql = "select rowid as 'No',fname as 'First Name',sname as 'Sirname',phoneno as 'Phone No'from drivers";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          table_drivers.setModel( DbUtils.resultSetToTableModel(rs));
          
      }
      catch(Exception e)
      {             JOptionPane.showMessageDialog(null,e);
            }
      
      
      
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        cmd_clear = new javax.swing.JButton();
        fname = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        cmd_update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmd_save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_drivers = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex)
            { return false;}
        };
        ;
        cmd_print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Drivers", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(51, 51, 0));

        jLabel1.setText("First Name");

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        phoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonenoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonenoKeyTyped(evt);
            }
        });

        cmd_update.setText("Update");
        cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_updateActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Phone No.");

        cmd_save.setText("Save");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jLabel2.setText("Sirname");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cmd_save)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                        .addComponent(sname))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(cmd_clear)
                                .addGap(18, 18, 18)
                                .addComponent(cmd_update)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmd_save)
                        .addComponent(cmd_clear)
                        .addComponent(cmd_update)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        table_drivers.setBackground(new java.awt.Color(204, 204, 204));
        table_drivers.setModel(new javax.swing.table.DefaultTableModel(
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
        table_drivers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_driversMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_drivers);

        cmd_print.setText("Print");
        cmd_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_printActionPerformed(evt);
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cmd_print)
                        .addGap(218, 218, 218))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(26, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmd_print))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        if(fname.getText().isEmpty()||sname.getText().isEmpty()||phoneno.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");
        }

        else if(phoneno.getText().length()>10||phoneno.getText().length()<10)
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Invalid Phone Number!</font></h2></html>");
        }
        else if(phoneno.getText().length()==10){

            try {
                String sql ="SELECT COUNT(*) AS total FROM drivers  where phoneno = '"+phoneno.getText()+"'";
                pst=conn.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next()){
                    if(rs.getInt("total")>0)
                    {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Phone Number already exist!</font></h2></html>");
                    }
                    else{
                        try{
                            String add = "insert into drivers(fname,sname,phoneno ) values (?,?,?)";

                            pst=conn.prepareStatement(add);
                            pst.setString(1, fname.getText().toUpperCase().trim());
                            pst.setString(2, sname.getText().toUpperCase().trim());
                            pst.setString(3, phoneno.getText().toUpperCase().trim());

                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");
                        }
                        catch(SQLException | HeadlessException e){
                            JOptionPane.showMessageDialog(null, e);
                        }
                      
                    }
                    }
                } catch (SQLException e) {
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
            else
            {};
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(fname.getText().isEmpty()||sname.getText().isEmpty()||phoneno.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");
        }

        else if(phoneno.getText().length()>10||phoneno.getText().length()<10)
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Invalid Phone Number!</font></h2></html>");
        }
        else{
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

                }
             finally {
                try{
                  rs.close();
                  pst.close();
                  }
                 catch(Exception ex){
                  }
                }
       
            }
        update_table();}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
        if(fname.getText().isEmpty()||sname.getText().isEmpty()||phoneno.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");
        }

        else if(phoneno.getText().length()>10||phoneno.getText().length()<10)
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Invalid Phone Number!</font></h2></html>");
        }
       
        else{
            try{
                String  value1 = fname.getText().toUpperCase().trim();
                String  value2 = sname.getText().toUpperCase().trim();
                String  value3 = phoneno.getText().toUpperCase().trim();

                String sql = "update drivers set fname='"+value1+"',sname='"+value2+"',phoneno='"+value3+"'WHERE phoneno='"+value3+"'";

                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Successfully Updated");

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

    private void phonenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenoKeyTyped

        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
        getToolkit().beep();
        }
    }//GEN-LAST:event_phonenoKeyTyped

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        // TODO add your handling code here:
        fname.setText("");
        sname.setText("");
        phoneno.setText("");
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void table_driversMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_driversMouseClicked
        // TODO add your handling code here:
        try{
            int row = table_drivers.getSelectedRow();
            int col = table_drivers.getSelectedColumn();

            String tableclicked = (table_drivers.getModel().getValueAt(row, col).toString());
            String sql = "select* from drivers where rowid ='"+tableclicked+"'";
             pst=conn.prepareStatement(sql);
             rs = pst.executeQuery();
         if(rs.next()){
           fname.setText(rs.getString("fname").trim());
           sname.setText(rs.getString("sname").trim());
           phoneno.setText(rs.getString("phoneno").trim());
               }
    }                                     
           catch(Exception e){
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
       
    }//GEN-LAST:event_table_driversMouseClicked

    private void cmd_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_printActionPerformed
        // TODO add your handling code here:
          MessageFormat header = new MessageFormat("Ragati Tea Factory Drivers");
          MessageFormat footer = new MessageFormat("Page{0,number,integer}");

      try{
           table_drivers.print(JTable.PrintMode.NORMAL,header,footer);
         }
      catch(java.awt.print.PrinterException e)
      {
         PrintStream format = System.err.format("Cannot print %s%n");
      }
    
    }//GEN-LAST:event_cmd_printActionPerformed

      @SuppressWarnings("empty-statement")
    private void phonenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonenoKeyPressed
       
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         if(fname.getText().isEmpty()||sname.getText().isEmpty()||phoneno.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");
        }

        else if(phoneno.getText().length()>10||phoneno.getText().length()<10)
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Invalid Phone Number!</font></h2></html>");
        }
        else if(phoneno.getText().length()==10){

            try {
                String sql ="SELECT COUNT(*) AS total FROM drivers  where phoneno = '"+phoneno.getText()+"'";
                pst=conn.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next()){
                    if(rs.getInt("total")>0)
                    {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Phone Number already exist!</font></h2></html>");
                    }
                    else{
                        try{
                            String add = "insert into drivers(fname,sname,phoneno ) values (?,?,?)";

                            pst=conn.prepareStatement(add);
                            pst.setString(1, fname.getText().toUpperCase().trim());
                            pst.setString(2, sname.getText().toUpperCase().trim());
                            pst.setString(3, phoneno.getText().toUpperCase().trim());

                            pst.execute();
                            JOptionPane.showMessageDialog(null, "Saved");
                        }
                        catch(SQLException | HeadlessException e){
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
       
                    }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
              
            }
           
        }
    }//GEN-LAST:event_phonenoKeyPressed

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
            java.util.logging.Logger.getLogger(admindrivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindrivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindrivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindrivers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindrivers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_print;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton cmd_update;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField sname;
    private javax.swing.JTable table_drivers;
    // End of variables declaration//GEN-END:variables
}
