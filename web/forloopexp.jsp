
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>For loop</h1>

        <ul>
            <%
                for (int i = 1; i <= 10; i++) {
            %>

            <li><%=i%> * 6 = <%=i * 6%></li>

            <%
                }

            %>

        </ul>

    </body>
</html>
