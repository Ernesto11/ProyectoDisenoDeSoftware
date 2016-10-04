<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Consultar</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="barrensavannah.css" />


</head>
<body>

<body>
    <div id="page">
        <img src="images/titulo.png" width="665" height="48" alt="titulo">
        <div class="topNaviagationLink"><a href="index.jsp">Principal</div>
        <div class="topNaviagationLink"><a href="registrar.jsp">Registrar</div>
      <div class="topNaviagationLink"><a href="consultar.jsp">Consultar </div>
        <div class="topNaviagationLink"><a href="index.html">Contact</a></div>
</div>
    <div id="mainPicture">
    	<div class="picture"></div>
    </div>
        <div class="contentBox">
    	<div class="innerBox">
    	  <form name="form">
    	  <jsp:useBean id="DTO_Consulta" scope="request" class="dto.DTO_Consulta" />
    	  <%
    	  String pregunta = DTO_Consulta.getPreguntaTexto();
    	  %>
    	  Pregunta Realizada: <input name="name" value="<%=pregunta%>" size="50" type="text" readonly><br><br>
    	  <label>Respuestas:</label><br>
    	  
    	 <%
            ArrayList<String> respuestas = DTO_Consulta.getRespuestas();
    	    String respuesta = "";
    	    for(int i = 0; i<respuestas.size();i++)
    	    {
    	    	respuesta += i+1+"- "+respuestas.get(i)+"\n";
    	    }
        %>
    	  
          <textarea name="area_respuestas"  cols="70" rows="5" readonly><%=respuesta%></textarea>

    	  </form>
 
    	  <div id="footer">Tutor Cognitivo</div>
<!-- Please leave this in place after all of your content - thanks :) -->
 
        
        </div>
    </div>
        
</body>
</html>