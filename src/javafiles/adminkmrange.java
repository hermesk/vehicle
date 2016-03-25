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
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;


public class adminkmrange extends javax.swing.JDialog {

    
    Connection conn = null;
    ResultSet rs = null;
    ResultSet rss = null;
    
    
    PreparedStatement pst = null;   
    public adminkmrange(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        conn = javaconnect.connecrDb();
        ComboDriver();
        fillCombo();
        update_table();
        setResizable(false);
    } 
    private void fixWidth(final JTable table, final int columnIndex, final int width) {
        TableColumn column = table.getColumnModel().getColumn(columnIndex);
        column.setMinWidth(width);
        column.setMaxWidth(width);
        column.setPreferredWidth(width);
    }
   
    
     public double getSum(){
         DecimalFormat df = new DecimalFormat("###.##");
         DefaultTableModel model = (DefaultTableModel)tablekmr.getModel();
        double fw=0,glkm=0,Tkm=0,fuel=0,lpkm=0,kgpl=0;
        float kg=0,kp=0;
               
        for(int i=0;i<tablekmr.getRowCount();i++){
            String d= tablekmr.getValueAt(i, 4).toString();
            double d1=Double.parseDouble(d);   
          glkm+=d1;
            }
        for(int i=0;i<tablekmr.getRowCount();i++){
            String d= tablekmr.getValueAt(i, 5).toString();
            double d1=Double.parseDouble(d);
          Tkm+=d1;
            }
        for(int i=0;i<tablekmr.getRowCount();i++)
           {
            String d= tablekmr.getValueAt(i, 6).toString();
            double d1=Double.parseDouble(d);
          fuel+=d1;
            }
          for(int i=0;i<tablekmr.getRowCount();i++){
            String d= tablekmr.getValueAt(i, 8).toString();
            double d1=Double.parseDouble(d);
            fw+=d1;
            }
         for(int i=0;i<tablekmr.getRowCount();i++){
            String d= tablekmr.getValueAt(i, 9).toString();
            double d1=Double.parseDouble(d);
             lpkm+=d1;
             kp =(float) (lpkm/(i+1));
            }
          for(int i=0;i<tablekmr.getRowCount();i++)
           {
            String d= tablekmr.getValueAt(i,10).toString();
            float d1=Float.parseFloat(d);
            kgpl+=d1;
            kg = (float) (kgpl/(i+1));
        
              } 
          
               String  kgppl = df.format(kg);
               String  lpkma = df.format(kp);
               Object[] row = { "","<html><h3><font color='black'>Total</font></h3></html>","", "", glkm,Tkm,fuel,"",fw,lpkma,kgppl};
                model.addRow(row);
                int  b= tablekmr.getRowCount()-1;
                 for(int i=10;i>=4;i--){
                     tablekmr.setValueAt("<html><u><b>" + tablekmr.getValueAt(b,i) + "</b></u></html>",b,i);
                 }

        return fw;
    }
    
  private void update_table(){
      try{
          String sql;
          sql = "select id,date as 'Date',vehicle as 'Vehicle',driver as 'Driver',glkm as 'KM on GL'"
                  + ",tkm as 'Total KM',diesel as 'Diesel',dbal as 'Diesel Bal',tfw as 'Factory Weight'"
                  + ",kmh as 'L/KM', kgl as 'KG/L'from kmrange";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          tablekmr.setModel( DbUtils.resultSetToTableModel(rs));
        fixWidth(tablekmr, 0, 50);
        fixWidth(tablekmr, 1, 80);
        fixWidth(tablekmr, 2, 80);
        fixWidth(tablekmr, 3, 150); 
        fixWidth(tablekmr, 4, 70);
        fixWidth(tablekmr, 5, 70);
        fixWidth(tablekmr, 6, 60);
        fixWidth(tablekmr, 7, 70);
        fixWidth(tablekmr, 8, 100);
        fixWidth(tablekmr, 9, 60);
        fixWidth(tablekmr, 10, 60);
        getSum();
        
        
      }
      catch(Exception e)
      {
             JOptionPane.showMessageDialog(null,e);
      
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
       
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablekmr = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex)
            { return false;}
        };
        ;
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
        txt_Date = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        cmd_clear = new javax.swing.JButton();
        cmd_del = new javax.swing.JButton();
        cmd_save = new javax.swing.JButton();
        cmd_update = new javax.swing.JButton();
        cmd_print = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sdate = new com.toedter.calendar.JDateChooser();
        tdate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        txt_search = new javax.swing.JButton();

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

