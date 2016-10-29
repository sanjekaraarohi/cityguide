
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


public class InsertData extends HttpServlet {

    String username,emailid,gender,city,password,conpass;
   
    String query;
    Connection conn;
    Statement stmt;
    ResultSet res;
    DatabaseConnection dbconn;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            dbconn=new DatabaseConnection();
            username=request.getParameter("username");
            emailid=request.getParameter("emailid");
            gender=request.getParameter("gender");
          
            city=request.getParameter("city");
            password=request.getParameter("password");
            conpass=request.getParameter("conpass");
            
            conn=dbconn.seConnection();
            stmt=conn.createStatement();
            query = "insert into reg values('"+username+"','"+emailid+"','"+gender+"','"+city+"','"+password+"','"+conpass+"')";
            int i=stmt.executeUpdate(query);
        }catch(Exception e){
            request.setAttribute("Error", e);
            RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }
        
        finally {
            RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);
    
            out.close();
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
