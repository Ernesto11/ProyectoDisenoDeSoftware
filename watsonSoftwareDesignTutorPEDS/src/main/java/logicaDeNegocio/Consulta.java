package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public abstract class Consulta implements Traducible {

    /**
     * Default constructor
     */
    public Consulta() {
    }

    /**
     * 
     */
    protected ArrayList<String> contenidoRespuestas;

    /**
     * 
     */
    protected String contenidoPregunta;

    /**
     * 
     */
    protected boolean estadoRespuesta;

    /**
     * 
     */
    public void Consulta() {
        // TODO implement here
    }

    /**
     * @return
     */
    public abstract ArrayList<String> hacerConsulta();

    /**
     * @param pRespuestaJSON 
     * @return
     */
    public ArrayList<String> obtenerRespuestas(String pRespuestaJSON) {
        // TODO implement here
        return null;
    }

    /**
     * @param pContenidoPregunta 
     * @return
     */
    public void setContenidoPregunta(String pContenidoPregunta) {
        // TODO implement here
       
    }

    /**
     * @return
     */
    public String getContenidoPregunta() {
        // TODO implement here
        return "";
    }

    /**
     * @param pTexto 
     * @return
     */
    public String traducirAIngles(String pTexto) {
        // TODO implement here
        return "";
    }


}