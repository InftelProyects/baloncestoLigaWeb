<%-- 
    Document   : ModificarPersonaJSP
    Created on : 13-ene-2019, 17:16:04
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
                    <h2>Actualizar los datos de un Usuario</h2>
                    <form name="formcontacto" action="ActualizarUsuario" method="post">
              <div class="form_settings">
                <!-- Campos formulario -->
               <c:if test="${not empty info}">
                        <h1 class="info">${info}</h1>
                     </c:if>
                <p><span>ID</span><input type="text" name="id" required/></p>
                <h3>Campos a actualizar</h3>
                <p><input type="text" name="username" required placeholder="Nombre de Usuario"/></p>
                <p><input type="text" name="password" required placeholder="Contraseña"/></p>
                <p><input type="text" name="email" required placeholder="Email"/></p>
                <p><input type="text" name="rol" required placeholder="Rol"/></p>
                <p><input type="text" name="idPersona" required placeholder="ID Persona"/></p>
                
                
                <button type="submit">Actualizar</button>
 
              </div>
            </form>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>  
        
    </body>
</html>