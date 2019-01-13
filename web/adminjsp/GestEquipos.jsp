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
                    <h2>Administración de Equipos</h2>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=AnadirEquipo'" type="button" >Añadir equipo</button>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=EliminarEquipo'" type="button" >Eliminar equipo</button>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=ModificarEquipoJSP'" type="button" >Modificar equipo</button>
                    
                    <br>
                    <strong>A continución se muestra los equipos 
                        participantes en la liga: </strong><br>
                    <br>
                     <table>
                        <tr>
                            <th>Nombre</th>
                            <th>ID</th>
                           <c:forEach var="equipo" items="${equipo}">
                           <th>${equipo.nombre}</th>
                           <th>${equipo.idEquipo}</th>
                            </c:forEach>
                        </tr>
                     </table>   
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
