package javafiles;


import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

public class viewvt extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public viewvt() {
        super("Vehicleturnabout");
        initComponents();
        conn = javaconnect.connecrDb();
          update_table();
       

     setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);      
    }
          public double getSum(){
         
         DefaultTableModel model = (DefaultTableModel)tablevt.getModel();
         DecimalFormat df = new DecimalFormat("###.##");

        float vtp=0,vta=0,fw=0;
        for(int i=0;i<tablevt.getRowCount();i++){
            String d= tablevt.getValueAt(i, 17).toString();
            double d1=Double.parseDouble(d);
            vtp+=d1;
             vta = (float) (vtp/i);
             }
        for(int i=0;i<tablevt.getRowCount();i++){
            String d= tablevt.getValueAt(i, 16).toString();
            double d1=Double.parseDouble(d);
            fw+=d1;          
            }
                String vtab = df.format(vta);
                Object[] row = {"<html><h3><font color='black'>Total</font></h3></html>", "","","", "","","","", "","", "","", "","","", "",fw,vtab};
                model.addRow(row);
                 int  b= tablevt.getRowCount()-1;
                 for(int i=17;i>=16;i--){
                     tablevt.setValueAt("<html><u><b>" + tablevt.getValueAt(b,i) + "</b></u></html>",b,i);
                 }

                return vta;
    }
          
    private void update_table(){
      try{
          String sql = "select date as 'Date',vehicle as 'Vehicle',driver as 'Driver',runs as 'Runs',tor1 as 'TOut R1',"
                  + "tir1 as 'TIn R1',fwr1 as 'FW1',tor2 as 'TOut R2',tir2 as 'TIn R2'"
                  + ",fwr2 as 'FW2',tor3 as 'TOut R3',tir3 as 'TIn R3',fwr3 as'FW3',tor4 as 'TOut R4',tir4 as 'TIn R4', "
                  + "fwr4 as 'FW4',tfw as 'TFW',vt from vt";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          tablevt.setModel( DbUtils.resultSetToTableModel(rs));
        fixWidth(tablevt, 0, 80);
        fixWidth(tablevt, 1, 80); 
        fixWidth(tablevt, 2, 120); 
        fixWidth(tablevt, 3, 40); 
        fixWidth(tablevt, 4, 55);
        fixWidth(tablevt, 5, 50);
        fixWidth(tablevt, 6, 48);
        fixWidth(tablevt, 7, 55);
        fixWidth(tablevt, 8, 50);
        fixWidth(tablevt, 9,48);
        fixWidth(tablevt, 10, 55);
        fixWidth(tablevt, 11, 50);
        fixWidth(tablevt, 12, 48);
        fixWidth(tablevt, 13, 55);
        fixWidth(tablevt, 14, 50);
        fixWidth(tablevt, 15, 48);
        fixWidth(tablevt, 16, 60);
        fixWidth(tablevt, 17, 50);
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
       
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdprint = new javax.swing.JButton();
        cmdexit = new javax.swing.JButton();
        sdate = new com.toedter.calendar.JDateChooser();
        tdate = new com.toedter.calendar.JDateChooser();
        cmd_search = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablevt = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex)
            { return false;}
        };
        cmd_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("\n");

        cmdprint.setText("Print");
        cmdprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdprintActionPerformed(evt);
            }
        });

        cmdexit.setText("Exit");
        cmdexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexitActionPerformed(evt);
            }
        });

        sdate.setDateFormatString(" yyyy-MM-d");

        tdate.setDateFormatString(" yyyy-MM-d");

        cmd_search.setText("Search");
        cmd_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_searchActionPerformed(evt);
            }
        });

        jLabel17.setText("To");

        jLabel1.setText("From");

        tablevt.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablevt);

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(389, 389, 389)
                                .addComponent(cmdprint)
                                .addGap(56, 56, 56)
                                .addComponent(cmdexit))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(245, 245, 245)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cmd_search)
                                .addGap(18, 18, 18)
                                .addComponent(cmd_clear)))
                        .addGap(0, 322, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmd_search)
                        .addComponent(cmd_clear))
                    .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdexit)
                    .addComponent(cmdprint))
                .addGap(42, 42, 42))
        );

        setSize(new java.awt.Dimension(1104, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cmdexitActionPerformed

    private void cmdprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprintActionPerformed
        // TODO add your handling code here:
        JCheckBox fitWidthBox = new JCheckBox("Fit width to printed page", true);                                                
     MessageFormat header = new MessageFormat("Factory Vehicleturnabout");
      MessageFormat footer = new MessageFormat("Page{0,number,integer}");
      
         boolean fitWidth = fitWidthBox.isSelected();
        


      try{
          JTable.PrintMode mode = fitWidth ? JTable.PrintMode.FIT_WIDTH
                                         : JTable.PrintMode.NORMAL;
           tablevt.print(mode,header,footer);
         }
      catch(java.awt.print.PrinterException e)
      {
         PrintStream format = System.err.format("Cannot print %s%n");
      }
      
    }//GEN-LAST:event_cmdprintActionPerformed

    private void cmd_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_searchActionPerformed
      if (((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty()&&((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
            {
             JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill start date and end date</font></html>");
            }
       else if(((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
             {
             JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill start date</font></html>");
             }
       else if (((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
                 { 
                    JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill end date</font></html>");
                 }
       else{       
        try
        {   
        String start=((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim();
        String end=((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim();
      
            String check = "select COUNT (*)as total from vt where date >='"+start+"'and date <='"+end+"'";

            pst=conn.prepareStatement(check);
            rs = pst.executeQuery();
            int tr =rs.getInt("total");  
            if(tr==0){
                  JOptionPane.showMessageDialog(null, "<html><font color='red'>No record Found!</font></html>");
                 }
            else{
            JOptionPane.showMessageDialog(null, tr+" "+"records found");
            
           
         while(rs.next()){
                if(rs.getInt("total")>0)

      try{
                  String sql = "select date as 'Date',vehicle as 'Vehicle',driver as 'Driver',runs as 'Runs',tor1 as 'TOut R1',"
                  + "tir1 as 'TIn R1',fwr1 as 'FW1',tor2 as 'TOut R2',tir2 as 'TIn R2'"
                  + ",fwr2 as 'FW2',tor3 as 'TOut R3',tir3 as 'TIn R3',fwr3 as'FW3',tor4 as 'TOut R4',tir4 as 'TIn R4', "
                  + "fwr4 as 'FW4',tfw as 'TFW',vt from vt where date between '"+start+"' and '"+end+"'";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          tablevt.setModel( DbUtils.resultSetToTableModel(rs));
       // fixWidth(tablevt, 0, 30);
        fixWidth(tablevt, 0, 80);
        fixWidth(tablevt, 1, 70); 
        fixWidth(tablevt, 2, 120); 
        fixWidth(tablevt, 3, 40); 
        fixWidth(tablevt, 4, 55);
        fixWidth(tablevt, 5, 50);
        fixWidth(tablevt, 6, 48);
        fixWidth(tablevt, 7, 55);
        fixWidth(tablevt, 8, 50);
        fixWidth(tablevt, 9,48);
        fixWidth(tablevt, 10, 55);
        fixWidth(tablevt, 11, 50);
        fixWidth(tablevt, 12, 48);
        fixWidth(tablevt, 13, 55);
        fixWidth(tablevt, 14, 50);
        fixWidth(tablevt, 15, 48);
        fixWidth(tablevt, 16, 60);
        fixWidth(tablevt, 17, 50);
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
         }
            }}
            catch (SQLException | HeadlessException ex) {

                JOptionPane.showMessageDialog(null, ex);

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
    }//GEN-LAST:event_cmd_searchActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
         ((JTextField)sdate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)tdate.getDateEditor().getUiComponent()).setText("");
          update_table();
    }//GEN-LAST:event_cmd_clearActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewvt().setVisible(true);
                
            }
        });
    }
     private void fixWidth(final JTable table, final int columnIndex, final int width) {
        TableColumn column = table.getColumnModel().getColumn(columnIndex);
        column.setMinWidth(width);
        column.setMaxWidth(width);
        column.setPreferredWidth(width);
    }
     WindowListener exitlistener = new WindowAdapter(){
         @Override
         public void windowClosing(WindowEvent e){
         // int c = JOptionPane.showOptionalDialog(null, "Are you sure to close?""Exit",JOptionPane.YES_NO_OPTION);
         }
     
     };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_search;
    private javax.swing.JButton cmdexit;
    private javax.swing.JButton cmdprint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTable tablevt;
    private com.toedter.calendar.JDateChooser tdate;
    // End of variables declaration//GEN-END:variables
}
