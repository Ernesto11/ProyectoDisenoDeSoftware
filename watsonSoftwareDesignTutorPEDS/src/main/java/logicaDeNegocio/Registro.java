package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public class Registro {
	
    private String pregunta;
    private ArrayList<String> respuestas;
    private String categoriaPregunta;
	

	
    public Registro(String pCategoria) 
    {
    	categoriaPregunta = pCategoria;
    }

    /**
     * @param pCategoria
     */
    public void registrarRespuestas(ArrayList<String> pRespuestas) {
        respuestas = pRespuestas;
    }

    /**
     * @param pPregunta 
     * @return
     */
    public void registrarPregunta(String pPregunta) {
        pregunta = pPregunta;
        
    }

    /**
     * @param pContenidoRespuesta 
     * @return
     */
    public void registrarRespuestas(String pContenidoRespuesta) {
        // TODO implement here

    }

}