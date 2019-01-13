<%-- 
    Document   : userhome
    Created on : 10-ene-2019, 15:13:42
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
            <jsp:include page="${typemenu}.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="/jsp/header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                    <h2>Bienvenida ${usuario.personaIdPersona.nombre} ${usuario.personaIdPersona.apellidos}</h2>
                    <br>
                    <h3>Estás registrado como ${userol} en esta Liga de Baloncesto.</h3>
                    <span style="font-weight: bold;font-size: medium">Navega por tu sesión</span>
                    <br>
                    <br>
                    <span style="font-size: small">Formas parte de nuestro grupo de BalonLiga. Aprovecha todas nuestras opciones para ti. </span>
                    <br>
                    <br>
                     <div style="text-align: center; margin: 0px 0 8px 0;">
                   <img src=${imagen} alt="Avatar" style="border-radius: 50%;width: 40%">
                        </div>
                </div>
                <jsp:include page="/jsp/footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
