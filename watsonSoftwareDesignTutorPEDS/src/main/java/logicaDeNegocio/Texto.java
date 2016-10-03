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
        
    	Conversacion servicioConversacion = new Conversacion();
    	return obtenerRespuestas(servicioConversacion.consultarPregunta(contenidoPregunta));
        
    }

}