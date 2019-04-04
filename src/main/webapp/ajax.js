var token;
var uri = "http://localhost:8080/copyquickmaven/";
////Registro
//----------Ingresar---------------------------------------------------------------------------------------------
function ingresar() {
    var nomUsuario = $('#nomUsuario').val();
    var contrasena = $('#contrasena').val();
    info = {
        "nomUsuario": nomUsuario,
        "contrasena": contrasena
    };
    dataToSend = JSON.stringify(info);
    $.ajax({
        url: "http://localhost:8080/copyquickmaven/ServletLogin",
        type: "POST",
        dataType: 'json',
        contentType: "application/json;charset=UTF-8",
        data: dataToSend,
        beforeSend: function () {
            console.log(dataToSend);
        }
    })
}
//----------Registrar--------------------------------------------------------------------------------------------
function tipoUsuario() {
    var name = $('#tipoUsuario').val();
    if (name == "estudiante") {
        $("#tipoProfesor").remove();
        $(".1").remove();
        $(".information").append('<br class="1"><br class="1"><input id="carrera" placeholder="Carrera"><br class="1"><br class="1"><input id="semestre" placeholder="Semestre">');
    } else {
        $("#carrera").remove();
        $("#semestre").remove();
        $(".1").remove();
        $(".information").append('<br class="1"><br class="1"><select id="tipoProfesor"><option>Escoge una opción</option><option value="planta">Planta</option><option value="catedra">Catedra</option></select>');
    }
}
;
function registrar() {
    var name = $('#tipoUsuario').val();
    var nomUsuario = $('#nomUsuario').val();
    var contrasena = $('#contrasena').val();
    var correo = $('#correo').val();
    var usuario;
    if (name == "estudiante") {
        var carrera = $('#carrera').val();
        var semestre = $('#semestre').val();
        usuario = "estudiante";
        info = {
            "nomUsuario": nomUsuario,
            "contrasena": contrasena,
            "correo": correo,
            "carrera": carrera,
            "semestre": semestre,
            "usuario": usuario
        };
    } else {
        var tipoProfesor = $('#tipoProfesor').val();
        usuario = "profesor";
        info = {
            "nomUsuario": nomUsuario,
            "contrasena": contrasena,
            "correo": correo,
            "tipoProfesor": tipoProfesor,
            "usuario": usuario
        };
    }
    dataToSend = JSON.stringify(info);
    $.ajax({
        url: "http://localhost:8080/CopyQuickV2/ServletRegistro",
        type: "POST",
        headers: {"token": token},
        dataType: 'json',
        contentType: "application/json;charset=UTF-8",
        data: dataToSend,
        beforeSend: function () {
            console.log(dataToSend);
            nomUsuario = $('#nomUsuario').val("");
            contrasena = $('#contrasena').val("");
            correo = $('#correo').val("");
            if (name == "estudiante") {
                carrera = $('#carrera').val("");
                semestre = $('#semestre').val("");
            } else {
                var tipoProfesor = $('#tipoProfesor').val("Tipo profesor");
            }
        }
    });

}

////Vista estudiante
//----------Ver saldo--------------------------------------------------------------------------------------------
function verSaldo() {
    $.ajax({
        url: "ServletEstudiante",
        type: "GET",
        headers: {"token": token},
        data: {"idPersona": "34"},
        success: function (rta) {
            console.log(rta);
        }
    });
}

////Vista completa de archivos
//----------Archivo escogido-------------------------------------------------------------------------------------
function archivoEscogido(idFile) {
    var id = idFile;
    info = {
        "idArchivo": id
    };
    dataToSend = JSON.stringify(info);
    $.ajax({
        //url:"ServletArchivos.java",
        type: "POST",
        dataType: 'json',
        contentType: "application/json;charset=UTF-8",
        data: dataToSend,
        beforeSend: function () {
            console.log(dataToSend);
        }
    })
}
//----------Ver archivos----------------------------------------------------------------------------------------
function mostrarArchivos() {
    $.ajax({
        url: "http://localhost:8080/copyquickmaven/ServletArchivos",
        type: "GET",
        data: {"id_archivo": "1"},
        success: function (rta) {

        }
    });
}

//----------Agregar saldo---------------------------------------------------------------------------------------
function agrearSaldo() {
    var correo = $('#correo').val();
    var usuario = $('#nomusuario').val();
     var saldo = $('#saldo').val();
    info = {
        "correo": correo,
        "usuario": usuario,
        "saldo": saldo
    };
    dataToSend = JSON.stringify(info);
    $.ajax({
        url: "http://localhost:8080/CopyQuickV2/ServletSaldo",
        type: "POST",
        dataType: 'json',
        contentType: "application/json;charset=UTF-8",
        data: dataToSend,
        beforeSend: function () {
            console.log(dataToSend);
        }
    }
            )
}
//----------Subir Archivo---------------------------------------------------------------------------------------
function collectFILES(){
	var files=$('input:file');
	var myFiles=[];
	for(var itF=0;itF<files.length;itF++){
		
		var file_data=$(files[itF]).prop('files')[0];
		if(file_data != undefined ){
			filename=saveFile(file_data);

			if(filename!="error"){
				//Hacer lo necesario con el nombre del archivo.
			}
		}
	}
	
	return myFiles;
}

function saveFile(file_data){
	 var form_data = new FormData();
	    form_data.append('file', file_data);
	    filename="";
	    $.ajax({
	        url: "http://localhost:8080/CopyQuickV2/FileUploadServlet",//La url del servlet.
	        type: "POST",
	        data: form_data,
	        processData: false,
	        contentType: false,
	        cache: false,
	        async:false,
	        dataType: 'json',
	        complete:function(ans){
	        	if(ans.statusText=="OK"){
	        		filename=ans.responseJSON;
	        	}else{
	        		filename="error";
	        	}
	        }
	    });

	   return filename;
}
