
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>IF ELSE example</h1>

        <%

            double d = Math.random();
            if (d > 0.5) {
        %>

        <h1>Good morning</h1>

        <%
        } else {
        %>
        <h1>Good afternoon</h1>

        <%
            }
        %>


    </body>
</html>
