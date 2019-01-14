<%-- 
    Document   : ModificarEntrnadorJSP
    Created on : 13-ene-2019, 23:55:56
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
                    <h2>Actualizar los datos del Entrenador</h2>
                    <form name="formcontacto" action="ActualizarEntrenadorr" method="post">
              <div class="form_settings">
                <!-- Campos formulario -->
               <c:if test="${not empty info}">
                        <h1 class="info">${info}</h1>
                     </c:if>
                <p><span>IdEntrenador</span><input type="text" name="idEntrenador" required/></p>
                <!--<p><span>Nombre</span><input type="text" name="nombre" required/></p>
                <p><span>Apellidos</span><input type="text" name="apellidos" required/></p>-->
                <p><span>nivel</span><input type="text" name="nivel" required/></p>
               <!-- <p><span>Fecha de nacimiento</span><input type="text" name="fechaNacimiento" required/></p>-->
                
                
                <button type="submit">Actualizar</button>
 
              </div>
            </form>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>  
        
    </body>
</html>