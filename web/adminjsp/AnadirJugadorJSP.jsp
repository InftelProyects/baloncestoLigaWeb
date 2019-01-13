<%-- 
    Document   : AnadirJugadorJSP
    Created on : 13-ene-2019, 22:04:58
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
                    <h2>Añadir Jugador</h2>
                    <form name="formcontacto" action="anadirJugadorServlet" method="post">
              <div class="form_settings">
                <!-- Campos formulario -->
               <c:if test="${not empty info}">
                        <h1 class="info">${info}</h1>
                     </c:if>
                <p><span>Identificador Jugador</span><input type="text" name="id_jugador" required/></p>     
                <p><span>Dorsal</span><input type="text" name="dorsal" required/></p>
                <p><span>Altura (cm)</span><input type="text" name="altura" required/></p>
                <p><span>Peso (kg)</span><input type="text" name="peso" required/></p>
                
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

