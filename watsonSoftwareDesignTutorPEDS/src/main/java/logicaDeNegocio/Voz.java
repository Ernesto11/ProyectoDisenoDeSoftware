package logicaDeNegocio;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.apache.solr.client.solrj.SolrServerException;

import logicaDeIntegracion.FactoryConversacion;
import logicaDeIntegracion.FactoryConvertidorVozATexto;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import dto.DTO_Consulta;

/**
 * 
 */
public class Voz extends Consulta {

    
    private File contenidoPregunta;

  
    public Voz(DTO_Consulta DTO_nuevaConsulta) {
        this.contenidoPregunta = DTO_nuevaConsulta.getPreguntaVoz();
    }

 
    public ArrayList<String> hacerConsulta() {
    	
    	try {
			return FactoryConversacion.crearConversacion().consultarPregunta(obtenerPreguntaTexto());
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
        
    }

   
    private String convertirVozTexto() {
        
    	return FactoryConvertidorVozATexto.crearVoz_Texto().convertirVozTexto(contenidoPregunta);
       
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
	    String respuesta = jobject.get("transcript").toString().replace('"', ' ');
	    System.out.println(respuesta);
	    return respuesta;
    }

}