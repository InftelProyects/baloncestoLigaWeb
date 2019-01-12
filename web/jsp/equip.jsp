<%-- 
    Document   : equip
    Created on : 09-ene-2019, 12:41:09
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
        <title> BalonLiga</title>
    </head>
    <body>
        <div id="mainwrap">
            <jsp:include page="menu.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                    <h1>Equipos de la liga</h1>
                    <br>
                    <strong>A continución se muestra los equipos 
                        participantes en la liga: </strong><br>
                    <br>
                    <c:forEach var="equipo" items="${equipos}">
                        <h3>${equipo.nombre}</h3>
                     <table>
                        <tr>
                            <th>Entrenador</th>
                           <c:forEach var="entrenador" items="${equipo.entrenadorCollection}">
                           <th>${entrenador.persona.apellidos}, ${entrenador.persona.nombre}</th>
                            </c:forEach>
                        </tr>
                     </table>   
                    <br>
                   <table>
                        <tr>
                            <th>Jugadores</th>
                        </tr>
                        <tr>
                          <th>Nombre</th>
                          <th>Dorsal</th>
                          <th>Partidos Jugados</th>
                        </tr>
                        <c:forEach var="jugador" items="${equipo.jugadorCollection}">
                        <tr>
                          <td>${jugador.persona.apellidos}, ${jugador.persona.nombre}</td>
                          <td>${jugador.dorsal}</td>
                          <td></td>
                        </tr>
                        </c:forEach>
                      </table>
                    <br>
                    </c:forEach>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
