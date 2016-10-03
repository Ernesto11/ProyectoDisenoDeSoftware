package logicaDeNegocio;

import java.util.*;

import dto.DTO_Consulta;

/**
 * 
 */
public interface AbstractFactoryConsulta {

    /**
     * @param pObjetoDTO
     */
    public abstract Voz crearConsultaPorVoz(DTO_Consulta pObjetoDTO);

    /**
     * @param pObjetoDTO
     * @return 
     */
    public abstract Texto crearConsultaPorTexto(DTO_Consulta pObjetoDTO);

}