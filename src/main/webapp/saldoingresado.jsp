<%-- 
    Document   : index
    Created on : Mar 13, 2019, 6:32:21 PM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <style>
@import url('https://fonts.googleapis.com/css?family=Comfortaa');


body {
  background: #456;
  font-family: 'Comfortaa', cursive;
}

.saldo {
  width: 400px;
  margin: 16px auto;
  font-size: 16px;
}
.button {
  background-color: #28d;
  border: none;
  color: #fff;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.saldo-header,
.saldo p {
  margin-top: 0;
  margin-bottom: 0;
}


.saldo-triangle {
  width: 0;
  margin-right: auto;
  margin-left: auto;
  border: 12px solid transparent;
  border-bottom-color: #28d;
}


.saldo-header {
  background: #28d;
  padding: 30px;
  font-size: 1.4em;
  font-weight: normal;
  text-align: left;
  text-transform: uppercase;
  color: #fff;
}

.saldo-container {
  background: #ebebeb;
  padding: 38px;

}

.saldo p {
  padding: 12px;
}

.saldo input {
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
 
  .saldo input {
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

.saldo input[type="text"],
.saldo input[type="Subir archivos"] {
  background: #fff;
  border-color: #bbb;
  color: #555;
}




.saldo input[type="submit"] {

  background: #28d;
  border-color: transparent;
  color: #fff;
  cursor: pointer;
  box-sizing: border-box;
  width: 50%;
  text-align: center;
 
}

</style>
<div class="saldo">
  <div class="saldo-triangle"></div>
  <h2 class="saldo-header">CopyQuick</h2>
  <form class="saldo-container" method="post">
    
<center>
  <p2 align="center">Saldo ingresado correctamente</p2>
  <a href="indexadministrador.jsp" class="button">regresar</a>

</center>

</center>
</form>
<div>
</div>
  
    </body>
</html>
