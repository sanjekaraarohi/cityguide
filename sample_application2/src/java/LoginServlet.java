

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
    String query;
    Connection conn;
    Statement stmt;
    ResultSet res;
    DatabaseConnection dbconn;
    
     String user;
     String pass;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
         try{
           dbconn = new DatabaseConnection();
           
            user=request.getParameter("username");
            pass=request.getParameter("password");
           
             conn=dbconn.seConnection();
            stmt=conn.createStatement();
          query="select * from reg where username = '"+user+"'";
          ResultSet res =stmt.executeQuery(query);
          
          String uid=null;
          String pid=null;
          
          while(res.next())
          {
             uid=res.getString(1);
             pid=res.getString(5);
          }
           
          if(uid.equals(user)&&pid.equals(pass))
          {
              HttpSession session = request.getSession(); 
              session.setAttribute("username", user);
              response.sendRedirect("success.jsp");
           
          }
          else
          {
              
              response.sendRedirect("error.jsp");
          }
        }catch(Exception e)
        {
               System.out.println("Error");
        }
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
