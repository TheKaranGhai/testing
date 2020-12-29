
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ajaxexplist extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out=response.getWriter();
        
        int number=Integer.parseInt(request.getParameter("number"));
        
        out.println("<ul>");
        
        for (int i = 1; i <=number; i++) {
            
            out.println("<li>"+i+"</li>");
        }
        
        out.println("</ul>");
        
    }

    
}
