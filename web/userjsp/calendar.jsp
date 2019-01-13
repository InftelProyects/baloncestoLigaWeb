<%-- 
    Document   : calendar
    Created on : 10-ene-2019, 18:58:18
    Author     : inftel07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
            <jsp:include page="${typemenu}.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="/jsp/header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                     <h3>Calendario</h3>
                    <table>
                        <tr>
                          <th>Fecha</th>
                          <th>Hora</th>
                          <th>Lugar</th>
                          <th>Jornada</th>
                          <th>Equipo</th>
                          <th>vs Equipo</th>
                         
                        </tr>
                        <jsp:include page="${userol}calendar.jsp" flush="true" />
                        </table>
                </div>
                <jsp:include page="/jsp/footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
