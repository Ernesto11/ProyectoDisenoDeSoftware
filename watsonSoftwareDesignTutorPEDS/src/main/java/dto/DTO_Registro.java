package dto;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class DTO_Registro implements Serializable{

    
    private String pregunta;
    private String[] respuestas;
    private String categoria;


    public DTO_Registro() {

    }

    
    public void setPregunta(String pPregunta) {
        this.pregunta = pPregunta;
        
    }

    public void setCategoria(String pCategoria) {
        this.categoria = pCategoria;
        
    }

    public void setRespuesta(String[] pRespuestas) {
        
        respuestas = pRespuestas;
    }

    
    public String getPregunta() {
        
        return this.pregunta;
    }

    public String getCategoria() {
       
        return this.categoria;
    }

    public String[] getRespuestas() {
        
        return this.respuestas;
    }

}