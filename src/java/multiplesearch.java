


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class multiplesearch extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
         String q=request.getParameter("q");
         String choice=request.getParameter("choice");
         
         if(choice.equals("google"))
         {
             response.sendRedirect("https://www.google.com/search?q="+q);
             
         }
         else if(choice.equals("bing"))
         {
             response.sendRedirect("https://www.bing.com/search?q="+q);
         }
         else
         {
             response.sendRedirect("https://in.search.yahoo.com/search?p="+q);
         }
        
        
        
        
    }

    
    
}
