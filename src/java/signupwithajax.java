
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import vmm.DBLoader;
import vmm.FileUploader;

@MultipartConfig
public class signupwithajax extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {

            PrintWriter out = response.getWriter();

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String phoneno = request.getParameter("phoneno");

            ResultSet rs = DBLoader.executeQuery("select * from allusers where username='" + username + "'");

            if (rs.next()) {

                out.println("alreadyexist");

            } else {

                //file save
                String absolutepath = request.getServletContext().getRealPath("/myuploads");
                String newname = System.currentTimeMillis() + "";
                Part filepart = request.getPart("myfile");
                String filename = FileUploader.savefileonserver(filepart, absolutepath, newname);

                String filepath = "myupload/" + filename;

                rs.moveToInsertRow();
                rs.updateString("username", username);
                rs.updateString("password", password);
                rs.updateString("email", email);
                rs.updateString("phoneno", phoneno);
                rs.updateString("photo", filepath);
                rs.insertRow();

                out.println("success");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
