<%-- 
    Document   : index
    Created on : 9/02/2025, 12:37:29 p. m.
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>formulario</title>
    </head>
    <body>
        <h1>Datos del usuario</h1>
        <form action="SVusuario" method="POST">
            <p><<label>DNI: </label><input type="text" name="dni"></p><!-- casilla del formulario Cedula -->
            <p><<label>Nombres: </label><input type="text" name="nombre"></p><!-- casilla del formulario -->
            <p><<label>Apellidos: </label><input type="text" name="apellido"></p><!-- casilla del formulario -->
            <p><<label>Telefono: </label><input type="text" name="telefono"></p><!-- casilla del formulario -->
            <p><<label>Email: </label><input type="text" name="email"></p><!-- casilla del formulario -->
            <button type="submit">Enviar</button>
        </form>
        <<h1>Lista de usuarios</h1>
        <p>Para ver los datos de los usuarios haga clic en el siguiente botón</p>
        <<form action="SVusuario" method="GET">
            <button type="submit">Mostrar usuarios</button>
            
        </form>
    </body>
</html>
