<%-- 
    Document   : menu
    Created on : 09-ene-2019, 11:41:15
    Author     : inftel07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <link href="css/reset.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/typography.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/main.css" rel="stylesheet" type="text/css" />
</head>
<div id="leftcol">
    <h1 id="logo">
        <a href="?">
            Balon<span>Liga</span>User
        </a>
    </h1>
    <div style="text-align: center; margin: 0px 0 8px 0;">
            <img src=${imagen} alt="Avatar" style="border-radius: 50%;width: 40%">
    </div>
    <div id="mainnav">
        <ul>
            <li><a href="/baloncestoLigaWeb/userController?userlist=userhome&userid=${usuario.idUsuario}&userol=${userol}&rolling=${rolling}"><span>Home</span></a></li>
            <li><a href="/baloncestoLigaWeb/userController?userlist=perfil&userid=${usuario.idUsuario}&userol=${userol}&rolling=${rolling}"><span>Perfil</span></a></li>
            <li><a href="/baloncestoLigaWeb/userController?userlist=calendar&userid=${usuario.idUsuario}&userol=${userol}&rolling=${rolling}"><span>Calendario</span></a></li>
            <li><a href="/baloncestoLigaWeb/userController?userlist=equip&userid=${usuario.idUsuario}&userol=${userol}&rolling=${rolling}"><span>Equipo</span></a></li>
            <li><a href="/baloncestoLigaWeb/userController?userlist=partidos&userid=${usuario.idUsuario}&userol=${userol}&rolling=${rolling}"><span>Partidos</span></a></li>
            <li><a href="/baloncestoLigaWeb/userController?userlist=historial&userid=${usuario.idUsuario}&userol=${userol}&rolling=${rolling}"><span>Historial</span></a></li>
            <li><a href="/baloncestoLigaWeb/BalonLigaController?list=balon"><span>Cerrar Sesion</span></a></li>
        </ul>
    </div>
</div>
