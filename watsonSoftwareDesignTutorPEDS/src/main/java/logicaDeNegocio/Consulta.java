package logicaDeNegocio;

import java.util.*;

import logicaDeIntegracion.FactoryTraductor;

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

   

    
    public void setContenidoPregunta(String pContenidoPregunta) {
        
    	this.contenidoPregunta = pContenidoPregunta;
       
    }

   
    public String getContenidoPregunta() {
        
        return this.contenidoPregunta;
    }

    public String traducirAIngles(String pTexto) {  
        return FactoryTraductor.crearTraductor().traducirEspañolIngles(pTexto);
    	
    }
}