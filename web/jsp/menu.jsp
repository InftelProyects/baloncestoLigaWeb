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
            Balon<span>Liga</span>
        </a>
    </h1>
    <div id="mainnav">
        <ul>
            <li><a href="/baloncestoLigaWeb/BalonLigaController?list=balon"><span>BalonLiga</span></a></li>
            <li><a href="/baloncestoLigaWeb/BalonLigaController?list=calendar&hoy=${hoy}"><span>Calendario</span></a></li>
            <li><a href="/baloncestoLigaWeb/BalonLigaController?list=equip"><span>Equipos</span></a></li>
            <li><a href="/baloncestoLigaWeb/BalonLigaController?list=participan"><span>Participantes</span></a></li>
            <li><a href="/baloncestoLigaWeb/BalonLigaController?list=enter"><span>Entrar</span></a></li>
        </ul>
    </div>
</div>
