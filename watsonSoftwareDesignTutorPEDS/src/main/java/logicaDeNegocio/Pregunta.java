package logicaDeNegocio;

import java.io.IOException;
import java.util.*;

import org.apache.solr.client.solrj.SolrServerException;

import dto.DTO_Pregunta;
import enlaceDeDatos.ConexionBaseDatosRedis;
import logicaDeIntegracion.FactoryConversacion;

/**
 * 
 */
public class Pregunta {
	
	private String pregunta;
	private String categoriaPregunta;
	private Respuesta respuesta;

    /**
     * Default constructor
     */
    public Pregunta(DTO_Pregunta DTO_nuevaPregunta) 
    {
    	pregunta = DTO_nuevaPregunta.getPregunta();
    	categoriaPregunta = DTO_nuevaPregunta.getCategoria();
    	respuesta = new Respuesta(DTO_nuevaPregunta.getRespuesta());
    	
    }
    
    public void registrarPreguntaRespuesta() throws SolrServerException, IOException{
    	registrarBaseDatosRedis();
    	registrarEnWatson(); 
    }
    
    public void registrarBaseDatosRedis()
    {
    	ConexionBaseDatosRedis registrar = new ConexionBaseDatosRedis();
    	registrar.insertarDatos(categoriaPregunta, pregunta, respuesta.getRespuesta());

    }
    
    public void registrarEnWatson() throws SolrServerException, IOException
    {
    	FactoryConversacion.crearConversacion().registrarPregunta(pregunta, respuesta.getRespuesta());
    }
    

}