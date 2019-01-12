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
            <jsp:include page="menu.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="/jsp/header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                    <h2>Bienvenida ${usuario.personaIdPersona.nombre} ${usuario.personaIdPersona.apellidos}</h2>
                    <h3>Estas registrado como ${userol} en esta Liga de Baloncesto.</h3>
                    <strong>Navega por tu sesión</strong>
                    <p>Phasellus leo. Sed rhoncus vestibulum nunc. In hac habitasse platea dictumst. Quisque posuere, ante vitae lobortis tincidunt, turpis pede eleifend justo, ut feugiat leo nulla nec lacus. Maecenas mollis lacinia nisl. In auctor purus a nibh. Curabitur pharetra dui ac dui. Etiam porta dictum felis. In a nisl in neque mattis dignissim. Proin mattis nunc sit amet mauris. Morbi turpis. Donec nonummy, magna nec vestibulum pretium, sem libero ultricies ligula, vel viverra magna magna ut pede. In quis neque. Nunc commodo pulvinar nisi. Suspendisse quis dolor. Vivamus placerat tempor tortor. Cras ullamcorper.</p>
                    <h3>Ve tu Perfil</h3>
                    <br>
                    <img src="imgs/otro.jpg" class="floatleft" alt="" />
                    <br>
                    <h3>Atento a tu Calendario</h3>
                    <img src="imgs/otro.jpg" class="floatleft" alt="" />
                    <br>
                    <h3>Observa a tu Equipo</h3>
                    <br>
                    <img src="imgs/otro.jpg" class="floatleft" alt="" />
                    <br>
                    <h3>Repasa tus partidos</h3>
                    <br>
                    <img src="imgs/otro.jpg" class="floatleft" alt="" />
                    <br>
                    <h3>Imprime tu historial</h3>
                    <br>
                    <img src="imgs/otro.jpg" class="floatleft" alt="" />
                    <br>
                </div>
                <jsp:include page="/jsp/footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
