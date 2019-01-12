<%-- 
    Document   : AnadirEquipo
    Created on : 12-ene-2019, 18:49:52
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
                    <h2>Añadir Persona</h2>
                    <form name="formcontacto" action="anadirEquipoServlet" method="post">
              <div class="form_settings">
                <!-- Campos formulario -->
               
                <p><span>Nombre</span><input type="text" name="nombre" required/></p>
                <p><span>Categoria</span><input type="text" name="categoria" required/></p>
                <button type="submit">Añadir</button>
 
              </div>
            </form>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
