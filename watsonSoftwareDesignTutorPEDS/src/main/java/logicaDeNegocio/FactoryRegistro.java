package logicaDeNegocio;

import java.util.*;

import dto.DTO_Registro;
import logicaDeNegocio.Registro;
/**
 * 
 */
public class FactoryRegistro implements AbstractFactoryRegistro {

    /**
     * Default constructor
     */
    public FactoryRegistro() {
    	
    }

    /**
     * @param DTO_Registro 
     * @return
     */
    public Registro crearRegistro(DTO_Registro pObjetoDTO) {
        Registro nuevoRegistro = new Registro(pObjetoDTO.getCategoria(),pObjetoDTO.getPregunta(),pObjetoDTO.getRespuestas());
        return nuevoRegistro;
    }



}