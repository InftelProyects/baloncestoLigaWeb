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
        <title>BalonLigaUser</title>
    </head>
    <body>
        <div id="mainwrap">
            <jsp:include page="menu.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="/jsp/header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                    <h3>Equipo: ${rolling.equipoIdEquipo.nombre}</h3>
                    <h2>Provincia : ${rolling.equipoIdEquipo.provincia}</h2>
                    <h2>Categoria: ${rolling.equipoIdEquipo.categoria}</h2>
                    <h2>Entrenador: ${rolling.equipoIdEquipo.categoria}</h2>
                    <h2>Integrantes del Equipo</h2>
                        <c:forEach var="jugador" items="${rolling.equipoIdEquipo.jugadorCollection}">
                          <h4>· Nombre: ${jugador.persona.apellidos}, ${jugador.persona.nombre}</h4>
                          <h4>· Dorsal: ${jugador.dorsal}</h4>
                          <br>
                        </c:forEach>
                </div>
                <jsp:include page="/jsp/footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
