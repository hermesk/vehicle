
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(cmdprint)
                .addGap(81, 81, 81)
                .addComponent(cmdexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdprint)
                    .addComponent(cmdexit))
                .addGap(0, 36, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1104, 391));
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
    private javax.swing.JButton cmdexit;
    private javax.swing.JButton cmdprint;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablevt;
    // End of variables declaration//GEN-END:variables
}
