<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Error</title>
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
        <div class="topNaviagationLink"><a href="index.html">Contact</a></div>
</div>
    <div id="mainPicture">
    	<div class="picture"></div>
    </div>
        <div class="contentBox">
    	<div class="innerBox">
        
        <form >
        <label>El registro de la pregunta se realizo correctamente.</label><br><br>
        <jsp:useBean id="DTO_Registro" scope="request" class="dto.DTO_Registro" /></h1>
        <p><span class="texto">Categoria:  </span><span class="texto">
        <jsp:getProperty name="DTO_Registro" property="categoria"/></span><br><br>
        <p><span class="texto">Pregunta:  </span><span class="texto">
        <jsp:getProperty name="DTO_Registro" property="pregunta"/></span><br><br>
        <br><label>Respuestas a la pregunta:</label><br>
        <ul>
        <%
            String[] respuestas = DTO_Registro.getRespuestas();
            if(respuestas != null){
            	for(int i =0; i<respuestas.length;i++)
            	{
        %>
        <li>
        <%= respuestas[i]  %>
        </li>
        <%}
            }
        %>
        
        <br><input type="button" value="Volver" onClick="location.href = 'registrar.jsp' ">
        </form>
  
         
         
    	  <div id="footer">tutor cognitivo</div>
<!-- Please leave this in place after all of your content - thanks :) -->
        
        
        

        
        </div>






    </div>
        
</body>
</html>