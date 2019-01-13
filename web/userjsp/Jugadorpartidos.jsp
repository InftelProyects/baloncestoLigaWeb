<%-- 
    Document   : Jugadorpartidos
    Created on : 12-ene-2019, 17:54:51
    Author     : inftel07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
   <c:forEach var="part" items="${rolling.equipoIdEquipo.partidoCollection}">
        <fmt:parseDate pattern="dd/MM/yy" value="${part.fecha}" var="date" />
                        <c:if test="${date lt hoy}">
                        <tr>
                          <td>${part.fecha}</td>
                      
                          <td>${part.localizacion}</td>
                          <td>${part.jornada}</td>
                          <td>${part.equipoIdEquipo.nombre}</td>
                          <td>${part.equipoIdEquipo1.nombre}</td>
                          <td>${part.resultado}</td>
                        </tr>
                        </c:if>
                        </c:forEach>
                       <c:forEach var="part" items="${rolling.equipoIdEquipo.partidoCollection1}">
                           <fmt:parseDate pattern="dd/MM/yy" value="${part.fecha}" var="date1" />
                        <c:if test="${date1 lt hoy}">
                        <tr>
                          <td>${part.fecha}</td>
                   
                          <td>${part.localizacion}</td>
                          <td>${part.jornada}</td>
                          <td>${part.equipoIdEquipo.nombre}</td>
                          <td>${part.equipoIdEquipo1.nombre}</td>
                          <td>${part.resultado}</td>
                        </tr>
                        </c:if>
                        </c:forEach>
</html>
