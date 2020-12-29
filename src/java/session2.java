

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class session2 extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        PrintWriter out=response.getWriter();
        
        String username=request.getParameter("username");
        
        request.getSession().setAttribute("username", username);
        
        out.println("<a href=\"session3.jsp\" >Next</a>");
        
        
    }

    
}
