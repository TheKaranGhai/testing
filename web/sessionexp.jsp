


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%

            int i;
            //first request
            if (session.getAttribute("count") == null) {

                i = 0;
                i++;
                session.setAttribute("count", i);
            } else {
                //next requests
                String count = session.getAttribute("count").toString();
                i = Integer.parseInt(count);
                i++;
                session.setAttribute("count", i);

            }


        %>


        <h1>Visit Count: <%=i%></h1>

    </body>
</html>
