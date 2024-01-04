<%-- 
    Document   : DestinoTable
    Created on : 11/09/2021, 07:44:29 PM
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
        <h1>Tus datos son: </h1>
        <br/><br/>
        <%
        String nombre=request.getParameter("Nombre");
        String apellidos=request.getParameter("Apellidos");
        String email=request.getParameter("Email");  
        String dom=request.getParameter("Calle y Numero");
        String colonia=request.getParameter("Colonia");  
        String cp=request.getParameter("CP");
        String ciudad=request.getParameter("Ciudad");
        String estado=request.getParameter("Estado");   
        String edad=request.getParameter("Edad");
        String confirmacion=request.getParameter("Terminos");

       
        
        %>
        
        
        <table>
                    <tr><%-- Filas --%> 
                        <td>Nombre: </td><%-- Columnas --%> 
                        <td>
                            <%=nombre%>
                        </td>
                    </tr>
                    <tr>
                        <td>Apellidos: </td>
                         <td>
                            <%=apellidos%>
                        </td>
                    </tr>
                    <tr>
                        <td>Email: </td> 
                         <td>
                            <%=email%>
                        </td>
                    </tr>
                    <tr>
                        <td>Calle y Numero: </td> 
                         <td>
                            <%=dom%>
                        </td>
                    </tr>
                    <tr>
                        <td>Colonia: </td>
                         <td>
                            <%=colonia%>
                        </td>
                    </tr>
                    <tr>
                        <td>CP: </td>
                         <td>
                            <%=cp%>
                        </td>
                    </tr>
                    <tr>
                        <td>Ciudad: </td>
                         <td>
                            <%=ciudad%>
                        </td>
                    </tr>
                    <tr>
                        <td>Estado: </td>
                         <td>
                           <%=estado%>
                        </td>
                    </tr>
                   
                </table>
        Acepto terminos y condiciones?: <%=confirmacion%>
        <br>
        Es mayor de Edad?:  <%=edad%><br>
        
        <br/><br/>
        <a href="Table.jsp">
            volver a principal
        </a>
    </body>
</html>
