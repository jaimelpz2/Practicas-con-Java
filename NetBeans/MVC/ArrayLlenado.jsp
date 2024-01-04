<%-- 
    Document   : ArrayLlenado
    Created on : 18/09/2021, 07:22:48 PM
    Author     : JimmyLpz
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="Arralist.Cacahuate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro Con Arraylist</h1>
        <%
           String nombre= request.getParameter("nombre");
           String codigo = request.getParameter("codigo");
           String precio = request.getParameter("precio");
           String cantidad = request.getParameter("cantidad");
           
           int a=Integer.parseInt(codigo);
           int b=Integer.parseInt(precio);
           int c=Integer.parseInt(cantidad);
           
        
           Cacahuate u = new Cacahuate(nombre, a, b, c);
           
           ArrayList<Cacahuate> lista = (ArrayList<Cacahuate>)request.getSession().getAttribute("lista");
           
           if(lista==null){
               lista = new ArrayList<Cacahuate>();
               lista.add(u);
               request.getSession().setAttribute("lista", lista);
           }else{
               lista.add(u);
               request.getSession().setAttribute("lista", lista);
           }
           
           out.println("<table border='1' >");

            if(lista==null){
                out.println("No existen usuarios registrados");
            }else{
                for(int j=0;j<lista.size();j++){ //columnas
                    out.println("<tr>");
                     for(int i=0;i<1;i++){ //filas
                    out.println("<td>");
                    out.println("codigo: "+lista.get(j).getCodigo());
                    out.println("nombre: "+lista.get(j).getNombre());
                    out.println("precio: "+lista.get(j).getPrecio());
                    out.println("Cantidad: "+lista.get(j).getCantidad());
                    out.println("</td>");
                     }
                     out.println("</tr>");
                  }
               
            }
            out.println("</table");
            out.println("<br>");
            
        %>
        <br><br/>
        <a href="Array.jsp">
            volver a principal
        </a>
      
    </body>
</html>
