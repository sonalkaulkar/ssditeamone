import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        out.println("Welcome " + username);
        ArrayList c1 =  new ArrayList();
        c1 = Validate.displayCourse(username);
        out.println("<br>");
       //out.println("<style>");
    	//out.println("table, th, td");
      out.println("<TABLE  BORDER='5' CELLSPACING ='3' CELLPADDING ='3'>");
        
        out.println("<tr>");
        out.println("<th>Course Id</th>");
        out.println("<th>Course Name</th>");
        out.println("</tr>");
        out.println("<br>");
        for (int i = 0 ;i < c1.size(); i++)
        {
        	Course c = (Course)c1.get(i);
        	System.out.println(c.getCourse_name());
        	System.out.println(c.getCourseId());
        	  out.print("<tr>");
              out.print("<td> <input type='text' name='course_id' value='"+c.getCourseId()+"' />  </td>");
              out.print(" <td> <input type='text' name='course_name' value='"+c.getCourse_name()+"' />   </td>");
              out.print("</tr>");
        	
        }
        
        
        
      }  
}