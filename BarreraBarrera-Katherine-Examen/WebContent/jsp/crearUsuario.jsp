<%@page import="ups.edu.ec.Entidades.TipoTelefono"%>
<%@page import="ups.edu.ec.Entidades.Operadoras"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <link href="css/cuadrado.css" rel="stylesheet" />
		<script src="js/funusuario.js" type="text/javascript"></script>
    </head>
    <body background="img/REGISTRAR.png" >
    
	<%
  
		
		List<Operadoras> op = (List<Operadoras>)request.getAttribute("operadoras");
		List<TipoTelefono> telTip = (List<TipoTelefono>)request.getAttribute("tipoTelefono");
	%>
    
    <section style=" margin-left: 9%; margin-top: 4%;">
    	
    	<a href="index.html" style="color: aliceblue;"> <H1>VOLVER AL INICIO </H1></a>
    	
    	</section>
    

        <section class="cuadrado">
            <div>
               
                        <i class="far fa-paper-plane fa-2x mb-2 text-white"></i>
                        <h2 class="text-white mb-5">Registra un nuevo usuario!</h2>
                        <form class="form-inline d-flex">
                        	<h3>Ingresa tu cedula para buscar y agregar mas telefonos  o crear un nuevo usuario </h3>
                            <input class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" id="cedula"  name="cedula" value= "" placeholder="Ingresa cedula..."  onkeyup="buscarUsu(); required="required" />
                            <br> 
                            
                            <input class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" id="nombre" name="nombre" value= "" placeholder="Ingresa nombre..." required="required" />
                            <br>
                           
                            <input class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" id="apellido" name= "apellido" value= "" placeholder="Ingresa apellido..." required="required" />
                            <br>
                           
                            <input class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" id="email"  name= "email" type="email" value= ""  placeholder="Ingresa email.." required="required" />
                            
                            <BR>
                            <input class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" id="contrasena" name= "contrasena" type="password" value= ""  placeholder="Ingresa contrasena..." required="required" />
							
                        
                           <h2 class="text-white mb-5">Agregar Telefonos al usuario!</h2>
                           
                     
                            
                            <input class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0" id="telefono" name= "telefono" type="number" placeholder="Ingrese telefono..." />
							
						    <h5 class="text-white mb-5">Elegir Operadora!</h5>
							<select class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0"  
							name="op" id= "op" style="width: 50%;" required="required">
							
							<option value="" disabled selected>Selecciona una opcion</option>
					     	<% 
						     		for(int i = 0; i<op.size(); i++){
						     			out.print("<option value=\""+op.get(i).getOpeCod()+"\">"+op.get(i).getOpeNombre()+"</option>");
						     		}
 							%>
  								

						 	</select>
						 	
						 	<h5 class="text-white mb-5">Elegir Tipo de telefono!</h5>
						 	<select class="form-control flex-fill mr-0 mr-sm-2 mb-3 mb-sm-0"  name="tipoTel" style="
    						width: 50%;" id= "tipoTel" required="required">
    						<option value="" disabled selected>Selecciona una opcion</option>
					     	<% 
						     		for(int i = 0; i<telTip.size(); i++){
						     			out.print("<option value=\""+telTip.get(i).getCodTipo()+"\">"+telTip.get(i).getTipo()+"</option>");
						     		}
 							%>
    							
    							
						 	</select>
                            
                            
                            <button class="btn btn-primary mx-auto" type="button" onclick="registrarTelefono()">Agregar Telefono</button>
                            
                          
                
            </div>
            
             <div class="separador"> </div>
			       		<div id="informacion2"><b>Verificacion de crear producto</b></div>
			       		
			       		
                       
        </section>
                          
        
        
        

       
    </body>
</html>