        tablekmr.setModel(new javax.swing.table.DefaultTableModel(
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
        tablekmr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablekmrMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablekmr);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicle KM Range Overhaul", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

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

        txt_Date.setDateFormatString("yyy-MM-dd\n");

        jLabel3.setText("Choose Date");

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        cmd_del.setText("Delete");
        cmd_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_delActionPerformed(evt);
            }
        });

        cmd_save.setText("Save");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tkm)
                            .addComponent(kmgl)
                            .addComponent(txt_Date, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(ComboBox_vehicle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBox_driver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(diesel)
                            .addComponent(dibal)
                            .addComponent(tfw)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(cmd_save)
                        .addGap(18, 18, 18)
                        .addComponent(cmd_clear)
                        .addGap(32, 32, 32)
                        .addComponent(cmd_update)
                        .addGap(29, 29, 29)
                        .addComponent(cmd_del)))
                .addContainerGap(21, Short.MAX_VALUE))
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
                        .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_del)
                    .addComponent(cmd_update)
                    .addComponent(cmd_clear)
                    .addComponent(cmd_save))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmd_print.setText("Print");
        cmd_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_printActionPerformed(evt);
            }
        });

        jLabel1.setText("From");

        sdate.setDateFormatString("yyyy-MM-dd\n");

        tdate.setDateFormatString("yyyy-MM-dd");

        jLabel2.setText("To");

        txt_search.setText("Search");
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(txt_search)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmd_print)
                .addGap(393, 393, 393))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmd_print)
                .addGap(16, 16, 16))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1329, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dieselKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dieselKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        evt.consume();
        getToolkit().beep();}
    }//GEN-LAST:event_dieselKeyTyped

    private void tkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tkmActionPerformed

    private void tkmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tkmKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        evt.consume();
        getToolkit().beep();}
    }//GEN-LAST:event_tkmKeyTyped

    private void dibalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dibalKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        evt.consume();
        getToolkit().beep();}
    }//GEN-LAST:event_dibalKeyTyped

    private void kmglKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kmglKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        evt.consume();
        getToolkit().beep();}
    }//GEN-LAST:event_kmglKeyTyped

    private void tfwKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfwKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
        getToolkit().beep();}
    }//GEN-LAST:event_tfwKeyTyped

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        ((JTextField)sdate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)tdate.getDateEditor().getUiComponent()).setText("");        
        ((JTextField)txt_Date.getDateEditor().getUiComponent()).setText("");
        kmgl.setText("");
        diesel.setText("");
        dibal.setText("");
        tfw.setText("");
        tfw.setText("");
        tkm.setText("");
           update_table();
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void cmd_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_delActionPerformed
        if(kmgl.getText().trim().isEmpty()||tkm.getText().trim().isEmpty()||diesel.getText().trim().isEmpty()||
                dibal.getText().trim().isEmpty()||tfw.getText().trim().isEmpty()||
                ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
        
     }
          else{
           int d = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete", "Delete", JOptionPane.YES_NO_OPTION);
         
                 if(d==0){
                 String sql = "delete from kmrange where id=?";
        
          try {
              pst=conn.prepareStatement(sql);
              pst.setString(1, rss.getString("id"));
              
              pst.execute();
        ((JTextField)sdate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)tdate.getDateEditor().getUiComponent()).setText("");        
        ((JTextField)txt_Date.getDateEditor().getUiComponent()).setText("");
        kmgl.setText("");
        diesel.setText("");
        dibal.setText("");
        tfw.setText("");
        tfw.setText("");
        tkm.setText("");
        
                    JOptionPane.showMessageDialog(null, "deleted");

          } catch (SQLException e) {
                   JOptionPane.showMessageDialog(null, e);
                 
         }
          finally {
                try{
                  if(rs!=null&&pst!=null){
                  rs.close();
                  rss=null;
                  pst.close();
                  pst=null;
                    }
                  }
                 catch(Exception ex){
                  }
                }
                        
                 }
         
         update_table();
    }
    }//GEN-LAST:event_cmd_delActionPerformed

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        int a =Integer.parseInt(kmgl.getText().trim());
        int b =Integer.parseInt(tkm.getText().trim());

        if(kmgl.getText().trim().isEmpty()||tkm.getText().trim().isEmpty()||diesel.getText().trim().isEmpty()||
            dibal.getText().trim().isEmpty()||tfw.getText().trim().isEmpty()||tfw.getText().trim().isEmpty()||
            ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");

        } 
     else if(a>b){
           JOptionPane.showMessageDialog(null, "<html><h2>GL KM cannot be greater than total KM</h2></html>");
                                         }
        else{

            try{
                String sql = "insert into kmrange (date,vehicle,driver,glkm,tkm,diesel,dbal,tfw,kmh,kgl)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
                pst=conn.prepareStatement(sql);
                DecimalFormat df = new DecimalFormat("###.##");
                float kml = (Float.parseFloat(tkm.getText().trim()))/ (Float.parseFloat(diesel.getText().trim()));
                float kgl = (Float.parseFloat(tfw.getText().trim()))/ (Float.parseFloat(diesel.getText().trim()));
                String kpl = df.format(kml);
                String kgpl = df.format(kgl);
                pst.setString(1, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText());
                pst.setString(2, ComboBox_vehicle.getSelectedItem().toString());
                pst.setString(3, ComboBox_driver.getSelectedItem().toString());
                pst.setString(4, kmgl.getText().trim());
                pst.setString(5, tkm.getText().trim());
                pst.setString(6, diesel.getText().trim());
                pst.setString(7, dibal.getText().trim());
                pst.setFloat(8, (Float.parseFloat(tfw.getText().trim())));
                pst.setString(9, kpl);
                pst.setString(10, kgpl);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Saved Successfully");
    }//GEN-LAST:event_cmd_saveActionPerformed
catch(  SQLException | NumberFormatException | HeadlessException e){
              JOptionPane.showMessageDialog(null, e);     
       }
             finally {
                try{
                  pst.close();
                  }
                 catch(Exception ex){
                  }
                }
       
      ((JTextField)sdate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)tdate.getDateEditor().getUiComponent()).setText("");        
        ((JTextField)txt_Date.getDateEditor().getUiComponent()).setText("");
        kmgl.setText("");
        diesel.setText("");
        dibal.setText("");
        tfw.setText("");
        tfw.setText("");
        tkm.setText("");
           update_table();
        }}
    private void tablekmrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablekmrMouseClicked
           try{
            int row = tablekmr.getSelectedRow();
            int col = tablekmr.getSelectedColumn();

            String tableclicked = (tablekmr.getModel().getValueAt(row, col).toString());
            String sql = "select* from kmrange where id ='"+tableclicked+"'";
             pst=conn.prepareStatement(sql);
             rss = pst.executeQuery();
             
         if(rss.next()){
             String dt = rss.getString("date");
             java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dt);
             txt_Date.setDate(date);
          
             ComboBox_vehicle.setSelectedItem(rss.getString("vehicle"));
           
             ComboBox_driver.setSelectedItem(rss.getString("driver"));
             kmgl.setText(rss.getString("glkm"));
             tkm.setText(rss.getString("tkm"));
             diesel.setText(rss.getString("diesel"));
             dibal.setText(rss.getString("dbal"));
             tfw.setText(rss.getString("tfw"));
         }
    }//GEN-LAST:event_tablekmrMouseClicked
           catch(SQLException | ParseException e){
               JOptionPane.showMessageDialog(null, e);
           }
           finally {
                try{
                  if(rs!=null&&pst!=null){
                  rs.close();
                  rss=null;
                  pst.close();
                  pst=null;
                    }
                  }
                 catch(Exception ex){
                  }
                }
       
    }       
    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
         
        if(kmgl.getText().trim().isEmpty()||tkm.getText().trim().isEmpty()||diesel.getText().trim().isEmpty()||
                dibal.getText().trim().isEmpty()||tfw.getText().trim().isEmpty()||tfw.getText().trim().isEmpty()||
                ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");
        
        }
          else{
         try
        {      
            
               SimpleDateFormat sdf=new SimpleDateFormat("kk:mm");
               
                 sdf.setTimeZone(TimeZone.getDefault());
                 float kml = (Float.parseFloat(tkm.getText()))/ (Float.parseFloat(diesel.getText()));
                 float kgl = (Float.parseFloat(tfw.getText()))/ (Float.parseFloat(diesel.getText()));
                
                String v = rss.getString("id");
                String v1 =((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim();
                String v2 =ComboBox_vehicle.getSelectedItem().toString();
                String v3 =ComboBox_driver.getSelectedItem().toString();
                String v4 =kmgl.getText().trim();
                String v5 =tkm.getText().trim();
                String v6 =diesel.getText().trim();
                String v7 =dibal.getText().trim();
                String v8 =tfw.getText().trim();
                
                String sql = "update kmrange set date= '"+v1+"',vehicle='"+v2+"',driver='"+v3+"',glkm='"+v4+"',"
                        + "tkm='"+v5+"',diesel='"+v6+"',dbal='"+v7+"',tfw='"+v8+"',kmh='"+kml+"',kgl='"+kgl+"'"
                        + "where id='"+v+"'";
                pst=conn.prepareStatement(sql);
                pst.execute();          
            JOptionPane.showMessageDialog(null, "Updated");
        }
        catch(NumberFormatException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
        }
         finally {
                try{
                  rss.close();
                  pst.close();
                  }
                 catch(Exception ex){
                  }
                }
       
        update_table();         
          }             
    }//GEN-LAST:event_cmd_updateActionPerformed

    private void cmd_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_printActionPerformed
        // TODO add your handling code here:
           MessageFormat header = new MessageFormat("Ragati Tea Factory Vehicle Km Overhaul");
           MessageFormat footer = new MessageFormat("Page{0,number,integer}");

      try{
           tablekmr.print(JTable.PrintMode.NORMAL,header,footer);
         }
      catch(java.awt.print.PrinterException e)
      {
         PrintStream format = System.err.format("Cannot print %s%n");
      }
    
    }//GEN-LAST:event_cmd_printActionPerformed

    private void tfwKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfwKeyPressed
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(kmgl.getText().trim().isEmpty()||tkm.getText().trim().isEmpty()||diesel.getText().trim().isEmpty()||
            dibal.getText().isEmpty()||tfw.getText().trim().isEmpty()||tfw.getText().trim().isEmpty()||
            ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");

        }
        else{

            try{
                String sql = "insert into kmrange (date,vehicle,driver,glkm,tkm,diesel,dbal,tfw,kmh,kgl)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
                pst=conn.prepareStatement(sql);
                float kml = (Float.parseFloat(tkm.getText().trim()))/ (Float.parseFloat(diesel.getText().trim()));
                float kgl = (Float.parseFloat(tfw.getText().trim()))/ (Float.parseFloat(diesel.getText().trim()));

                pst.setString(1, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText());
                pst.setString(2, ComboBox_vehicle.getSelectedItem().toString());
                pst.setString(3, ComboBox_driver.getSelectedItem().toString());
                pst.setString(4, kmgl.getText().trim());
                pst.setString(5, tkm.getText().trim());
                pst.setString(6, diesel.getText().trim());
                pst.setString(7, dibal.getText().trim());
                pst.setString(8, tfw.getText().trim());
                pst.setFloat(9, kml);
                pst.setFloat(10, kgl);

                pst.execute();

                JOptionPane.showMessageDialog(null, "Saved Successfully");
    }                                        
catch(  SQLException | NumberFormatException | HeadlessException e){
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
         
         }
    }//GEN-LAST:event_tfwKeyPressed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
 
        if(((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty()&&
               ((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
            {
             JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill start date and end date</font></html>");
            }
       else if(((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
       {
        JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill start date</font></html>");
       }
       else if(((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
       {        JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill end date</font></html>");
       }
       else{
        try {
            String start=((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim();
            String end=((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim();
            
            String check = "select COUNT (*)as total from kmrange where date >='"+start+"'and date <='"+end+"'";

            pst=conn.prepareStatement(check);
            rs = pst.executeQuery();
            int tt =rs.getInt("total");
            
            if(tt==0){
                   JOptionPane.showMessageDialog(null, "<html><font color='red'>No record Found!</font></html>");
                }
            else{
            JOptionPane.showMessageDialog(null, tt+" "+"records found");

            while(rs.next()){
                if(rs.getInt("total")>0)

                try{
                    String sql= "select id,date as 'Date',vehicle as 'Vehicle',driver as 'Driver',glkm as 'KM on GL'"
                    + ",tkm as 'Total KM',diesel as 'Diesel',dbal as 'Diesel Bal',tfw as 'Factory Weight'"
                    + ",kmh as 'L/KM', kgl as 'KG/L'from kmrange where date >='"+start+"'and date <='"+end+"'";
                    pst = conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tablekmr.setModel( DbUtils.resultSetToTableModel(rs));
                    fixWidth(tablekmr, 0, 50);
                    fixWidth(tablekmr, 1, 80);
                    fixWidth(tablekmr, 2, 80);
                    fixWidth(tablekmr, 3, 150); 
                    fixWidth(tablekmr, 4, 70);
                    fixWidth(tablekmr, 5, 70);
                    fixWidth(tablekmr, 6, 70);
                    fixWidth(tablekmr, 7, 80);
                    fixWidth(tablekmr, 8, 100);
                    getSum();

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
       
                else {
                    JOptionPane.showMessageDialog(null, "<html><font color='red'>No record Found!</font></html>");

                }

            }}}
            catch (SQLException | HeadlessException ex) {

                JOptionPane.showMessageDialog(null, ex);

            }}
    }//GEN-LAST:event_txt_searchActionPerformed
 
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
            java.util.logging.Logger.getLogger(adminkmrange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminkmrange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminkmrange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminkmrange.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new adminkmrange(null,true).setVisible(true);
            }
        });
    }
private void fillCombo(){
     try{
         String sql = "select *from vehicles";
         pst = conn.prepareStatement(sql);
         rs =pst.executeQuery();
         while(rs.next()){
          String Regno = rs.getString("Regno").trim();
          ComboBox_vehicle.addItem(Regno);
         
         }
     
     
     }
     catch(Exception e)
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
    
    
     private void ComboDriver(){
          try{
         String sql = "select *from drivers";
         pst = conn.prepareStatement(sql);
         rs =pst.executeQuery();
         while(rs.next()){
          String fname = rs.getString("fname").trim();
          String sname = rs.getString("sname").trim();
          String name = fname+ " "+sname;
          ComboBox_driver.addItem(name);
         
         }
       }
     catch(Exception e)
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_driver;
    private javax.swing.JComboBox ComboBox_vehicle;
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_del;
    private javax.swing.JButton cmd_print;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton cmd_update;
    private javax.swing.JTextField dibal;
    private javax.swing.JTextField diesel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kmgl;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTable tablekmr;
    private com.toedter.calendar.JDateChooser tdate;
    private javax.swing.JTextField tfw;
    private javax.swing.JTextField tkm;
    private com.toedter.calendar.JDateChooser txt_Date;
    private javax.swing.JButton txt_search;
    // End of variables declaration//GEN-END:variables
}
