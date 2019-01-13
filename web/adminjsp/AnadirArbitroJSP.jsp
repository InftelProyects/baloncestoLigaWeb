<%-- 
    Document   : anadirArbitroJSP
    Created on : 13-ene-2019, 19:47:52
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
                    <h2>Añadir Equipo</h2>
                    <form name="formcontacto" action="anadirArbitroServlet" method="post">
              <div class="form_settings">
                <!-- Campos formulario -->
               <c:if test="${not empty info}">
                        <h1 class="info">${info}</h1>
                     </c:if>
                <p><span>Identificador Arbitro</span><input type="text" name="id_persona" required/></p>
                <p><span>Provincia</span><input type="text" name="provincia" required/></p>
                <p><span>Identificador Partido</span><input type="text" name="id_partido" required/></p>
                <button type="submit">Añadir</button>
 
              </div>
            </form>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>

