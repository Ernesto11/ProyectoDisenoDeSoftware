package controlador;



import java.io.IOException;
import java.util.ArrayList;

import org.apache.solr.client.solrj.SolrServerException;

import dto.DTO_Consulta;
import dto.DTO_Documento;
import dto.DTO_Pregunta;
import logicaDeIntegracion.FactoryTraductor;
import logicaDeNegocio.Consulta;
import logicaDeNegocio.Documento;
import logicaDeNegocio.FactoryConsulta;
import logicaDeNegocio.FactoryDocumento;
import logicaDeNegocio.FactoryPregunta;
import logicaDeNegocio.Pregunta;
//import logicaDeNegocio.Consulta;
//import logicaDeNegocio.Registro;

public class ControladorWeb {

	/*public Registro solicitudCrearRegistro()
	{
		
	}*/
	
	/**	 * Permite crear un objeto de tipo Documento, enviando el objeto DTO_nuevoDocumento a la
	 * fábrica encargada de crear dicho documento.
	 * @param DTO_nuevoDocumento contiene los datos necesarios para crear el objeto Documento
	 * @return nuevoDocumento es el objeto creado a partir del DTO_nuevoDocumento
	 */
	public static Documento solicitudCrearDocumento(DTO_Documento DTO_nuevoDocumento)
	{
		Documento nuevoDocumento = FactoryDocumento.crearDocumento(DTO_nuevoDocumento);
		return nuevoDocumento;
	}
	
	
	
	public static void solicitudRealizarRegistro(DTO_Pregunta DTO_nuevaPregunta) throws SolrServerException, IOException
	{
		solicitudCrearPregunta(DTO_nuevaPregunta).registrarPreguntaRespuesta();
	}
	
	private static Pregunta solicitudCrearPregunta(DTO_Pregunta DTO_nuevaPregunta){
		return FactoryPregunta.crearPregunta(DTO_nuevaPregunta);
	}
	
	public static Consulta crearConsulta(DTO_Consulta DTO_nuevaConsulta)
	{
		Consulta nuevaConsulta = FactoryConsulta.crearConsulta(DTO_nuevaConsulta); 
		return nuevaConsulta;

	}
	
	public static String solicitudTraducir(String pTexto)
	{
		return FactoryTraductor.crearTraductor().traducirEspañolIngles(pTexto);
		
	}

}
