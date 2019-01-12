<%-- 
    Document   : perfil
    Created on : 10-ene-2019, 18:58:10
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
            <jsp:include page="${typemenu}.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="/jsp/header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                    <h3>Perfil</h3>
                    
                    <h4><span style="font-weight: bold">Nombre: </span>${usuario.personaIdPersona.nombre} ${usuario.personaIdPersona.apellidos}</h4>
                    <h4><span style="font-weight: bold">DNI :</span> ${usuario.personaIdPersona.dni}</h4>
                    <h4><span style="font-weight: bold">Fecha de Nacimiento : </span>${usuario.personaIdPersona.fechaNacimiento}</h4>
                    <h4><span style="font-weight: bold">Telefono :</span> ${usuario.personaIdPersona.telefono}</h4>
                    <br>
                    <h4><span style="font-weight: bold">Rol :</span> ${userol}</h4> 
                    <jsp:include page="${rol}" flush="true" />
                </div>
                <jsp:include page="/jsp/footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
