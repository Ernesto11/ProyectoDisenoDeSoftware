package controlador;



import java.io.IOException;
import java.util.ArrayList;

import org.apache.solr.client.solrj.SolrServerException;

import dto.DTO_Consulta;
import dto.DTO_Pregunta;
import logicaDeNegocio.Documento;
import logicaDeNegocio.FactoryConsulta;
import logicaDeNegocio.FactoryPregunta;
import logicaDeNegocio.Pregunta;
//import logicaDeNegocio.Consulta;
//import logicaDeNegocio.Registro;

public class ControladorWeb {

	/*public Registro solicitudCrearRegistro()
	{
		
	}*/
	
	public static void solicitudRealizarRegistro(DTO_Pregunta DTO_nuevaPregunta) throws SolrServerException, IOException
	{
		solicitudCrearPregunta(DTO_nuevaPregunta).registrarPreguntaRespuesta();
	}
	
	private static Pregunta solicitudCrearPregunta(DTO_Pregunta DTO_nuevaPregunta){
		return FactoryPregunta.crearPregunta(DTO_nuevaPregunta);
	}
	
	public static ArrayList<String> hacerConsulta(DTO_Consulta DTO_nuevaConsulta)
	{
		return FactoryConsulta.crearConsulta(DTO_nuevaConsulta).hacerConsulta();

	}
	
	/**
	public Documento solicitudCrearDocumento(DTO_Documento DTO_nuevoDocumento)
	{
		FactoryDocumento nuevaFabricaDoc = new FactoryDocumento();
		Documento nuevoDocumento = nuevaFabricaDoc.crearDocumento(DTO_nuevoDocumento);
		return nuevoDocumento;
	}
	
	public void solicitudGenerarArchivo(String pContenido, String pIdioma, String pTipoDocumento, Document pPreDocumento)
	{
		DTO_Documento DTO_nuevoDocumento = new DTO_Documento();
		DTO_nuevoDocumento.setContenido(pContenido);
		//DTO_nuevoDocumento.setPreDocumento(pPreDocumento);
		DTO_nuevoDocumento.setIdioma(pIdioma);
		DTO_nuevoDocumento.setTipoDocumento(pTipoDocumento);
		
		Documento nuevoDocumento = solicitudCrearDocumento(DTO_nuevoDocumento);
		nuevoDocumento.generarArchivo();
	}
	
	/*
	public Consulta solicitudCrearConsulta()
	{
		
	}
	*/
	public void solicitudHacerConsulta()
	{
		
	}
}
