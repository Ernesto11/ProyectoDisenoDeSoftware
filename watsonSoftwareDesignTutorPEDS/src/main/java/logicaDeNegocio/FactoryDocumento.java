package logicaDeNegocio;

import java.util.*;

import dto.DTO_Documento;

/**
 * 
 */
public class FactoryDocumento implements AbstractFactoryDocumento {

    /**
     * Default constructor
     */
    public FactoryDocumento() {
    }

    /**
     * @param DTO_Documento 
     * @return
     */
    public PDF crearPDF(DTO_Documento pDocumento) {
        // TODO implement here
        return null;
    }

    /**
     * @param DTO_Documento 
     * @return
     */
    public TXT crearTXT(DTO_Documento pDocumento) {
        // TODO implement here
        return null;
    }


}