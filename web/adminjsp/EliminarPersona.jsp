<%-- 
    Document   : equip
    Created on : 10-ene-2019, 18:58:29
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
        <title>BalonLigaAdmin</title>
    </head>
    <body>
        <div id="mainwrap">
            <jsp:include page="menu.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="/jsp/header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                    <h2>Eliminar Persona</h2>
                    <form name="formcontacto" action="EliminarPersona" method="post">
                    <div class="form_settings">
                    <!-- Campos formulario -->
                     <c:if test="${not empty info}">
                        <h1 class="info">${info}</h1>
                     </c:if>
                    <p><span>ID</span><input type="text" name="id" required/></p>

                    <button type="submit">Eliminar</button>
 
                     </div>
            </form>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>