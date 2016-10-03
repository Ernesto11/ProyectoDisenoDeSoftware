package logicaDeNegocio;

import java.util.*;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * 
 */
public abstract class Consulta implements Traducible {

    
	
    protected ArrayList<String> contenidoRespuestas;
    protected String contenidoPregunta;
    protected boolean estadoRespuesta;

    public Consulta() {
    
       contenidoRespuestas = new ArrayList<String>();
    }

   
    public abstract ArrayList<String> hacerConsulta();

   
    public ArrayList<String> obtenerRespuestas(String pRespuestaJSON) {
  
    	
    	JsonElement jelement = new JsonParser().parse(pRespuestaJSON);
	    JsonObject  jobject = jelement.getAsJsonObject();
	    
	    jelement = jobject.get("output");
	    jobject = jelement.getAsJsonObject();
	    
	    JsonArray listaRespuestasObtenidas = jobject.getAsJsonArray("text");
    	
	    for (int contador=0; contador<listaRespuestasObtenidas.size();contador++){
	    	
	    	contenidoRespuestas.add(listaRespuestasObtenidas.get(contador).toString());
	    }
	    return contenidoRespuestas;
    }

    
    public void setContenidoPregunta(String pContenidoPregunta) {
        
    	this.contenidoPregunta = pContenidoPregunta;
       
    }

   
    public String getContenidoPregunta() {
        
        return this.contenidoPregunta;
    }

    public String traducirAIngles(String pTexto) {
    
        
        FactoryServicios familiaServicios = new FactoryServicios();
        return familiaServicios.crearServicioTraducir().traducirEspañolIngles(pTexto);
    	
    }
}