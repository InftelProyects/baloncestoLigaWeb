<%-- 
    Document   : ModificarEquipoJSP
    Created on : 13-ene-2019, 18:18:12
    Author     : mohammed
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
                    <h2>Inserte ID de partido</h2>
                    <form name="formcontacto" action="ActualizarPartido" method="post">
              <div class="form_settings">
                <!-- Campos formulario -->
               <c:if test="${not empty info}">
                        <h1 class="info">${info}</h1>
                     </c:if>
                <p><input type="text" name="id" required placeholder="ID"/></p>
                <h3>Datos a modificar</h3>
                <p><input type="text" name="fecha" required placeholder="Fecha"/></p>
                <p><input type="text" name="localizacion" required placeholder="Localizacion"/></p>
                <p><input type="text" name="resultado" required placeholder="Resultado"/></p>
                <p><input type="text" name="jornada" required placeholder="Jornada"/></p>
                <p><input type="text" name="idLocal" required placeholder="ID equipo local"/></p>
                <p><input type="text" name="idVisitante" required placeholder="ID equipo visitante"/></p>
                
                
                <button type="submit">Actualizar</button>
 
              </div>
            </form>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>  
        
    </body>
</html>