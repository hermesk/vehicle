package javafiles;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;


public class vehicles extends javax.swing.JDialog{

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
       
    public vehicles(java.awt.Frame parent, boolean modal) {
        
      super(parent, modal);
        initComponents();
        conn = javaconnect.connecrDb();
        update_table();
    }

    private void update_table(){
      try{
          String sql = "select  Regno as Regno,DOP as Date_of_Purchase,Make from vehicles";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          tablevehicles.setModel( DbUtils.resultSetToTableModel(rs));

      }
      catch(Exception e)
      {
             JOptionPane.showMessageDialog(null,e);
      
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
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmd_print = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_Date = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmd_save = new javax.swing.JButton();
        txt_make = new javax.swing.JTextField();
        txt_regno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmd_delete = new javax.swing.JButton();
        cmdclear = new javax.swing.JButton();
        cmd_update = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablevehicles = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we)
            { 
                String ObjButtons[] = {"Yes","No"};
                int PromptResult = JOptionPane.showOptionDialog(null,"Are you sure you want to close?","Confirm",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
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
        setTitle("\t\t\t\t\tFACTORY VEHICLES");
        setFont(new java.awt.Font("Agency FB", 1, 14)); // NOI18N
        setIconImage(null);
        setIconImages(null);

        cmd_print.setText("Print");
        cmd_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_printActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Factory Vehicles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txt_Date.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("Date of Purchase");

        jLabel3.setText("Make ");

        cmd_save.setText("Save");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        txt_make.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_makeKeyPressed(evt);
            }
        });

