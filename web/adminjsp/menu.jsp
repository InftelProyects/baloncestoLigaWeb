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
            <li><a href="/baloncestoLigaWeb/adminController"><span>Bienvenida</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=GestEquipos"><span>Gestor de equipos</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=GestPersona"><span>Gestor de personas</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=GestEntrenador"><span>Gestor de entrenadores</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=GestArbitro"><span>Gestor de arbitros</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=GestJugador"><span>Gestor de jugadores</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=GestPartidos"><span>Gestor de partidos</span></a></li>
            <li><a href="/baloncestoLigaWeb/adminController?adminlist=GestUsuarios"><span>Gestor de Usuarios</span></a></li>
            <li><a href="/baloncestoLigaWeb/BalonLigaController?list=balon"><span>Salir</span></a></li>
        </ul>
    </div>
</div>
