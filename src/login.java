
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.sql.*;
import javax.swing.JOptionPane;
public class login extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public login() {
        super("Login");
        initComponents();
        
         conn = javaconnect.connecrDb();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmd_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 18), new java.awt.Color(0, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 0));

        jLabel1.setText("Username");

        cmd_login.setText("Login");
        cmd_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd_loginActionPerformed(evt);
            }
        });

        jLabel2.setText("Password");

        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_user)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cmd_login))
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmd_login)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(261, 221));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmd_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd_loginActionPerformed
        // TODO add your handling code here:
        String sql = "select * from users where username=? and password=?";
        
        try{
             pst = conn.prepareStatement(sql);
             pst.setString(1,txt_user.getText());
             pst.setString(2,md5(txt_password.getText()));
             
             rs =pst.executeQuery(); 
             
             if(rs.next()){
                 String name =  rs.getString("username"); 
                 if(name.equals("admin")||name.equals("root"))
                 {
                adminvt vt = new  adminvt();
                 vt.setVisible(true);
                        close();
                 }
                 else{
                     vehiclet vt = new  vehiclet();
                     vt.setVisible(true);
                        close();
                     }      
                    }

             else {
                      JOptionPane.showMessageDialog(null,"Incorrect login details");
}
            
        
    }                                         
   catch(SQLException | HeadlessException e){
                      JOptionPane.showMessageDialog(null,e);

   }
    }//GEN-LAST:event_cmd_loginActionPerformed

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            String sql = "select * from users where username=? and password=?";
        
        try{
             pst = conn.prepareStatement(sql);
             pst.setString(1,txt_user.getText());
             pst.setString(2,txt_password.getText());
             
             rs =pst.executeQuery(); 
             if(rs.next()){
                 vehiclet vt = new  vehiclet();
                 vt.setVisible(true);
                        close();
               
             }

             else {
                            JOptionPane.showMessageDialog(null,"Incorrect login details");
}
            
        
    }                                         
   catch(SQLException | HeadlessException e){
                      JOptionPane.showMessageDialog(null,e);

   }
        }
    }//GEN-LAST:event_txt_passwordKeyPressed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
     
     
     }
    
      private String md5(String c) 
      {
       try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[]messageDigest =md.digest(c.getBytes());
            BigInteger number =new BigInteger(1,messageDigest);
            String hashtext = number.toString(16);
            
            while(hashtext.length()<32)
            {
            hashtext ="0"+hashtext;
            }
            return hashtext;
          }
          catch(Exception ex){
          }
        return null;

       }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
