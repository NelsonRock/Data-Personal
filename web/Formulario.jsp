<%-- 
    Document   : Formulario
    Created on : 22-ene-2013, 10:04:54
    Author     : rcerrato
--%>

<%@page contentType="text/html"  pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <% Integer i=Integer.parseInt(request.getParameter("opcion"));
               switch(i){
               case 1:
                   %>
                 <h1>Operaciones con personas</h1>
                 <form action="/DatosPersonales/Respuesta.jsp" method="POST" >
                 Nombre <input type="text" name="datos" /><br>
                 Apellido <input type="text" name="datos" /><br>
                  <input type="radio" name="accion" value="alta" />Alta  <input type="radio" name="accion" value="atualizar" /> Modificacion <input type="radio" name="accion" value="baja" />Baja<br><br>
                     <input type="checkbox" name="aficion" value="cine" />Cine  <input type="checkbox" name="aficion" value="literatura" />Literatura <input type="checkbox" name="aficion" value="deporte" />Deporte<input type="checkbox" name="aficion" value="musica" />Musica
                 <input type="checkbox" name="aficion" value="television" />Television <input type="checkbox" name="aficion" value="videojuegos" />Videojuegos<br><br>
                      EDAD:<select name="datos" >
                     <option value="-20" selected>Menos de 20 años</option>
                     <option value="+20">Mas de 20 años</option>
                 </select>
                      SEXO:<select name="datos" >
                     <option value="--" selected>---</option>
                     <option value="hombre">Hombre</option>
                     <option value="mujer">Mujer</option>
                 </select>
                     ESTADO CIVIL:<select name="datos" >
                     <option value="casado">Casado</option>
                     <option value="soltero">Soltero</option>
                     <option value="otro" selected>Otro</option>
                 </select>
                 <input type="submit" value="Enviar" >
                 <input type="hidden" name="oculto" value="1" />
                 </form>
                 <a href="http://localhost:8084/DatosPersonales/" >Volver</a>
                   <%
                   break;
               case 2:
                   %>
                 <h1>AFICIONES</h1>
                 <form action="/DatosPersonales/Respuesta.jsp" method="POST" >
                 <input type="checkbox" name="aficion" value="cine" />Cine  <input type="checkbox" name="aficion" value="literatura" />Literatura <input type="checkbox" name="aficion" value="deporte" />Deporte<input type="checkbox" name="aficion" value="musica" />Musica
                 <input type="checkbox" name="aficion" value="television" />Television <input type="checkbox" name="aficion" value="videojuegos" />Videojuegos
                 <input type="hidden" name="oculto" value="2" />
                 <input type="submit" value="Enviar" >
                 </form>
        
                <a href="http://localhost:8084/DatosPersonales/" >Volver</a>
                   <%
                   break;
               }
            %>
        </div>
    </body>
</html>
