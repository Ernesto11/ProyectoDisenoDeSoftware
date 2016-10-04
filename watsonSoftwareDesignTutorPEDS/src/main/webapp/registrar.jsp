<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Registrar</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="barrensavannah.css" />

<script type="text/javascript">
function agregarElemento()
{
	var option = document.createElement("option");
	option.text =document.getElementById('respuesta').value;
	option.value =document.getElementById('respuesta').value;
	option.selected = "selected";
	var select = document.getElementById("respuestas");
	select.appendChild(option);
	document.getElementById('respuesta').value="";
	alert("Respuesta asociada a la pregunta");
}
</script>



</head>
<body>

<body>

    <div id="page">
        <img src="images/titulo.png" width="665" height="48" alt="titulo">
        <div class="topNaviagationLink"><a href="index.jsp">Principal</div>
        <div class="topNaviagationLink"><a href="registrar.jsp">Registrar</div>
      <div class="topNaviagationLink"><a href="consultar.jsp">Consultar</div>
        <div class="topNaviagationLink"><a href="index.html">Contact</a></div>
</div>
    <div id="mainPicture">
    	<div class="picture"></div>
    </div>
        <div class="contentBox">
    	<div class="innerBox">
        
        <form name="form"  action="ControladorRegistro"  method="post">
    	  <p>
    	  <br><label>Seleccione una categoria: </label><br>
    	  <input type="radio" name="tipo" value="Programacion orientada a objetos" checked>Programacion Orientada a objetos.<br>
          <input type="radio" name="tipo" value="Notacion UML">Notacion UML para diagramas de Clase.<br>
          <input type="radio" name="tipo" value="Principios de Diseño">Principios de Diseno. <br><br>
    
          <br><label>Ingrese la pregunta: </label><input id="pregunta" name="pregunta" type="text" width="450"><br>
          <br><label>Ingrese la respuesta: </label><input id="respuesta" name="respuesta" width="450" type="text"><br>
          <br><input type="button" onclick="agregarElemento()" value="Agregar Respuesta"><br>
    	  <select  multiple="multiple"  id="respuestas" name="respuestas" size="5" style="visibility:hidden">
  	      </select>
    	    <br><br><br>
   	      </p>
    	  <p>
    	    <input type="submit" value="Registrar">
    	    <br>
  	    </p>                                           
    	  </form>
         
         
    	  <div id="footer">tutor cognitivo</div>
<!-- Please leave this in place after all of your content - thanks :) -->
        
        
        

        
        </div>






    </div>
        
</body>
</html>
