package javafiles;


import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

public class viewvt extends javax.swing.JDialog {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
   
    public viewvt(java.awt.Frame parent, boolean modal) {
         super(parent, modal);
        initComponents();
        conn = javaconnect.connecrDb();
        update_table();
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
                Object[] row = {"Total", "","","", "","","","", "","", "","", "","","", "",fw,vtab};
                model.addRow(row);
              /*   int  b= tablevt.getRowCount()-1;
                 for(int i=17;i>=16;i--){
                     tablevt.setValueAt("<html><u><b>" + tablevt.getValueAt(b,i) + "</b></u></html>",b,i);
                 }
                      */
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
                    public void close()
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
        cmd_toexcel = new javax.swing.JButton();

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
        setTitle("\n                                     \t\t\tVehicleturnabout");
        setIconImages(null);

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

        cmd_toexcel.setText("Save to Excel");
        cmd_toexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_toexcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(397, 397, 397)
                                .addComponent(cmd_toexcel)
                                .addGap(18, 18, 18)
                                .addComponent(cmdprint)
                                .addGap(39, 39, 39)
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
                        .addGap(0, 322, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdexit)
                    .addComponent(cmdprint)
                    .addComponent(cmd_toexcel))
                .addGap(42, 42, 42))
        );

        setSize(new java.awt.Dimension(1104, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
                   close();
    }//GEN-LAST:event_cmdexitActionPerformed

    private void cmdprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprintActionPerformed
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
      
            String check = "select COUNT (*)as total from vt where strftime('%s',date) between strftime('%s','"+start+"') and strftime('%s','"+end+"')";

            pst=conn.prepareStatement(check);
            rs = pst.executeQuery();
            int tr =rs.getInt("total");  
            if(tr==0){
                  JOptionPane.showMessageDialog(null, "<html>No record Found!</html>");
                 }
            else{
            JOptionPane.showMessageDialog(null, tr+" "+"records found");
           
           
         while(rs.next()){
                if(rs.getInt("total")>0)

      try{
                  String sql = "select date as 'Date',vehicle as 'Vehicle',driver as 'Driver',runs as 'Runs',tor1 as 'TOut R1',"
                  + "tir1 as 'TIn R1',fwr1 as 'FW1',tor2 as 'TOut R2',tir2 as 'TIn R2'"
                  + ",fwr2 as 'FW2',tor3 as 'TOut R3',tir3 as 'TIn R3',fwr3 as'FW3',tor4 as 'TOut R4',tir4 as 'TIn R4', "
                  + "fwr4 as 'FW4',tfw as 'TFW',vt from vt where strftime('%s',date) between strftime('%s','"+start+"') and strftime('%s','"+end+"')";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          tablevt.setModel( DbUtils.resultSetToTableModel(rs));
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

    private void cmd_toexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_toexcelActionPerformed

        JFileChooser fc = new JFileChooser();
        int option = fc.showSaveDialog(viewvt.this);
        if(option == JFileChooser.APPROVE_OPTION){
            String filename = fc.getSelectedFile().getName();
            String path = fc.getSelectedFile().getParentFile().getPath();

            int len = filename.length();
            String ext = "";
            String file = "";

            if(len > 4){
                ext = filename.substring(len-4, len);
            }

            if(ext.equals(".xls")){
                file = path + "\\" + filename; 
            }else{
                file = path + "\\" + filename + ".xls"; 
            }
            toExcel(tablevt, new File(file));
        }
    }//GEN-LAST:event_cmd_toexcelActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewvt(null,true).setVisible(true);
                
            }
        });
    }
    //export to excel
            public void toExcel(JTable tablevt, File file){
               
                    try (FileWriter excel = new FileWriter(file)) {
                        for(int i = 0; i < tablevt.getColumnCount(); i++){
                            excel.write(tablevt.getColumnName(i) + "\t");
                                               }
                          excel.write("\n");
                       
                          for(int i=0; i< tablevt.getRowCount(); i++) {
                            for(int j=0; j < tablevt.getColumnCount(); j++) {
                            excel.write(tablevt.getValueAt(i,j).toString()+"\t");                           

                            }
                           excel.write("\n");
                        }
                    

                }catch(IOException e){ 
                 JOptionPane.showMessageDialog(null,e);
 }
            }

 
     private void fixWidth(final JTable table, final int columnIndex, final int width) {
        TableColumn column = table.getColumnModel().getColumn(columnIndex);
        column.setMinWidth(width);
        column.setMaxWidth(width);
        column.setPreferredWidth(width);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_search;
    private javax.swing.JButton cmd_toexcel;
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
