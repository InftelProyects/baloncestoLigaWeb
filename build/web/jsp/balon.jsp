<%-- 
    Document   : balon
    Created on : 09-ene-2019, 12:41:00
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
        <title> BalonLiga</title>
    </head>
    <body>
        <div id="mainwrap">
            <jsp:include page="menu.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                      <h2>Bienvenida a BalonLiga</h2>
                    <h3>Esta web está dedicada a Gestionar Ligas de Baloncesto</h3>
                    <strong>Nuestra visión</strong>
                    <br>
                    <p> Es mejorar la administración de las ligas de Baloncesto de forma rápida y fácil.</p>
                    <br>
                    <h3>Nosotros nos dedicamos a :</h3>
                    <br>
                     <ul class="bullet">
                        <li>Organizar una liga de baloncesto para todas las edades y géneros</li>
                        <li>Crear equipos de todos los niveles</li>
                        <li>Administrar los partidos</li>
         
                    </ul>
                    <img src="imgs/otro.jpg"  alt="" />
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
