package logicaDePresentacion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.solr.client.solrj.SolrServerException;

import dto.DTO_Consulta;
import enlaceDeDatos.ConexionBaseDatosRedis;
import logicaDeIntegracion.ConvertidorVozATexto;
import logicaDeIntegracion.FactoryConversacion;
import logicaDeNegocio.FactoryConsulta;
import logicaDeNegocio.Texto;
import logicaDeNegocio.Voz;






public class Principal {
	
    
    
	
	public static void main(String[] args) throws SolrServerException, IOException {
		

		//ConvertidorVozATexto p = new ConvertidorVozATexto();
		//File n = new File("C:/Users/Ernesto/Desktop/prueb1a.wav");
		//System.out.println(p.convertirVozTexto(n));
		//File f = new File("C:/Users/Ernesto/Desktop/prueba.wav");
		//p.setPreguntaVoz(f);
		//Voz t = new Voz(p);
		
		//System.out.println(t.hacerConsulta());
		
       // System.out.println(FactoryConversacion.crearConversacion().consultarPregunta("¿Qué es UML?"));  
        ConexionBaseDatosRedis p = new ConexionBaseDatosRedis();
        ArrayList<String> n = p.obtenerDatos("Principios de Diseno");
        System.out.println(n.toString());
       p.limpiarBaseDatos("Principios de Diseno");
        n = p.obtenerDatos("Principios de Diseno");
       System.out.println("Despues"+ n.toString());        
        
        
        
        
        
        
        
        
        
	}

}
