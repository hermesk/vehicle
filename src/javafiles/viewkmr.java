package javafiles;


import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

public class viewkmr extends javax.swing.JDialog {

    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public viewkmr(java.awt.Frame parent, boolean modal) {
       super(parent, modal);
        initComponents();
        conn = javaconnect.connecrDb();
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
         
         DefaultTableModel model = (DefaultTableModel)tablekmr.getModel();
         DecimalFormat df = new DecimalFormat("###.##");
         
        float kg=0, fw=0,glkm=0,Tkm=0,fuel=0,lpkm=0,kgpl=0,kp=0;
        for(int i=0;i<tablekmr.getRowCount();i++){
            String d= tablekmr.getValueAt(i, 7).toString();
            double d1=Double.parseDouble(d);
            fw+=d1;
            }
        for(int i=0;i<tablekmr.getRowCount();i++){
            String d= tablekmr.getValueAt(i, 4).toString();
            double d1=Double.parseDouble(d);
          Tkm+=d1;
            }
        for(int i=0;i<tablekmr.getRowCount();i++){
            String d= tablekmr.getValueAt(i, 5).toString();
            double d1=Double.parseDouble(d);
          fuel+=d1;
            }
        for(int i=0;i<tablekmr.getRowCount();i++){
            String d= tablekmr.getValueAt(i, 3).toString();
            double d1=Double.parseDouble(d);
          glkm+=d1;
            }
         for(int i=0;i<tablekmr.getRowCount();i++){
             String d= tablekmr.getValueAt(i, 8).toString();
            double d1=Double.parseDouble(d);
             lpkm+=d1;
             kp =(float) (lpkm/(i+1));
           }
          for(int i=0;i<tablekmr.getRowCount();i++){
           String d= tablekmr.getValueAt(i,9).toString();
            float d1=Float.parseFloat(d);
            kgpl+=d1;
            kg = (float) (kgpl/(i+1));
         }
               String  kgppl = df.format(kg);
               String  lpkma = df.format(kp);
               Object[] row = { "","<html><h3><font color='black'>Total</font></h3></html>", "", glkm,Tkm,fuel,"",fw,lpkma,kgppl};
                model.addRow(row);
                int  b= tablekmr.getRowCount()-1;
                 for(int i=9;i>=3;i--){
                     tablekmr.setValueAt("<html><u><b>" + tablekmr.getValueAt(b,i) + "</b></u></html>",b,i);
                 }

        return fw;
    }
      
    private void update_table(){
      try{
          String sql;
          sql = "select date as 'Date',vehicle as 'Vehicle',driver as 'Driver',glkm as 'KM on GL'"
                  + ",tkm as 'Total KM',diesel as 'Diesel',dbal as 'Diesel Bal',tfw as 'Factory Weight'"
                  + ",kmh as 'L/KM', kgl as 'KG/L'from kmrange";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          tablekmr.setModel( DbUtils.resultSetToTableModel(rs));
                        fixWidth(tablekmr, 0, 80);
                        fixWidth(tablekmr, 1, 80);
                        fixWidth(tablekmr, 2, 150);
                        fixWidth(tablekmr, 3, 70);
                        fixWidth(tablekmr, 4, 70);
                        fixWidth(tablekmr, 5, 70);
                        fixWidth(tablekmr, 6, 80);
                        fixWidth(tablekmr, 7, 100);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablekmr = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex)
            { return false;}
        };
        cmdprint = new javax.swing.JButton();
        cmdexit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        sdate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        tdate = new com.toedter.calendar.JDateChooser();
        txt_search = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();

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
        setTitle("                           Kilometer Overhaul");
        setIconImages(null);

        tablekmr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablekmr);

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

        jLabel1.setText("From");

        sdate.setDateFormatString("yyyy-MM-dd\n");

        jLabel2.setText("To");

        tdate.setDateFormatString("yyyy-MM-dd");

        txt_search.setText("Search");
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

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
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(cmdprint)
                        .addGap(56, 56, 56)
                        .addComponent(cmdexit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmd_clear)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_search)
                        .addComponent(cmd_clear)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdexit)
                    .addComponent(cmdprint))
                .addGap(47, 47, 47))
        );

        setSize(new java.awt.Dimension(1072, 535));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
       close();
    }//GEN-LAST:event_cmdexitActionPerformed

    private void cmdprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdprintActionPerformed
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
    
    }//GEN-LAST:event_cmdprintActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed

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
                    String sql= "select date as 'Date',vehicle as 'Vehicle',driver as 'Driver',glkm as 'KM on GL'"
                    + ",tkm as 'Total KM',diesel as 'Diesel',dbal as 'Diesel Bal',tfw as 'Factory Weight'"
                    + ",kmh as 'L/KM', kgl as 'KG/L'from kmrange where  date between '"+start+"'and '"+end+"' ";
                    pst = conn.prepareStatement(sql);
                    rs=pst.executeQuery();
                    tablekmr.setModel( DbUtils.resultSetToTableModel(rs));
                        
                        fixWidth(tablekmr, 0, 80);
                        fixWidth(tablekmr, 1, 80);
                        fixWidth(tablekmr, 2, 150);
                        fixWidth(tablekmr, 3, 70);
                        fixWidth(tablekmr, 4, 70);
                        fixWidth(tablekmr, 5, 70);
                        fixWidth(tablekmr, 6, 80);
                        fixWidth(tablekmr, 7, 100);
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
                   }}}
            catch (SQLException | HeadlessException ex) {

                JOptionPane.showMessageDialog(null, ex);

            }}
    }//GEN-LAST:event_txt_searchActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
       ((JTextField)sdate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)tdate.getDateEditor().getUiComponent()).setText("");
        update_table();
        
    }//GEN-LAST:event_cmd_clearActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewkmr(null,true).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmdexit;
    private javax.swing.JButton cmdprint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTable tablekmr;
    private com.toedter.calendar.JDateChooser tdate;
    private javax.swing.JButton txt_search;
    // End of variables declaration//GEN-END:variables
}
