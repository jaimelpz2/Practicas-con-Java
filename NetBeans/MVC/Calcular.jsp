<%-- 
    Document   : Calcular
    Created on : 11/09/2021, 10:17:48 PM
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
        <h1>Resultados:</h1>
        
        <%
        double Area,Perimetro;
        double bll=Double.parseDouble(request.getParameter("Dato1"));
        double bh=Double.parseDouble(request.getParameter("Dato2"));
        String opcion=request.getParameter("Figura");
        String Operacion=request.getParameter("Operacion");
        if(opcion.equals("Triangulo")){
        out.println("Usted ha seleccionado calcular el Triangulo"+"<br>");
          if(Operacion.equals("Area") && Operacion.equals("Perimetro")){
         Area=bll*bh/2;
         out.println("Area es: "+Area);
             Perimetro=bll*3;
         out.println("Perimetro es: "+Perimetro);
            
}
         else if(Operacion.equals("Area")){
         Area=bll*bh/2;
         out.println("Area es: "+Area);
            
        }else if(Operacion.equals("Perimetro")){
        Perimetro=bll+(bh*2);
         out.println("Perimetro es: "+Perimetro);
            
           
        }
     }  
        
        else if(opcion.equals("Cuadrado")){
        out.println("Usted ha seleccionado calcular el Cuadrado"+"<br>");
         if(Operacion.equals("Area")){
         Area=bll*bll;
            out.println("Area es: "+Area);
            
        }else if(Operacion.equals("Perimetro")){
        Perimetro=bll*4;
            out.println("Perimetro es: "+Perimetro);
            
        }

      } 

        else if(opcion.equals("Rectangulo")){
        out.println("Usted ha seleccionado calcular el Rectangulo"+"<br>");
         if(Operacion.equals("Area")){
         Area=bll*bh;
            out.println("Area es: "+Area);
            
        }else if(Operacion.equals("Perimetro")){
        Perimetro=(bh*2)+(bll*2);
            out.println("Perimetro es: "+Perimetro);
            
        }
      }
 
        %>
        
        
        <a href="Ecuaciones.jsp">
            volver a principal
        </a>
    </body>
</html>
