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
                    <br>
                    <strong>A continución se muestran las listas de todos los 
                        participantes en la liga según su rol.</strong><br>
                    
                        <h3>Entrenadores</h3>
                    <br>
                    <table>
                        <tr>
                            <th>Nombre</th>
                            <th>Equipo</th>
                            <th>Nivel</th>
                            <th>ID</th>
                        </tr>
                        <c:forEach var="entrenador" items="${entrenadores}">
                        <tr>
                          <td>${entrenador.persona.apellidos}, ${entrenador.persona.nombre}</td>
                          <td>${entrenador.equipoIdEquipo.nombre}</td>
                          <td>${entrenador.nivel}</td>
                          <td>${entrenador.idPersona}</td>
                        </tr>
                        </c:forEach>
                    </table>
                    <br>
                    <h3>Arbitros</h3>
                    <br>
                    <table>
                        <tr>
                            <th>Nombre</th>
                            <th>Provincia</th>
                            <th>ID</th>
                        </tr>
                       <c:forEach var="arbitro" items="${arbitros}">
                        <tr>
                          <td>${arbitro.persona.apellidos}, ${arbitro.persona.nombre}</td>
                          <td>${arbitro.provincia}</td>
                          <td>${arbitro.idPersona}</td>
                        </tr>
                        </c:forEach>
                    </table>
                    <br>
                    <h3>Jugadores</h3>
                    <br>
                    <table>
                        <tr>
                            <th>Nombre</th>
                            <th>Equipo</th>
                            <th>Dorsal</th>
                            <th>ID</th>
                        </tr>
                         <c:forEach var="jugador" items="${jugadores}">
                        <tr>
                          <td>${jugador.persona.apellidos}, ${jugador.persona.nombre}</td>
                          <td>${jugador.equipoIdEquipo.nombre}</td>
                          <td>${jugador.dorsal}</td>
                          <td>${jugador.idPersona}</td>
                        </tr>
                        </c:forEach>
                    </table>
                    <br>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
