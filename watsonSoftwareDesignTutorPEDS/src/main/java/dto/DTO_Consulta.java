package dto;

import java.io.File;
import java.util.*;

/**
 * 
 */
public class DTO_Consulta {

	private File preguntaVoz;
    private String preguntaTexto;
    private ArrayList<String> respuestas;

    public DTO_Consulta() {
        
    	respuestas = new ArrayList<String>();
    }

    public void setPreguntaTexto(String pPregunta) {
        this.preguntaTexto = pPregunta;

    }
    public void setPreguntaVoz(File pPregunta) {
        this.preguntaVoz = pPregunta;

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
    public String getPreguntaTexto() {
        
        return this.preguntaTexto;
    }
    public File getPreguntaVoz() {
        
        return this.preguntaVoz;
    }
}