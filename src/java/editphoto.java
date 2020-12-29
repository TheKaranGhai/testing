
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import vmm.DBLoader;
import vmm.FileUploader;

@MultipartConfig
public class editphoto extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            PrintWriter out = response.getWriter();

            String rollno = request.getParameter("rollno");

            String absolutepath = request.getServletContext().getRealPath("/myuploads");
            Part filepart = request.getPart("myfile");
            String newname = System.currentTimeMillis() + "";
            String filename = FileUploader.savefileonserver(filepart, absolutepath, newname);
            String filepath = "myuploads/" + filename;

            ResultSet rs = DBLoader.executeQuery("select * from student where rollno=" + rollno);

            if (rs.next()) {
                rs.updateString("photo", filepath);
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
