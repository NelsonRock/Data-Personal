<%-- 
    Document   : index
    Created on : 22-ene-2013, 9:03:14
    Author     : rcerrato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="true" %>
<!DOCTYPE html>
<%! int visitas;

public String Saludo(String n){
    return "";
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% if(visitas!=0) {
            visitas++; %>
            <h1>Visita numero:<%=visitas%></h1>
        <% } else {
            visitas++; %>
            <h1>Esta es tu primera visita</h1> 
        <% }%>
        <h1 align="center">Datos Personales</h1>
        <table align="center">
        <tr>
            <td>
        <form action="/DatosPersonales/SProcesar" method="POST">
                <input type="radio" name="accion" value="2" />Consulta
                <input type="radio" name="accion" value="1" />Operaciones con una persona
                <input type="radio" name="accion" value="3" />Salir
                <input type="submit" value="Enviar" />
        </form>
            </td>
        </tr>
        </table>
     
    </body>
</html>
