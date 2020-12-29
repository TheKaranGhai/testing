
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import vmm.DBLoader;

public class editstudent extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            PrintWriter out = response.getWriter();

            String rollno = request.getParameter("rollno");
            String name = request.getParameter("name");
            String marks = request.getParameter("marks");

            ResultSet rs = DBLoader.executeQuery("select * from student where rollno=" + rollno);

            if (rs.next()) {
                rs.updateString("name", name);
                rs.updateInt("marks", Integer.parseInt(marks));
                rs.updateRow();
                out.println("success");

            } else {
                out.println("fail");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
