
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="text-align: center;">
        <h1>Login</h1>
        <form action="loginresponse.jsp" method="post" >
            <input type="text" name="username" placeholder="Enter username" /><br></br>
    
            <input type="password" name="password" placeholder="Enter password" /><br><br>
            
            <input type="submit" value="Login" />
            
        </form>
        
        </div>
        
    </body>
</html>
