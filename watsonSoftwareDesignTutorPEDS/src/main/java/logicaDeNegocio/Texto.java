package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public class Texto extends Consulta {

	private String contenidoPregunta;
	
    
    public  Texto(String pContenidoPregunta) {
        this.contenidoPregunta = pContenidoPregunta; 
    }

  
    public ArrayList<String> hacerConsulta() {
        
    	FactoryServicios familiaServicios = new FactoryServicios();
    	return obtenerRespuestas(familiaServicios.crearServicioConversacion().consultarPregunta(contenidoPregunta));
        
    }

}