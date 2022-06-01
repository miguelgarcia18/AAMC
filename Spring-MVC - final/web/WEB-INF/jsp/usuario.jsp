<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title> AAMC ♡ </title>
    </head>
    <body>            
        <div class="container mt-4">
            <div>
                <center>
                    <img src="img/logo.png" height="300" width="300"/>   
                </center>
                <br> 
            </div>  
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    
                    <a class="btn btn-light" href="index.htm">Libros</a>
                    <a class="btn btn-light" href="agregarUsuarios.htm">Registrar usuario</a>
                    <a class="btn btn-light" href="prestamo.htm">Prestamo</a>
                    <a class="btn btn-light" href="devolucion.htm">Devolucion</a>
      
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Nombre del Usuario</th>
                                <th>Domicilio</th>
                                <th>Fecha de Nacimiento</th>
                                <th>Numero de Telefono</th>
                                <th>Correo Electronico</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="dato" items="${lista}">
                            <tr>
                                <td>${dato.Id_Usuario}</td>
                                <td>${dato.Nombre}</td>
                                <td>${dato.Domicilio}</td>
                                <td>${dato.FechaDeNacimiento}</td>
                                <td>${dato.NumeroDeTelefono}</td>
                                <td>${dato.CorreoElectronico}</td>
                                <td>
                                    <a href="editarUsuario.htm?id=${dato.Id_Usuario}"class="btn btn-warning">Editar</a>
                                    <a href="eliminarUsuario.htm?id=${dato.Id_Usuario}"class="btn btn-danger">Eliminar</a>  
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>
