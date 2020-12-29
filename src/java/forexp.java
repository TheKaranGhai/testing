
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class forexp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>loop Exp to gerenate dynamic content</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>List</h1>");
        out.println("<ul>");

        for (int i = 1; i <= 10; i++) {
            out.println("<li>"+i+" * 6 ="+(i*6)+"</li>");
           
        }
        
        
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");

    }

}
