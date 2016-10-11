<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" /> 
<head>
<title>Registrar</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="barrensavannah.css" />




</head>
<body>

<body>

    <div id="page">
        <img src="images/titulo.png" width="665" height="48" alt="titulo">
        <div class="topNaviagationLink"><a href="index.jsp">Principal</div>
        <div class="topNaviagationLink"><a href="registrar.jsp">Registrar</div>
      <div class="topNaviagationLink"><a href="consultar.jsp">Consultar</div>
      <div class="topNaviagationLink"><a href="catalogo.jsp">Catalogo</a></div>
</div>
    <div id="mainPicture">
    	<div class="picture"></div>
    </div>
        <div class="contentBox">
    	<div class="innerBox">
        
        <form name="form"  action="ServletCatalogo"  method="post">
    	  <p>
          <br><label>Descargar Catalogo de preguntas: </label><br>
    	  <br><label>Seleccione el formato del Documento: </label>
                 <select id="comboFormatos" name="comboFormatos">
                     <option value="PDF">PDF</option>
                     <option value="TXT">TXT</option>
                 </select> 
          
          <br><br>
          <label>Seleccione una categoria: </label><br><br>
    	  <input type="radio" name="tipo" id="tipo"  value="Programacion orientada a objetos" checked>Programacion Orientada a objetos.<br>
          <input type="radio" name="tipo" id="tipo"  value="Notacion UML">Notacion UML para diagramas de Clase.<br>
          <input type="radio" name="tipo" id="tipo" value="Principios de Diseno">Principios de Diseno. <br><br>
    
    
    
              <label>Seleccione el idioma: </label><br><br>
    	  <input type="radio" name="idioma" id="idioma"  value="espanol" checked>Español.<br>
          <input type="radio" name="idioma" id="idioma"  value="ingles">Ingles.<br><br> 
    
    
    	    <input type="submit" value="Descargar">
    	    <br>
  	    </p>                                           
    	  </form>
         
         
    	  <div id="footer">tutor cognitivo</div>
<!-- Please leave this in place after all of your content - thanks :) -->
        
        
        

        
        </div>






    </div>
        
</body>
</html>
