<%-- 
    Document   : mostrarUsuarios
    Created on : 9/02/2025, 3:15:23 p. m.
    Author     : ASUS
--%>

<%@page import="java.util.List"%>
<%@page import="logica.Usuarios"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ver Usuarios</title>
    </head>
    <body>
        <h1>Lista de usuarios registrados</h1>
        <%
           List<Usuarios> listaUsuarios =(List) request.getSession().getAttribute("ListaUsuarios");
           int cont = 1;
           for(Usuarios usu : listaUsuarios) {
        %>
        <p><b>Usuario N° <%=cont%></b></p>
        <p>DNI: <%=usu.getDni()%></p>
        <p>Nombres: <%=usu.getNombre()%></p>
        <p>Apellidos: <%=usu.getApellido()%></p>
        <p>Teléfono: <%=usu.getTelefono()%></p>
        <p>Email: <%=usu.getEmail()%></p>
        
        <p>------------------------------------</p>
        
        <%cont = cont+1;%>
        
        
        
        <% } %>
    </body>
</html>
