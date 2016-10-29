

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Display extends HttpServlet {
    String selectc;
    String selectp;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            
             selectc =request.getParameter("CityType");
             selectp =request.getParameter("City");
             
             //Indore Pages
             
             if(selectc.equalsIgnoreCase("indore")&&selectp.equalsIgnoreCase("Regional Park"))
           {
               response.sendRedirect("regional.html");
           }
             
             if(selectc.equalsIgnoreCase("indore")&&selectp.equalsIgnoreCase("Khajrana"))
           {
               response.sendRedirect("Khajrana.html");
           }
             
             if(selectc.equalsIgnoreCase("indore")&&selectp.equalsIgnoreCase("Nehru Park"))
           {
               response.sendRedirect("Nehrupark.html");
           }
             
             if(selectc.equalsIgnoreCase("indore")&&selectp.equalsIgnoreCase("Lalbag"))
           {
               response.sendRedirect("lalbag.html");
           }
             if(selectc.equalsIgnoreCase("indore")&&selectp.equalsIgnoreCase("Rajwada"))
           {
               response.sendRedirect("rajwada.html");
           }
            
             
             //Mumbai Pages
             
             if(selectc.equalsIgnoreCase("Mumbai")&&selectp.equalsIgnoreCase("Gateway of India"))
           {
               response.sendRedirect("gateway.html");
           }
             
             if(selectc.equalsIgnoreCase("Mumbai")&&selectp.equalsIgnoreCase("Siddhivinayak Mandir"))
           {
               response.sendRedirect("siddhivinayak.html");
           }
              if(selectc.equalsIgnoreCase("Mumbai")&&selectp.equalsIgnoreCase("Elephanta Caves"))
           {
               response.sendRedirect("elephanta.html");
           }
              if(selectc.equalsIgnoreCase("Mumbai")&&selectp.equalsIgnoreCase("Marine Drive"))
           {
               response.sendRedirect("marine.html");
           } 
            
            if(selectc.equalsIgnoreCase("Mumbai")&&selectp.equalsIgnoreCase("Girgaon Chowpatty"))
           {
               response.sendRedirect("girgaon.html");
           } 
            
            //Pune Pages
             if(selectc.equalsIgnoreCase("Pune")&&selectp.equalsIgnoreCase("Dagdusheth Ganpati Mandir"))
           {
               response.sendRedirect("dagdusheth.html");
           } 
             
             if(selectc.equalsIgnoreCase("Pune")&&selectp.equalsIgnoreCase("Shaniwar Wada"))
           {
               response.sendRedirect("shanivarwada.html");
           } 
              if(selectc.equalsIgnoreCase("Pune")&&selectp.equalsIgnoreCase("Sinhagad fort"))
           {
               response.sendRedirect("sinhgad.html");
           } 
            if(selectc.equalsIgnoreCase("Pune")&&selectp.equalsIgnoreCase("Parvati Hill"))
           {
               response.sendRedirect("parvatihill.html");
           } 
            if(selectc.equalsIgnoreCase("Pune")&&selectp.equalsIgnoreCase("Aga Khan Palace "))
           {
               response.sendRedirect("agakhan.html");
           } 
        }catch(Exception e)
        {
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
