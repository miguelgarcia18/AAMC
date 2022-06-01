
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title> AAMC ♡ </title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Actualizar Datos del Usuario</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>Nombre</label>
                        <input type="text" name="nombre" class="form-control" value="${lista[0].Nombre}">
                        <label>Domicilio</label>
                        <input type="text" name="domicilio" class="form-control" value="${lista[0].Domicilio}">
                        <label>Fecha De Nacimiento</label>
                        <input type="text" name="fechaDeNacimiento" class="form-control" value="${lista[0].FechaDeNacimiento}">
                        <label>Numero de Telefono</label>
                        <input type="text" name="numeroDeTelefono" class="form-control" value="${lista[0].NumeroDeTelefono}">
                        <label>Correo Electronico</label>
                        <input type="text" name="correoElectronico" class="form-control" value="${lista[0].CorreoElectronico}"><br>
                        <input type="submit" value="Actualizar" class="btn btn-success">
                        <a href="usuario.htm">Regresar</a>
                    </form>
                </div>
            </div>
    </body>
</html>
