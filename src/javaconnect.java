

import java.sql.*;
import javax.swing.*;

public class javaconnect {
    
    Connection conn = null;
    
    public static Connection connecrDb()
    {
        try{ 
               Class.forName("com.mysql.jdbc.Driver");
               Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vehicle?" + "user=root&password=admin");     
            //JOptionPane.showMessageDialog(null, "connection established");

            return conn;
        }
        
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
