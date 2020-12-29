
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
        <h1>Table Example</h1>
        <table class="table table-striped">

            <tr>
                <th>Rollno</th>
                <th>Name</th>
                <th>Marks</th>
            </tr>

            <%
                int rollno[] = {1, 2, 3, 4, 5, 6, 7, 8};
                String names[] = {"enola", "peter", "sherlock", "watson", "smith", "john", "sam", "dean"};
                int marks[] = {99, 88, 77, 93, 98, 94, 95, 99};

                for (int i = 0; i < rollno.length; i++) {
            %>

            <tr>
                <td><%=rollno[i]%></td>
                <td><%=names[i]%></td>
                <td><%=marks[i]%></td>
            </tr>
            
            <%
            }
            %>


        </table>
            
        </div>
    </body>
</html>
