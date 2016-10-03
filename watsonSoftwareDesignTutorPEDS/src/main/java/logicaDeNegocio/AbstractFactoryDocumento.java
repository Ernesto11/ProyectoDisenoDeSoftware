package logicaDeNegocio;

import java.util.*;

import dto.DTO_Documento;

/**
 * 
 */
public interface AbstractFactoryDocumento {

    /**
     * @param DTO_Documento 
     * @return
     */
    public abstract PDF crearPDF(DTO_Documento pDocumento);

    /**
     * @param DTO_Documento 
     * @return
     */
    public abstract TXT crearTXT(DTO_Documento pDocumento);

}