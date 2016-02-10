
import java.awt.Toolkit;
import javax.swing.ImageIcon;


public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        super("Factory Vehicle System Homepage");
        initComponents();
    //this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        vtb = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        fillvt = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        viewvt = new javax.swing.JMenuItem();
        kmr = new javax.swing.JMenu();
        fillkmr = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        viewkmr = new javax.swing.JMenuItem();
        vehicle = new javax.swing.JMenu();
        addvehicle = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        viewvehicles = new javax.swing.JMenuItem();
        driver = new javax.swing.JMenu();
        addriver = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setForeground(new java.awt.Color(102, 102, 0));
        jLabel1.setText("Welcome to Ragati Tea Factory Vehicleturnabout System");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rgv.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rg.jpg"))); // NOI18N

        jMenu1.setForeground(new java.awt.Color(51, 51, 0));
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

        vtb.setForeground(new java.awt.Color(51, 51, 0));
        vtb.setText("Vehicleturnabout");
        vtb.add(jSeparator1);

        fillvt.setText("Fill");
        fillvt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fillvtMousePressed(evt);
            }
        });
        vtb.add(fillvt);
        vtb.add(jSeparator5);

        viewvt.setText("View");
        viewvt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewvtMousePressed(evt);
            }
        });
        vtb.add(viewvt);

        jMenuBar1.add(vtb);

        kmr.setForeground(new java.awt.Color(51, 51, 0));
        kmr.setText("KM Overhaul");

        fillkmr.setText("Fill");
        fillkmr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fillkmrMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                fillkmrMousePressed(evt);
            }
        });
        kmr.add(fillkmr);
        kmr.add(jSeparator2);

        viewkmr.setText("View");
        viewkmr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewkmrMousePressed(evt);
            }
        });
        kmr.add(viewkmr);

        jMenuBar1.add(kmr);

        vehicle.setForeground(new java.awt.Color(51, 51, 0));
        vehicle.setText("Vehicles");

        addvehicle.setText("Add");
        addvehicle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addvehicleMousePressed(evt);
            }
        });
        vehicle.add(addvehicle);
        vehicle.add(jSeparator3);

        viewvehicles.setText("View");
        viewvehicles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                viewvehiclesMousePressed(evt);
            }
        });
        vehicle.add(viewvehicles);

        jMenuBar1.add(vehicle);

        driver.setForeground(new java.awt.Color(51, 51, 0));
        driver.setText("Drivers");

        addriver.setText("Add");
        addriver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addriverMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addriverMousePressed(evt);
            }
        });
        driver.add(addriver);
        driver.add(jSeparator4);

        jMenuItem9.setText("View");
        jMenuItem9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItem9MousePressed(evt);
            }
        });
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        driver.add(jMenuItem9);

        jMenuBar1.add(driver);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(jLabel3))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(58, 58, 58))
        );

        setSize(new java.awt.Dimension(550, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void addriverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addriverMouseClicked
        // TODO add your handling code here:
         drivers dr = new drivers();
                 dr.setVisible(true);
    }//GEN-LAST:event_addriverMouseClicked

    private void fillkmrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fillkmrMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_fillkmrMouseClicked

    private void addriverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addriverMousePressed
        // TODO add your handling code here:
                drivers dr = new drivers();
                 dr.setVisible(true);
    }//GEN-LAST:event_addriverMousePressed

    private void jMenuItem9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem9MousePressed
        // TODO add your handling code here:
          viewdrivers view = new viewdrivers();
           view.setVisible(true);
    }//GEN-LAST:event_jMenuItem9MousePressed

    private void fillvtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fillvtMousePressed
        // TODO add your handling code here:
        vehiclet vht = new vehiclet();
            vht.setVisible(true);
    }//GEN-LAST:event_fillvtMousePressed

    private void viewvtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewvtMousePressed
        // TODO add your handling code here:
        viewvt vwvt = new viewvt();
               vwvt.setVisible(true);
    }//GEN-LAST:event_viewvtMousePressed

    private void fillkmrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fillkmrMousePressed
        // TODO add your handling code here:
        kmrange kmrg = new kmrange();
               kmrg.setVisible(true);
    }//GEN-LAST:event_fillkmrMousePressed

    private void viewkmrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewkmrMousePressed
        // TODO add your handling code here:
        viewkmr vkmr = new viewkmr();
                vkmr.setVisible(true);
    }//GEN-LAST:event_viewkmrMousePressed

    private void addvehicleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addvehicleMousePressed
        // TODO add your handling code here:
        vehicles v = new vehicles();
                 v.setVisible(true);
    }//GEN-LAST:event_addvehicleMousePressed

    private void viewvehiclesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewvehiclesMousePressed
        // TODO add your handling code here:
        viewvehicles vwvh = new viewvehicles();
                     vwvh.setVisible(true);
    }//GEN-LAST:event_viewvehiclesMousePressed

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        // TODO add your handling code here:
        login lg = new login();
              lg.setVisible(true);
              this.dispose();
    }//GEN-LAST:event_logoutMousePressed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addriver;
    private javax.swing.JMenuItem addvehicle;
    private javax.swing.JMenu driver;
    private javax.swing.JMenuItem fillkmr;
    private javax.swing.JMenuItem fillvt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenu kmr;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu vehicle;
    private javax.swing.JMenuItem viewkmr;
    private javax.swing.JMenuItem viewvehicles;
    private javax.swing.JMenuItem viewvt;
    private javax.swing.JMenu vtb;
    // End of variables declaration//GEN-END:variables
}
