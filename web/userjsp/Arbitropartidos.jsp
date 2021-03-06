<%-- 
    Document   : Arbitropartidos
    Created on : 12-ene-2019, 17:53:31
    Author     : inftel07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
     <c:forEach var="arb" items="${all}">
            <c:if test="${arb.idPersona eq rolling.idPersona}">
                <fmt:parseDate pattern="dd/MM/yy" value="${arb.partidoIdPartido.fecha}" var="date" />
                <c:if test="${date lt hoy}">    
                        <tr>
                          <td>${arb.partidoIdPartido.fecha}</td>
                          <td></td>
                          <td>${arb.partidoIdPartido.localizacion}</td>
                          <td>${arb.partidoIdPartido.jornada}</td>
                          <td>${arb.partidoIdPartido.equipoIdEquipo.nombre}</td>
                          <td>${arb.partidoIdPartido.equipoIdEquipo1.nombre}</td>
                          <td>${arb.partidoIdPartido.resultado}</td>
                        </tr>
                    </c:if>
            </c:if>
    </c:forEach>
</html>
