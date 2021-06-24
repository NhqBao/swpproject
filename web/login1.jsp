<%-- 
    Document   : login1
    Created on : Jun 1, 2021, 9:30:33 PM
    Author     : msi-pc
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        <style>
            p{color:red;
              font-size: 40px;
              font-weight: bold}
            
        </style>
    </head>
    <body>
        <form action="login" method="POST">
            <p class="text-danger"> ${mess}</p>
            <h2>Tên đăng nhập<input type="text" name="user" value="" /></h2><br>
            <h2>Mật khẩu<input type="text" name="pass" value="" /></h2><br>
            <input type="submit" value="signin" />
        </form>
    </body>
</html>
