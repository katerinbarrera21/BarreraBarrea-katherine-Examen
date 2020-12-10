<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="ISO-8859-1">
		<title>List</title>
 		<link href="../css/cuadrado.css" rel="stylesheet" />
		<script src="/BarreraBarrera-Katherine-Examen/js/listarTelefono.js" type="text/javascript"></script>
</head>
<body>

    <body background="../img/listar.png">
    
    	<section style=" margin-left: 9%; margin-top: 4%;">
    	
    	<a href="../index.html" style="color: aliceblue;"> <H1>VOLVER AL INICIO </H1></a>
    	
    	</section>
    

        <section class="cuadrado">
        
        
        		<H1 style=" color: aliceblue; ">LISTAR TELEFONOS </H1>
 				<label id="nomProducto"  for="nomProducto">Busca por: </label>
 			                
                	<select  id="busqueda" name="busqueda"  required >
					     	<option value="" disabled selected>Elegir</option>
					     	<option value="numero">Numero telefonico</option>
					     	<option value="cedula">Cedula Usuario</option>
					     	
					</select>
                
                
                <div class="form-group">
	                <span class="span"><i class="i"></i></span>
	                <div class="info">
	                    <input id="infoBusca" name="infoBusca" type="text" placeholder="Ingrese informacion" class="form-control" required>
	                </div>
               	</div>
                
                <br>
                <br>
                
				<input type="button" id="listarUsuario" name="listarUsuario" value="Listar Usuario" onclick="listarTelefono();" />            
		        <div class="separador"> </div>
		        <div id="informacion"><b>Usuarios Encontrados</b></div>
				<br>
				<br>
							
                       
        </section>

</body>
</html>