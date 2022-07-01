
package doctordatabase;

import java.sql.*;

import java.util.*;
public class DoctorDatabase {

   
    public static void main(String[] args) {
        String n,i, p;
        System.out.println("Enter name");
        Scanner in= new Scanner(System.in);
        n=in.next();
        System.out.println("Enter Doctor ID");
        i=in.next();
        System.out.println("Enter your phone number");
        p=in.next();
        
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","Dipti077");
        Statement st= con.createStatement();
        st.executeUpdate("Insert into Doctor Values('"+n+"','"+i+"','"+p+"')");
               st.close();
               con.close();
        }
        catch(Exception e){
            System.out.println("Error:+ e");
        }
    }
    
}
