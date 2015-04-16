<%-- 
    Document   : Error
    Created on : 23-ene-2013, 9:56:51
    Author     : rcerrato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true" import="java.util.*;"  %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>P&aacute;gina de errores</h1>
        <%= exception.getMessage() %>
        <%= exception.toString() %>

    </body>
</html>
