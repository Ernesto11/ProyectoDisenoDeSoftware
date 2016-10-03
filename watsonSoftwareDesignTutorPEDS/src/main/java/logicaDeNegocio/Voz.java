package logicaDeNegocio;

import java.io.File;
import java.util.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * 
 */
public class Voz extends Consulta {

    
    private File contenidoPregunta;

  
    public Voz(File pContenidoPregunta) {
        this.contenidoPregunta = pContenidoPregunta;
    }

 
    public ArrayList<String> hacerConsulta() {
    	FactoryServicios familiaServicios = new FactoryServicios();
    	return obtenerRespuestas(familiaServicios.crearServicioConversacion().consultarPregunta(obtenerPreguntaTexto()));
        
    }

   
    private String convertirVozTexto() {
        
    	FactoryServicios familiaServicios = new FactoryServicios();
    	return familiaServicios.crearServicioVozATexto().convertirVozTexto(contenidoPregunta);
       
    }

   
    private String obtenerPreguntaTexto() {
     
    	JsonElement jelement = new JsonParser().parse(convertirVozTexto());
	    JsonObject  jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray = jobject.getAsJsonArray("results");
	    jelement = jarray.get(0);
	    jobject = jelement.getAsJsonObject();
	    
	    JsonArray jarray2 = jobject.getAsJsonArray("alternatives");
	    jelement = jarray2.get(0);
	    jobject = jelement.getAsJsonObject();
	    String respuesta = jobject.get("transcript").toString();
	    return respuesta;
    }

}