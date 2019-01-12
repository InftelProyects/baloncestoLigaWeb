<%-- 
    Document   : Entrenadorcalendar
    Created on : 12-ene-2019, 17:54:08
    Author     : inftel07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
    <c:forEach var="parte" items="${rolling.equipoIdEquipo.partidoCollection}">
                            <c:if test="${parte.fecha ge hoy}">    
                        <tr>
                          <td>${parte.fecha}</td>
                          <td></td>
                          <td>${parte.localizacion}</td>
                          <td>${parte.jornada}</td>
                          <td>${parte.equipoIdEquipo.nombre}</td>
                          <td>${parte.equipoIdEquipo1.nombre}</td>
                          <td>${parte.resultado}</td>
                        </tr>
                            </c:if>
                        </c:forEach>
                       <c:forEach var="part" items="${rolling.equipoIdEquipo.partidoCollection1}">
                           <c:if test="${part.fecha ge hoy}">
                        <tr>
                          <td>${part.fecha}</td>
                          <td></td>
                          <td>${part.localizacion}</td>
                          <td>${part.jornada}</td>
                          <td>${part.equipoIdEquipo.nombre}</td>
                          <td>${part.equipoIdEquipo1.nombre}</td>
                          <td>${part.resultado}</td>
                        </tr>
                        </c:if>
                        </c:forEach>
</html>
