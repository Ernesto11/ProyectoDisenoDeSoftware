package logicaDePresentacion;

import java.io.File;
import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;

import dto.DTO_Consulta;
import enlaceDeDatos.ConexionBaseDatosRedis;
import logicaDeIntegracion.FactoryConversacion;
import logicaDeNegocio.FactoryConsulta;
import logicaDeNegocio.Texto;
import logicaDeNegocio.Voz;






public class Principal {
	
    
    
	
	public static void main(String[] args) throws SolrServerException, IOException {
		
		DTO_Consulta p = new DTO_Consulta();
		p.setTipoConsulta("Texto");
		p.setPreguntaTexto("¿Qué es Programación Orientada a Objetos?");
		FactoryConsulta.crearConsulta(p).hacerConsulta();
		//File f = new File("C:/Users/Ernesto/Desktop/prueba.wav");
		//p.setPreguntaVoz(f);
		//Voz t = new Voz(p);
		
		//System.out.println(t.hacerConsulta());
		
       // System.out.println(FactoryConversacion.crearConversacion().consultarPregunta("¿Qué es UML?"));  
        //ConexionBaseDatosRedis p = new ConexionBaseDatosRedis();
        //p.obtenerDatos("Programacion orientada a objetos");
	}

}
