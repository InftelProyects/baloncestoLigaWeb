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
                    <span style="font-size: small">Formas parte de nuestro grupo de BalonLiga. Aprovecha todas nuestras opciones para ti: </span>
                    <br>
                    <br>
                    <ul>
                        <li><h3>Ve tu Perfil</h3>
                        <img src="imgs/otro.jpg" height="120" width="200" alt="" /> </li>
                    
                        <li><h3>Atento a tu Calendario</h3><img src="imgs/otro.jpg" height="120" width="200" alt="" /></li>
                        
                        <li><h3>Observa a tu Equipo</h3><img src="imgs/otro.jpg" height="120" width="200" alt="" /></li>
                        
                        <li><h3>Repasa tus partidos</h3><img src="imgs/otro.jpg" height="120" width="200" alt="" /></li>
                         
                    </ul>
                </div>
                <jsp:include page="/jsp/footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
