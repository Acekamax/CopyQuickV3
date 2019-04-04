<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html><head>
        <script src="jquery-3.3.1.min.js"></script>
        <script src="ajax.js"></script>
        <style>
@import url('https://fonts.googleapis.com/css?family=Comfortaa');


body {
  background: #456;
  font-family: 'Comfortaa', cursive;
}

.archivoprofesor {
  width: 400px;
  margin: 16px auto;
  font-size: 16px;
}


.archivoprofesor-header,
.archivoprofesor p {
  margin-top: 0;
  margin-bottom: 0;
}


.archivoprofesor-triangle {
  width: 0;
  margin-right: auto;
  margin-left: auto;
  border: 12px solid transparent;
  border-bottom-color: #28d;
}


.archivoprofesor-header {
  background: #28d;
  padding: 30px;
  font-size: 1.4em;
  font-weight: normal;
  text-align: left;
  text-transform: uppercase;
  color: #fff;
}

.archivoprofesor-container {
  background: #ebebeb;
  padding: 38px;

}

.archivoprofesor p {
  padding: 12px;
}

.archivoprofesor input {
  box-sizing: border-box;
  display: block;
  width: 100%;
  border-width: 3px;
  border-style: solid;
  padding: 16px;
  outline: 0;
  font-family: inherit;
  font-size: 0.95em;
}
 
  .archivoprofesor input {
  box-sizing: border-box;
  border-box:center;
  display: block;
  width: 100%;
  border-width: 3px;
  border-style: solid;
  padding: 16px;
  outline: 0;
  font-family: inherit;
  font-size: 0.95em;
}

.archivoprofesor input[type="text"],
.archivoprofesor input[type="Subir archivos"] {
  background: #fff;
  border-color: #bbb;
  color: #555;
}

.subirarchivo{
  background:blue;
  
}



.archivoprofesor input[type="submit"] {

  background: #28d;
  border-color: transparent;
  color: #fff;
  cursor: pointer;
  box-sizing: border-box;
  width: 50%;
  text-align: center;
}
  .boton_personalizado{
    alignment-baseline: central;  
    text-decoration: none;
    padding: 10px;
    font-weight: 600;
    font-size: 30px;
    color: #ffffff;
    background-color: #1883ba;
    border-radius: 6px;
    border: 2px solid #0016b0;
    margin-top: 7px;
    
  }
</style>
</head><body><div class="archivoprofesor">
  <div class="archivoprofesor-triangle"></div>
  <h2 class="archivoprofesor-header">CopyQuick</h2>
  <div class="archivoprofesor-container">
  <p align="center">
                    <input class="boton_personalizado" type="file" id="Ingresar" value="Ver Archivos" onclick="ingresar()">
                    &nbsp;
                    <button class="boton_personalizado"  onClick="collectFILES()">Subir</button>
                    &nbsp;
                    <button class="boton_personalizado"  onClick="myFunction()">Borrar</button>
                    
         </p>
  </div>
<p></p>
  
</div>
</body>
</html>

