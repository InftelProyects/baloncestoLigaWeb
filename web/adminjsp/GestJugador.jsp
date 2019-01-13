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
                    <h2>Administración de Jugadores</h2>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=AnadirJugador'" type="button" >Añadir jugador</button>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=EliminarJugador'" type="button" >Eliminar jugador</button>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=ModificarJugador'" type="button" >Modificar jugador</button>
                    <br>
                    <strong>A continución se muestra las listas de todas las 
                        personas en la liga según su rol.</strong><br>
                    
                        
                    <br>
                    <table>
                        <tr>
                            <th>ID</th>
                            <th>DNI</th>
                            <th>Nombre</th>
                            <th>Apellidos</th>
                            <th>Dorsal</th>
                            <th>Equipo</th>
                            <th>Altura (cm)</th>
                            <th>Peso (kg)</th>
                        </tr>
                        <c:forEach var="persona" items="${personas}">
                        <tr>
                          <td>${persona.idPersona}</td>
                          <td>${persona.persona.dni}</td>
                          <td>${persona.persona.nombre}</td>
                          <td>${persona.persona.apellidos}</td>
                          <td>${persona.dorsal}</td>
                          <td>${persona.equipoIdEquipo.nombre}</td>
                          <td>${persona.altura}</td>
                          <td>${persona.peso}</td>
                        </tr>
                        </c:forEach>
                    </table>
                    
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
