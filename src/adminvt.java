
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import net.proteanit.sql.DbUtils;


public class adminvt extends javax.swing.JFrame {

   
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    float th=0,tm=0,tmh,TH4,TH1,TH2,TH3,vt,tt;
    float th1,th2,th3,th4,tm1,tm2,tm3,tm4,tmh1,tmh2,tmh3,tmh4;
    public adminvt() {
     super("Fill Vehicleturnabout");
      conn = javaconnect.connecrDb();
       initComponents();
       ComboDriver();
       fillCombo();
        update_table();
        //deactivate maxmize
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    private void update_table(){ //update jtable
      try{
          String sql;
          sql = "select id, date as 'Date',vehicle as 'Vehicle',driver as 'Driver',runs as 'Runs',tor1 as 'TimeOut R1',"
                  + "tir1 as 'TimeIn R1',fwr1 as 'FW1',tor2 as 'TimeOut R2',tir2 as 'TimeIn R2'"
                  + ",fwr2 as 'FW2',tor3 as 'TimeOut R3',tir3 as 'TimeIn R3',fwr3 as'FW3',tor4 as 'TimeOut R4',tir4 as 'TimeIn R4', "
                  + "fwr4 as 'FW4',tfw as 'Total Factory Weight',vt as 'Vehicleturnabout'from vt";
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        t32 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        t42 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        ComboBox_driver = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        wt2 = new javax.swing.JTextField();
        t12 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        wt3 = new javax.swing.JTextField();
        t31 = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        cmd_save = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cmd_delete = new javax.swing.JButton();
        cmd_clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t11 = new javax.swing.JSpinner();
        runs = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        wt1 = new javax.swing.JTextField();
        t21 = new javax.swing.JSpinner();
        t41 = new javax.swing.JSpinner();
        jLabel15 = new javax.swing.JLabel();
        ComboBox_vehicle = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        t22 = new javax.swing.JSpinner();
        wt4 = new javax.swing.JTextField();
        txt_Date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        cmd_update = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablevt = new javax.swing.JTable(){
            public boolean isCellEditable(int rowindex, int colIndex)
            { return false;}
        };
        ;
        print = new javax.swing.JButton();
        cmd_print = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        kmr = new javax.swing.JMenu();
        vehicle = new javax.swing.JMenu();
        dr = new javax.swing.JMenu();
        adduser = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicleturnabout", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        t32.setModel(new SpinnerDateModel());
        t32.setEditor(new JSpinner.DateEditor(t32, "HH:mm"));

        jLabel13.setText("Enter timeout for run 4");

        jLabel16.setText("Choose Date");

        t42.setModel(new SpinnerDateModel());
        t42.setEditor(new JSpinner.DateEditor(t42, "HH:mm"));

        jLabel2.setText("Choose driver");

        jLabel1.setText("Choose Vehicle");

        jLabel12.setText("Enter factory Weight for run 3");

        jLabel8.setText("Enter timein for run 2");

        wt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt2KeyTyped(evt);
            }
        });

        t12.setModel(new SpinnerDateModel());
        t12.setEditor(new JSpinner.DateEditor(t12, "HH:mm"));

        jLabel7.setText("Enter timeout for run 2");

