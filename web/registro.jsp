<%-- 
    Document   : registro
    Created on : 11-mar-2019, 0:02:55
    Author     : KIKA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="jakarta.servlet.http.HttpServletRequest"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
       
        Usuario confirmado:<br>
        
        Nombre:<%=request.getParameter("Nombre")%>
        <br><br>
        Apellido:<%=request.getParameter("Apellido")%>
        
                
        
    </body>
</html>
