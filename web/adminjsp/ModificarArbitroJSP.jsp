<%-- 
    Document   : ModificarArbitroJSP
    Created on : 13-ene-2019, 23:24:21
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
                    <h2>Actualizar los datos del Arbitro</h2>
                    <form name="formcontacto" action="ActualizarArb" method="post">
              <div class="form_settings">
                <!-- Campos formulario -->
               <c:if test="${not empty info}">
                        <h1 class="info">${info}</h1>
                     </c:if>
                <p><span>IdPersona</span><input type="text" name="idEq" required/></p>
                <p><span>Provencia</span><input type="text" name="provencia" required/></p>-->
                
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