package javafiles;


import java.awt.HeadlessException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

public class viewkmr extends javax.swing.JFrame {

    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public viewkmr() {
        super("Kilometer Overhaul");
        initComponents();
        conn = javaconnect.connecrDb();
        update_table();
         //deactivate maxmize
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
 
    }
    private void fixWidth(final JTable table, final int columnIndex, final int width) {
        TableColumn column = table.getColumnModel().getColumn(columnIndex);
        column.setMinWidth(width);
        column.setMaxWidth(width);
        column.setPreferredWidth(width);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                        .addComponent(txt_search)))
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
                    .addComponent(txt_search, javax.swing.GroupLayout.Alignment.TRAILING))
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
        // TODO add your handling code here:
        dispose();
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

        if(((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty()&&
            ((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill start date and end date</font></html>");
        }
        else if(((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill start date</font></html>");
        }
        else if(((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim().isEmpty())
        {        JOptionPane.showMessageDialog(null, "<html><font color='red'>Fill end date</font></html>");
        }
        else{
            try {
                String start=((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim();
                String end=((JTextField)tdate.getDateEditor().getUiComponent()).getText().trim();

                String check = "select COUNT (*)as total from kmrange where date between '"+start+"'and '"+end+"'";

                pst=conn.prepareStatement(check);
                rs = pst.executeQuery();
                int tt =rs.getInt("total");
                JOptionPane.showMessageDialog(null, tt+" "+"records found");

                while(rs.next()){
                    if(rs.getInt("total")>0)

                    try{
                        String sql;
                        sql = "select date as 'Date',vehicle as 'Vehicle',driver as 'Driver',glkm as 'KM on GL'"
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

                }}
                catch (SQLException | HeadlessException ex) {

                    JOptionPane.showMessageDialog(null, ex);

                }}
    }//GEN-LAST:event_txt_searchActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewkmr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
