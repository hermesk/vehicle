
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class viewvehicles extends javax.swing.JFrame {
    
   
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public viewvehicles() {
        super("Ragati Tea Factory vehicles");
        initComponents();
        conn = javaconnect.connecrDb();
        update_table();
    }
 private void update_table(){
      try{
          String sql = "select Regno,DOP as 'Date of Purchase',Make from vehicles";
          pst = conn.prepareStatement(sql);
          rs=pst.executeQuery();
          tablevehicles.setModel( DbUtils.resultSetToTableModel(rs));

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
        tablevehicles = new javax.swing.JTable();
        cmd_print = new javax.swing.JButton();
        cmdexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablevehicles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablevehicles);

        cmd_print.setText("Print");
        cmd_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_printActionPerformed(evt);
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
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cmd_print)
                        .addGap(55, 55, 55)
                        .addComponent(cmdexit)
                        .addGap(128, 128, 128))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_print)
                    .addComponent(cmdexit))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(578, 342));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmd_printActionPerformed

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_cmdexitActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new viewvehicles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_print;
    private javax.swing.JButton cmdexit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablevehicles;
    // End of variables declaration//GEN-END:variables
}