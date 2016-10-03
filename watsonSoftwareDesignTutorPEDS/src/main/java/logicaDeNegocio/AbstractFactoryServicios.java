package logicaDeNegocio;

import java.util.*;

/**
 * 
 */
public interface AbstractFactoryServicios {

    /**
     * 
     */
    public Conversacion crearServicioConversacion();

    /**
     * 
     */
    public Traducir crearServicioTraducir();

    /**
     * 
     */
    public VozATexto crearServicioVozATexto();

}