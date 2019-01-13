<%-- 
    Document   : AnadirPartidoJSP
    Created on : 13-ene-2019, 22:01:32
    Author     : beatrizillanesalcaide
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                    <h2>${creado}</h2>
                    <h2>Añadir Partido</h2>
                    <form name="formcontacto" action="anadirPartidoServlet" method="post">
              <div class="form_settings">
                <!-- Campos formulario -->
               <c:if test="${not empty info}">
                        <h1 class="info">${info}</h1>
                     </c:if>
                <p><span>Fecha</span><input type="text" name="fecha" required/></p>
                <p><span>Lugar</span><input type="text" name="lugar" required/></p>
                <p><span>Jornada</span><input type="text" name="jornada" required/></p>
                <p><span>Equipo</span><input type="text" name="equipo" required/></p>
                <p><span>vs Equipo</span><input type="text" name="vs_equipo" required/></p>
                <p><span>Resultado</span><input type="text" name="resultado" required/></p>
                <p><span>Identificador Partido</span><input type="text" name="id_partido" required/></p>
               <%-- <p><span>Identificador Partido</span><input type="text" name="id_partido" required/></p> --%>
                <button type="submit">Añadir</button>
 
              </div>
            </form>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
