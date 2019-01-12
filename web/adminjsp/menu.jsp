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
            Balon<span>Liga</span>Admin
        </a>
    </h1>
    <div style="text-align: center; margin: 0px 0 8px 0;">
            <img src="imgs/administrador.png" alt="Avatar" style="border-radius: 50%;width: 40%">
    </div>
    <div id="mainnav">
        <ul>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=perfil"><span>-HOla</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=calendar"><span>Cashajo</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=equip"><span>Equipo</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=partidos"><span>Partidos</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=historial"><span>Historial</span></a></li>
            <li><a href="/baloncestoLigaWeb/BalonLigaController?list=balon"><span>BalonLiga</span></a></li>
        </ul>
    </div>
</div>