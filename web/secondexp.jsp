
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
          int a=10;
          int b=20;
          int c=Math.min(a,b);   
        %>
        
        <h1>Result of Min:  <%= c %></h1>
        
        
        
        
    </body>
</html>
