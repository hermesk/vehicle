
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class kmrange extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public kmrange() {
        super("Kilometer Overhaul");
        initComponents();
        conn = javaconnect.connecrDb();
        ComboDriver();
        fillCombo();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        diesel = new javax.swing.JTextField();
        tkm = new javax.swing.JTextField();
        ComboBox_vehicle = new javax.swing.JComboBox();
        ComboBox_driver = new javax.swing.JComboBox();
        dibal = new javax.swing.JTextField();
        kmgl = new javax.swing.JTextField();
        tfw = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cmd_clear = new javax.swing.JButton();
        cmd_exit = new javax.swing.JButton();
        cmd_save = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        closekm = new javax.swing.JMenuItem();
        viewkm = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle KM Range Overhaul", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        diesel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dieselKeyTyped(evt);
            }
        });

        tkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkmActionPerformed(evt);
            }
        });
        tkm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tkmKeyTyped(evt);
            }
        });

        dibal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dibalKeyTyped(evt);
            }
        });

        kmgl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kmglKeyTyped(evt);
            }
        });

        tfw.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfwKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfwKeyTyped(evt);
            }
        });

        jLabel10.setText("Vehicle Regno");

        jLabel11.setText("Driver Name");

        jLabel12.setText("KM on GL");

        jLabel13.setText("Total KM covered");

        jLabel14.setText("Diesel consumed");

        jLabel15.setText("Diesel Balance");

        jLabel16.setText("Total Factory Weight ");

        jDateChooser1.setDateFormatString("yyy-MM-dd\n");

        jLabel3.setText("Choose Date");

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        cmd_exit.setText("Exit");
        cmd_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_exitActionPerformed(evt);
            }
        });

        cmd_save.setText("Save");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfw, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dibal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diesel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBox_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tkm, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(kmgl, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ComboBox_driver, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(cmd_save)
                        .addGap(48, 48, 48)
                        .addComponent(cmd_clear)
                        .addGap(49, 49, 49)
                        .addComponent(cmd_exit)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBox_driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dibal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tfw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_clear)
                    .addComponent(cmd_exit)
                    .addComponent(cmd_save))
                .addGap(24, 24, 24))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ComboBox_driver, ComboBox_vehicle, dibal, diesel, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, kmgl, tfw, tkm});

        jMenu1.setText("File");

        closekm.setText("Close");
        closekm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closekmMousePressed(evt);
            }
        });
        jMenu1.add(closekm);

        jMenuBar1.add(jMenu1);

        viewkm.setText("View");
        viewkm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewkmMouseClicked(evt);
            }
        });
        jMenuBar1.add(viewkm);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(386, 386, 386))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(106, 106, 106))
        );

        setSize(new java.awt.Dimension(861, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        if(kmgl.getText().isEmpty()||tkm.getText().isEmpty()||diesel.getText().isEmpty()||
                dibal.getText().isEmpty()||tfw.getText().isEmpty()||tfw.getText().isEmpty()||
                ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");
        
     }
          else{
            
              try{
            String sql = "insert into kmrange (date,vehicle,driver,glkm,tkm,diesel,dbal,tfw,kmh,kgl)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
         pst=conn.prepareStatement(sql);
         float kml = (Float.parseFloat(tkm.getText()))/ (Float.parseFloat(diesel.getText().trim()));
         float kgl = (Float.parseFloat(tfw.getText()))/ (Float.parseFloat(diesel.getText().trim()));
         
            pst.setString(1, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().trim());
            pst.setString(2, ComboBox_vehicle.getSelectedItem().toString().trim());
            pst.setString(3, ComboBox_driver.getSelectedItem().toString().trim());
            pst.setString(4, kmgl.getText().trim().trim());
            pst.setString(5, tkm.getText().trim().trim());
            pst.setString(6, diesel.getText().trim().trim());
            pst.setString(7, dibal.getText().trim().trim());
            pst.setString(8, tfw.getText().trim().trim());
            pst.setFloat(9, kml);
            pst.setFloat(10, kgl);

            pst.execute();

             JOptionPane.showMessageDialog(null, "Saved Successfully");
    }//GEN-LAST:event_cmd_saveActionPerformed
catch(  SQLException | NumberFormatException | HeadlessException e){
              JOptionPane.showMessageDialog(null, e);

        }}}
        /*
    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void cmd_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_exitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd_exitActionPerformed
   */
    private void viewkmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewkmMouseClicked
        // TODO add your handling code here:
         viewkmr vkmr = new viewkmr();
                vkmr.setVisible(true);
    }//GEN-LAST:event_viewkmMouseClicked

    private void closekmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closekmMousePressed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_closekmMousePressed

    private void tfwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfwKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
         getToolkit().beep();}
    }//GEN-LAST:event_tfwKeyTyped

    private void dibalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dibalKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        evt.consume();
         getToolkit().beep();}
    }//GEN-LAST:event_dibalKeyTyped

    private void dieselKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dieselKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        evt.consume();
         getToolkit().beep();}
    }//GEN-LAST:event_dieselKeyTyped

    private void tkmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkmKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        evt.consume();
         getToolkit().beep();}
    }//GEN-LAST:event_tkmKeyTyped

    private void kmglKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kmglKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        evt.consume();
         getToolkit().beep();}
    }//GEN-LAST:event_kmglKeyTyped

    private void tkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tkmActionPerformed

    private void tfwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfwKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
        if(kmgl.getText().isEmpty()||tkm.getText().isEmpty()||diesel.getText().isEmpty()||
                dibal.getText().isEmpty()||tfw.getText().isEmpty()||tfw.getText().isEmpty()||
                ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");
        
     }
          else{
            
              try{
            String sql = "insert into kmrange (date,vehicle,driver,glkm,tkm,diesel,dbal,tfw,kmh,kgl)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
         pst=conn.prepareStatement(sql);
         float kml = (Float.parseFloat(tkm.getText()))/ (Float.parseFloat(diesel.getText().trim()));
         float kgl = (Float.parseFloat(tfw.getText()))/ (Float.parseFloat(diesel.getText().trim()));
         
            pst.setString(1, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText().trim());
            pst.setString(2, ComboBox_vehicle.getSelectedItem().toString().trim());
            pst.setString(3, ComboBox_driver.getSelectedItem().toString().trim());
            pst.setString(4, kmgl.getText().trim().trim());
            pst.setString(5, tkm.getText().trim().trim());
            pst.setString(6, diesel.getText().trim().trim());
            pst.setString(7, dibal.getText().trim().trim());
            pst.setString(8, tfw.getText().trim().trim());
            pst.setFloat(9, kml);
            pst.setFloat(10, kgl);

            pst.execute();

             JOptionPane.showMessageDialog(null, "Saved Successfully");
    }                                        
catch(  SQLException | NumberFormatException | HeadlessException e){
              JOptionPane.showMessageDialog(null, e);

        }}
        }
    }//GEN-LAST:event_tfwKeyPressed
    

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt){
    
        ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText("");
           kmgl.setText("");
           tkm.setText("");
           diesel.setText("");
           dibal.setText("");
           tfw.setText("");  
    }
     private void cmd_exitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
    } 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new kmrange().setVisible(true);
            }
        });
    }
 private void fillCombo(){
     try{
         String sql = "select *from vehicles";
         pst = conn.prepareStatement(sql);
         rs =pst.executeQuery();
         while(rs.next()){
          String Regno = rs.getString("Regno");
          ComboBox_vehicle.addItem(Regno);
         
         }
     
     
     }
     catch(Exception e)
     {
         JOptionPane.showMessageDialog(null, e);

      }
     }
    
    
     private void ComboDriver(){
          try{
         String sql = "select *from drivers";
         pst = conn.prepareStatement(sql);
         rs =pst.executeQuery();
         while(rs.next()){
          String fname = rs.getString("fname");
          String sname = rs.getString("sname");
          String name = fname+ " "+sname;
          ComboBox_driver.addItem(name);
         
         }
       }
     catch(Exception e)
     {
                 JOptionPane.showMessageDialog(null, e);
    }
          }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_driver;
    private javax.swing.JComboBox ComboBox_vehicle;
    private javax.swing.JMenuItem closekm;
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_exit;
    private javax.swing.JButton cmd_save;
    private javax.swing.JTextField dibal;
    private javax.swing.JTextField diesel;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField kmgl;
    private javax.swing.JTextField tfw;
    private javax.swing.JTextField tkm;
    private javax.swing.JMenu viewkm;
    // End of variables declaration//GEN-END:variables
}