        txt_regno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_regnoActionPerformed(evt);
            }
        });
        txt_regno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_regnoKeyTyped(evt);
            }
        });

        jLabel1.setText("Enter  Vehicle Registration Number");

        cmd_delete.setText("Delete");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        cmdclear.setText("Clear");
        cmdclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdclearActionPerformed(evt);
            }
        });

        cmd_update.setText("Update");
        cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(cmd_save)
                        .addGap(28, 28, 28)
                        .addComponent(cmdclear)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_make, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_Date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(txt_regno, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(cmd_update)
                        .addGap(18, 18, 18)
                        .addComponent(cmd_delete)
                        .addGap(51, 51, 51))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_regno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_make, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_save)
                    .addComponent(cmd_delete)
                    .addComponent(cmdclear)
                    .addComponent(cmd_update))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tablevehicles.setModel(new javax.swing.table.DefaultTableModel(
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
        tablevehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablevehiclesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablevehicles);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmd_print)
                .addGap(215, 215, 215))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(cmd_print)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Close");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
              
             if(txt_make.getText().trim().isEmpty()||((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty()||
                     txt_regno.getText().trim().isEmpty())
             {        
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
             }
             else if(txt_regno.getText().trim().length()>8||txt_regno.getText().trim().length()<8)
                        {   
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Invalid registration number!</font></h2></html>");
                        }
                else if(txt_regno.getText().trim().length()==8){
                     try
                     {
                        String check ="SELECT COUNT(*) AS total FROM vehicles  where Regno = '"+txt_regno.getText()+"'"; 
                        pst=conn.prepareStatement(check);
                        rs = pst.executeQuery();
                        while(rs.next()){
                        if(rs.getInt("total")>0)
                        {
                          JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>vehicle already exist!</font></h2></html>");
          
                       }
              else{
                   
              try{
                 String sql = "insert into vehicles(Regno,DOP,Make ) values (?,?,?)";
                 
                pst=conn.prepareStatement(sql);
                pst.setString(1, txt_regno.getText().trim().toUpperCase()); 
                pst.setString(2, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim());
                pst.setString(3, txt_make.getText().trim().toUpperCase());
                
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
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void txt_regnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_regnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_regnoActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        // TODO add your handling code here:
         if(txt_make.getText().trim().isEmpty()||((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty()||
                     txt_regno.getText().trim().isEmpty())
             {    
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
             }
             else if(txt_regno.getText().trim().length()>8||txt_regno.getText().trim().length()<8)
                        {   
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Invalid registration number!</font></h2></html>");
                        }
             else{
                   int d = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete", "Delete", JOptionPane.YES_NO_OPTION);
         
                 if(d==0){
                 String sql = "delete from vehicles where Regno=?";
        
          try {
              pst=conn.prepareStatement(sql);
              pst.setString(1, txt_regno.getText());
              
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
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void txt_regnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regnoKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_regnoKeyTyped

    private void cmdclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdclearActionPerformed
        // TODO add your handling code here:
       txt_regno.setText("");
      ((JTextField)txt_Date.getDateEditor().getUiComponent()).setText("");
        txt_make.setText("");
    }//GEN-LAST:event_cmdclearActionPerformed

    private void txt_makeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_makeKeyPressed
       
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
             
             if(txt_make.getText().trim().isEmpty()||((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty())
             {           
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
             
             if(txt_regno.getText().trim().length()>8||txt_regno.getText().trim().length()<8)
                        {   
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Invalid registration number!</font></h2></html>");
                        }
             }
           else{
                   
              try{
                 String sql = "insert into vehicles(Regno,DOP,Make ) values (?,?,?)";
                 
                pst=conn.prepareStatement(sql);
                
                pst.setString(1, txt_regno.getText().trim().toUpperCase()); 
                
                pst.setString(2, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim());
                
                pst.setString(3, txt_make.getText().trim().toUpperCase());
                
               
                 pst.execute();
               
                 JOptionPane.showMessageDialog(null, "Saved");
         }
        catch(SQLException | HeadlessException e){
                    //JOptionPane.showMessageDialog(null, );
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
    }//GEN-LAST:event_txt_makeKeyPressed

    private void tablevehiclesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablevehiclesMouseClicked
        // TODO add your handling code here:
         try{
            int row = tablevehicles.getSelectedRow();
            int col = tablevehicles.getSelectedColumn();

            String tableclicked = (tablevehicles.getModel().getValueAt(row, col).toString());
            String sql = "select* from vehicles where Regno ='"+tableclicked+"'";
             pst=conn.prepareStatement(sql);
             rs = pst.executeQuery();
         if(rs.next()){
         txt_regno.setText(rs.getString("Regno"));
          String dt = rs.getString("DOP");
          java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dt);
           txt_Date.setDate(date);
          txt_make.setText(rs.getString("Make"));
         }}
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
       
    }//GEN-LAST:event_tablevehiclesMouseClicked

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
         if(txt_make.getText().trim().isEmpty()||((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty()||
                     txt_regno.getText().trim().isEmpty())
             {         
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
             }
             else if(txt_regno.getText().trim().length()>8||txt_regno.getText().trim().length()<8)
                        {   
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Invalid registration number!</font></h2></html>");
                        }
             else if(txt_regno.getText().trim().length()==8){
                     try
                     {
                        String check ="SELECT COUNT(*) AS total FROM vehicles  where Regno = '"+txt_regno.getText()+"'"; 
                        pst=conn.prepareStatement(check);
                        rs = pst.executeQuery();
                        while(rs.next()){
                        if(rs.getInt("total")==0)
                        {
                        JOptionPane.showMessageDialog(null, 
                                "<html><h2><font color='red'>vehicle does not exist!</font></h2></html>");
          
                       }
               
             else{
                   
            try
        {      
                
                String v = txt_regno.getText().trim();
                String v1 =((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim();
                String v2 =txt_make.getText().trim().toUpperCase();
                
                String sql = "update vehicles set Regno='"+v+"',DOP='"+v1+"',Make='"+v2+"' where Regno='"+v+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
            
            JOptionPane.showMessageDialog(null, "Updated");
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
          }}}
              catch (SQLException e) 
              {
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
               
    }//GEN-LAST:event_cmd_updateActionPerformed

    private void cmd_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_printActionPerformed
        // TODO add your handling code here:
                                                               
     MessageFormat header = new MessageFormat("Ragati Tea Factory Vehicles");
      MessageFormat footer = new MessageFormat("Page{0,number,integer}");

      try{
           tablevehicles.print(JTable.PrintMode.NORMAL,header,footer);
         }
      catch(java.awt.print.PrinterException e)
      {
         PrintStream format = System.err.format("Cannot print %s%n");
      }
    }//GEN-LAST:event_cmd_printActionPerformed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenuItem1MousePressed
         
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              new vehicles(null,true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_print;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton cmd_update;
    private javax.swing.JButton cmdclear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablevehicles;
    private com.toedter.calendar.JDateChooser txt_Date;
    private javax.swing.JTextField txt_make;
    private javax.swing.JTextField txt_regno;
    // End of variables declaration//GEN-END:variables
}
