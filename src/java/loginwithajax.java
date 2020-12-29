
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import vmm.DBLoader;

public class loginwithajax extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            PrintWriter out=response.getWriter();
            
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            
            ResultSet rs=DBLoader.executeQuery("select * from allusers where username='"+username+"' and password='"+password+"'");
            
            if(rs.next())
            {
                out.println("success");
            }
            else
            {
                out.println("fail");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
