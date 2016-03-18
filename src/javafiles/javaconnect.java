package javafiles;



import java.sql.*;
import javax.swing.*;

public class javaconnect {
    
    Connection conn = null;
    
  
    public static Connection connecrDb()
    {           
       /* String dburl ="jdbc:derby://localhost:1527/vehicles";
        String uname ="root";
        String pwd ="root";*/
        try{  
            //Class.forName("org.sqlite.JDBC");
               Connection conn = DriverManager.getConnection("jdbc:sqlite:vehicle.sqlite");     
   

           //JOptionPane.showMessageDialog(null, "connection established");
            return conn;
        }
        
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