        wt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt3KeyTyped(evt);
            }
        });

        t31.setModel(new SpinnerDateModel());
        t31.setEditor(new JSpinner.DateEditor(t31, "HH:mm"));

        jLabel9.setText("Enter factory Weight for run 2");

        cmd_save.setText("Save");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jLabel14.setText("Enter timein for run 4");

        cmd_delete.setText("Delete");
        cmd_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_deleteActionPerformed(evt);
            }
        });

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter timeout for run 1");

        jLabel3.setText("Choose the number of runs");

        t11.setModel(new SpinnerDateModel());
        t11.setEditor(new JSpinner.DateEditor(t11, "HH:mm"));

        runs.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        jLabel6.setText("Enter factory Weight for run 1");

        wt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wt1ActionPerformed(evt);
            }
        });
        wt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt1KeyTyped(evt);
            }
        });

        t21.setModel(new SpinnerDateModel());
        t21.setEditor(new JSpinner.DateEditor(t21, "HH:mm"));

        t41.setModel(new SpinnerDateModel());
        t41.setEditor(new JSpinner.DateEditor(t41, "HH:mm"));

        jLabel15.setText("Enter factory Weight for run 4");

        jLabel10.setText("Enter timeout for run 3");

        t22.setModel(new SpinnerDateModel());
        t22.setEditor(new JSpinner.DateEditor(t22, "HH:mm"));

        wt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wt4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt4KeyTyped(evt);
            }
        });

        txt_Date.setDateFormatString(" yyyy-MM-d");
        txt_Date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DateKeyTyped(evt);
            }
        });

        jLabel11.setText("Enter timein for run 3");

        cmd_update.setText("Update");
        cmd_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_updateActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter timein for run 1");

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
        tablevt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablevtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablevt);

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(cmd_save)
                        .addGap(31, 31, 31)
                        .addComponent(cmd_clear)
                        .addGap(18, 18, 18)
                        .addComponent(cmd_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmd_delete)
                        .addGap(147, 147, 147)
                        .addComponent(print)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel9))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBox_vehicle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBox_driver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(t22)
                                    .addComponent(t21)
                                    .addComponent(runs)
                                    .addComponent(t11)
                                    .addComponent(t12)
                                    .addComponent(wt1)
                                    .addComponent(t32)
                                    .addComponent(t31)
                                    .addComponent(wt2)
                                    .addComponent(t42)
                                    .addComponent(t41)
                                    .addComponent(wt3)
                                    .addComponent(wt4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboBox_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBox_driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(runs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(wt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(wt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(t31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(t32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(wt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(t41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(t42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(wt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmd_save)
                        .addComponent(cmd_clear)
                        .addComponent(cmd_update)
                        .addComponent(cmd_delete))
                    .addComponent(print))
                .addContainerGap())
        );

        cmd_print.setText("Print");
        cmd_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(978, 978, 978)
                .addComponent(cmd_print)
                .addGap(962, 962, 962))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(cmd_print))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        kmr.setText("KM Overhaul");
        kmr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kmrMouseClicked(evt);
            }
        });
        jMenuBar1.add(kmr);

        vehicle.setText("Vehicles");
        vehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehicleMouseClicked(evt);
            }
        });
        jMenuBar1.add(vehicle);

        dr.setText("Drivers");
        dr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                drMouseClicked(evt);
            }
        });
        jMenuBar1.add(dr);

        adduser.setText("Add User");
        adduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adduserMouseClicked(evt);
            }
        });
        jMenuBar1.add(adduser);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_DateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DateKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if((Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '/'||evt.getKeyChar() == '-')){
        evt.consume();
        getToolkit().beep();}
    }//GEN-LAST:event_txt_DateKeyTyped

    private void wt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wt1ActionPerformed

    private void wt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt1KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
        getToolkit().beep();
        }
    }//GEN-LAST:event_wt1KeyTyped

    private void wt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt2KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
        getToolkit().beep();}
    }//GEN-LAST:event_wt2KeyTyped

    private void wt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt3KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
        getToolkit().beep();}
    }//GEN-LAST:event_wt3KeyTyped

    private void wt4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt4KeyPressed
      
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().isEmpty()||wt1.getText().isEmpty()||
                wt2.getText().isEmpty()||wt3.getText().isEmpty()||wt4.getText().isEmpty() )
            {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");

            }
            else{
                try{

                    Float tfw = Float.parseFloat(wt1.getText()) +Float.parseFloat(wt2.getText())+
                    Float.parseFloat(wt3.getText())+Float.parseFloat(wt4.getText());

                    String sql = "insert into vt(date,vehicle,driver,runs,tor1,tir1,fwr1"
                    + ",tor2,tir2,fwr2,tor3,tir3,fwr3,tor4,tir4,fwr4,tfw,vt)"

                    + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    pst=conn.prepareStatement(sql);

                    SimpleDateFormat sdf=new SimpleDateFormat("kk:mm");
                    sdf.setTimeZone(TimeZone.getDefault());
                    String tt11=sdf.format(t11.getValue());
                    String tt12=sdf.format(t12.getValue());
                    String tt21=sdf.format(t21.getValue());
                    String tt22=sdf.format(t22.getValue());
                    String tt31=sdf.format(t31.getValue());
                    String tt32=sdf.format(t32.getValue());
                    String tt41=sdf.format(t41.getValue());
                    String tt42=sdf.format(t42.getValue());
                    //FT RUN1
                    Date d11 = sdf.parse(tt11);
                    Date d12= sdf.parse(tt12);
                    long diff1 = d12.getTime()-d11.getTime();
                    long diffH1 = diff1 / (60 * 60 * 1000) % 24;
                    long diffM1 = diff1 / (60 * 1000) % 60;
                    th1 = th+diffH1;
                    tm1 = tm+diffM1;
                    tmh1 = tm1/60;
                    TH1 = tmh1 +th1;
                    //FT RUN2
                    Date d21 = sdf.parse(tt21);
                    Date d22= sdf.parse(tt22);
                    long diff2 = d22.getTime() - d21.getTime();
                    long diffH2 = diff2 / (60 * 60 * 1000) % 24;
                    long diffM2 = diff2 / (60 * 1000) % 60;
                    th2 = th+diffH2;
                    tm2 = tm+diffM2;
                    tmh2 = tm2/60;
                    TH2 = tmh2 +th2;
                    //FT RUN3
                    Date d31 = sdf.parse(tt31);
                    Date d32= sdf.parse(tt32);
                    long diff3 = d32.getTime() - d31.getTime();
                    long diffH3 = diff3 / (60 * 60 * 1000) % 24;
                    long diffM3 = diff3 / (60 * 1000) % 60;
                    th3 = th+diffH3;
                    tm3 = tm+diffM3;
                    tmh3 = tm3/60;
                    TH3 = tmh3 +th3;
                    //FT RUN4
                    Date d41 = sdf.parse(tt41);
                    Date d42= sdf.parse(tt42);
                    long diff4 = d42.getTime() - d41.getTime();
                    long diffH4 = diff4 / (60 * 60 * 1000) % 24;//hrs
                    long diffM4 = diff4 / (60 * 1000) % 60;//mins
                    th4 = th+diffH4;
                    tm4 = tm+diffM4;
                    tmh4 = tm4/60;
                    TH4 = tmh4 +th4;
                    tt = TH1+TH2+TH3+TH4;

                    int run =(int)runs.getValue();
                    vt = (float)tt/run;
                    pst.setString(1, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText());
                    pst.setString(2, ComboBox_vehicle.getSelectedItem().toString());
                    pst.setString(3, ComboBox_driver.getSelectedItem().toString());
                    pst.setString(4,  runs.getValue().toString().trim());

                    pst.setString(5,tt11 );
                    pst.setString(6, tt12);
                    pst.setString(7, wt1.getText().trim());

                    pst.setString(8, tt21);
                    pst.setString(9, tt22);
                    pst.setString(10,wt2.getText().trim());

                    pst.setString(11, tt31);
                    pst.setString(12, tt32);
                    pst.setString(13, wt3.getText().trim());

                    pst.setString(14, tt41);
                    pst.setString(15, tt42);
                    pst.setString(16, wt4.getText().trim());
                    pst.setFloat(17, tfw);
                    pst.setDouble(18,vt );
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Saved Successfully");

                }
                catch(NumberFormatException | SQLException | ParseException | HeadlessException e){
                    JOptionPane.showMessageDialog(null, e);

                }}
            }

    }//GEN-LAST:event_wt4KeyPressed

    private void wt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt4KeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
            (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
        getToolkit().beep();}
    }//GEN-LAST:event_wt4KeyTyped

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        if(((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().isEmpty()||wt1.getText().isEmpty()||
            wt2.getText().isEmpty()||wt3.getText().isEmpty()||wt4.getText().isEmpty() )
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");

        }
        else{
            try{

                Float tfw = Float.parseFloat(wt1.getText()) +Float.parseFloat(wt2.getText())+
                Float.parseFloat(wt3.getText())+Float.parseFloat(wt4.getText());

                String sql = "insert into vt(date,vehicle,driver,runs,tor1,tir1,fwr1"
                + ",tor2,tir2,fwr2,tor3,tir3,fwr3,tor4,tir4,fwr4,tfw,vt)"

                + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                pst=conn.prepareStatement(sql);

                SimpleDateFormat sdf=new SimpleDateFormat("kk:mm");
                sdf.setTimeZone(TimeZone.getDefault());
                String tt11=sdf.format(t11.getValue());
                String tt12=sdf.format(t12.getValue());
                String tt21=sdf.format(t21.getValue());
                String tt22=sdf.format(t22.getValue());
                String tt31=sdf.format(t31.getValue());
                String tt32=sdf.format(t32.getValue());
                String tt41=sdf.format(t41.getValue());
                String tt42=sdf.format(t42.getValue());
                //FT RUN1
                Date d11 = sdf.parse(tt11);
                Date d12= sdf.parse(tt12);
                long diff1 = d12.getTime()-d11.getTime();
                long diffH1 = diff1 / (60 * 60 * 1000) % 24;
                long diffM1 = diff1 / (60 * 1000) % 60;
                th1 = th+diffH1;
                tm1 = tm+diffM1;
                tmh1 = tm1/60;
                TH1 = tmh1 +th1;
                //FT RUN2
                Date d21 = sdf.parse(tt21);
                Date d22= sdf.parse(tt22);
                long diff2 = d22.getTime() - d21.getTime();
                long diffH2 = diff2 / (60 * 60 * 1000) % 24;
                long diffM2 = diff2 / (60 * 1000) % 60;
                th2 = th+diffH2;
                tm2 = tm+diffM2;
                tmh2 = tm2/60;
                TH2 = tmh2 +th2;
                //FT RUN3
                Date d31 = sdf.parse(tt31);
                Date d32= sdf.parse(tt32);
                long diff3 = d32.getTime() - d31.getTime();
                long diffH3 = diff3 / (60 * 60 * 1000) % 24;
                long diffM3 = diff3 / (60 * 1000) % 60;
                th3 = th+diffH3;
                tm3 = tm+diffM3;
                tmh3 = tm3/60;
                TH3 = tmh3 +th3;
                //FT RUN4
                Date d41 = sdf.parse(tt41);
                Date d42= sdf.parse(tt42);
                long diff4 = d42.getTime() - d41.getTime();
                long diffH4 = diff4 / (60 * 60 * 1000) % 24;//hrs
                long diffM4 = diff4 / (60 * 1000) % 60;//mins
                th4 = th+diffH4;
                tm4 = tm+diffM4;
                tmh4 = tm4/60;
                TH4 = tmh4 +th4;
                tt = TH1+TH2+TH3+TH4;

                int run =(int)runs.getValue();
                vt = (float)tt/run;
                pst.setString(1, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText());
                pst.setString(2, ComboBox_vehicle.getSelectedItem().toString());
                pst.setString(3, ComboBox_driver.getSelectedItem().toString());
                pst.setString(4,  runs.getValue().toString().trim());

                pst.setString(5,tt11 );
                pst.setString(6, tt12);
                pst.setString(7, wt1.getText().trim());

                pst.setString(8, tt21);
                pst.setString(9, tt22);
                pst.setString(10,wt2.getText().trim());

                pst.setString(11, tt31);
                pst.setString(12, tt32);
                pst.setString(13, wt3.getText().trim());

                pst.setString(14, tt41);
                pst.setString(15, tt42);
                pst.setString(16, wt4.getText().trim());
                pst.setFloat(17, tfw);
                pst.setDouble(18,vt );
                pst.execute();
                JOptionPane.showMessageDialog(null, "Saved Successfully");

            }
            catch(NumberFormatException | SQLException | ParseException | HeadlessException e){
                JOptionPane.showMessageDialog(null, e);

            }
        update_table();
        }
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        // TODO add your handling code here:
        ((JTextField)txt_Date.getDateEditor().getUiComponent()).setText("");
        wt1.setText("");
        wt2.setText("");
        wt3.setText("");
        wt4.setText("");
    }//GEN-LAST:event_cmd_clearActionPerformed
   
    private void tablevtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablevtMouseClicked
        // TODO add your handling code here:
        try{
            int row = tablevt.getSelectedRow();
            int col = tablevt.getSelectedColumn();

            String tableclicked = (tablevt.getModel().getValueAt(row, col).toString());
            String sql = "select* from vt where id ='"+tableclicked+"'";
             pst=conn.prepareStatement(sql);
             rs = pst.executeQuery();
         if(rs.next()){
             String add1 = rs.getString("date");
             java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse(add1);
             txt_Date.setDate(date);
          
             ComboBox_vehicle.addItem(rs.getString("vehicle"));
           
             ComboBox_driver.addItem(rs.getString("driver"));
          
            runs.setValue(rs.getInt("runs"));
              
              SimpleDateFormat format = new SimpleDateFormat("HH:mm");
                 String tm11 =rs.getString("tor1");
                 t11.setValue(format.parse(tm11));
                 String tm12 =rs.getString("tir1");
                 t12.setValue(format.parse(tm12));
                 
             wt1.setText(rs.getString("fwr1"));
                 String tm21 =rs.getString("tor2");
                 t21.setValue(format.parse(tm21));
                 String tm22 =rs.getString("tir2");
                 t22.setValue(format.parse(tm22));
                 
             wt2.setText(rs.getString("fwr2"));
                 String tm31 =rs.getString("tor3");
                 t31.setValue(format.parse(tm31));
                 String tm32 =rs.getString("tir3");
                 t32.setValue(format.parse(tm32));
             wt3.setText(rs.getString("fwr3"));
             
             String tm41 =rs.getString("tor4");
                 t41.setValue(format.parse(tm41));
                 String tm42 =rs.getString("tir4");
                 t42.setValue(format.parse(tm42));
             wt4.setText(rs.getString("fwr4"));
     
         }
        }
        
        catch(Exception e){
        JOptionPane.showMessageDialog(null, e);}
    }//GEN-LAST:event_tablevtMouseClicked

    private void cmd_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_deleteActionPerformed
        // TODO add your handling code here:
         if(((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().isEmpty()||wt1.getText().isEmpty()||
            wt2.getText().isEmpty()||wt3.getText().isEmpty()||wt4.getText().isEmpty() )
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");

        }
        else{
             int d = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete", "Delete", JOptionPane.YES_NO_OPTION);
         
                 if(d==0){
                 String sql = "delete from vt where id=?";
        
          try {
              pst=conn.prepareStatement(sql);
              pst.setString(1, rs.getString("id"));
              
              pst.execute();
                    JOptionPane.showMessageDialog(null, "deleted");

          } catch (SQLException e) {
                   JOptionPane.showMessageDialog(null, e);
                   

          }}
         }
         update_table();
    }//GEN-LAST:event_cmd_deleteActionPerformed

    private void cmd_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_updateActionPerformed
        // TODO add your handling code here:
         if(((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().isEmpty()||wt1.getText().isEmpty()||
            wt2.getText().isEmpty()||wt3.getText().isEmpty()||wt4.getText().isEmpty() )
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all the fields!</font></h2></html>");

        }
        else{
        
        try
        {      
            
               SimpleDateFormat sdf=new SimpleDateFormat("kk:mm");
                sdf.setTimeZone(TimeZone.getDefault());
                
                String v = rs.getString("id");
                String v1 =((JTextField)txt_Date.getDateEditor().getUiComponent()).getText();
                String v2 =ComboBox_vehicle.getSelectedItem().toString();
                String v3 =ComboBox_driver.getSelectedItem().toString();
                String v4 =runs.getValue().toString().trim();
                String v5 =sdf.format(t11.getValue());
                String v6 =sdf.format(t12.getValue());
                String v7 =wt1.getText().trim();
                String v8=sdf.format(t21.getValue());
                String v9=sdf.format(t22.getValue());
                String v10 =wt2.getText().trim();
                String v11=sdf.format(t31.getValue());
                String v12=sdf.format(t32.getValue());
                String v13 =wt3.getText().trim();
                String v14=sdf.format(t41.getValue());
                String v15=sdf.format(t42.getValue());  
                String v16 =wt3.getText().trim();
                //FT RUN1
                Date d11 = sdf.parse(v5);
                Date d12= sdf.parse(v6);
                long diff1 = d12.getTime()-d11.getTime();
                long diffH1 = diff1 / (60 * 60 * 1000) % 24;
                long diffM1 = diff1 / (60 * 1000) % 60;
                th1 = th+diffH1;
                tm1 = tm+diffM1;
                tmh1 = tm1/60;
                TH1 = tmh1 +th1;
                //FT RUN2
                Date d21 = sdf.parse(v8);
                Date d22= sdf.parse(v9);
                long diff2 = d22.getTime() - d21.getTime();
                long diffH2 = diff2 / (60 * 60 * 1000) % 24;
                long diffM2 = diff2 / (60 * 1000) % 60;
                th2 = th+diffH2;
                tm2 = tm+diffM2;
                tmh2 = tm2/60;
                TH2 = tmh2 +th2;
                //FT RUN3
                Date d31 = sdf.parse(v11);
                Date d32= sdf.parse(v12);
                long diff3 = d32.getTime() - d31.getTime();
                long diffH3 = diff3 / (60 * 60 * 1000) % 24;
                long diffM3 = diff3 / (60 * 1000) % 60;
                th3 = th+diffH3;
                tm3 = tm+diffM3;
                tmh3 = tm3/60;
                TH3 = tmh3 +th3;
                //FT RUN4
                Date d41 = sdf.parse(v14);
                Date d42= sdf.parse(v15);
                long diff4 = d42.getTime() - d41.getTime();
                long diffH4 = diff4 / (60 * 60 * 1000) % 24;//hrs
                long diffM4 = diff4 / (60 * 1000) % 60;//mins
                th4 = th+diffH4;
                tm4 = tm+diffM4;
                tmh4 = tm4/60;
                TH4 = tmh4 +th4;
                tt = TH1+TH2+TH3+TH4;
                Float tfw = Float.parseFloat(wt1.getText()) +Float.parseFloat(wt2.getText())+
                Float.parseFloat(wt3.getText())+Float.parseFloat(wt4.getText());
                int run =(int)runs.getValue();
                 vt = (float)tt/run;

          
    String sql = "update vt set date= '"+v1+"',vehicle='"+v2+"',driver='"+v3+"',runs='"+v4+"',tor1='"+v5+"',tir1='"+v6+"',"
            + "fwr1='"+v7+"',tor2='"+v8+"',tir2='"+v9+"',fwr2='"+v10+"',tor3='"+v11+"',tir3='"+v12+"',fwr3='"+v13+"',"
            + "tor4='"+v14+"',tir4='"+v15+"',fwr4='"+v16+"', tfw='"+tfw+"', vt='"+vt+"' where id ='"+v+"'";
             
            pst=conn.prepareStatement(sql);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Updated");
        }
        catch(NumberFormatException | SQLException e){
        JOptionPane.showMessageDialog(null, e);
        } catch (ParseException ex) {
            Logger.getLogger(adminvt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        update_table();

         }
    }//GEN-LAST:event_cmd_updateActionPerformed

    private void cmd_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_printActionPerformed
        // TODO add your handling code here:
                                                             
     MessageFormat header = new MessageFormat("Factory Vehicleturnabout");
      MessageFormat footer = new MessageFormat("Page{0,number,integer}");

      try{
          
           tablevt.print(JTable.PrintMode.NORMAL,header,footer);
         }
      catch(java.awt.print.PrinterException e)
      {
         PrintStream format = System.err.format("Cannot print %s%n");
      }
      
    }//GEN-LAST:event_cmd_printActionPerformed

    private void kmrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kmrMouseClicked
        // TODO add your handling code here:
        adminkmrange kmrg = new adminkmrange();
               kmrg.setVisible(true);

    }//GEN-LAST:event_kmrMouseClicked

    private void vehicleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleMouseClicked
        // TODO add your handling code here:
        vehicles v = new vehicles();
                v.setVisible(true);
    }//GEN-LAST:event_vehicleMouseClicked

    private void drMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drMouseClicked
        // TODO add your handling code here:
        admindrivers adr = new admindrivers();
                   adr.setVisible(true);
    }//GEN-LAST:event_drMouseClicked

    private void adduserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adduserMouseClicked
        // TODO add your handling code here:
        register rg = new register();
                 rg.setVisible(true);
    }//GEN-LAST:event_adduserMouseClicked

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
                                                            
     MessageFormat header = new MessageFormat("Factory Vehicleturnabout");
      MessageFormat footer = new MessageFormat("Page{0,number,integer}");

      try{
          
           tablevt.print(JTable.PrintMode.NORMAL,header,footer);
         }
      catch(java.awt.print.PrinterException e)
      {
         PrintStream format = System.err.format("Cannot print %s%n");
      }
      
    
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(adminvt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminvt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminvt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminvt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminvt().setVisible(true);
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
         while(rs.next())
         {
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
    private javax.swing.JMenu adduser;
    private javax.swing.JButton cmd_clear;
    private javax.swing.JButton cmd_delete;
    private javax.swing.JButton cmd_print;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton cmd_update;
    private javax.swing.JMenu dr;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu kmr;
    private javax.swing.JButton print;
    private javax.swing.JSpinner runs;
    private javax.swing.JSpinner t11;
    private javax.swing.JSpinner t12;
    private javax.swing.JSpinner t21;
    private javax.swing.JSpinner t22;
    private javax.swing.JSpinner t31;
    private javax.swing.JSpinner t32;
    private javax.swing.JSpinner t41;
    private javax.swing.JSpinner t42;
    private javax.swing.JTable tablevt;
    private com.toedter.calendar.JDateChooser txt_Date;
    private javax.swing.JMenu vehicle;
    private javax.swing.JTextField wt1;
    private javax.swing.JTextField wt2;
    private javax.swing.JTextField wt3;
    private javax.swing.JTextField wt4;
    // End of variables declaration//GEN-END:variables
}
