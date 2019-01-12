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
                    <h2>Administración de Arbitros</h2>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=AnadirArbitro'" type="button" >Añadir arbitro</button>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=EliminarArbitro'" type="button" >Eliminar arbitro</button>
                    <button onclick="location.href='/baloncestoLigaWeb/adminController?adminlist=ModificarArbitro'" type="button" >Modificar arbitro</button>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
