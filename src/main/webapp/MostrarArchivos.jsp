<%-- 
    Document   : MostrarArchivos
    Created on : 14/03/2019, 03:02:14 AM
    Author     : PC02
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <title>CopyQuick</title>
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/ajax.js"></script>
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

        .bodyStudent {
            background: rgb(233, 232, 232);
            padding: 12px;
        }

        .containerBody {
            margin: 15px;
        }

        table {
            border-collapse: collapse;
        }

        table,
        th,
        td {
            border: 1px solid black;
            text-align: center;
        }

        table th {
            width: 30mm;
            height: 10mm;
            text-align: center;
        }

        table td {
            width: 30mm;
            height: 10mm;
            text-align: center;
        }

        input {
            border: none;
            background: none;
            width: 30mm;
            height: 10mm;
            text-align: center;
            font-family: 'Comfortaa', cursive;
        }
    </style>

    <body>
        <div class="container">
            <div class="header">
                <h1>CopyQuick</h1>
            </div>

            <div class="bodyStudent">
                <div class="containerBody">
                    <br>
                    <br>
                    <table style="border-collapse: collapse">
                        <tr>
                            <th># Archivo</th>
                            <th>Nombre Archivo</th>
                            <th>Profesor</th>
                            <th>Semestre</th>
                        </tr>
                    </table>
                    <br>
                    <br>
                </div>
            </div>
        </div>
        <script>
            var token;
            $(document).ready(mostrarArchivos());
        </script>
    </body>

</html>
