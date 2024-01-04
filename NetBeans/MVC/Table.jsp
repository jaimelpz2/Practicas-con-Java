<%-- 
    Document   : Table
    Created on : 11/09/2021, 07:41:06 PM
    Author     : JimmyLpz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS2/EstTab.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="header">
        <h1>Bienvenido Estudiante!</h1>
        <h2>llene la siguiente informacion</h2>
        </div>
        <div id="Body">
            <form action="DestinoTable.jsp" method="get">
                <table name="tabla">
                    <tr><%-- Filas --%> 
                        <td>Nombre</td><%-- Columnas --%> 
                        <td>
                            <input type="text"class="entrada" name="Nombre"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Apellidos</td>
                         <td>
                            <input type="text"class="entrada" name="Apellidos"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Email</td> 
                         <td>
                            <input type="text"class="entrada" name="Email"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Calle y Numero</td> 
                         <td>
                            <input type="text"class="entrada" name="Calle y Numero"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Colonia</td>
                         <td>
                            <input type="text"class="entrada" name="Colonia"/>
                        </td>
                    </tr>
                    <tr>
                        <td>CP</td>
                         <td>
                            <input type="text"class="entrada" name="CP"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Ciudad</td>
                         <td>
                            <input type="text"class="entrada" name="Ciudad"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Estado</td>
                         <td>
                            <input type="text"class="entrada" name="Estado"/>
                        </td>
                    </tr>
                   
                </table>
                        <br/><br/>
                     <label id="que es">Es usted Mayor de edad?</label>
                   
                     <input type="radio" name="Edad" value="SI" id="op1"><label>SI</label>
                     <input type="radio" name="Edad" value="NO" id="op2"><label>NO</label>
                    <br/><br/>
                    <label id="Condiciones">Acepte terminos y Condiciones</label>
                    <input type="CheckBox" name="Terminos" value="Acepto" id="Confirmacion" required/><label id="Condiciones2">Acepto</label>
                    <br/><br/>
                    <input type="submit" value="Guardar"id="SAVE"/>
            </form>
            
        </div>
                        
        
    </body>
</html>
