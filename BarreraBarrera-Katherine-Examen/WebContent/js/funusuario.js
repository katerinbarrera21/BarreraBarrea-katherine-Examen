/**
 * 
 */

function registrarTelefono() {
	
	var cedula = document.getElementById("cedula").value;
	var nombres = document.getElementById("nombre").value;
	var apellidos = document.getElementById("apellido").value;
	var email = document.getElementById("email").value;
	var password = document.getElementById("contrasena").value;
	var phone = document.getElementById("telefono").value;
	var operadora = document.getElementById("op").value;
	var tipo = document.getElementById("tipoTel").value;
	
	if (window.XMLHttpRequest) {
        // code for IE7+, Firefox, Chrome, Opera, Safari
        xmlhttp = new XMLHttpRequest();
    } else {
        // code for IE6, IE5
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    
	xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            //alert("llegue");
            document.getElementById("informacion2").innerHTML = this.responseText;
        }
    };
    
	xmlhttp.open("GET", "/BarreraBarrera-Katherine-Examen/RegistrarTelefono?cedula="+cedula+"&nombres="+nombres
	+"&apellidos="+apellidos+"&email="+email+"&password="+password+"&phone="+phone+"&operadora="+operadora+"&tipo="+tipo, true);
	xmlhttp.send();
		
}



