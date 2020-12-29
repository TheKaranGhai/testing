

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
        
          String s= session.getAttribute("username").toString();
        
        %>
        
        <h1>Hiii    <%=s%></h1>
        
        <a href="session4" >Next</a>
    </body>
</html>
