<%-- 
    Document   : equip
    Created on : 10-ene-2019, 18:58:29
    Author     : inftel07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <head>
         <link href="css/reset.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/typography.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/main.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BalonLigaAdmin</title>
    </head>
    <body>
        <div id="mainwrap">
            <jsp:include page="menu.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="/jsp/header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                    <h2>Administración de Usuarios</h2>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=AnadirUsuarioJSP'" type="button" >Añadir usuario</button>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=EliminarUsuario'" type="button" >Eliminar usuario</button>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=ModificarUsuario'" type="button" >Modificar usuario</button>
                    <br>
                    <strong>A continución se muestra las listas de todas las 
                        personas en la liga según su rol.</strong><br>
                    
                        
                    <br>
                    <table>
                        <tr>
                            <th>ID Persona</th>
                            <th>ID Usuario</th>
                            <th>DNI</th>
                            <th>Nombre</th>
                            <th>Apellidos</th>
                            <th>Username</th>
                            <th>Password</th>
                            <th>Email</th>
                            
                        </tr>
                        <c:forEach var="persona" items="${personas}">
                        <tr>
                           
                         <td>${persona.personaIdPersona.idPersona}</td>
                          <td>${persona.idUsuario}</td>
                          <td>${persona.personaIdPersona.dni}</td>
                          <td>${persona.personaIdPersona.nombre}</td>
                          <td>${persona.personaIdPersona.apellidos}</td>
                          <td>${persona.username}</td>
                          <td>${persona.password}</td>
                          <td>${persona.email}</td>
                         
                        </tr>
                        </c:forEach>
                    </table>
                    
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
