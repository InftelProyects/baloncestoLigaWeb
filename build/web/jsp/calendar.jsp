<%-- 
    Document   : calendar
    Created on : 09-ene-2019, 12:40:43
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
                    <h2>Calendario de la Liga</h2>
                    <br>
                    <h3>A continuación se muestran los próximos partidos de la Liga :</h3>
                    <br>
                     <table>
                        
                        <tr>
                          <th>Fecha</th>
                          <th>Lugar</th>
                          <th>Jornada</th>
                          <th>Equipo</th>
                          <th>vs Equipo</th>
                         
                        </tr>
                        <c:forEach var="partido" items="${partidos}">
                         <fmt:parseDate pattern="dd/MM/yy" value="${partido.fecha}" var="date" />
                           <c:if test="${date ge hoy}">
                            
                            <tr>
                              <td>${partido.fecha}</td>
                              <td>${partido.localizacion}</td>
                              <td>${partido.jornada}</td>
                              <td>${partido.equipoIdEquipo.nombre}</td>
                              <td>${partido.equipoIdEquipo1.nombre}</td>

                            </tr>
                        </c:if>
                       </c:forEach>
                    </table>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
