package dto;

import java.util.*;

/**
 * 
 */
public class DTO_Consulta {


    private String pregunta;
    private ArrayList<String> respuestas;

    public DTO_Consulta() {
        
    	respuestas = new ArrayList<String>();
    }

    public void setPregunta(String pPregunta) {
        this.pregunta = pPregunta;

    }

    public void setRespuesta(String pRespuesta) {
        respuestas.add(pRespuesta);

    }

    public ArrayList<String> getRespuesta() {
       
        return this.respuestas;
    }

    /**
     * @return
     */
    public String getPregunta() {
        
        return this.pregunta;
    }

}