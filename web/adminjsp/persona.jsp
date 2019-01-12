<%-- 
    Document   : equip
    Created on : 10-ene-2019, 18:58:29
    Author     : inftel07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <h2>Administración de Equipos</h2>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=AnadirPersonaJSP'" type="button" >Añadir persona</button>
                    <br>
                    <strong>A continución se muestra las listas de todos los 
                        participantes en la liga según su rol.</strong><br>
                    <br>
                    <h3>Entrenadores</h3>
                    <br>
                    <table>
                        <tr>
                            <th>Nombre</th>
                            <th>Equipo</th>
                            <th>Nivel</th>
                        </tr>
                        <c:forEach var="entrenador" items="${entrenadores}">
                        <tr>
                          <td>${entrenador.persona.apellidos}, ${entrenador.persona.nombre}</td>
                          <td>${entrenador.equipoIdEquipo.nombreEquipo}</td>
                          <td>${entrenador.nivel}</td>
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
                            <th>Partidos</th>
                        </tr>
                       <c:forEach var="arbitro" items="${arbitros}">
                        <tr>
                          <td>${arbitro.persona.apellidos}, ${arbitro.persona.nombre}</td>
                          <td>${arbitro.provincia}</td>
                          <td></td>
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
                            <th>Partidos</th>
                        </tr>
                         <c:forEach var="jugador" items="${jugadores}">
                        <tr>
                          <td>${jugador.persona.apellidos}, ${jugador.persona.nombre}</td>
                          <td>${jugador.equipoIdEquipo.nombreEquipo}</td>
                          <td>${jugador.dorsal}</td>
                          <td></td>
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
