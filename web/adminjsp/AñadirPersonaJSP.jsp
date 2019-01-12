<%-- 
    Document   : PersonaJSP
    Created on : 11-ene-2019, 20:59:09
    Author     : beatrizillanesalcaide
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <header>
        <h2>ANADIR PERSONA</h2>
    </header>    
        
    <body>
        <section> 
            <form name="formcontacto" action="anadirPersonaServlet" method="post">
              <div class="form_settings">
                <!-- Campos formulario -->
               
                <p><span>Dni</span><input type="text" name="dni" required/></p>
                <p><span>Nombre</span><input type="text" name="nombre" required/></p>
                <p><span>Apellidos</span><input type="text" name="apellidos" required/></p>
                <p><span>Telefono</span><input type="text" name="telefono" required/></p>
                <p><span>Fecha de nacimiento</span><input type="text" name="fechaNacimiento" required/></p>
                
                
                <input class="submit" type="submit" value="Anadir" />
 
              </div>
            </form>
        </section>
    </body>    
</html>
