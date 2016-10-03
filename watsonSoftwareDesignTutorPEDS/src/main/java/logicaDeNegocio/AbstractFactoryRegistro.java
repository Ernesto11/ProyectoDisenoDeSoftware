package logicaDeNegocio;

import java.util.*;

import dto.DTO_Registro;

/**
 * 
 */
public interface AbstractFactoryRegistro {

    /**
     * @param DTO_Registro 
     * @return
     */
    public abstract Registro crearRegistro(DTO_Registro pRegistro);

}