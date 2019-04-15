<%-- 
    Document   : ArchivoEscogido
    Created on : 11/04/2019, 11:50:08 AM
    Author     : PC02
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <title>CopyQuick</title>
</head>
<style>
    @import url('https://fonts.googleapis.com/css?family=Comfortaa');

    body {
        background: #456;
        font-family: 'Comfortaa', cursive;
    }

    .container {
        width: 500px;
        margin: 16px auto;
        font-size: 16px;
        background: rgb(34, 136, 221);
    }

    .header h1 {
        text-align: left;
        padding: 15px;
        margin-left: 15px;
        margin-bottom: 0%;
        color: rgb(255, 255, 255);
    }

    .body {
        background: rgb(233, 232, 232);
        padding: 12px;
    }

    .containerBody {
        margin: 15px;
    }

    .containerBody h4 {
        text-align: center;
    }

    #archivo {
        width: 500;
        height: 350;
        background: black;
        margin-left: auto;
        margin-right: auto;
        display: block;
    }

    .footer button {
        font-size: 7.5mm;
        background: #28d;
        border-color: transparent;
        color: #fff;
        cursor: pointer;
        box-sizing: border-box;
        width: 35%;
        display: inline-block;
        font-family: 'Comfortaa', cursive;
        margin-left: 22.5mm;
    }

    .footer h3 {
        display: inline-block;
    }
</style>

<body>
    <div class="container">
        <div class="header">
            <h1>CopyQuick</h1>
        </div>

        <div class="body">
            <div class="containerBody">
                <h4>Archivo Escogido.</h4>
                <br>
                <br>
                <embed src=”C:\Users\PC02\Documents\Arduino\pasabordo.pdf#toolbar=0″ id="archivo">
                <br>
                <br>
                <div class="footer">
                    <button class="btn">Imprimir</button>
                    <h3>Total: 100.00</h3>
                </div>
            </div>
        </div>
    </div>
</body>

</html>