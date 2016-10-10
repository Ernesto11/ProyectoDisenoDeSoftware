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

    
    private File contenidoPreguntaAudio;

  
    public Voz(DTO_Consulta DTO_nuevaConsulta)
    {
    	super();
        this.contenidoPreguntaAudio = DTO_nuevaConsulta.getPreguntaVoz();
    }

 
    public ArrayList<String> hacerConsulta() {
    	
    	try {
    		
			return contenidoRespuestas = FactoryConversacion.crearConversacion().consultarPregunta(convertirVozTexto());
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
       
    	return contenidoPreguntaTexto = FactoryConvertidorVozATexto.crearVoz_Texto().convertirVozTexto(contenidoPreguntaAudio);
       
    }

   


}