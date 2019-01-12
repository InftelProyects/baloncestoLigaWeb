<%-- 
    Document   : partidos
    Created on : 10-ene-2019, 18:58:38
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
        <title>BalonLigaUser</title>
    </head>
    <body>
        <div id="mainwrap">
            <jsp:include page="menu.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="/jsp/header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                    <h2>Partidos de Usuario</h2>
                    <h3>PARTIDOS</h3>
                     <img src="imgs/usuario.jpg"  />
                </div>
                <jsp:include page="/jsp/footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
