<%-- 
    Document   : enter
    Created on : 09-ene-2019, 14:39:50
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
        <title> BalonLiga</title>
    </head>
    <body>
        <div id="mainwrap">
            <jsp:include page="menu.jsp" flush="true" />
            <div id="rightcol">
               <jsp:include page="header.jsp" flush="true" />
                <div id="banner"></div>
                <div id="content">
                    <h1>Entrar como Usuario o Administrador</h1>
                    <br>
                    <h3><strong>Si formas parte de la Liga, puedes entrar y ver toda tu información particular.</strong></h3>
                    <br>
                    <form action="EnterController" method="POST">
                        <label for="uname" ><b>Usuario</b></label>
                        <input type="text" placeholder="Enter Username" name="uname" required >
                        <br>
                        <label for="psw"><b>Contraseña</b></label>
                        <input type="password" placeholder="Enter Password" name="psw" required>
                        <br>
                        <button type="submit">Entrar</button>
                    </form>
                </div>
                <jsp:include page="footer.jsp" flush="true" />
            </div>
        </div>
    </body>
</html>
