
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class divexp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Div Exp</title>");
        out.println("</head>");
        out.println("<body>");

        for (int i = 1; i <= 20; i++) {

            out.println("<div style='margin:10px;padding:20px;background:rgba(255,0,0)'>");
            out.println("<h1>Heading "+i+"</h1>");
            out.println("<p>This some content</p>");
            out.println("</div>");

        }

        out.println("</body>");
        out.println("</html>");

    }

}
