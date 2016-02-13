
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

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
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txt_Date = new com.toedter.calendar.JDateChooser();
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
        jPanel4 = new javax.swing.JPanel();
        cmd_exit = new javax.swing.JButton();
        cmd_save = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        closekm = new javax.swing.JMenuItem();
        viewkm = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Date");

        txt_Date.setDateFormatString("yyy-MM-dd\n");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Vehicle KM Range Overhaul");

        diesel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dieselKeyTyped(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(dibal, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diesel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tkm, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kmgl, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfw)
                            .addComponent(ComboBox_driver, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(161, 161, 161)
                        .addComponent(ComboBox_vehicle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBox_driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tkm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dibal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ComboBox_driver, ComboBox_vehicle, dibal, diesel, jLabel10, jLabel11, jLabel12, jLabel13, jLabel14, jLabel15, jLabel16, kmgl, tfw, tkm});

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

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmd_save)
                .addGap(15, 15, 15)
                .addComponent(cmd_clear)
                .addGap(18, 18, 18)
                .addComponent(cmd_exit)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_save)
                    .addComponent(cmd_exit)
                    .addComponent(cmd_clear))
                .addContainerGap())
        );

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
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(586, 550));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
         if(((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().isEmpty())
                    {
                  JOptionPane.showMessageDialog(null,"Choose Date");
                    }
        if(kmgl.getText().isEmpty())
                    {
                   kmgl.setText("Fill ");
                 kmgl.setForeground(Color.RED);}
        if(tkm.getText().isEmpty())
                    {
                   tkm.setText("Fill ");
               tkm.setForeground(Color.RED);}
        if(diesel.getText().isEmpty())
                    {
                    diesel.setText("Fill ");
                   diesel.setForeground(Color.RED);}
         if(dibal.getText().isEmpty())
                    {
                    dibal.setText("Fill ");
                   dibal.setForeground(Color.RED);}
          if(tfw.getText().isEmpty())
                    {
                    tfw.setText("Fill ");
                   tfw.setForeground(Color.RED);}
          else{
            
              try{
            String sql = "insert into kmrange (date,vehicle,driver,glkm,tkm,diesel,dbal,tfw,kmh,kgl)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
         pst=conn.prepareStatement(sql);
         float kml = (Float.parseFloat(tkm.getText()))/ (Float.parseFloat(diesel.getText()));
         float kgl = (Float.parseFloat(tfw.getText()))/ (Float.parseFloat(diesel.getText()));
         
            pst.setString(1, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText());
            pst.setString(2, ComboBox_vehicle.getSelectedItem().toString());
            pst.setString(3, ComboBox_driver.getSelectedItem().toString());
            pst.setString(4, kmgl.getText());
            pst.setString(5, tkm.getText());
            pst.setString(6, diesel.getText());
            pst.setString(7, dibal.getText());
            pst.setString(8, tfw.getText());
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
    

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt){
    
        ((JTextField)txt_Date.getDateEditor().getUiComponent()).setText("");
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField kmgl;
    private javax.swing.JTextField tfw;
    private javax.swing.JTextField tkm;
    private com.toedter.calendar.JDateChooser txt_Date;
    private javax.swing.JMenu viewkm;
    // End of variables declaration//GEN-END:variables
}
