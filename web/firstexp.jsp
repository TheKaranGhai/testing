<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1 style="color:red; border:1px solid #000">Hello World!</h1>
        
        <h1 style="color: blue">Random Number:   <%= Math.random() %> </h1>
        
        <h1>Time: <%= System.currentTimeMillis() %>   </h1>
        
    </body>
</html>
