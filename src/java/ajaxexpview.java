
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import vmm.DBLoader;

public class ajaxexpview extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            PrintWriter out = response.getWriter();

            ResultSet rs = DBLoader.executeQuery("select * from users");

            out.println("<table border='1' cellpadding='10' >");

            out.println("<tr>");
            out.println("<th>Username</th>");
            out.println("<th>Password</th>");
            out.println("<th>Email</th>");
            out.println("<th>Age</th>");
            out.println("</tr>");

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                int age = rs.getInt("age");
             
                out.println("<tr>");
                out.println("<td>"+username+"</td>");
                out.println("<td>"+password+"</td>");
                out.println("<td>"+email+"</td>");
                out.println("<td>"+age+"</td>");
                out.println("</tr>");

            }

            out.println("</table>");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
