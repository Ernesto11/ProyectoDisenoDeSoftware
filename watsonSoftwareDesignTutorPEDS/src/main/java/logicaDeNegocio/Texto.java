package logicaDeNegocio;

import java.io.IOException;
import java.util.*;

import org.apache.solr.client.solrj.SolrServerException;

import logicaDeIntegracion.FactoryConversacion;
import dto.DTO_Consulta;

/**
 * 
 */
public class Texto extends Consulta {

	private String contenidoPregunta;
	
    
    public  Texto(DTO_Consulta DTO_nuevaConsulta) {
        this.contenidoPregunta =  DTO_nuevaConsulta.getPreguntaTexto(); 
    }

  
    public ArrayList<String> hacerConsulta() {
        
    	try {
			return FactoryConversacion.crearConversacion().consultarPregunta(contenidoPregunta);
		} catch (SolrServerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
        
    }

}