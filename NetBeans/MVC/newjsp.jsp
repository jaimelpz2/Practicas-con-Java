<%-- 
    Document   : newjsp
    Created on : 14/09/2021, 11:02:52 AM
    Author     : JimmyLpz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calcular la Formula General</h1>
        <form action="NewServlet" method="post">
            <label>Por Ejemplo 1,-2,-24</label><br><br/>
            <label>A: </label><input type="text" name="datos1">
            <br>
            <label>B: </label><input type="text" name="datos2">
            <br>
            <label>C: </label><input type="text" name="datos3">
            <br><br/>
            <input type="submit" value="Enviar">
            
        </form>
    </body>
</html>
