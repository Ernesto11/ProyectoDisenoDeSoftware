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
    public Registro crearRegistro(DTO_Registro pRegistro) {
        Registro nuevoRegistro = new Registro(pRegistro.getCategoria());
        nuevoRegistro.registrarPregunta(pRegistro.getPregunta());
        nuevoRegistro.registrarRespuestas(pRegistro.getRespuestas());
        return nuevoRegistro;
    }



}