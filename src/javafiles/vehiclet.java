package javafiles;


import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

public class vehiclet extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    float th=0,tm=0,tmh,TH4,TH1,TH2,TH3,vt,tt;
    float th1,th2,th3,th4,tm1,tm2,tm3,tm4,tmh1,tmh2,tmh3,tmh4;
    public vehiclet() {
        
      super("Fill Vehicleturnabout");
      conn = javaconnect.connecrDb();
       initComponents();
        ComboDriver();
        fillCombo();
         setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        wt4 = new javax.swing.JTextField();
        cmd_save = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        wt2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ComboBox_vehicle = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        wt3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ComboBox_driver = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        wt1 = new javax.swing.JTextField();
        runs = new javax.swing.JSpinner();
        txt_Date = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        t11 = new javax.swing.JSpinner();
        t12 = new javax.swing.JSpinner();
        t21 = new javax.swing.JSpinner();
        t22 = new javax.swing.JSpinner();
        t31 = new javax.swing.JSpinner();
        t32 = new javax.swing.JSpinner();
        t41 = new javax.swing.JSpinner();
        t42 = new javax.swing.JSpinner();
        cmd_clear = new javax.swing.JButton();
        cmd_exit = new javax.swing.JButton();
        cmdviewvt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setName("VehicleTurnabout"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vehicleturnabout", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel8.setText("Enter timein for run 2");

        jLabel13.setText("Enter timeout for run 4");

        jLabel10.setText("Enter timeout for run 3");

        jLabel12.setText("Enter factory Weight for run 3");

        jLabel3.setText("Choose the number of runs");

        jLabel15.setText("Enter factory Weight for run 4");

        wt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wt4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt4KeyTyped(evt);
            }
        });

        cmd_save.setText("Save");
        cmd_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_saveActionPerformed(evt);
            }
        });

        jLabel14.setText("Enter timein for run 4");

        wt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt2KeyTyped(evt);
            }
        });

        jLabel1.setText("Choose Vehicle");

        jLabel5.setText("Enter timein for run 1");

        jLabel11.setText("Enter timein for run 3");

        jLabel4.setText("Enter timeout for run 1");

        jLabel2.setText("Choose driver");

        jLabel6.setText("Enter factory Weight for run 1");

        wt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wt3KeyTyped(evt);
            }
        });

        jLabel7.setText("Enter timeout for run 2");

        jLabel9.setText("Enter factory Weight for run 2");

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

        runs.setModel(new javax.swing.SpinnerNumberModel(1, 1, 4, 1));

        txt_Date.setDateFormatString(" yyyy-MM-d");
        txt_Date.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_DateKeyTyped(evt);
            }
        });

        jLabel16.setText("Choose Date");

        t11.setModel(new SpinnerDateModel());
        t11.setEditor(new JSpinner.DateEditor(t11, "HH:mm"));

        t12.setModel(new SpinnerDateModel());
        t12.setEditor(new JSpinner.DateEditor(t12, "HH:mm"));

        t21.setModel(new SpinnerDateModel());
        t21.setEditor(new JSpinner.DateEditor(t21, "HH:mm"));

        t22.setModel(new SpinnerDateModel());
        t22.setEditor(new JSpinner.DateEditor(t22, "HH:mm"));

        t31.setModel(new SpinnerDateModel());
        t31.setEditor(new JSpinner.DateEditor(t31, "HH:mm"));

        t32.setModel(new SpinnerDateModel());
        t32.setEditor(new JSpinner.DateEditor(t32, "HH:mm"));

        t41.setModel(new SpinnerDateModel());
        t41.setEditor(new JSpinner.DateEditor(t41, "HH:mm"));

        t42.setModel(new SpinnerDateModel());
        t42.setEditor(new JSpinner.DateEditor(t42, "HH:mm"));

        cmd_clear.setText("Clear");
        cmd_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_clearActionPerformed(evt);
            }
        });

        cmd_exit.setText("Exit");
        cmd_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_exitActionPerformed(evt);
            }
        });

        cmdviewvt.setText("View");
        cmdviewvt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdviewvtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(60, 60, 60)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBox_vehicle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBox_driver, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_Date, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
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
                                    .addComponent(wt4)))
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(cmd_save)
                                .addGap(28, 28, 28)
                                .addComponent(cmd_clear)
                                .addGap(18, 18, 18)
                                .addComponent(cmdviewvt)
                                .addGap(18, 18, 18)
                                .addComponent(cmd_exit)))
                        .addGap(0, 94, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_vehicle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboBox_driver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(runs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(wt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(t31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(t32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(wt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(t41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(t42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(wt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd_clear)
                    .addComponent(cmd_exit)
                    .addComponent(cmdviewvt)
                    .addComponent(cmd_save))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("KM Overhaul");

        jMenuItem1.setText("Fill");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem1MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator1);

        jMenuItem2.setText("View");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem2MousePressed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(663, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void wt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wt1ActionPerformed

    private void cmd_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_saveActionPerformed
        // TODO add your handling code here:
        if(((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty()||wt1.getText().trim().isEmpty()||
               wt2.getText().trim().isEmpty()||wt3.getText().trim().isEmpty()||wt4.getText().trim().isEmpty() )
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");

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
            pst.setString(1, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim());
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
         finally {
                try{
                  rs.close();
                  pst.close();
                  }
                 catch(Exception ex){
                  }
                }
       
        }
    }//GEN-LAST:event_cmd_saveActionPerformed

    private void cmd_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_clearActionPerformed
        ((JTextField)txt_Date.getDateEditor().getUiComponent()).setText("");
        wt1.setText("");
        wt2.setText("");
        wt3.setText("");
        wt4.setText("");
    }//GEN-LAST:event_cmd_clearActionPerformed

    private void cmd_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_exitActionPerformed
        dispose();
    }//GEN-LAST:event_cmd_exitActionPerformed

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        login lg = new login();
              lg.setVisible(true);
              this.dispose();
    }//GEN-LAST:event_logoutMousePressed

    private void jMenuItem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MousePressed
         kmrange kmrg = new kmrange();
               kmrg.setVisible(true);

    }//GEN-LAST:event_jMenuItem1MousePressed

    private void jMenuItem2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MousePressed
         viewkmr vkmr = new viewkmr();
                vkmr.setVisible(true);
    }//GEN-LAST:event_jMenuItem2MousePressed

    private void cmdviewvtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdviewvtActionPerformed
         viewvt vwvt = new viewvt();
               vwvt.setVisible(true);
    }//GEN-LAST:event_cmdviewvtActionPerformed

    private void wt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt1KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
         getToolkit().beep();
        }
    }//GEN-LAST:event_wt1KeyTyped

    private void wt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt2KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
         getToolkit().beep();}
    }//GEN-LAST:event_wt2KeyTyped

    private void wt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt3KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
         getToolkit().beep();}
    }//GEN-LAST:event_wt3KeyTyped

    private void wt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt4KeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '.')){
        evt.consume();
         getToolkit().beep();}
    }//GEN-LAST:event_wt4KeyTyped

    private void txt_DateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_DateKeyTyped
        char c=evt.getKeyChar();
        if((Character.isDigit(c)||
        (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE||evt.getKeyChar() == '/'||evt.getKeyChar() == '-')){
        evt.consume();
         getToolkit().beep();}
    }//GEN-LAST:event_txt_DateKeyTyped

    private void wt4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wt4KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             if(((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim().isEmpty()||wt1.getText().trim().isEmpty()||
               wt2.getText().trim().isEmpty()||wt3.getText().trim().isEmpty()||wt4.getText().trim().isEmpty() )
        {
           JOptionPane.showMessageDialog(null, "<html><h2><font color='red'>Fill all fields!</font></h2></html>");

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
            pst.setString(1, ((JTextField)txt_Date.getDateEditor().getUiComponent()).getText().trim());
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
              finally {
                try{
                  rs.close();
                  pst.close();
                  }
                 catch(Exception ex){
                  }
                }
       
             }
    }                                        

        
    }//GEN-LAST:event_wt4KeyPressed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

        
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
            java.util.logging.Logger.getLogger(vehiclet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vehiclet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vehiclet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vehiclet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new vehiclet().setVisible(true);
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
         while(rs.next())
         {
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
    private javax.swing.JButton cmd_exit;
    private javax.swing.JButton cmd_save;
    private javax.swing.JButton cmdviewvt;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JSpinner runs;
    private javax.swing.JSpinner t11;
    private javax.swing.JSpinner t12;
    private javax.swing.JSpinner t21;
    private javax.swing.JSpinner t22;
    private javax.swing.JSpinner t31;
    private javax.swing.JSpinner t32;
    private javax.swing.JSpinner t41;
    private javax.swing.JSpinner t42;
    private com.toedter.calendar.JDateChooser txt_Date;
    private javax.swing.JTextField wt1;
    private javax.swing.JTextField wt2;
    private javax.swing.JTextField wt3;
    private javax.swing.JTextField wt4;
    // End of variables declaration//GEN-END:variables
}
