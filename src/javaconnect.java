

import java.sql.*;
import javax.swing.*;

public class javaconnect {
    
    Connection conn = null;
    
  
    public static Connection connecrDb()
    {
        try{ 
               Class.forName("org.sqlite.JDBC");
               Connection conn = DriverManager.getConnection
              ("jdbc:sqlite:vehicle.sqlite");     
              //JOptionPane.showMessageDialog(null, "connection established");

            return conn;
        }
        
        catch (ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
