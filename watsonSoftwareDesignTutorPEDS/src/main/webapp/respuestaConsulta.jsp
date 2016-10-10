<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
    
    <%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Consulta Respuesta</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="barrensavannah.css" />

<script type="text/javascript">
function callservlet() {

    var servletname='/watsonSoftwareDesingTutorPEDS/ServletTraducir';

    if(servletname== "")
        {
        alert("NO value..");
        return false;
        }
    else
        {
    	document.form.action = servletname;
    	document.form.submit();
        return false;
        }
}
</script>





</head>
<body>

<script type="text/javascript">
function callservlet() {

    var servletname='/watsonSoftwareDesingTutorPEDS/ServletTraducir';

    if(servletname== "")
        {
        alert("NO value..");
        return false;
        }
    else
        {
    	document.form.action = servletname;
    	document.form.submit();
        return false;
        }
}
</script>


    <div id="page">
        <img src="images/titulo.png" width="665" height="48" alt="titulo">
        <div class="topNaviagationLink"><a href="index.jsp">Principal</div>
        <div class="topNaviagationLink"><a href="registrar.jsp">Registrar</div>
      <div class="topNaviagationLink"><a href="consultar.jsp">Consultar </div>
        <div class="topNaviagationLink"><a href="catalogo.jsp">Catalogo</a></div>
</div>
    <div id="mainPicture">
    	<div class="picture"></div>
    </div>
        <div class="contentBox">
    	<div class="innerBox">
    	  <form name="form" id="form" action="crearDocumento"  method="post">
    	  <jsp:useBean id="DTO_Consulta" scope="request" class="dto.DTO_Consulta" />
    	  <%
    	  String pregunta = DTO_Consulta.getPreguntaTexto();
    	  %>
    	  Pregunta Realizada: <input name="pregunta" id="pregunta" value="<%=pregunta%>" size="50" type="text" readonly><br><br>
    	  <label>Respuestas:</label><br>
    	  
    	 <%
            ArrayList<String> respuestas = DTO_Consulta.getRespuestas();
    	    String respuesta = "";
    	    for(int i = 0; i<respuestas.size();i++)
    	    {
    	    	respuesta += i+1+"- "+respuestas.get(i)+"\n";
    	    }
        %>
          <textarea name="respuestas" id="respuestas"  cols="70" rows="5" readonly><%=respuesta%></textarea><br><br>
          <h3>Calificacion de la respuesta:</h3><br>
            <input type="radio" name="gender" value="Correcta" checked="checked"> Correcta<br>
            <input type="radio" name="gender" value="Incorrecta"> Incorrecta<br><br>
          <a href="consultar.jsp" target="_self"> <input type="button" name="boton" value="Aceptar" /> </a><br><br>
          
          <h3>Traducir a ingles:</h3><input type="button" value="Traducir" onclick="return callservlet();"> <br><br>  

    <h3>Generar Archivo:
      <select id="comboFormatos" name="comboFormatos">
        <option value="PDF">PDF</option>
        <option value="TXT">TXT</option>
      </select> 
        </h3>
        
        
        
        <input type="submit" value="Descargar">
        
    	  </form>
 
    	  <div id="footer">Tutor Cognitivo</div>
<!-- Please leave this in place after all of your content - thanks :) -->
 
        
        </div>
    </div>
        
</body>
</html>