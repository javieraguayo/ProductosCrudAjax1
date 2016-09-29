<%-- 
    Document   : crearproducto
    Created on : 26-08-2016, 1:40:49
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo Producto</h1>
        <form action="crearproducto" name="frmnuevo" method="POST" enctype="multipart/form-data" id="frm_nuevo">
            <table>
                <tr>
                    <td><label for="">Nombre:</label></td>
                    <td><input type="text" name="nombre" id="nombre"></td>
                    
                </tr>
                <tr>
                    <td><label for="">Descricion:</label></td>
                    <td><textarea cols="30" rows="6" name="descripcion" id="descripcion"></textarea></td>
                </tr>
                <tr>
                    <td><label for="">Precio:</label></td>
                    <td><input type="text" name="precio" id="precio"></td>    
                </tr>
                <tr>
                    <td><label for="">Categoria:</label></td>
                    <td><input type="text" name="categoria" id="categoria"></td>
                </tr>
                 <tr>
                    <td><label for="">Detalles:</label></td>
                    <td><textarea cols="30" rows="6" name="destalles" id="destalles"></textarea></td>
                </tr>
                <tr>
                    <td><label for="">Reviews:</label></td>
                    <td><textarea cols="30" rows="6" name="reviews" id="reviews"></textarea></td>
                </tr>
                <tr>
                    <td><label for="">Size:</label></td>
                    <td>
                        <select name="size" id="size">
                            <%for(int i=1; i<=30; i++){%>
                            <option value='<%= i %>'><%= i%></option>
                            <%}%>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td><label for="">Color:</label></td>
                    <td><input type="text" name="color" id="color"></td>
                </tr>
                <tr>
                    <td><label for="">Imagenes:</label></td>
                    <td><input type="file" name="file[]" id="archivos" multiple></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Crear Producto" id="btncrearproducto"></td>
                </tr>
              
            </table>
        </form>
    
    </body>
</html>
