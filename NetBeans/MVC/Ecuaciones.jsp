<%-- 
    Document   : Ecuaciones
    Created on : 11/09/2021, 10:17:21 PM
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
        <div>
            <form action="Calcular.jsp" method="get">
        <h1>Clase de Matematicas Avanzadas</h1>
        <h4>Necesitamos obtener unos datos</h4>
        <input type="text" name="Dato1" /><label>LadoLargo/Base/Lado</label>
        <br>
        <input type="text" name="Dato2" /><label>LadoAncho/Altura</label>
        <br>
        <br/>
        <label>Selecciona la figura que desea Calcular</label>
         <br/>
         <br>
        <input type="radio" name="Figura" value="Triangulo"/><label>Triangulo</label>
        <input type="radio" name="Figura" value="Cuadrado"/><label>Cuadrado</label>
        <input type="radio" name="Figura" value="Rectangulo"/><label>Rectangulo</label>
          <br/><br/>
        <label>Que desea Calcular?</label>
         <br/>
        <input type="checkbox" name="Operacion" value="Area" /><label>Area</label>
        <input type="checkbox" name="Operacion" value="Perimetro" /><label>Perimetro</label>
        <br/><br/>
        <input type="submit" value="Enviar" name="Send"/>
            </form>
        </div>
    </body>
</html>
