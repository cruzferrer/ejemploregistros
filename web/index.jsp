<%-- 
    Document   : index
    Created on : 11-mar-2019, 0:00:20
    Author     : KIKA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="post" action="Registroservlet">
            Nombre: <input type="text" name="nombre"><br><br>
            Apellido Paterno: <input type="text" name="paterno"><br><br><br>
            Apellido Materno: <input type="text" name="materno"><br><br><br>
            Fecha de Nacimiento:<input type="date" name="fecha"><br><br><br>
            Usuario: <input type="text" name="usu"><br><br><br>
            Contraseña:<input type="Password" name="contra"><br><br><br>
        <input type="submit" value="Registrar">
        </form>
        
    </body>
</html>
