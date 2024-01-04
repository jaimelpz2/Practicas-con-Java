<%-- 
    Document   : Array
    Created on : 18/09/2021, 06:55:49 PM
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
        <h1>Bienvenido Usuario</h1>
        <h2>Registre los productos que desee</h2>
        <form action="ArrayLlenado.jsp" method="post">
            <table border="1">
                <tr>
                    <td>Codigo</td>
                    <td>Nombre</td>
                    <td>Precio</td>
                    <td>Cantidad</td>
                </tr>
                <tr>
                    <td><input type="text" name="codigo"></td>
                    <td><input type="text" name="nombre"></td>
                    <td><input type="text" name="precio"></td>
                    <td><input type="text" name="cantidad"></td>
                </tr>
            </table>
            <input type="submit" name="subir">
        </form>
    </body>
</html>
