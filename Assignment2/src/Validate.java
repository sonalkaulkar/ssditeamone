import java.sql.*;
import java.util.ArrayList;

public class Validate
 {
     public static boolean checkUser(String username,String pass) 
     {
      boolean st =false;
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://127.0.0.1:3306/test","root","UnccSonal11");
         if (con == null)
                 { System.out.println("Connection not establised");
                 }
         PreparedStatement ps =con.prepareStatement
                             ("select * from login where username=? and password=?");
         ps.setString(1, username);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        System.out.println(username);
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  } 
     
     public static ArrayList<Course> displayCourse(String username) 
     { ArrayList<Course> c1 = new ArrayList();
      try{

	 //loading drivers for mysql
         Class.forName("com.mysql.jdbc.Driver");

 	 //creating connection with the database 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql://127.0.0.1:3306/mydatabase","root","UnccSonal11");
         if (con == null)
                 { System.out.println("Connection not establised");
                 }
         PreparedStatement ps =con.prepareStatement
                             ("select * from course where student=?");
         ps.setString(1, username);
         ResultSet rs =ps.executeQuery();
         while (rs.next())
         {
        	 String course_id = rs.getString(1);
        	String course_name =rs.getString(2);
        	Course c = new Course(course_id,course_name);
        	c1.add(c);
        	
         }
       
      }catch(Exception e)
      {
          e.printStackTrace();
      }
      return c1;                  
  } 
}