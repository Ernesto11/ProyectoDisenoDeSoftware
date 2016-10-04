package logicaDeNegocio;



import logicaDeIntegracion.Conversacion;
import logicaDeIntegracion.Traducir;
import logicaDeIntegracion.VozATexto;

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