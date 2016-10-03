package logicaDeNegocio;

import java.util.*;

import dto.DTO_Documento;

/**
 * 
 */
public interface AbstractFactoryDocumento {

  
    public abstract PDF crearPDF(DTO_Documento pDocumento);

   
    public abstract TXT crearTXT(DTO_Documento pDocumento);

}