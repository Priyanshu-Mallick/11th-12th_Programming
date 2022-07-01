
package studentdatabase;

import java.sql.*;
public class StudentDatabase {

    public static void main(String[] args) {
        String name,Sec;
        int roll;
     
        try
        {
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sms","root","Diptiranjan077");
    Statement st=con.createStatement();
    st.executeUpdate("insert into Student  values (6,'Ajay','E')");
  
  
    st.close();
    con.close();
    
    }
         catch (Exception e)
             {
             System.out.println("Error: +e");
             }
    }
    
}

