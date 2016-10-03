package dto;

import java.util.*;

/**
 * 
 */
public class DTO_Documento {

  
    private String fuenteDeDatos;
    private String rutaGuardado;
    private String contenido;

    public DTO_Documento() {
        
    }

    public void setFuenteDeDatos(String pFuenteDeDatos) {
        this.fuenteDeDatos = pFuenteDeDatos;
        
    }

    public void setRutaGuardado(String pRutaGuardado) {
       this.rutaGuardado = pRutaGuardado;

    }

    public void setContenido(String pContenido) {
       this.contenido = pContenido;

    }

    public String getFuenteDeDatos() {
        
        return this.fuenteDeDatos;
    }

    public String getRutaGuardado() {
        
        return this.rutaGuardado;
    }

    public String getContenido() {
        
        return this.contenido;
    }

}