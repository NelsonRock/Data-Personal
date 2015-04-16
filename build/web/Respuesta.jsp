

<%@page import="BaseDatos.BDPersonas"%>
<%@page import="BaseDatos.BDDatos"%>
<%@page contentType="text/html" import="bbdd.*, java.util.*, excepciones.*, Clases.*;" pageEncoding="UTF-8" errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!-- -->
        <%! BaseDatos miBase=new BaseDatos("jdbc:odbc:DatosPersonales","sun.jdbc.odbc.JdbcOdbcDriver"); 
           int exito=0;
            String error="";
            String [] aficiones;
            int cont=0;
        %>
        <% Integer oculto=Integer.parseInt(request.getParameter("oculto"));
        switch(oculto){
        case 1:
            String valor[] = request.getParameterValues("datos");
            Persona p = new Persona (valor[0],valor[1], Integer.parseInt(valor[2]), valor[3],valor[4]);
            String accion=request.getParameter("accion");
            error=miBase.abrir();
            if(!error.equals(""))
                throw new ExcepcionTecnica ("Problemas al abrir base de datos");
            exito=BDPersonas.altaBaja(accion, p, miBase);
            miBase.cerrar();
            if(exito != -2) {
                 if(exito == 1){%>
                    <h1>Insertado con exito</h1>
                    <%
                    }
                 if(exito == 0){%>
                      <h1>Actualizado con exito</h1>
                    <%
                    }
             }
            if(exito == -2)
               %>
                <h1>No se pudo realizar la operacion</h1>
                <jsp:forward page="/index.jsp"></jsp:forward>
               <%
           break;
        
        case 2: %>
             <h1>Total personas con aficiones!</h1>
        <%
        aficiones = request.getParameterValues("aficion");
        if(aficiones==null){ %>
        <h1> No tienes aficiones. Vago</h1>
        <% }         
         else {
        error=miBase.abrir();
             //try{
         if(!error.equals(""))
            throw new ExcepcionTecnica ("Problemas con la aplicacion ");
         else{
            for(int i=0;i<aficiones.length;i++){
                cont=BDDatos.buscar(aficiones[i],miBase);
                %>
                <p><b>Aficion <%=aficiones[i]%></b>: numero de personas: <%=cont%></p> 
                <%
                }
            cont=0;
            } 
         }
        miBase.cerrar();
        break;
               }%>
        <a href="http://localhost:8084/DatosPersonales/" >Volver</a>
    </body>
</html>
