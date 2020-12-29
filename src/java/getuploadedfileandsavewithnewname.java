
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import vmm.FileUploader;

@MultipartConfig
public class getuploadedfileandsavewithnewname extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");

        String email = request.getParameter("email");

        //will return absolute path of myuploads folder
        String absolutepath = request.getServletContext().getRealPath("/myuploads");

        //get file part from request
        Part filepart = request.getPart("myfile");

        //decide name
        String newname=System.currentTimeMillis()+"";
        
        // file will be uploaded and name of the file will be returned
        String filename = FileUploader.savefileonserver(filepart, absolutepath,newname);

        out.println("username : " + username);
        out.println("email : " + email);
        out.println("file name : " + filename);
        out.println("File uploaded");

    }
}
