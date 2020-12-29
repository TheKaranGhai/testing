
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
public class addstudent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            PrintWriter out = response.getWriter();

            String rollno = request.getParameter("rollno");
            String name = request.getParameter("name");
            String marks = request.getParameter("marks");

            ResultSet rs = DBLoader.executeQuery("select * from student where rollno=" + rollno);

            if (rs.next()) {

                out.println("alreadyexist");
            } else {

               String absolutepath= request.getServletContext().getRealPath("/myuploads");
               Part filepart= request.getPart("myfile");
               String newname=System.currentTimeMillis()+"";
               String filename=FileUploader.savefileonserver(filepart, absolutepath, newname);
               
               String filepath="myuploads/"+filename;
               
               rs.moveToInsertRow();
               rs.updateInt("rollno", Integer.parseInt(rollno));
               rs.updateString("name", name);
               rs.updateInt("marks", Integer.parseInt(marks));
               rs.updateString("photo", filepath);
               rs.insertRow();
               
               out.println("success");
               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
