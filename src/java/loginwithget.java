
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginwithget extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        //out.println("<h1>You entered<h1>");
        //out.println("<h1>Username : "+username+"</h1>");
        //out.println("<h1>Password: "+password+"</h1>");
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Login with get</title>");
        out.println("</head>");
        out.println("<body>");

        if (username.equals("harpreet") && password.equals("123456")) {
            out.println("<h1>Login Successful</h1>");
            response.sendRedirect("ServletExpuserhome.html");
        } else {
            out.println("<h1>Login Fail</h1>");
        }

        out.println("</body>");
        out.println("</html>");

    }

}
