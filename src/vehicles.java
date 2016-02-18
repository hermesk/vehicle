
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class vehicles extends javax.swing.JFrame {

        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst = null;
    
    public vehicles() {
        super("Add New Vehicle");
        initComponents();
        conn = javaconnect.connecrDb();

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txt_Date = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmd_save = new javax.swing.JButton();
        txt_make = new javax.swing.JTextField();
        txt_regno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmdexit = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        cmdsearch = new javax.swing.JButton();
        cmdclear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        viewdr = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add New Vehicle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

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

        cmdexit.setText("Exit");
        cmdexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexitActionPerformed(evt);
            }
        });

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmdsearch.setText("Search");
        cmdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsearchActionPerformed(evt);
            }
        });

        cmdclear.setText("Clear");
        cmdclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmd_save)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmdclear)
                        .addGap(22, 22, 22)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_make, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_Date, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(txt_regno, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmdsearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_search, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cmdexit)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_regno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdsearch))
                .addGap(15, 15, 15)
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
                    .addComponent(cmdexit)
                    .addComponent(jButton1)
                    .addComponent(cmdclear))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setText("Close");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        viewdr.setText("View");
        viewdr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewdrMouseClicked(evt);
            }
        });
        jMenuBar1.add(viewdr);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
              
             if(txt_make.getText().isEmpty()||((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().isEmpty()||
                     txt_regno.getText().isEmpty())
             {           JOptionPane.showMessageDialog(null, "Fill all the fields!");
             }
             else if(txt_regno.getText().length()>8||txt_regno.getText().length()<8)
                        {   
                           JOptionPane.showMessageDialog(null, "Invalid registration number!");
                        }
                else if(txt_regno.getText().length()==8){
                     try
                     {
                        String check ="SELECT COUNT(*) AS total FROM vehicles  where Regno = '"+txt_regno.getText()+"'"; 
                        pst=conn.prepareStatement(check);
                        rs = pst.executeQuery();
                        while(rs.next()){
                        if(rs.getInt("total")>0)
                        {
                          JOptionPane.showMessageDialog(null, "vehicle already exist!");
                        }
              else{
                   
              try{
                 String sql = "insert into vehicles(Regno,DOP,Make ) values (?,?,?)";
                 
                pst=conn.prepareStatement(sql);
                pst.setString(1, txt_regno.getText().toUpperCase()); 
                pst.setString(2, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText());
                pst.setString(3, txt_make.getText().toUpperCase());
                
                pst.execute();
               
                 JOptionPane.showMessageDialog(null, "Saved");
                }
              
        catch(SQLException | HeadlessException e){

        }}}
                     }catch (SQLException e) {
                               JOptionPane.showMessageDialog(null, e);
                           }
         
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

    private void viewdrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewdrMouseClicked
        // TODO add your handling code here:
        viewvehicles vwvh = new viewvehicles();
                     vwvh.setVisible(true);
    }//GEN-LAST:event_viewdrMouseClicked

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cmdexitActionPerformed

    private void cmdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsearchActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "select *from vehicles where Regno=?  ";

          pst=conn.prepareStatement(sql);
          pst.setString(1, txt_search.getText().toUpperCase());
          rs=pst.executeQuery();
          
          if(rs.next()){
            txt_regno.setText(rs.getString(1));
            String dop = rs.getString(2);
            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dop);
            txt_Date.setDate(date);
            txt_make.setText(rs.getString(3));
                      
          }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
           
        }
    }//GEN-LAST:event_cmdsearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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

          }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_regnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_regnoKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txt_regnoKeyTyped

    private void cmdclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdclearActionPerformed
        // TODO add your handling code here:
       txt_regno.setText("");
       txt_search.setText("");
      ((JTextField)txt_Date.getDateEditor().getUiComponent()).setText("");
        txt_make.setText("");
    }//GEN-LAST:event_cmdclearActionPerformed

    private void txt_makeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_makeKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
             
             if(txt_make.getText().isEmpty()||((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().isEmpty())
             {           JOptionPane.showMessageDialog(null, "Fill all the fields!");
             
             if(txt_regno.getText().length()>8||txt_regno.getText().length()<8)
                        {   
                           JOptionPane.showMessageDialog(null, "Invalid registration number!");
                        }
             }
           else{
                   
              try{
                 String sql = "insert into vehicles(Regno,DOP,Make ) values (?,?,?)";
                 
                pst=conn.prepareStatement(sql);
                
                pst.setString(1, txt_regno.getText().toUpperCase()); 
                
                pst.setString(2, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText());
                
                pst.setString(3, txt_make.getText().toUpperCase());
                
               
                 pst.execute();
               
                 JOptionPane.showMessageDialog(null, "Saved");
         }
        catch(SQLException | HeadlessException e){
                    //JOptionPane.showMessageDialog(null, );

        }} 
        }
    }//GEN-LAST:event_txt_makeKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              new vehicles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton cmdclear;
    private javax.swing.JButton cmdexit;
    private javax.swing.JButton cmdsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser txt_Date;
    private javax.swing.JTextField txt_make;
    private javax.swing.JTextField txt_regno;
    private javax.swing.JTextField txt_search;
    private javax.swing.JMenu viewdr;
    // End of variables declaration//GEN-END:variables
}
