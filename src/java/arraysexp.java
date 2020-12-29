
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class arraysexp extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int rollno[] = {1, 2, 3, 4, 5, 6, 7, 8};
        String names[] = {"enola", "peter", "sherlock", "watson", "smith", "john", "sam", "dean"};
        int marks[] = {99, 88, 77, 93, 98, 94, 95, 99};

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Array Exp</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Table</h1>");

        out.println("<table cellpadding='10' border='2' style='color:red;'  >");

        //heading row
        out.println("<tr>");
        out.println("<th>Rollno</th>");
        out.println("<th>Name</th>");
        out.println("<th>Marks</th>");
        out.println("</tr>");

        for (int i = 0; i < rollno.length; i++) {

            //data  row 
            out.println("<tr>");
            out.println("<td>"+rollno[i]+"</td>");
            out.println("<td>"+names[i]+"</td>");
            out.println("<td>"+marks[i]+"</td>");
            out.println("</tr>");

        }

        out.println("</table>");

        out.println("</body>");
        out.println("</html>");

        
        
        
    }

}
