
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%

            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username.equals("preet") && password.equals("34567")) {

        %>
        <h1>Login successful</h1>
        
        <%
          response.sendRedirect("userhome.jsp");  
        }
       else{
        
        %>
        <h1>Login Fail</h1>
        <%
        }
        %>

        

    </body>
</html>
