<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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


	<meta name="viewport" content="width=device-width,initial-scale=1">

	<script src="js/audiodisplay.js"></script>
	<script src="js/recorder.js"></script>
	<script src="js/main.js"></script>
	<style>
	html { overflow: hidden; }
	body { 
		font: 14pt Arial, sans-serif; 
		background: lightgrey;
		display: flex;
		flex-direction: column;
		height: 100vh;
		width: 100%;
		margin: 0 0;
	}


	#record { height: 15vh; }
	#record.recording { 
		background: red;
		background: -webkit-radial-gradient(center, ellipse cover, #ff0000 0%,lightgrey 75%,lightgrey 100%,#7db9e8 100%); 
		background: -moz-radial-gradient(center, ellipse cover, #ff0000 0%,lightgrey 75%,lightgrey 100%,#7db9e8 100%); 
		background: radial-gradient(center, ellipse cover, #ff0000 0%,lightgrey 75%,lightgrey 100%,#7db9e8 100%); 
	}



	@media (orientation: landscape) {

		#controls { flex-direction: column; height: 100%; width: 10%;}

	}

	</style>
<title>Consultar</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="barrensavannah.css" />


</head>
<body>

<body id="body">
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
    	  <form name="form"  action="ServletConsultaTexto"  method="post" >
    	    <p><br>
            </p>
    	    <p>Ingrese la pregunta: </p><br>
            <p>
             <input type="text" id="pregunta" name="pregunta" size="59" maxlength="100" class="form-control" placeholder="pregunta" required><div id="controls">
		<img id="record" src="images/mic128.png" onclick="toggleRecording(this);">
	</div>

    	    <p>
    	    <input type="submit" value="Consultar"><br><br>                                           
    	  </form>

    	  <div id="footer">Tutor Cognitivo</div>
<!-- Please leave this in place after all of your content - thanks :) -->
        
        
        

        
        </div>
    </div>
        
</body>
</html>