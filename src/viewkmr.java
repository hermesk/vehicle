
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

public class viewkmr extends javax.swing.JFrame {

    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public viewkmr() {
        super("Kilometer Overhaul");
        initComponents();
        conn = javaconnect.connecrDb();
        update_table();
        //set column width
        fixWidth(tablekmr, 0, 80);
        fixWidth(tablekmr, 1, 80);
        fixWidth(tablekmr, 2, 150); 
         //deactivate maxmize
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
 
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

      }
      catch(Exception e)
      {
             JOptionPane.showMessageDialog(null,e);
      
      }
     }
    private void fixWidth(final JTable table, final int columnIndex, final int width) {
        TableColumn column = table.getColumnModel().getColumn(columnIndex);
        column.setMinWidth(width);
        column.setMaxWidth(width);
        column.setPreferredWidth(width);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
                        .addComponent(cmdexit)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
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
       
        JCheckBox fitWidthBox = new JCheckBox("Fit width to printed page", true);                                                
        MessageFormat header = new MessageFormat("Ragati Tea Factory Vehicle Km Overhaul");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        
         boolean fitWidth = fitWidthBox.isSelected();


      try{
             JTable.PrintMode mode = fitWidth ? JTable.PrintMode.FIT_WIDTH
                                         : JTable.PrintMode.NORMAL;
           tablekmr.print(mode,header,footer);
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
                new viewkmr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdexit;
    private javax.swing.JButton cmdprint;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablekmr;
    // End of variables declaration//GEN-END:variables
}
