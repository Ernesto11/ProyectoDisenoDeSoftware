package dto;

import java.util.*;

/**
 * 
 */
public class DTO_Registro {

    
    private String pregunta;
    private ArrayList<String> respuestas;
    private String categoria;


    public DTO_Registro() {
        respuestas = new ArrayList<String>();
    }

    
    public void setPregunta(String pPregunta) {
        this.pregunta = pPregunta;
        
    }

    public void setCategoria(String pCategoria) {
        this.categoria = pCategoria;
        
    }

    public void setRespuesta(String pRespuesta) {
        
        respuestas.add(pRespuesta);
    }

    
    public String getPregunta() {
        
        return this.pregunta;
    }

    public String getCategoria() {
       
        return this.categoria;
    }

    public ArrayList<String> getRespuestas() {
        
        return this.respuestas;
    }

}