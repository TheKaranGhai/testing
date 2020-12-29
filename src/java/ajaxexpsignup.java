
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import vmm.DBLoader;

public class ajaxexpsignup extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            PrintWriter out = response.getWriter();

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String age = request.getParameter("age");

            ResultSet rs = DBLoader.executeQuery("select * from users where username='" + username + "'");

            if (rs.next()) {
                
                out.println("alreadyexist");

            } else {

                rs.moveToInsertRow();
                rs.updateString("username", username);
                rs.updateString("password", password);
                rs.updateString("email", email);
                rs.updateInt("age", Integer.parseInt(age));
                rs.insertRow();

                out.println("success");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
