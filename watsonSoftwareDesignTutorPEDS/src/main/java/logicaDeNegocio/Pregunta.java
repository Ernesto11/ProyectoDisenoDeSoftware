package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public class Pregunta {

    /**
     * Default constructor
     */
    public Pregunta() {
    }

    /**
     * 
     */
    private String contenidoPregunta;

    /**
     * 
     */
    private String categoria;


    /**
     * 
     */
    private Set<Respuesta> respuestas;

    /**
     * @param pContenidoPregunta 
     * @param pCategoría
     */
    public void Pregunta(String pContenidoPregunta, String pCategoría) {
        this.contenidoPregunta = pContenidoPregunta;
        this.categoria = pCategoría;
    }

    /**
     * @param pContenidoRespuesta 
     * @return
     */
    public void registrarRespuesta(Respuesta pContenidoRespuesta) {
        respuestas.add(pContenidoRespuesta);
    }

}