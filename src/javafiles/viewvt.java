package javafiles;


import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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
        fixWidth(tablevt, 0, 80);
        fixWidth(tablevt, 1, 130);
        fixWidth(tablevt, 2, 50);
        fixWidth(tablevt, 11, 100);
        fixWidth(tablevt, 12, 100);


     setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);      
    }

    private void update_table(){
      try{
          String sql = "select date as 'Date',driver as 'Driver',runs as 'Runs',tor1 as 'Timeout R1',"
                  + "tir1 as 'TimeinR1',tor2 as 'Timeout R2',tir2 as 'Timein R2'"
                  + ",tor3 as 'Timeout R3',tir3 as 'Timein R3',tor4 as 'Timeout R4',tir4 as 'Timein R4', "
                  + "tfw as 'T.Factory Weight',vt as 'Vehicleturnabout'from vt";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          tablevt.setModel( DbUtils.resultSetToTableModel(rs));

      }
      catch(Exception e)
      {
             JOptionPane.showMessageDialog(null,e);
      
      }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablevt = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex)
            { return false;}
        };
        cmdprint = new javax.swing.JButton();
        cmdexit = new javax.swing.JButton();
        sdate = new com.toedter.calendar.JDateChooser();
        edate = new com.toedter.calendar.JDateChooser();
        cmd_search = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jScrollPane1.setViewportView(tablevt);

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

        edate.setDateFormatString(" yyyy-MM-d");

        cmd_search.setText("Search");
        cmd_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_searchActionPerformed(evt);
            }
        });

        jLabel17.setText("To");

        jLabel1.setText("From");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(cmdprint)
                        .addGap(56, 56, 56)
                        .addComponent(cmdexit)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cmd_search)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd_search)
                    .addComponent(sdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        try{
            String start=((JTextField)sdate.getDateEditor().getUiComponent()).getText().trim();
            String end=((JTextField)edate.getDateEditor().getUiComponent()).getText().trim();

            String check = "select COUNT (*)as total from vt where date between '"+start+"'and '"+end+"'";

            pst=conn.prepareStatement(check);
            rs = pst.executeQuery();
            int tr =rs.getInt("total");
            JOptionPane.showMessageDialog(null, tr+" "+"records found");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cmd_searchActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_search;
    private javax.swing.JButton cmdexit;
    private javax.swing.JButton cmdprint;
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser sdate;
    private javax.swing.JTable tablevt;
    // End of variables declaration//GEN-END:variables
}
